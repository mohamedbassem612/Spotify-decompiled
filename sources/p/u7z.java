package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u7z extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7z(jb3 jb3Var, byte b) {
        super(4);
        this.a = b;
        this.b = jb3Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        jb3 jb3Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new mpl0((String) jb3Var.f, (r6h1) obj4);
            default:
                return new as0((Context) obj2, jb3Var, (iu30) obj4);
        }
    }
}
