package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class s3v0 {
    public static final r3v0 Companion = new r3v0();
    public static final znb0[] c = {dm5.S(2, tnt0.R0), null};
    public final List a;
    public final abr b;

    public /* synthetic */ s3v0(int i, List list, abr abrVar) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, q3v0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = abrVar;
        }
    }

    public s3v0(List list, abr abrVar) {
        this.a = list;
        this.b = abrVar;
    }
}
