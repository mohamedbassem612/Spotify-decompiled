package p;

import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.Permission;
import com.spotify.playlist.proto.PermissionGrantDescription;
import com.spotify.playlist.proto.SetBasePermissionRequest;
import com.spotify.playlist.proto.SetMemberPermissionRequest;
import java.util.List;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.PlaylistRange;
import spotify.playlist.esperanto.proto.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xyc0 implements iyc0 {
    public final thy0 a;
    public final dmr b;
    public final q8n c;
    public final jn7 d;
    public final yn4 e;
    public final gqu0 f;
    public final jn7 g;

    static {
        new xgc((byte) 14);
    }

    public xyc0(thy0 thy0Var, dmr dmrVar, q8n q8nVar, jn7 jn7Var, yn4 yn4Var, gqu0 gqu0Var, jn7 jn7Var2) {
        this.a = thy0Var;
        this.b = dmrVar;
        this.c = q8nVar;
        this.d = jn7Var;
        this.e = yn4Var;
        this.f = gqu0Var;
        this.g = jn7Var2;
    }

    public static SaveSource w(zxc0 zxc0Var) {
        oc41 oc41VarP = SaveSource.p();
        oc41VarP.n(zxc0Var.a().a);
        return oc41VarP.build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(String str, List list, String str2, String str3, zxc0 zxc0Var, onm onmVar) {
        myc0 myc0Var;
        String str4;
        ModificationRequest modificationRequest;
        if (onmVar instanceof myc0) {
            myc0Var = (myc0) onmVar;
            int i = myc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                myc0Var.e = i - Integer.MIN_VALUE;
            } else {
                myc0Var = new myc0(this, onmVar);
            }
        } else {
            myc0Var = new myc0(this, onmVar);
        }
        myc0 myc0Var2 = myc0Var;
        Object obj = myc0Var2.c;
        int i2 = myc0Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (list.isEmpty()) {
                hhg1.n("You need to add at least one item when adding items.");
                return null;
            }
            com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
            bVarR.B("add");
            bVarR.q(list);
            if (zxc0Var != null) {
                bVarR.D(w(zxc0Var));
            }
            ModificationRequest modificationRequestBuild = bVarR.build();
            myc0Var2.a = str;
            myc0Var2.b = modificationRequestBuild;
            myc0Var2.e = 1;
            if (h(str, str2, list, str3, myc0Var2) != d9nVar) {
                str4 = str;
                modificationRequest = modificationRequestBuild;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ModificationRequest modificationRequest2 = myc0Var2.b;
        String str5 = myc0Var2.a;
        hm5.M(obj);
        modificationRequest = modificationRequest2;
        str4 = str5;
        modificationRequest.getClass();
        myc0Var2.a = null;
        myc0Var2.b = null;
        myc0Var2.e = 2;
        Object objH = c921.H(this.c, new pyc0(this, str4, modificationRequest, (lnm) null, (byte) 0), myc0Var2);
        return objH == d9nVar ? d9nVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object e(String str, List list, String str2, String str3, String str4, zxc0 zxc0Var, onm onmVar) {
        nyc0 nyc0Var;
        String str5;
        ModificationRequest modificationRequest;
        if (onmVar instanceof nyc0) {
            nyc0Var = (nyc0) onmVar;
            int i = nyc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nyc0Var.e = i - Integer.MIN_VALUE;
            } else {
                nyc0Var = new nyc0(this, onmVar);
            }
        } else {
            nyc0Var = new nyc0(this, onmVar);
        }
        nyc0 nyc0Var2 = nyc0Var;
        Object obj = nyc0Var2.c;
        int i2 = nyc0Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (list.isEmpty()) {
                hhg1.n("You need to add at least one item when adding items.");
                return null;
            }
            com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
            bVarR.B("add");
            bVarR.t(str2);
            bVarR.q(list);
            if (zxc0Var != null) {
                bVarR.D(w(zxc0Var));
            }
            ModificationRequest modificationRequestBuild = bVarR.build();
            nyc0Var2.a = str;
            nyc0Var2.b = modificationRequestBuild;
            nyc0Var2.e = 1;
            if (h(str, str3, list, str4, nyc0Var2) != d9nVar) {
                str5 = str;
                modificationRequest = modificationRequestBuild;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        modificationRequest = nyc0Var2.b;
        str5 = nyc0Var2.a;
        hm5.M(obj);
        modificationRequest.getClass();
        nyc0Var2.a = null;
        nyc0Var2.b = null;
        nyc0Var2.e = 2;
        Object objH = c921.H(this.c, new pyc0(this, str5, modificationRequest, (lnm) null, (byte) 0), nyc0Var2);
        return objH == d9nVar ? d9nVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(String str, List list, String str2, String str3, String str4, zxc0 zxc0Var, onm onmVar) {
        oyc0 oyc0Var;
        String str5;
        ModificationRequest modificationRequest;
        if (onmVar instanceof oyc0) {
            oyc0Var = (oyc0) onmVar;
            int i = oyc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oyc0Var.e = i - Integer.MIN_VALUE;
            } else {
                oyc0Var = new oyc0(this, onmVar);
            }
        } else {
            oyc0Var = new oyc0(this, onmVar);
        }
        oyc0 oyc0Var2 = oyc0Var;
        Object obj = oyc0Var2.c;
        int i2 = oyc0Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (list.isEmpty()) {
                hhg1.n("You need to add at least one item when adding items.");
                return null;
            }
            com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
            bVarR.B("add");
            bVarR.w(str2);
            bVarR.q(list);
            if (zxc0Var != null) {
                bVarR.D(w(zxc0Var));
            }
            ModificationRequest modificationRequestBuild = bVarR.build();
            oyc0Var2.a = str;
            oyc0Var2.b = modificationRequestBuild;
            oyc0Var2.e = 1;
            if (h(str, str3, list, str4, oyc0Var2) != d9nVar) {
                str5 = str;
                modificationRequest = modificationRequestBuild;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        modificationRequest = oyc0Var2.b;
        str5 = oyc0Var2.a;
        hm5.M(obj);
        modificationRequest.getClass();
        oyc0Var2.a = null;
        oyc0Var2.b = null;
        oyc0Var2.e = 2;
        Object objH = c921.H(this.c, new pyc0(this, str5, modificationRequest, (lnm) null, (byte) 0), oyc0Var2);
        return objH == d9nVar ? d9nVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        syc0 syc0Var;
        Object m231Var;
        v6b1 v6b1Var;
        if (onmVar instanceof syc0) {
            syc0Var = (syc0) onmVar;
            int i = syc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                syc0Var.c = i - Integer.MIN_VALUE;
            } else {
                syc0Var = new syc0(this, onmVar);
            }
        } else {
            syc0Var = new syc0(this, onmVar);
        }
        Object objQ = syc0Var.a;
        int i2 = syc0Var.c;
        boolean z = true;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                try {
                    v6b1Var = new y6b1(str, false).c;
                } catch (SpotifyUriParserException unused) {
                    v6b1Var = v6b1.E1;
                }
                v6b1Var.getClass();
                int iOrdinal = v6b1Var.ordinal();
                if (iOrdinal == 12 || iOrdinal == 13) {
                    jn7 jn7Var = this.g;
                    pmu0 pmu0VarN = PlaylistGetRequest.n();
                    pmu0VarN.t(str);
                    d dVarY = PlaylistQuery.y();
                    wqu0 wqu0VarN = PlaylistRange.n();
                    wqu0VarN.q(0);
                    wqu0VarN.n(0);
                    dVarY.A(wqu0VarN);
                    pmu0VarN.r(dVarY);
                    hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                    sku0 sku0VarP = PlaylistDecorationPolicy.p();
                    sku0VarP.H();
                    hru0VarS.x(sku0VarP);
                    pmu0VarN.q(hru0VarS);
                    PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) pmu0VarN.build();
                    syc0Var.c = 1;
                    objQ = jn7Var.q(playlistGetRequest, syc0Var);
                    d9n d9nVar = d9n.a;
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                }
                return yah0.m(zBooleanValue);
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
            if (((PlaylistGetResponse) objQ).o().C().q().s().length() != 0) {
                z = false;
            }
            m231Var = yah0.m(z);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Object objM = yah0.m(false);
        if (m231Var instanceof m231) {
            m231Var = objM;
        }
        zBooleanValue = ((Boolean) m231Var).booleanValue();
        return yah0.m(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, List list, String str3, onm onmVar) {
        tyc0 tyc0Var;
        if (onmVar instanceof tyc0) {
            tyc0Var = (tyc0) onmVar;
            int i = tyc0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyc0Var.g = i - Integer.MIN_VALUE;
            } else {
                tyc0Var = new tyc0(this, onmVar);
            }
        } else {
            tyc0Var = new tyc0(this, onmVar);
        }
        Object objG = tyc0Var.e;
        int i2 = tyc0Var.g;
        if (i2 == 0) {
            hm5.M(objG);
            tyc0Var.a = str;
            tyc0Var.b = str2;
            tyc0Var.c = list;
            tyc0Var.d = str3;
            tyc0Var.g = 1;
            objG = g(str, tyc0Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = tyc0Var.d;
            list = tyc0Var.c;
            str2 = tyc0Var.b;
            str = tyc0Var.a;
            hm5.M(objG);
        }
        String str4 = str;
        String str5 = str2;
        List list2 = list;
        String str6 = str3;
        if (((Boolean) objG).booleanValue()) {
            this.b.a(str4, str5, false, str6, list2);
        }
        return rih1.a;
    }

    public final Object i(String str, String str2, List list, onm onmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("move");
        bVarR.n(list);
        if (str2 == null) {
            str2 = "end";
        }
        bVarR.t(str2);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        Object objJ = j(str, modificationRequest, onmVar);
        return objJ == d9n.a ? objJ : (py21) objJ;
    }

    public final Object j(String str, ModificationRequest modificationRequest, onm onmVar) {
        return c921.H(this.c, new pyc0(this, str, modificationRequest, (lnm) null, (byte) 1), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r9 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.uyc0
            if (r0 == 0) goto L13
            r0 = r9
            p.uyc0 r0 = (p.uyc0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.uyc0 r0 = new p.uyc0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            p.hm5.M(r9)
            goto Lbe
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L32:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L86
        L38:
            p.hm5.M(r9)
            p.pmu0 r9 = spotify.playlist.esperanto.proto.PlaylistGetRequest.n()
            r9.t(r8)
            p.hru0 r1 = com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy.s()
            p.vwu0 r6 = com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy.r()
            r6.A()
            r1.z(r6)
            p.llu0 r6 = com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy.r()
            r6.x()
            r1.t(r6)
            com.google.protobuf.h r1 = r1.build()
            com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy r1 = (com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy) r1
            r9.n(r1)
            spotify.playlist.esperanto.proto.d r1 = spotify.playlist.esperanto.proto.PlaylistQuery.y()
            r1.C(r4)
            r1.w(r4)
            r1.v()
            r9.r(r1)
            com.google.protobuf.h r9 = r9.build()
            spotify.playlist.esperanto.proto.PlaylistGetRequest r9 = (spotify.playlist.esperanto.proto.PlaylistGetRequest) r9
            r0.a = r8
            r0.d = r4
            p.jn7 r1 = r7.g
            java.lang.Object r9 = r1.q(r9, r0)
            if (r9 != r5) goto L86
            goto Lbd
        L86:
            spotify.playlist.esperanto.proto.PlaylistGetResponse r9 = (spotify.playlist.esperanto.proto.PlaylistGetResponse) r9
            com.spotify.playlist.proto.PlaylistRequest$Response r9 = r9.o()
            p.h290 r9 = r9.w()
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = p.q7h.U(r9, r4)
            r1.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L9f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lb3
            java.lang.Object r4 = r9.next()
            com.spotify.playlist.proto.PlaylistRequest$Item r4 = (com.spotify.playlist.proto.PlaylistRequest$Item) r4
            java.lang.String r4 = r4.w()
            r1.add(r4)
            goto L9f
        Lb3:
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = r7.m(r8, r1, r0, r2)
            if (r9 != r5) goto Lbe
        Lbd:
            return r5
        Lbe:
            p.py21 r9 = (p.py21) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xyc0.k(java.lang.String, p.onm):java.lang.Object");
    }

    public final Object l(String str, List list, onm onmVar, tv80 tv80Var) {
        ou80 ou80Var;
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("remove");
        bVarR.q(list);
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(ou80Var.a);
            bVarR.D(oc41VarP.build());
        }
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        Object objJ = j(str, modificationRequest, onmVar);
        return objJ == d9n.a ? objJ : (py21) objJ;
    }

    public final Object m(String str, List list, onm onmVar, tv80 tv80Var) {
        ou80 ou80Var;
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("remove");
        bVarR.n(list);
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(ou80Var.a);
            bVarR.D(oc41VarP.build());
        }
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        Object objJ = j(str, modificationRequest, onmVar);
        return objJ == d9n.a ? objJ : (py21) objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, String str2, List list, String str3, String str4, onm onmVar) {
        vyc0 vyc0Var;
        ModificationRequest modificationRequest;
        vyc0 vyc0Var2;
        if (onmVar instanceof vyc0) {
            vyc0Var = (vyc0) onmVar;
            int i = vyc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyc0Var.e = i - Integer.MIN_VALUE;
            } else {
                vyc0Var = new vyc0(this, onmVar);
            }
        } else {
            vyc0Var = new vyc0(this, onmVar);
        }
        Object obj = vyc0Var.c;
        int i2 = vyc0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (list.isEmpty()) {
                hhg1.n("You need to add at least one item when replacing.");
                return null;
            }
            com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
            bVarR.B("replace");
            bVarR.q(list);
            bVarR.z(str2);
            modificationRequest = (ModificationRequest) bVarR.build();
            vyc0Var.a = str;
            vyc0Var.b = modificationRequest;
            vyc0Var.e = 1;
            vyc0Var2 = vyc0Var;
            if (h(str, str3, list, str4, vyc0Var2) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ModificationRequest modificationRequest2 = vyc0Var.b;
        String str5 = vyc0Var.a;
        hm5.M(obj);
        modificationRequest = modificationRequest2;
        str = str5;
        vyc0Var2 = vyc0Var;
        modificationRequest.getClass();
        vyc0Var2.a = null;
        vyc0Var2.b = null;
        vyc0Var2.e = 2;
        Object objJ = j(str, modificationRequest, vyc0Var2);
        return objJ == d9nVar ? d9nVar : objJ;
    }

    public final Object o(List list, wls0 wls0Var, Integer num, onm onmVar) {
        wj61 wj61VarN = SetBasePermissionRequest.n();
        wj61VarN.n(xgc.n(wls0Var));
        wj61VarN.q(num.intValue());
        return c921.H(this.c, new n0a0(this, list, wj61VarN, (lnm) null, (byte) 14), onmVar);
    }

    public final Object p(String str, String str2, boolean z, boolean z2, onm onmVar) {
        return c921.H(this.c, new wyc0(this, str, z, str2, z2, (lnm) null), onmVar);
    }

    public final Object q(String str, String str2, wls0 wls0Var, Integer num, onm onmVar) {
        tk61 tk61VarN = SetMemberPermissionRequest.n();
        tk61VarN.q(str);
        tk61VarN.s(str2);
        if (wls0Var != null) {
            tk61VarN.n(xgc.n(wls0Var));
        }
        if (num != null) {
            tk61VarN.r(num.intValue());
        }
        return c921.H(this.c, new n0a0(this, tk61VarN, str, (lnm) null, (byte) 16), onmVar);
    }

    public final Object r(String str, com.spotify.playlist.proto.a aVar, onm onmVar) {
        com.spotify.playlist.proto.b bVarR = ModificationRequest.r();
        bVarR.B("set");
        bVarR.u(aVar);
        ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
        modificationRequest.getClass();
        Object objJ = j(str, modificationRequest, onmVar);
        return objJ == d9n.a ? objJ : (py21) objJ;
    }

    public final Object s(String str, List list, List list2, lnm lnmVar) {
        return c921.H(this.c, new z290(this, str, list, list2, (lnm) null, (byte) 13), lnmVar);
    }

    public final Object t(String str, String str2, String str3, phc phcVar, onm onmVar) {
        return c921.H(this.c, new z290(this, str, str2, k4p1.x(new ayc0(str3, (phc) null, phcVar, false, (String) null, 26)), (lnm) null, (byte) 14), onmVar);
    }

    public final Object u(String str, ddd1 ddd1Var, lnm lnmVar) {
        return c921.H(this.c, new ss90(this, k4p1.x(str), (lnm) null, (byte) 28), lnmVar);
    }

    public final gyc0 v(PermissionGrantDescription permissionGrantDescription) {
        wls0 wls0VarD;
        Permission permissionP = permissionGrantDescription.o().p();
        boolean zR = permissionP.r();
        thy0 thy0Var = this.a;
        if (zR) {
            wls0VarD = ((wo30) thy0Var).d(permissionP.p());
        } else {
            wls0VarD = null;
        }
        if (wls0VarD == null) {
            return null;
        }
        int i = 0;
        if (permissionP.s()) {
            yls0 yls0VarQ = permissionP.q();
            ((wo30) thy0Var).getClass();
            int iOrdinal = yls0VarQ.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
            }
        }
        int i2 = i == 0 ? -1 : kyc0.a[l1d.C(i)];
        if (i2 == -1) {
            return new dyc0(wls0VarD);
        }
        if (i2 == 1) {
            return new eyc0(wls0VarD);
        }
        if (i2 == 2) {
            return new dyc0(wls0VarD);
        }
        if (i2 == 3) {
            return fyc0.a;
        }
        eg.o();
        return null;
    }
}
