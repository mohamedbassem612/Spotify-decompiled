package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v4c implements jvd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x9a b;

    public /* synthetic */ v4c(x9a x9aVar, byte b) {
        this.a = b;
        this.b = x9aVar;
    }

    public final Observable f(i iVar, ArrayList arrayList, mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                p4c p4cVar = (p4c) mvdVar;
                return anm1.L(o6x.a, new us0(p4cVar, (a5c) x9aVar, iVar, (lnm) null, (byte) 12)).onErrorReturn(new it8(p4cVar, iVar, (byte) 19));
            case 1:
                v491 v491Var = (v491) mvdVar;
                ysc1 ysc1Var = (ysc1) x9aVar;
                vz01 vz01Var = ysc1Var.f;
                String str = ysc1Var.c;
                int i = ysc1Var.e.d;
                String uri = iVar.getUri();
                List list = v491Var.a.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((i) it.next()).getUri());
                }
                return up30.u(vz01.c(vz01Var, str, i, gzy.f, uri, o7h.p1(up30.v(o7h.N0(v491Var.c, arrayList2))), 16), arrayList).map(ysc1Var.g).map(new wsc1(v491Var, iVar, (byte) 0)).toObservable().onErrorReturn(new xsc1(v491Var, iVar, (byte) 0));
            case 2:
                v491 v491Var2 = (v491) mvdVar;
                ctc1 ctc1Var = (ctc1) x9aVar;
                vz01 vz01Var2 = ctc1Var.f;
                String str2 = ctc1Var.c;
                int i2 = ctc1Var.e.d;
                String uri2 = iVar.getUri();
                List list2 = v491Var2.a.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((i) it2.next()).getUri());
                }
                return up30.u(vz01.c(vz01Var2, str2, i2, gzy.e, uri2, o7h.p1(up30.w(o7h.N0(v491Var2.c, arrayList3))), 16), arrayList).map(ctc1Var.g).map(new r2a1(v491Var2, iVar, (byte) 23)).onErrorReturn(new wsc1(v491Var2, iVar, (byte) 1)).toObservable();
            default:
                v491 v491Var3 = (v491) mvdVar;
                hmm0 hmm0Var = (hmm0) x9aVar;
                o411 o411Var = (o411) hmm0Var.f;
                String uri3 = iVar.getUri();
                int i3 = hmm0Var.d.d;
                List list3 = v491Var3.a.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((i) it3.next()).getUri());
                }
                Set setP1 = o7h.p1(up30.x(o7h.N0(v491Var3.c, o7h.N0(arrayList4, arrayList))));
                o411Var.getClass();
                return up30.t(o411Var.b(i3, "", null, Collections.singleton(uri3), setP1), arrayList).map(new xsc1(v491Var3, iVar, (byte) 1));
        }
    }

    public final Observable g(List list, String str, mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                p4c p4cVar = (p4c) mvdVar;
                return anm1.L(o6x.a, new vs0(p4cVar, (a5c) x9aVar, false, (lnm) null, (byte) 15)).onErrorReturn(new dg8((Object) p4cVar, (byte) 9));
            case 1:
                v491 v491Var = (v491) mvdVar;
                ysc1 ysc1Var = (ysc1) x9aVar;
                vz01 vz01Var = ysc1Var.f;
                String str2 = ysc1Var.c;
                int i = ysc1Var.e.c;
                Set setP1 = o7h.p1(o7h.e1(10, up30.v(list)));
                List list2 = v491Var.a.a;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i) it.next()).getUri());
                }
                return up30.u(vz01Var.a(str2, i, gzy.f, setP1, o7h.p1(up30.v(o7h.N0(v491Var.c, arrayList)))).map(pdx0.R0), list).map(ysc1Var.g).map(new dr41(v491Var, (byte) 26)).onErrorReturn(new ep31(v491Var, (byte) 26)).toObservable();
            case 2:
                v491 v491Var2 = (v491) mvdVar;
                ctc1 ctc1Var = (ctc1) x9aVar;
                vz01 vz01Var2 = ctc1Var.f;
                String str3 = ctc1Var.c;
                int i2 = ctc1Var.e.c;
                Set setP2 = o7h.p1(o7h.e1(10, up30.w(list)));
                List list3 = v491Var2.a.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((i) it2.next()).getUri());
                }
                return up30.u(vz01Var2.a(str3, i2, gzy.e, setP2, o7h.p1(up30.w(o7h.N0(v491Var2.c, arrayList2)))).map(wdx0.Q0), list).map(ctc1Var.g).map(new xq81(v491Var2, (byte) 14)).onErrorReturn(new h5a1(v491Var2, (byte) 10)).toObservable();
            default:
                v491 v491Var3 = (v491) mvdVar;
                hmm0 hmm0Var = (hmm0) x9aVar;
                o411 o411Var = (o411) hmm0Var.f;
                String strN = hmm0.n((String) hmm0Var.g, list);
                Set setM = hmm0Var.m(up30.x(list));
                int i3 = hmm0Var.d.c;
                List list4 = v491Var3.a.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((i) it3.next()).getUri());
                }
                return up30.t(o411Var.b(i3, str, strN, setM, o7h.p1(up30.x(o7h.N0(v491Var3.c, arrayList3)))), list).map(new q881(v491Var3, (byte) 17));
        }
    }

    public final yrd l(mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                p4c p4cVar = (p4c) mvdVar;
                a5c a5cVar = (a5c) x9aVar;
                String string = a5cVar.c.getString(2131952492);
                String str = p4cVar.b;
                String str2 = p4cVar.c;
                pud pudVar = a5cVar.l;
                return new yrd(string, str, str2, pudVar.a, pudVar, Collections.singletonList(new avd("items", null, null, new cvd(p4cVar.getItems()))), p4cVar.a.a.b, new vtd(pudVar.a, a5cVar.d), 0L, 516);
            case 1:
                ysc1 ysc1Var = (ysc1) x9aVar;
                Context context = ysc1Var.b;
                String string2 = context.getString(2131952490);
                String string3 = context.getString(2131952483);
                pud pudVar2 = ysc1Var.i;
                String str3 = pudVar2.a;
                ivd ivdVar = ((v491) mvdVar).a;
                return new yrd(string2, string3, (String) null, str3, pudVar2, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar.a))), ivdVar.b, new vtd(pudVar2.a, ""), 0L, 524);
            case 2:
                ctc1 ctc1Var = (ctc1) x9aVar;
                pud pudVar3 = ctc1Var.i;
                String str4 = pudVar3.a;
                ivd ivdVar2 = ((v491) mvdVar).a;
                return new yrd(ctc1Var.b.getString(2131952491), (String) null, (String) null, str4, pudVar3, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar2.a))), ivdVar2.b, new vtd(pudVar3.a, ""), 0L, 524);
            default:
                hmm0 hmm0Var = (hmm0) x9aVar;
                String string4 = hmm0Var.c.getString(2131952492);
                pud pudVar4 = hmm0Var.e;
                String str5 = pudVar4.a;
                ivd ivdVar3 = ((v491) mvdVar).a;
                return new yrd(string4, (String) null, (String) null, str5, pudVar4, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar3.a))), ivdVar3.b, new vtd(pudVar4.a, ""), 0L, 524);
        }
    }

    public final Observable n(String str, List list) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                return anm1.L(o6x.a, new u4c((a5c) x9aVar, list, null)).onErrorReturn(ios.Z);
            case 1:
                ysc1 ysc1Var = (ysc1) x9aVar;
                vz01 vz01Var = ysc1Var.f;
                String str2 = ysc1Var.c;
                Set setP1 = o7h.p1(o7h.e1(10, up30.v(list)));
                return up30.u(vz01Var.a(str2, ysc1Var.e.e, gzy.f, setP1, w7x.a).map(new zb91(ysc1Var, (byte) 10)), list).map(ysc1Var.g).map(new ezb1(ysc1Var, (byte) 3)).onErrorReturn(rdx0.Q0).toObservable();
            case 2:
                ctc1 ctc1Var = (ctc1) x9aVar;
                vz01 vz01Var2 = ctc1Var.f;
                String str3 = ctc1Var.c;
                Set setP2 = o7h.p1(o7h.e1(10, up30.w(list)));
                return up30.u(vz01Var2.a(str3, ctc1Var.e.e, gzy.e, setP2, w7x.a).map(new y281(ctc1Var, (byte) 18)), list).map(ctc1Var.g).map(new o2b1(ctc1Var, (byte) 8)).onErrorReturn(gex0.R0).toObservable();
            default:
                hmm0 hmm0Var = (hmm0) x9aVar;
                return up30.t(o411.a((o411) hmm0Var.f, hmm0Var.d.e, str, hmm0.n((String) hmm0Var.g, list), null, hmm0Var.m(up30.x(list)), 8), list).map(new r2a1(hmm0Var, list, (byte) 24));
        }
    }
}
