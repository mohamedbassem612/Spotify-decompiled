package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ibv extends a8d1 implements zu30 {
    public /* synthetic */ Boolean a;
    public /* synthetic */ Set b;
    public /* synthetic */ YourLibraryResponse c;
    public final /* synthetic */ goq d;
    public final /* synthetic */ lia1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibv(goq goqVar, lia1 lia1Var, String str, String str2, lnm lnmVar) {
        super(4, lnmVar);
        this.d = goqVar;
        this.e = lia1Var;
        this.f = str;
        this.g = str2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = this.f;
        String str2 = this.g;
        ibv ibvVar = new ibv(this.d, this.e, str, str2, (lnm) obj4);
        ibvVar.a = (Boolean) obj;
        ibvVar.b = (Set) obj2;
        ibvVar.c = (YourLibraryResponse) obj3;
        return ibvVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        int i;
        wcv xcvVar;
        Boolean bool = this.a;
        Set set = this.b;
        YourLibraryResponse yourLibraryResponse = this.c;
        hm5.M(obj);
        goq goqVar = this.d;
        hbv hbvVar = (hbv) goqVar.d;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        boolean zY0 = ihc1.y0(this.f);
        boolean z3 = !zY0;
        boolean z4 = ((ak3) goqVar.e) == ak3.c;
        hbvVar.getClass();
        h290 h290VarN = yourLibraryResponse.n();
        String str = this.g;
        if (zY0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : h290VarN) {
                YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj2;
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasPlaylist() && yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().C()) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) it.next()).w().q().getUri());
            }
            h290 arrayList2 = new ArrayList();
            for (Object obj3 : h290VarN) {
                YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2 = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj3;
                if (!set.contains(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.e().getUri())) {
                    if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.C() ? linkedHashSet.contains(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.e().getUri()) : (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.hasPlaylist() && yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.w().C() && !u890.j(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.w().q().getUri(), str)) ? false : true) {
                    }
                }
                arrayList2.add(obj3);
            }
            h290VarN = arrayList2;
        }
        smc0 smc0VarN = k4p1.n();
        zwm1 zwm1Var = hbvVar.b;
        if (z4 && str == null) {
            String str2 = ebv.a;
            smc0VarN.add(new xcv(str2, zwm1Var.i(), zwm1Var.i(), set.contains(str2), (String) null, false, (String) null, false, false, 0, (Map) null, 0, 8176));
        }
        cev cevVar = hbvVar.a;
        cevVar.getClass();
        Iterable iterable = (Iterable) h290VarN;
        ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3 = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) it2.next();
            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.C()) {
                String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getUri();
                String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getName();
                String strQ = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.u().q();
                if (strQ == null) {
                    strQ = "";
                }
                xcvVar = new wcv(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.u().o(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.u().p(), uri, name, strQ, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().p());
                z = zBooleanValue;
                z2 = z4;
            } else {
                String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getUri();
                String name2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getName();
                String strQ2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().q();
                String strO = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().o();
                boolean z5 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().z();
                boolean zS = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().s();
                boolean zP = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().p();
                YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w();
                z = zBooleanValue;
                z2 = z4;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0(yhu0.a, Integer.valueOf(cev.a(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.e))), new mmr0(yhu0.b, Integer.valueOf(cev.a(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.h))), new mmr0(yhu0.c, Integer.valueOf(cev.a(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.g))), new mmr0(yhu0.d, Integer.valueOf(cev.a(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.t))), new mmr0(yhu0.e, Integer.valueOf(cev.b(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, Collections.singleton(clc0.i)))), new mmr0(yhu0.f, Integer.valueOf(cev.b(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, f46.S0(new clc0[]{clc0.c, clc0.d, clc0.f, clc0.N0}))))});
                int iOrdinal = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().s().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    i = 3;
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                String strB = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().B();
                strB.getClass();
                String uri3 = strB.length() > 0 ? strB : null;
                if (uri3 == null) {
                    uri3 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getUri();
                }
                String str3 = uri3;
                str3.getClass();
                boolean z6 = (z || !yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().s()) && (cevVar.a || (!z2 ? cev.d(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w()) : yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w().s() || !(cev.c(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w()) || cev.d(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.w()))));
                String uri4 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity3.e().getUri();
                xcvVar = new xcv(uri2, name2, str3, zP, strQ2, z6, strO, z5, zS, i, mapJ, (uri4.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || uri4.equals("spotify:collection:tracks") || uri4.equals("spotify:internal:collection:tracks") || (nhc1.Y(uri4, "spotify:user:", false) && nhc1.R(uri4, ":collection", false))) ? 2 : 4, 16);
            }
            arrayList3.add(xcvVar);
            zBooleanValue = z;
            it2 = it2;
            z4 = z2;
            z3 = z3;
        }
        boolean z7 = z3;
        smc0VarN.addAll(arrayList3);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        ArrayList<xcv> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                break;
            }
            Object next = rmc0Var.next();
            if (set.contains(((ycv) next).getUri())) {
                arrayList4.add(next);
            } else {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList4, 10));
        for (xcv xcvVarC : arrayList4) {
            if (xcvVarC instanceof xcv) {
                xcvVarC = xcv.c(xcvVarC, true, 8167);
            } else if (!(xcvVarC instanceof wcv)) {
                eg.o();
                return null;
            }
            arrayList6.add(xcvVarC);
        }
        return new gbv(this.e, arrayList6, arrayList5, z7, set);
    }
}
