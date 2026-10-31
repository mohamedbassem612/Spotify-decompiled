package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.PlaylistRange;
import spotify.playlist.esperanto.proto.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class mlu0 {
    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0 A[PHI: r5
      0x00e0: PHI (r5v2 p.vqu0) = (r5v0 p.vqu0), (r5v1 p.vqu0), (r5v1 p.vqu0), (r5v0 p.vqu0) binds: [B:74:0x00e4, B:77:0x00eb, B:91:0x0104, B:70:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(d dVar, g3d0 g3d0Var) {
        boolean z = g3d0Var instanceof x2d0;
        vqu0 vqu0Var = vqu0.NAME_ASC;
        if (z) {
            if (((x2d0) g3d0Var).a) {
                vqu0Var = vqu0.NAME_DESC;
            }
        } else if (g3d0Var instanceof o2d0) {
            vqu0Var = ((o2d0) g3d0Var).a ? vqu0.ADDED_BY_DESC : vqu0.ADDED_BY_ASC;
        } else {
            boolean z2 = g3d0Var instanceof m2d0;
            vqu0 vqu0Var2 = vqu0.ADD_TIME_DESC;
            if (z2) {
                if (((m2d0) g3d0Var).a) {
                    vqu0Var = vqu0Var2;
                } else {
                    vqu0Var = vqu0.ADD_TIME_ASC;
                }
            } else if (g3d0Var instanceof w2d0) {
                vqu0Var = ((w2d0) g3d0Var).a ? vqu0.DURATION_DESC : vqu0.DURATION_ASC;
            } else if (g3d0Var instanceof e3d0) {
                vqu0Var = ((e3d0) g3d0Var).a ? vqu0.SHOW_NAME_DESC : vqu0.SHOW_NAME_ASC;
            } else {
                boolean z3 = g3d0Var instanceof q2d0;
                vqu0 vqu0Var3 = vqu0.ALBUM_NAME_ASC;
                if (z3) {
                    if (((q2d0) g3d0Var).a) {
                        vqu0Var = vqu0.ALBUM_NAME_DESC;
                    } else {
                        vqu0Var = vqu0Var3;
                    }
                } else if (g3d0Var instanceof v2d0) {
                    vqu0Var = ((v2d0) g3d0Var).a ? vqu0.DISC_NUMBER_DESC : vqu0.DISC_NUMBER_ASC;
                } else {
                    boolean z4 = g3d0Var instanceof s2d0;
                    vqu0 vqu0Var4 = vqu0.ARTIST_NAME_ASC;
                    if (z4) {
                        if (((s2d0) g3d0Var).a) {
                            vqu0Var = vqu0.ARTIST_NAME_DESC;
                        } else {
                            vqu0Var = vqu0Var4;
                        }
                    } else if (g3d0Var instanceof c3d0) {
                        vqu0Var = ((c3d0) g3d0Var).a ? vqu0.PUBLISH_DATE_DESC : vqu0.PUBLISH_DATE_ASC;
                    } else if (g3d0Var instanceof f3d0) {
                        vqu0Var = ((f3d0) g3d0Var).a ? vqu0.TRACK_NUMBER_DESC : vqu0.TRACK_NUMBER_ASC;
                    } else if (g3d0Var instanceof p2d0) {
                        vqu0Var = ((p2d0) g3d0Var).a ? vqu0.ALBUM_ARTIST_NAME_DESC : vqu0.ALBUM_ARTIST_NAME_ASC;
                    } else {
                        boolean z5 = g3d0Var instanceof z2d0;
                        vqu0 vqu0Var5 = vqu0.PROVIDED_ASC;
                        if (z5) {
                            if (((z2d0) g3d0Var).a()) {
                                vqu0Var = vqu0.PROVIDED_DESC;
                            } else {
                                vqu0Var = vqu0Var5;
                            }
                        } else if (g3d0Var instanceof a3d0) {
                            vqu0Var = vqu0Var5;
                        } else {
                            boolean z6 = g3d0Var instanceof u2d0;
                            vqu0Var5 = vqu0.NO_SORT;
                            if (z6) {
                                vqu0Var = vqu0Var5;
                            } else if (!(g3d0Var instanceof y2d0)) {
                                if (g3d0Var instanceof n2d0) {
                                    vqu0Var = vqu0Var2;
                                } else if (g3d0Var instanceof r2d0) {
                                    vqu0Var = vqu0Var3;
                                } else if (g3d0Var instanceof t2d0) {
                                    vqu0Var = vqu0Var4;
                                } else {
                                    if (g3d0Var != null) {
                                        eg.o();
                                        return;
                                    }
                                    vqu0Var = vqu0Var5;
                                }
                            }
                        }
                    }
                }
            }
        }
        dVar.D(vqu0Var);
        if (g3d0Var instanceof b3d0) {
            dVar.z(((b3d0) g3d0Var).b());
        }
    }

    public static PlaylistQuery b(boolean z, trc0 trc0Var) {
        Object next;
        Object next2;
        yvu0 yvu0Var;
        List<List> list;
        clc0 clc0Var;
        d dVarY = PlaylistQuery.y();
        Set set = trc0Var.c;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((orc0) next) instanceof jrc0));
        jrc0 jrc0Var = next instanceof jrc0 ? (jrc0) next : null;
        String str = jrc0Var != null ? jrc0Var.a : null;
        if (str == null) {
            str = "";
        }
        dVarY.F(str);
        dVarY.w(z);
        a(dVarY, trc0Var.b);
        dVarY.y(trc0Var.d);
        dVarY.G(trc0Var.h);
        dVarY.C(!set.contains(yqc0.a));
        Set set2 = set;
        Iterator it2 = set2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(((orc0) next2) instanceof hrc0));
        hrc0 hrc0Var = next2 instanceof hrc0 ? (hrc0) next2 : null;
        String str2 = hrc0Var != null ? hrc0Var.a : null;
        dVarY.x(str2 != null ? str2 : "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (obj instanceof qqc0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((qqc0) it3.next()).a);
        }
        dVarY.q(arrayList2);
        int iOrdinal = trc0Var.g.ordinal();
        if (iOrdinal == 0) {
            yvu0Var = yvu0.NO_RESTRICTION;
        } else if (iOrdinal == 1) {
            yvu0Var = yvu0.RESTRICT_SOURCE_TO_50;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            yvu0Var = yvu0.RESTRICT_SOURCE_TO_500;
        }
        dVarY.E(yvu0Var);
        mqz0 mqz0Var = trc0Var.f;
        if (!u890.j(mqz0Var, hqz0.a)) {
            if (mqz0Var instanceof iqz0) {
                wqu0 wqu0VarN = PlaylistRange.n();
                iqz0 iqz0Var = (iqz0) mqz0Var;
                wqu0VarN.q(iqz0Var.a);
                wqu0VarN.n(iqz0Var.b);
                dVarY.B((PlaylistRange) wqu0VarN.build());
            } else {
                if (!u890.j(mqz0Var, jqz0.a)) {
                    eg.o();
                    return null;
                }
                wqu0 wqu0VarN2 = PlaylistRange.n();
                wqu0VarN2.q(0);
                wqu0VarN2.n(0);
                dVarY.B((PlaylistRange) wqu0VarN2.build());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : set2) {
            if (obj2 instanceof arc0) {
                arrayList3.add(obj2);
            }
        }
        arc0 arc0Var = (arc0) o7h.s0(arrayList3);
        if (arc0Var == null || (list = arc0Var.a) == null) {
            list = z6x.a;
        }
        for (List list2 : list) {
            spotify.playlist.esperanto.proto.c cVarO = PlaylistQuery.AttributeFilter.o();
            cVarO.n(list2);
            dVarY.u((PlaylistQuery.AttributeFilter) cVarO.build());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : set2) {
            if (obj3 instanceof irc0) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            r7h.W(((irc0) it4.next()).a(), arrayList5);
        }
        if (!arrayList5.isEmpty()) {
            dVarY.t(arrayList5);
        }
        src0 src0Var = trc0Var.e;
        if (src0Var instanceof rrc0) {
            Set set3 = ((rrc0) src0Var).a;
            ArrayList arrayList6 = new ArrayList(q7h.U(set3, 10));
            Iterator it5 = set3.iterator();
            while (it5.hasNext()) {
                switch (((dlc0) it5.next()).ordinal()) {
                    case 0:
                        clc0Var = clc0.CLIP;
                        break;
                    case 1:
                        clc0Var = clc0.SHOW;
                        break;
                    case 2:
                        clc0Var = clc0.ALBUM;
                        break;
                    case 3:
                        clc0Var = clc0.TRACK;
                        break;
                    case 4:
                        clc0Var = clc0.ARTIST;
                        break;
                    case 5:
                        clc0Var = clc0.KALLAX;
                        break;
                    case 6:
                        clc0Var = clc0.EPISODE;
                        break;
                    case 7:
                        clc0Var = clc0.LOCAL_TRACK;
                        break;
                    case 8:
                    default:
                        clc0Var = clc0.UNRECOGNIZED;
                        break;
                    case 9:
                        clc0Var = clc0.PODCAST_CHAPTER;
                        break;
                }
                arrayList6.add(clc0Var);
            }
            dVarY.s(o7h.l1(arrayList6));
        } else {
            if (!u890.j(src0Var, qrc0.a)) {
                eg.o();
                return null;
            }
            dVarY.v();
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = set2.iterator();
        while (it6.hasNext()) {
            uqu0 uqu0Var = (uqu0) nlu0.a.get((orc0) it6.next());
            if (uqu0Var != null) {
                arrayList7.add(uqu0Var);
            }
        }
        dVarY.n(arrayList7);
        dVarY.r(trc0Var.i);
        return (PlaylistQuery) dVarY.build();
    }
}
