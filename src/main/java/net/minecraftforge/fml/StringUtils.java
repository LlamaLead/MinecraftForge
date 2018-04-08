/*
 * Minecraft Forge
 * Copyright (c) 2018.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.fml;

/**
 * Created by cpw on 05/06/17.
 */
public class StringUtils
{
    public static String toLowerCase(final String str) {
        return str.toLowerCase(java.util.Locale.ROOT);
    }

    public static boolean endsWith(final String search, final String... endings) {
        String lowerSearch = toLowerCase(search);
        return java.util.stream.Stream.of(endings).anyMatch(lowerSearch::endsWith);
    }
}