package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sqs0 {
    public static final bma1 c = bma1.b.q("key_selected_lyrics_translation_language");
    public final dma1 a;
    public final bpb1 b;

    public sqs0(Context context, ut71 ut71Var) {
        dma1 dma1VarC = ut71Var.c(context);
        this.a = dma1VarC;
        this.b = gio1.b(dma1VarC.e(c, (String) null));
    }

    public final synchronized void a(String str) {
        try {
            hma1 hma1VarEdit = this.a.edit();
            if (str == null) {
                hma1VarEdit.f(c);
            } else {
                hma1VarEdit.d(c, str);
            }
            hma1VarEdit.g();
            this.b.l(str);
        } catch (Throwable th) {
            throw th;
        }
    }
}
