package org.example.hunopen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputUtil {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int inInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static int[] inIntArray(int size) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            ret[i] = Integer.parseInt(st.nextToken());
        }
        return ret;
    }

    public static long inLong() throws IOException {
        return Long.parseLong(br.readLine());
    }

    public static long[] inLongArray(int size) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] ret = new long[size];
        for (int i = 0; i < size; i++) {
            ret[i] = Long.parseLong(st.nextToken());
        }
        return ret;
    }

    public static String inString() throws IOException {
        return br.readLine();
    }
}
