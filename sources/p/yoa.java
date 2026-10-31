package p;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yoa implements woa {
    public final m2p a;
    public final rma b;
    public final m021 c;
    public final String d;
    public final xoa e;
    public final LinkedHashMap f;

    public yoa(m2p m2pVar, rma rmaVar, q74 q74Var, m021 m021Var, e8r e8rVar) {
        this.a = m2pVar;
        this.b = rmaVar;
        this.c = m021Var;
        int iA = q74Var.a();
        this.d = hap1.g(iA);
        this.f = new LinkedHashMap();
        jap1.x(iA);
        if (iA > 0) {
            this.e = new xoa(this, iA);
        }
    }

    @Override // p.woa
    public final uoa b(String str, o2u0 o2u0Var, w2k1 w2k1Var, kma kmaVar, List list, boolean z, bas basVar, sr20 sr20Var, un10 un10Var) {
        List listA;
        LinkedHashMap linkedHashMap = this.f;
        Trace.beginSection("BetamaxPlayerPool.Acquire");
        try {
            jap1.z(this.d);
            zoa zoaVar = o2u0Var != null ? new zoa(str, o2u0Var) : null;
            Trace.beginSection("BetamaxPlayerPool.KeyLookup");
            try {
                uoa uoaVarA = (uoa) linkedHashMap.get(zoaVar);
                Trace.endSection();
                xoa xoaVar = this.e;
                if (uoaVarA == null || zoaVar == null) {
                    if (z) {
                        m021 m021Var = this.c;
                        if (basVar == null) {
                            basVar = new bas(3);
                        }
                        listA = m021Var.b(basVar).a();
                    } else {
                        listA = z6x.a;
                    }
                    soa soaVarF = this.a.a(this.b.a()).f();
                    soaVarF.w = str;
                    soaVarF.C = un10Var;
                    soaVarF.u = w2k1Var;
                    soaVarF.v = new ArrayList(o7h.N0(list, listA));
                    soaVarF.x = z;
                    soaVarF.y = true;
                    if (kmaVar != null) {
                        soaVarF.z = kmaVar;
                    }
                    if (sr20Var != null) {
                        soaVarF.E = sr20Var;
                    }
                    Trace.beginSection("BetamaxPlayerPool.BuildPlayer");
                    try {
                        uoaVarA = soaVarF.a();
                        Trace.endSection();
                        if (xoaVar != null) {
                            Trace.beginSection("BetamaxPlayerPool.CacheAccess");
                            try {
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (zoaVar != null) {
                            linkedHashMap.put(zoaVar, uoaVarA);
                        }
                        jap1.y(xoaVar != null ? xoaVar.size() : linkedHashMap.size(), "BetamaxPlayerPool.Miss");
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    if (xoaVar != null) {
                        Trace.beginSection("BetamaxPlayerPool.CacheAccess");
                        try {
                            Trace.endSection();
                        } finally {
                            Trace.endSection();
                        }
                    }
                    jap1.y(xoaVar != null ? xoaVar.size() : linkedHashMap.size(), "BetamaxPlayerPool.Hit");
                }
                return uoaVarA;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // p.woa
    public final void c(uoa uoaVar) {
        uoa uoaVar2;
        xoa xoaVar = this.e;
        if (xoaVar != null) {
            Trace.beginSection("BetamaxPlayerPool.CacheAccess");
            try {
                uoaVar2 = (uoa) xoaVar.remove(uoaVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            uoaVar2 = null;
        }
        if (uoaVar2 == null) {
            d(uoaVar, false);
        }
    }

    public final void d(uoa uoaVar, boolean z) {
        Object next;
        LinkedHashMap linkedHashMap = this.f;
        String strSubstring = z ? "BetamaxPlayerPool.EvictionWork" : "BetamaxPlayerPool.ReleaseWork";
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
        try {
            Iterator it = linkedHashMap.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((Map.Entry) next).getValue(), uoaVar));
            Map.Entry entry = (Map.Entry) next;
            zoa zoaVar = entry != null ? (zoa) entry.getKey() : null;
            if (zoaVar != null) {
            }
            xoa xoaVar = this.e;
            int size = xoaVar != null ? xoaVar.size() : linkedHashMap.size();
            if (z) {
                jap1.y(size, "BetamaxPlayerPool.Eviction");
            } else {
                jap1.y(size, "BetamaxPlayerPool.Release");
            }
            Trace.beginSection("BetamaxPlayerPool.PlayerRelease");
            try {
                uoaVar.i();
                Trace.endSection();
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
