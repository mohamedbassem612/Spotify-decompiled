package p;

import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import com.spotify.playlistmixing.proto.Chain;
import com.spotify.playlistmixing.proto.Chains;
import com.spotify.playlistmixing.proto.Exclusions;
import com.spotify.playlistmixing.proto.HarmonizeRequestBody;
import com.spotify.playlistmixing.proto.HarmonizeResponseBody;
import com.spotify.playlistmixing.proto.HarmonizeSaveRequestBody;
import com.spotify.playlistmixing.proto.ManualOps;
import com.spotify.playlistmixing.proto.a;
import com.spotify.playlistmixing.proto.b;
import com.spotify.playlistmixing.proto.c;
import com.spotify.playlistmixing.proto.d;
import com.spotify.playlistmixing.proto.e;
import com.spotify.playlistmixing.proto.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zhk0 implements vhk0 {
    public final xrc0 a;
    public final iyc0 b;
    public final bik0 c;
    public final rxj0 d;

    public zhk0(xrc0 xrc0Var, iyc0 iyc0Var, bik0 bik0Var, rxj0 rxj0Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = bik0Var;
        this.d = rxj0Var;
    }

    public static ManualOps a(List list, List list2) {
        e eVarO = ManualOps.PreOps.o();
        List list3 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(f((yak0) it.next()));
        }
        eVarO.n(arrayList);
        ManualOps.PreOps preOps = (ManualOps.PreOps) eVarO.build();
        d dVarO = ManualOps.PostOps.o();
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f((yak0) it2.next()));
        }
        dVarO.n(arrayList2);
        ManualOps.PostOps postOps = (ManualOps.PostOps) dVarO.build();
        a aVarN = ManualOps.n();
        aVarN.q(preOps);
        aVarN.n(postOps);
        return (ManualOps) aVarN.build();
    }

    public static Chains e(List list) {
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (List list3 : list2) {
            sbe sbeVarO = Chain.o();
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList2.add(qmo1.q((String) it.next()));
            }
            sbeVarO.n(arrayList2);
            arrayList.add((Chain) sbeVarO.build());
        }
        ece eceVarO = Chains.o();
        eceVarO.n(arrayList);
        return (Chains) eceVarO.build();
    }

    public static ManualOps.Op f(yak0 yak0Var) {
        if (yak0Var instanceof wak0) {
            c cVarN = ManualOps.Op.n();
            b bVarN = ManualOps.Move.n();
            wak0 wak0Var = (wak0) yak0Var;
            bVarN.q(qmo1.q(wak0Var.a));
            bVarN.r(qmo1.q(wak0Var.b));
            bVarN.n(wak0Var.c);
            cVarN.n(bVarN);
            return (ManualOps.Op) cVarN.build();
        }
        if (!(yak0Var instanceof xak0)) {
            eg.o();
            return null;
        }
        c cVarN2 = ManualOps.Op.n();
        f fVarN = ManualOps.Remove.n();
        fVarN.n(qmo1.q(((xak0) yak0Var).a));
        cVarN2.q(fVarN);
        return (ManualOps.Op) cVarN2.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, List list, List list2, List list3, List list4, onm onmVar) throws MixingReorderingError.RevisionConflict, MixingReorderingError.ReorderFailed, MixingReorderingError.TrackLimitExceeded {
        whk0 whk0Var;
        if (onmVar instanceof whk0) {
            whk0Var = (whk0) onmVar;
            int i = whk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                whk0Var.c = i - Integer.MIN_VALUE;
            } else {
                whk0Var = new whk0(this, onmVar);
            }
        } else {
            whk0Var = new whk0(this, onmVar);
        }
        Object objB = whk0Var.a;
        int i2 = whk0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            zl00 zl00VarO = Exclusions.o();
            List list5 = list4;
            ArrayList arrayList = new ArrayList(q7h.U(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(qmo1.q((String) it.next()));
            }
            zl00VarO.n(arrayList);
            Exclusions exclusions = (Exclusions) zl00VarO.build();
            Chains chainsE = e(list3);
            ManualOps manualOpsA = a(list, list2);
            kt50 kt50VarN = HarmonizeSaveRequestBody.n();
            kt50VarN.t(str2);
            kt50VarN.q(str);
            kt50VarN.r(exclusions);
            kt50VarN.n(chainsE);
            kt50VarN.s(manualOpsA);
            HarmonizeSaveRequestBody harmonizeSaveRequestBody = (HarmonizeSaveRequestBody) kt50VarN.build();
            harmonizeSaveRequestBody.getClass();
            whk0Var.c = 1;
            objB = this.c.b(harmonizeSaveRequestBody, whk0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        ry21 ry21Var = ((sy21) objB).a;
        if (ry21Var.Q0) {
            return rih1.a;
        }
        int i3 = ry21Var.d;
        if (i3 == 409) {
            throw MixingReorderingError.RevisionConflict.a;
        }
        if (i3 != 422) {
            throw MixingReorderingError.ReorderFailed.a;
        }
        throw MixingReorderingError.TrackLimitExceeded.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, List list, List list2, List list3, onm onmVar) {
        xhk0 xhk0Var;
        jt50 m231Var;
        if (onmVar instanceof xhk0) {
            xhk0Var = (xhk0) onmVar;
            int i = xhk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhk0Var.c = i - Integer.MIN_VALUE;
            } else {
                xhk0Var = new xhk0(this, onmVar);
            }
        } else {
            xhk0Var = new xhk0(this, onmVar);
        }
        Object objA = xhk0Var.a;
        int i2 = xhk0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                zl00 zl00VarO = Exclusions.o();
                List list4 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(qmo1.q((String) it.next()));
                }
                zl00VarO.n(arrayList);
                Exclusions exclusions = (Exclusions) zl00VarO.build();
                Chains chainsE = e(list2);
                ManualOps manualOpsA = a(list3, z6x.a);
                it50 it50VarN = HarmonizeRequestBody.n();
                it50VarN.s(str);
                it50VarN.q(exclusions);
                it50VarN.n(chainsE);
                it50VarN.r(manualOpsA);
                HarmonizeRequestBody harmonizeRequestBody = (HarmonizeRequestBody) it50VarN.build();
                bik0 bik0Var = this.c;
                harmonizeRequestBody.getClass();
                xhk0Var.c = 1;
                objA = bik0Var.a(harmonizeRequestBody, xhk0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            ry21 ry21Var = sy21Var.a;
            if (!ry21Var.Q0) {
                if (ry21Var.d == 422) {
                    throw MixingReorderingError.TrackLimitExceeded.a;
                }
                throw MixingReorderingError.ReorderFailed.a;
            }
            HarmonizeResponseBody harmonizeResponseBody = (HarmonizeResponseBody) sy21Var.b;
            if (harmonizeResponseBody == null) {
                throw MixingReorderingError.ReorderFailed.a;
            }
            h290<phc> h290VarO = harmonizeResponseBody.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (phc phcVar : h290VarO) {
                phcVar.getClass();
                arrayList2.add(f46.r0(phcVar.t(), s8x.g, 30));
            }
            m231Var = new jt50(arrayList2, harmonizeResponseBody.n());
            Throwable thA = e331.a(m231Var);
            if (thA == null) {
                return m231Var;
            }
            try {
                MixingReorderingError.TrackLimitExceeded trackLimitExceeded = thA instanceof MixingReorderingError.TrackLimitExceeded ? (MixingReorderingError.TrackLimitExceeded) thA : null;
                if (trackLimitExceeded != null) {
                    throw trackLimitExceeded;
                }
                throw MixingReorderingError.ReorderFailed.a;
            } catch (Throwable th) {
                return new m231(th);
            }
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r0.u(r4, r2, r12) == r15) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.List r33, java.util.List r34, java.util.List r35, java.util.List r36, p.onm r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zhk0.d(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, p.onm):java.lang.Object");
    }
}
