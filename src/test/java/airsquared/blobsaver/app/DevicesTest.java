/*
 * Copyright (c) 2026  airsquared
 *
 * This file is part of blobsaver.
 *
 * blobsaver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * blobsaver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with blobsaver.  If not, see <https://www.gnu.org/licenses/>.
 */

package airsquared.blobsaver.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DevicesTest {

    @Test
    void modelsResolveToTheirDeviceType() {
        for (String type : Devices.getDeviceTypes()) {
            for (String model : Devices.getModelsForType(type)) {
                String identifier = Devices.modelToIdentifier(model);
                assertEquals(type, Devices.getDeviceType(identifier), model);
                assertEquals(model, Devices.identifierToModel(identifier), identifier);
            }
        }
    }
}
