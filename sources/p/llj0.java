package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class llj0 {
    public final jy50 a;
    public final Function0 b;
    public final Function0 c;
    public final blj0 d;
    public final ilj0 e;
    public final vjj0 f;
    public final vjj0 g;
    public final String h;
    public final flj0 i;
    public final jlj0 j;
    public final boolean k;
    public final nx50 l;

    public llj0(jy50 jy50Var, iqy iqyVar, Function0 function0, blj0 blj0Var, hlj0 hlj0Var, vjj0 vjj0Var, vjj0 vjj0Var2, String str, flj0 flj0Var, jlj0 jlj0Var, nx50 nx50Var, int i) {
        iqyVar = (i & 4) != 0 ? null : iqyVar;
        function0 = (i & 8) != 0 ? null : function0;
        ilj0 ilj0Var = (i & 64) != 0 ? glj0.a : hlj0Var;
        vjj0Var = (i & 256) != 0 ? null : vjj0Var;
        vjj0Var2 = (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : vjj0Var2;
        str = (i & 2048) != 0 ? null : str;
        jlj0Var = (i & 8192) != 0 ? null : jlj0Var;
        boolean z = (i & 16384) == 0;
        nx50Var = (i & 32768) != 0 ? mx50.a : nx50Var;
        this.a = jy50Var;
        this.b = iqyVar;
        this.c = function0;
        this.d = blj0Var;
        this.e = ilj0Var;
        this.f = vjj0Var;
        this.g = vjj0Var2;
        this.h = str;
        this.i = flj0Var;
        this.j = jlj0Var;
        this.k = z;
        this.l = nx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llj0)) {
            return false;
        }
        llj0 llj0Var = (llj0) obj;
        return this.a.equals(llj0Var.a) && u890.j(this.b, llj0Var.b) && u890.j(this.c, llj0Var.c) && this.d.equals(llj0Var.d) && this.e.equals(llj0Var.e) && u890.j(this.f, llj0Var.f) && u890.j(this.g, llj0Var.g) && u890.j(this.h, llj0Var.h) && this.i.equals(llj0Var.i) && u890.j(this.j, llj0Var.j) && this.k == llj0Var.k && this.l.equals(llj0Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        Function0 function0 = this.b;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 961)) * 31)) * 961;
        vjj0 vjj0Var = this.f;
        int iHashCode4 = (iHashCode3 + (vjj0Var == null ? 0 : vjj0Var.hashCode())) * 31;
        vjj0 vjj0Var2 = this.g;
        int iG = xcg1.g((iHashCode4 + (vjj0Var2 == null ? 0 : vjj0Var2.hashCode())) * 31, 31, false);
        String str = this.h;
        int iHashCode5 = (this.i.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        jlj0 jlj0Var = this.j;
        return this.l.hashCode() + xcg1.g((iHashCode5 + (jlj0Var != null ? jlj0Var.hashCode() : 0)) * 31, 31, this.k);
    }
}
