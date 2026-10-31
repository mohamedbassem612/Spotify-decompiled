package p;

import com.google.android.gms.common.api.Scope;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class epj1 implements Comparator {
    public static final /* synthetic */ epj1 b = new epj1(10);
    public static final /* synthetic */ epj1 c = new epj1(11);
    public static final /* synthetic */ epj1 d = new epj1(15);
    public final /* synthetic */ byte a;

    public /* synthetic */ epj1(byte b2) {
        this.a = b2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return pap1.t(Long.valueOf(((apj1) obj2).c), Long.valueOf(((apj1) obj).c));
            case 1:
                return pap1.t(Integer.valueOf(((apj1) obj).a), Integer.valueOf(((apj1) obj2).a));
            case 2:
                return pap1.t(Integer.valueOf(((apj1) obj).a), Integer.valueOf(((apj1) obj2).a));
            case 3:
                return pap1.t(((yvj1) obj).b, ((yvj1) obj2).b);
            case 4:
                return pap1.t(Integer.valueOf(((uvj1) obj2).d), Integer.valueOf(((uvj1) obj).d));
            case 5:
                return pap1.t(((VideoSurfaceView) obj2).getPriority(), ((VideoSurfaceView) obj).getPriority());
            case 6:
                return ((ndk1) obj).a - ((ndk1) obj2).a;
            case 7:
                return pap1.t(Integer.valueOf(((prm1) obj).a), Integer.valueOf(((prm1) obj2).a));
            case 8:
                return pap1.t(Integer.valueOf(((qrm1) obj).a), Integer.valueOf(((qrm1) obj2).a));
            case 9:
                return pap1.t(((i4n1) obj).a, ((i4n1) obj2).a);
            case 10:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                pl10 pl10Var = (pl10) obj2;
                pl10 pl10Var2 = (pl10) obj;
                return !pl10Var2.a.equals(pl10Var.a) ? pl10Var2.a.compareTo(pl10Var.a) : Long.compare(pl10Var2.j(), pl10Var.j());
            case grn1.d /* 12 */:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 13:
                return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
            case 14:
                tdp1 tdp1Var = (tdp1) obj;
                tdp1 tdp1Var2 = (tdp1) obj2;
                int i = 0;
                int i2 = 0;
                while (true) {
                    length = tdp1Var.a.length;
                    if (i < length && i2 < tdp1Var2.a.length) {
                        int iCompare = Integer.compare(tdp1.f(tdp1Var.b(i)), tdp1.f(tdp1Var2.b(i2)));
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        i++;
                        i2++;
                    }
                }
                return Integer.compare(length, tdp1Var2.a.length);
            default:
                return Long.compare(((bfp1) obj).a, ((bfp1) obj2).a);
        }
    }
}
