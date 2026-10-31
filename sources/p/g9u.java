package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g9u implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n8l1 b;

    public /* synthetic */ g9u(n8l1 n8l1Var, byte b) {
        this.a = b;
        this.b = n8l1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        n8l1 n8l1Var = this.b;
        switch (b) {
            case 0:
                n8l1Var.e.a(((u8u) obj).a);
                break;
            case 1:
                boolean z = ((p8u) obj).a;
                bpb1 bpb1Var = n8l1Var.f;
                bpb1Var.m((Object) null, m8l1.a((m8l1) bpb1Var.getValue(), z, false, false, null, 14));
                break;
            case 2:
                boolean z2 = ((n8u) obj).a;
                bpb1 bpb1Var2 = n8l1Var.f;
                bpb1Var2.m((Object) null, m8l1.a((m8l1) bpb1Var2.getValue(), false, z2, false, null, 13));
                break;
            case 3:
                boolean z3 = ((m8u) obj).a;
                bpb1 bpb1Var3 = n8l1Var.f;
                bpb1Var3.m((Object) null, m8l1.a((m8l1) bpb1Var3.getValue(), false, false, z3, null, 11));
                break;
            case 4:
                int i = ((s8u) obj).a;
                dt71 dt71Var = n8l1Var.c;
                if (i < 0) {
                    i = 0;
                }
                dt71Var.a(Integer.valueOf(i));
                break;
            case 5:
                h8u h8uVar = (h8u) obj;
                n8l1Var.a.a(Integer.valueOf(h8uVar.a));
                Integer num = h8uVar.b;
                if (num != null) {
                    n8l1Var.b.a(Integer.valueOf(num.intValue()));
                }
                break;
            case 6:
                n8l1Var.b.a(Integer.valueOf(((i8u) obj).a));
                break;
            default:
                n8l1Var.d.a(Boolean.valueOf(!((w8u) obj).a));
                break;
        }
    }
}
