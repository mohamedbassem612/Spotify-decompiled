package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nxb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxb0(xtb0 xtb0Var, ahi0 ahi0Var) {
        super(0);
        this.a = (byte) 19;
        this.b = xtb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public final Object invoke() {
        long jG;
        qtb0 qtb0Var;
        byte b = this.a;
        Object obj = null;
        int iIntValue = 0;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case 0:
                List list = xtb0Var.h().l;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((qtb0) it.next()).a));
                }
                return arrayList;
            case 1:
                List list2 = xtb0Var.h().l;
                qtb0 qtb0Var2 = (qtb0) o7h.s0(list2);
                Integer numValueOf = qtb0Var2 != null ? Integer.valueOf(qtb0Var2.a) : null;
                qtb0 qtb0Var3 = (qtb0) o7h.C0(list2);
                Integer numValueOf2 = qtb0Var3 != null ? Integer.valueOf(qtb0Var3.a) : null;
                if (numValueOf != null && numValueOf2 != null) {
                    iIntValue = (numValueOf2.intValue() + numValueOf.intValue()) / 2;
                }
                return Integer.valueOf(iIntValue);
            case 2:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case 3:
                return Boolean.valueOf(!xtb0Var.d() && xtb0Var.c());
            case 4:
                return Integer.valueOf(((err0) xtb0Var.e.c).s());
            case 5:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case 6:
                return Boolean.valueOf(!xtb0Var.d() && xtb0Var.c());
            case 7:
                return Integer.valueOf(((err0) xtb0Var.e.c).s());
            case 8:
                List<qtb0> list3 = xtb0Var.h().l;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (qtb0 qtb0Var4 : list3) {
                    arrayList2.add(new mmr0(Integer.valueOf(qtb0Var4.a), Integer.valueOf(qtb0Var4.q)));
                }
                return arrayList2;
            case 9:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case 10:
                return xtb0Var.h().l;
            case 11:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case 12:
                return Boolean.valueOf(!xtb0Var.d() && xtb0Var.c());
            case 13:
                return Integer.valueOf(((err0) xtb0Var.e.c).s());
            case 14:
                qtb0 qtb0Var5 = (qtb0) o7h.C0(xtb0Var.h().l);
                return Integer.valueOf(qtb0Var5 != null ? qtb0Var5.a : 0);
            case 15:
                i25 i25Var = xtb0Var.e;
                return Boolean.valueOf(((err0) i25Var.b).s() == 0 && ((err0) i25Var.c).s() == 0);
            case 16:
                return d9p1.t(xtb0Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return d9p1.t(xtb0Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return xtb0Var.h();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(xtb0Var.j.b() && !ahi0.o(xtb0Var));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(ahi0.o(xtb0Var));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Boolean boolValueOf = Boolean.valueOf(xtb0Var.j.b());
                i25 i25Var2 = xtb0Var.e;
                return new yvg1(boolValueOf, Integer.valueOf(((err0) i25Var2.b).s()), Integer.valueOf(((err0) i25Var2.c).s()));
            case 22:
                ptb0 ptb0VarH = xtb0Var.h();
                qtb0 qtb0Var6 = (qtb0) o7h.C0(ptb0VarH.l);
                return new mmr0(Integer.valueOf(qtb0Var6 != null ? qtb0Var6.a : 0), Integer.valueOf(ptb0VarH.o));
            case 23:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(!xtb0Var.d() && xtb0Var.c());
            case 25:
                return Integer.valueOf(((err0) xtb0Var.e.c).s());
            case 26:
                ptb0 ptb0VarH2 = xtb0Var.h();
                int iOrdinal = ptb0VarH2.q.ordinal();
                if (iOrdinal == 0) {
                    jG = ptb0VarH2.g() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    jG = ptb0VarH2.g() >> 32;
                }
                return Float.valueOf(((int) jG) * 0.05f);
            case 27:
                return xtb0Var.h().q;
            case 28:
                return Integer.valueOf(xtb0Var.h().o);
            default:
                ptb0 ptb0VarH3 = xtb0Var.h();
                int i = ptb0VarH3.o - 1;
                if (i < 0) {
                    return Boolean.TRUE;
                }
                for (Object obj2 : ptb0VarH3.l) {
                    if (((qtb0) obj2).a == i) {
                        obj = obj2;
                        qtb0Var = (qtb0) obj;
                        if (qtb0Var == null) {
                            return Boolean.FALSE;
                        }
                        return Boolean.valueOf(qtb0Var.p + qtb0Var.q <= ptb0VarH3.n);
                    }
                }
                qtb0Var = (qtb0) obj;
                if (qtb0Var == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(qtb0Var.p + qtb0Var.q <= ptb0VarH3.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxb0(xtb0 xtb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxb0(ahi0 ahi0Var, xtb0 xtb0Var) {
        super(0);
        this.a = (byte) 20;
        this.b = xtb0Var;
    }
}
