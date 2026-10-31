package p;

import androidx.media3.exoplayer.drm.DrmSession;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class opt0 implements y8v {
    public final o5n a;
    public final LinkedHashSet b;
    public final String c;
    public DrmSession.DrmSessionException d;
    public boolean e;
    public final LinkedHashMap f;

    public opt0(o5n o5nVar, LinkedHashSet linkedHashSet, String str) {
        LinkedHashMap linkedHashMap;
        this.a = o5nVar;
        this.b = linkedHashSet;
        this.c = str;
        if (o5nVar == null || linkedHashSet.isEmpty()) {
            linkedHashMap = null;
        } else {
            int iS = zno1.s(q7h.U(linkedHashSet, 10));
            linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
            for (Object obj : linkedHashSet) {
                bjx bjxVar = this.a.b;
                linkedHashMap.put(obj, (spt0) ((ConcurrentHashMap) bjxVar.g).computeIfAbsent(((rpt0) obj).b(), new d4k(bjxVar, (byte) 4)));
            }
        }
        this.f = linkedHashMap;
    }

    public final DrmSession.DrmSessionException a() {
        return this.d;
    }

    public final UUID b() {
        return whc.e;
    }

    public final boolean d() {
        return true;
    }

    public final byte[] e() {
        return null;
    }

    public final nco f() {
        return sl10.a1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    public final int getState() {
        int i;
        Object obj;
        if (this.d != null) {
            return 1;
        }
        o5n o5nVar = this.a;
        if (o5nVar == null) {
            this.d = new DrmSession.DrmSessionException(6000, new IllegalStateException("DRM session is not available"));
            return 1;
        }
        boolean zIsEmpty = this.b.isEmpty();
        bqt0 bqt0Var = bqt0.a;
        eqt0 eqt0Var = eqt0.a;
        dqt0 dqt0Var = dqt0.a;
        if (!zIsEmpty) {
            i = 3;
            LinkedHashMap linkedHashMap = this.f;
            linkedHashMap.getClass();
            Collection collectionValues = linkedHashMap.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((spt0) it.next()).a.equals(eqt0Var)) {
                        this.d = new DrmSession.DrmSessionException(6000, new SunsetUpgradeRequiredException());
                        return 1;
                    }
                }
            }
            Collection collectionValues2 = linkedHashMap.values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it2 = collectionValues2.iterator();
                while (it2.hasNext()) {
                    if (((spt0) it2.next()).a.equals(bqt0Var)) {
                        this.d = new DrmSession.DrmSessionException(6000, new IllegalStateException("Fetch failed"));
                        return 1;
                    }
                }
            }
            this.d = null;
            Collection collectionValues3 = linkedHashMap.values();
            if ((collectionValues3 instanceof Collection) && collectionValues3.isEmpty()) {
                return 4;
            }
            Iterator it3 = collectionValues3.iterator();
            while (it3.hasNext()) {
                if (!((spt0) it3.next()).a.equals(dqt0Var)) {
                }
            }
            return 4;
        }
        bjx bjxVar = o5nVar.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bjxVar.f;
        String str = this.c;
        Set set = (Set) concurrentHashMap.get(str);
        Set set2 = set;
        aqt0 aqt0Var = aqt0.a;
        cqt0 cqt0Var = cqt0.a;
        if (set2 == null || set2.isEmpty()) {
            i = 3;
        } else {
            Iterator it4 = set.iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (!it4.hasNext()) {
                    i = 3;
                    if (!z) {
                        if (!z2) {
                            obj = dqt0Var;
                            break;
                        }
                        obj = cqt0Var;
                        break;
                    }
                    obj = bqt0Var;
                    break;
                }
                i = 3;
                fqt0 fqt0VarW = bjxVar.W((rpt0) it4.next());
                if (!fqt0VarW.equals(aqt0Var)) {
                    if (fqt0VarW.equals(eqt0Var)) {
                        obj = eqt0Var;
                        break;
                    }
                    if (fqt0VarW.equals(bqt0Var)) {
                        z = true;
                    } else if (fqt0VarW.equals(cqt0Var)) {
                        z2 = true;
                    } else if (!fqt0VarW.equals(dqt0Var)) {
                        eg.o();
                        return 0;
                    }
                }
            }
            if (obj.equals(dqt0Var)) {
                return 4;
            }
            if (!obj.equals(cqt0Var)) {
                if (obj.equals(eqt0Var)) {
                    this.d = new DrmSession.DrmSessionException(6000, new SunsetUpgradeRequiredException());
                    return 1;
                }
                if (obj.equals(bqt0Var)) {
                    this.d = new DrmSession.DrmSessionException(6000, new IllegalStateException("Fetch failed"));
                    return 1;
                }
                if (obj.equals(aqt0Var)) {
                    eg.o();
                    return 0;
                }
                if (!this.e) {
                    this.e = true;
                    Logger.k("DrmSession was missing keyIds for mediaSessionID: ".concat(str), new Object[0]);
                    n57.s("DrmSession was missing keyIds");
                    return i;
                }
            }
        }
        obj = aqt0Var;
        if (obj.equals(dqt0Var)) {
            return 4;
        }
        if (!obj.equals(cqt0Var)) {
            if (obj.equals(eqt0Var)) {
                this.d = new DrmSession.DrmSessionException(6000, new SunsetUpgradeRequiredException());
                return 1;
            }
            if (obj.equals(bqt0Var)) {
                this.d = new DrmSession.DrmSessionException(6000, new IllegalStateException("Fetch failed"));
                return 1;
            }
            if (obj.equals(aqt0Var)) {
                eg.o();
                return 0;
            }
            if (!this.e) {
                this.e = true;
                Logger.k("DrmSession was missing keyIds for mediaSessionID: ".concat(str), new Object[0]);
                n57.s("DrmSession was missing keyIds");
                return i;
            }
        }
        return i;
    }

    public final Map h() {
        return b7x.a;
    }

    public final boolean i(String str) {
        return false;
    }

    public final void c(b9v b9vVar) {
    }

    public final void g(b9v b9vVar) {
    }
}
