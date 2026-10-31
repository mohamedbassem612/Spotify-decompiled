package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.CuratedItems;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hy1 {
    public final av1 a;
    public final ugb b;
    public String c = "";
    public pia1 d = pia1.a;
    public List e = z6x.a;
    public Set f = w7x.a;
    public Set g;
    public String h;

    public hy1(av1 av1Var, ugb ugbVar) {
        this.a = av1Var;
        this.b = ugbVar;
        zu1 zu1Var = av1Var.b;
        this.h = zu1Var != null ? zu1Var.a : null;
    }

    public final YourLibraryRequest a() {
        hvm1 hvm1VarB = b();
        qsm1 qsm1VarN = YourLibraryConfig$YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1.RECENTLY_ADDED);
        hvm1VarB.H(qsm1VarN);
        hvm1VarB.q(true);
        bho bhoVar = (bho) hvm1VarB.n().toBuilder();
        cho choVar = cho.ONLY_CURATED;
        bhoVar.r(choVar);
        hvm1VarB.r(bhoVar);
        gvm1 gvm1VarO = YourLibraryRequest.o();
        gvm1VarO.n(hvm1VarB);
        gvm1VarO.t(500);
        gvm1VarO.s(d(choVar));
        return (YourLibraryRequest) gvm1VarO.build();
    }

    public final hvm1 b() {
        rsm1 rsm1Var;
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        jsm1 jsm1VarR = YourLibraryConfig$YourLibraryFilters.r();
        jsm1VarR.q(ksm1.PLAYLIST);
        jsm1VarR.q(ksm1.WRITABLE);
        hvm1VarQ.u((YourLibraryConfig$YourLibraryFilters) jsm1VarR.build());
        qsm1 qsm1VarN = YourLibraryConfig$YourLibrarySortOrder.n();
        int iOrdinal = this.d.ordinal();
        Long lValueOf = null;
        if (iOrdinal == 0) {
            rsm1Var = rsm1.NAME;
        } else if (iOrdinal == 1) {
            rsm1Var = rsm1.RECENTLY_ADDED;
        } else if (iOrdinal == 2) {
            rsm1Var = rsm1.RECENTLY_UPDATED;
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            rsm1Var = rsm1.RECENTLY_PLAYED_OR_ADDED;
        }
        qsm1VarN.n(rsm1Var);
        hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
        gy1 gy1Var = this.a.i;
        if (!(gy1Var instanceof fy1) && !(gy1Var instanceof by1)) {
            bho bhoVarQ = CuratedItems.q();
            bhoVarQ.n(this.e);
            hvm1VarQ.s((CuratedItems) bhoVarQ.build());
        }
        hvm1VarQ.K(this.c);
        hvm1VarQ.w();
        hvm1VarQ.C(Integer.MAX_VALUE);
        String str = this.h;
        if (str != null) {
            bzu0 bzu0VarC = oxu0.a.c(str);
            bzu0 bzu0Var = bzu0VarC instanceof bzu0 ? bzu0VarC : null;
            if (bzu0Var != null) {
                rhc rhcVarV = u890.v(bzu0Var.b);
                if (rhcVarV.a.length != 8) {
                    hhg1.f(l1d.m("Invalid folderId, ", this.h));
                    return null;
                }
                lValueOf = Long.valueOf(rhcVarV.a().asLongBuffer().get());
            }
        }
        if (lValueOf != null) {
            hvm1VarQ.v(lValueOf.longValue());
        }
        hvm1VarQ.D();
        hvm1VarQ.q(this.c.length() > 0);
        return hvm1VarQ;
    }

    public final YourLibraryRequest c() {
        hvm1 hvm1VarB = b();
        bho bhoVar = (bho) hvm1VarB.n().toBuilder();
        cho choVar = cho.ONLY_NOT_CURATED;
        bhoVar.r(choVar);
        hvm1VarB.r(bhoVar);
        gvm1 gvm1VarO = YourLibraryRequest.o();
        gvm1VarO.n(hvm1VarB);
        gvm1VarO.t(500);
        gvm1VarO.s(d(choVar));
        return (YourLibraryRequest) gvm1VarO.build();
    }

    public final YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs d(cho choVar) {
        lkg1 smsVar;
        kqu0 kqu0Var = new kqu0(this.g, choVar);
        by1 by1Var = this.a.i;
        Set set = this.f;
        if (by1Var instanceof fy1) {
            smsVar = lkg1.b;
        } else if (by1Var instanceof by1) {
            smsVar = new sms(by1Var.a, (byte) 0);
        } else {
            boolean z = by1Var instanceof cy1;
            kly0 kly0Var = this.b.a;
            smsVar = z ? new sms(((glc0) kly0Var.get()).a(set), (byte) 1) : ((glc0) kly0Var.get()).a(set);
        }
        kmv0 kmv0VarA = smsVar.a(kqu0Var);
        psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
        osm1 osm1Var = kmv0VarA.a;
        if (osm1Var != null) {
            nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO.q(osm1Var);
            psm1VarP.u(nsm1VarO);
        }
        osm1 osm1Var2 = kmv0VarA.b;
        if (osm1Var2 != null) {
            nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO2.q(osm1Var2);
            psm1VarP.z(nsm1VarO2);
        }
        osm1 osm1Var3 = kmv0VarA.c;
        if (osm1Var3 != null) {
            nsm1 nsm1VarO3 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO3.q(osm1Var3);
            psm1VarP.r(nsm1VarO3);
        }
        osm1 osm1Var4 = kmv0VarA.d;
        if (osm1Var4 != null) {
            nsm1 nsm1VarO4 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO4.q(osm1Var4);
            psm1VarP.t(nsm1VarO4);
        }
        return psm1VarP.build();
    }

    public final void e(Set set) {
        this.g = set;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void g(List list) {
        this.e = list;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            Set set = s4b1.f;
            arrayList.add(uic.x(str).c);
        }
        this.f = o7h.p1(arrayList);
    }

    public final void h(pia1 pia1Var, String str) {
        this.d = pia1Var;
        this.c = str;
    }
}
