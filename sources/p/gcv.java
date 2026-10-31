package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gcv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcv(vfv vfvVar, bpb1 bpb1Var) {
        super(1);
        this.a = (byte) 1;
        this.b = bpb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.l((String) obj);
                return rih1.a;
            case 1:
                rfv rfvVar = (rfv) obj;
                whx0 whx0Var = (whx0) bpb1Var.getValue();
                hix0 hix0Var = (iix0) whx0Var.a.get(rfvVar.a);
                if (hix0Var == null) {
                    hix0Var = new hix0(false, 0L);
                }
                return new tfv(rfvVar, hix0Var);
            case 2:
                return new mt(bpb1Var, (byte) 22);
            case 3:
                wxo0 wxo0Var = (wxo0) obj;
                bl11 bl11Var = new bl11(wxo0Var.a, wxo0Var.b, wxo0Var.c);
                LinkedHashSet linkedHashSetX0 = dm61.x0(bl11Var.a, o7h.p1(bl11Var.b));
                bpb1Var.m((Object) null, linkedHashSetX0);
                return linkedHashSetX0;
            default:
                return bpb1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcv(bpb1 bpb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = bpb1Var;
    }
}
