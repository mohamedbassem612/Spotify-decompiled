package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yiq0 {
    public static final yiq0 a = new yiq0();
    public static int b = 10;
    public static SharedPreferences c;

    public static void a(int i) {
        b = i;
    }

    public static void b(SharedPreferences sharedPreferences) {
        c = sharedPreferences;
    }

    public static void c(int i, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt(gvg.h("OopsSamplingOverride:", str, ":", str2), i)) == null) {
            return;
        }
        editorPutInt.apply();
    }
}
