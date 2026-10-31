package p;

import com.comscore.streaming.ContentMediaFormat;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bbj1 implements bcu0 {
    public final /* synthetic */ woa a;
    public final /* synthetic */ dbj1 b;
    public final /* synthetic */ bw91 c;

    public bbj1(woa woaVar, dbj1 dbj1Var, bw91 bw91Var) {
        this.a = woaVar;
        this.b = dbj1Var;
        this.c = bw91Var;
    }

    public final uoa a(o2u0 o2u0Var) {
        dbj1 dbj1Var = this.b;
        uoa uoaVarA = woa.a(this.a, dbj1Var.c.a, o2u0Var, (w2k1) null, (kma) null, Collections.singletonList(dbj1Var.d), false, (bas) null, (sn10) null, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
        this.c.add(uoaVarA);
        return uoaVarA;
    }
}
