package p;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.profileconfig.proto.v1.Avatar;
import j$.time.Instant;
import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cvt implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ cvt(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return pap1.t(Integer.valueOf(((di9) obj).ordinal()), Integer.valueOf(((di9) obj2).ordinal()));
            case 1:
                return pap1.t(Long.valueOf(((dos0) obj).b), Long.valueOf(((dos0) obj2).b));
            case 2:
                return pap1.t(Long.valueOf(((dos0) obj).b), Long.valueOf(((dos0) obj2).b));
            case 3:
                do5 do5Var = ((mo5) obj).a;
                do5 do5Var2 = ((mo5) obj2).a;
                return pap1.t("default", "default");
            case 4:
                llw0 llw0Var = (llw0) obj;
                if (llw0Var instanceof klw0) {
                    i = 0;
                } else {
                    i = llw0Var instanceof jlw0 ? 1 : 2;
                }
                Integer numValueOf = Integer.valueOf(i);
                llw0 llw0Var2 = (llw0) obj2;
                if (llw0Var2 instanceof klw0) {
                    i2 = 0;
                } else if (!(llw0Var2 instanceof jlw0)) {
                    i2 = 2;
                }
                return pap1.t(numValueOf, Integer.valueOf(i2));
            case 5:
                return pap1.t(Integer.valueOf(((i1z) obj2).y), Integer.valueOf(((i1z) obj).y));
            case 6:
                return pap1.t(Long.valueOf(((tom) obj2).d), Long.valueOf(((tom) obj).d));
            case 7:
                return pap1.t(Integer.valueOf(((dz10) obj2).b.k), Integer.valueOf(((dz10) obj).b.k));
            case 8:
                return pap1.t(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
            case 9:
                return pap1.t(Integer.valueOf(((mo41) obj).c), Integer.valueOf(((mo41) obj2).c));
            case 10:
                c440 c440Var = (c440) obj;
                c440 c440Var2 = (c440) obj2;
                RecyclerView recyclerView = c440Var.d;
                if ((recyclerView == null) == (c440Var2.d == null)) {
                    boolean z = c440Var.a;
                    if (z == c440Var2.a) {
                        int i3 = c440Var2.b - c440Var.b;
                        if (i3 != 0) {
                            return i3;
                        }
                        int i4 = c440Var.c - c440Var2.c;
                        if (i4 != 0) {
                            return i4;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return pap1.t(Boolean.valueOf(((xj50) obj2).d), Boolean.valueOf(((xj50) obj).d));
            case grn1.d /* 12 */:
                return ((nob1) obj).d - ((nob1) obj2).d;
            case 13:
                return pap1.t((Integer) ((mmr0) obj).a, (Integer) ((mmr0) obj2).a);
            case 14:
                return pap1.t((Integer) ((mmr0) obj).a, (Integer) ((mmr0) obj2).a);
            case 15:
                return pap1.t(((cz81) obj).a, ((cz81) obj2).a);
            case 16:
                return pap1.t((Instant) ((mmr0) obj2).b, (Instant) ((mmr0) obj).b);
            case 17:
                return pap1.t(Long.valueOf(((t6a0) obj).a), Long.valueOf(((t6a0) obj2).a));
            case 18:
                return pap1.t(Long.valueOf(((t6a0) obj).a), Long.valueOf(((t6a0) obj2).a));
            case 19:
                return pap1.t(((Method) obj).getName(), ((Method) obj2).getName());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                se11 se11Var = mla0.a;
                Integer numB = mht.b((lht) obj, (lht) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
            case 21:
                return Integer.compare(((yoa0) obj).a, ((yoa0) obj2).a);
            case 22:
                return pap1.t(((Avatar) obj).getName(), ((Avatar) obj2).getName());
            case 23:
                return pap1.t(Long.valueOf(((ffs0) obj2).C0()), Long.valueOf(((ffs0) obj).C0()));
            case 24:
                return pap1.t(Long.valueOf(((ffs0) o7h.q0(((ifs0) obj2).l0())).C0()), Long.valueOf(((ffs0) o7h.q0(((ifs0) obj).l0())).C0()));
            case 25:
                return pap1.t(Integer.valueOf(((xe20) obj).c), Integer.valueOf(((xe20) obj2).c));
            case 26:
                return pap1.t(Integer.valueOf(((vhc0) obj).a), Integer.valueOf(((vhc0) obj2).a));
            case 27:
                return pap1.t(Long.valueOf(((x3s0) obj).a()), Long.valueOf(((x3s0) obj2).a()));
            case 28:
                return pap1.t(Float.valueOf(((njf1) obj2).b), Float.valueOf(((njf1) obj).b));
            default:
                return pap1.t(Integer.valueOf(((hfe0) obj).b), Integer.valueOf(((hfe0) obj2).b));
        }
    }
}
