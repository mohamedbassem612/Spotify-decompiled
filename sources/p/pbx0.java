package p;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pbx0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ytp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbx0(ytp0 ytp0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ytp0Var;
    }

    public final Object invoke() {
        int i;
        byte b = this.a;
        ytp0 ytp0Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((s4b1) ((idd1) ytp0Var.f).getValue()).c.ordinal();
                if (iOrdinal == 705) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    return yon1.G1("PROFILE_ARTISTS", "profile/artists", 1574, "profile");
                }
                if (iOrdinal == 706) {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    return yon1.l4();
                }
                if (iOrdinal == 717) {
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    return yon1.p4();
                }
                if (iOrdinal == 718) {
                    AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                    return yon1.q4();
                }
                if (iOrdinal == 720) {
                    AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                    return yon1.G1("PROFILE_FRIENDS", "profile/friends", 1583, "profile");
                }
                if (iOrdinal != 723) {
                    AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                    return yon1.H5();
                }
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                return yon1.G1("PROFILE_PLAYLISTS", "profile/playlists", 1586, "profile");
            case 1:
                String str = ((sbx0) ((hvp0) ytp0Var.b).b).a;
                Set set = s4b1.f;
                return uic.x(str);
            case 2:
                int iOrdinal2 = ((s4b1) ((idd1) ytp0Var.f).getValue()).c.ordinal();
                if (iOrdinal2 == 705) {
                    i = 2131960545;
                } else if (iOrdinal2 == 706) {
                    i = 2131960536;
                } else if (iOrdinal2 == 717) {
                    i = 2131960539;
                } else if (iOrdinal2 == 718) {
                    i = 2131960542;
                } else if (iOrdinal2 != 720) {
                    i = iOrdinal2 != 723 ? 0 : 2131960544;
                } else {
                    i = 2131960543;
                }
                return Integer.valueOf(i);
            default:
                return new lik1(((sbx0) ((hvp0) ytp0Var.b).b).a);
        }
    }
}
