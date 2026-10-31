package p;

import android.os.Trace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wif1 {
    public static final wif1 a = new wif1();

    public final void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
