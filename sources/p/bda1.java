package p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficConnectionInfo;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficResponseInfo;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bda1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public bda1(c9n c9nVar, k42 k42Var) {
        this.a = (byte) 25;
        this.b = k42Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object b(rlj1 rlj1Var, lnm lnmVar) {
        tlj1 tlj1Var;
        jd0 jd0Var = jd0.D;
        amj1 amj1Var = (amj1) this.b;
        String str = amj1Var.b;
        d0r d0rVar = amj1Var.a;
        if (lnmVar instanceof tlj1) {
            tlj1Var = (tlj1) lnmVar;
            int i = tlj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlj1Var.c = i - Integer.MIN_VALUE;
            } else {
                tlj1Var = new tlj1(this, lnmVar);
            }
        } else {
            tlj1Var = new tlj1(this, lnmVar);
        }
        Object obj = tlj1Var.a;
        int i2 = tlj1Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            ouc0 ouc0Var = new ouc0(str);
            int iOrdinal = rlj1Var.ordinal();
            if (iOrdinal != 0) {
                nrc0 nrc0Var = nrc0.a;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        muc0 muc0Var = new muc0(nrc0Var);
                        tlj1Var.c = 2;
                        if (d0r.d(d0rVar, jd0Var, ouc0Var, muc0Var, tlj1Var) == d9nVar) {
                        }
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        muc0 muc0Var2 = new muc0(nrc0Var);
                        tlj1Var.c = 3;
                        if (d0r.d(d0rVar, jd0Var, ouc0Var, muc0Var2, tlj1Var) != d9nVar) {
                        }
                    }
                    return d9nVar;
                }
                luc0 luc0Var = new luc0(nrc0Var);
                tlj1Var.c = 1;
                if (d0r.d(d0rVar, jd0Var, ouc0Var, luc0Var, tlj1Var) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 == 2) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        v061 v061Var = v061.d;
        hnj1 hnj1Var = new hnj1(str);
        enj1 enj1Var = new enj1();
        tlj1Var.c = 4;
        if (d0r.d(d0rVar, v061Var, hnj1Var, enj1Var, tlj1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(boolean z, lnm lnmVar) {
        jxg1 jxg1Var;
        dt71 dt71Var;
        if (lnmVar instanceof jxg1) {
            jxg1Var = (jxg1) lnmVar;
            int i = jxg1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jxg1Var.d = i - Integer.MIN_VALUE;
            } else {
                jxg1Var = new jxg1(this, lnmVar);
            }
        } else {
            jxg1Var = new jxg1(this, lnmVar);
        }
        Object obj = jxg1Var.b;
        int i2 = jxg1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            kxg1 kxg1Var = (kxg1) this.b;
            dt71 dt71Var2 = kxg1Var.i;
            jxg1Var.a = dt71Var2;
            jxg1Var.d = 1;
            Object objA = kxg1Var.a(jxg1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            obj = objA;
            dt71Var = dt71Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt71Var = jxg1Var.a;
            hm5.M(obj);
        }
        dt71Var.a(obj);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    /* JADX WARN: Code duplicated, block: B:155:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:225:0x059c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0861 A[PHI: r0
      0x0861: PHI (r0v33 java.lang.Object) = (r0v26 java.lang.Object), (r0v29 java.lang.Object), (r0v32 java.lang.Object), (r0v36 java.lang.Object) binds: [B:362:0x0891, B:357:0x0880, B:352:0x0871, B:346:0x085f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:348:0x0863  */
    /* JADX WARN: Code duplicated, block: B:404:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:? A[LOOP:2: B:162:0x03c8->B:405:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:? A[RETURN, SYNTHETIC] */
    public final Object emit(Object obj, lnm lnmVar) throws jgo0 {
        Object objH1;
        Object objW;
        Object obj2;
        h5f1 h5f1Var;
        mmr0 mmr0Var;
        MessageResponseToken messageResponseToken;
        nsz nszVar;
        csz cszVar;
        m4g1 q4g1Var;
        m4g1 o4g1Var;
        Object objEmit;
        int i;
        String str;
        String str2;
        Iterator it;
        rih1 rih1Var;
        drj1 drj1Var;
        drj1 drj1Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((dda1) obj3).c.l((xca1) obj);
                return rih1Var2;
            case 1:
                if (((xca1) obj) instanceof wca1) {
                    ((pda1) obj3).r.setValue((Object) null);
                }
                return rih1Var2;
            case 2:
                yvg1 yvg1Var = (yvg1) obj;
                l0l l0lVar = (l0l) yvg1Var.a;
                boolean zBooleanValue = ((Boolean) yvg1Var.b).booleanValue();
                Boolean bool = (Boolean) yvg1Var.c;
                if (l0lVar != null && !l0lVar.l() && bool.booleanValue() && !zBooleanValue) {
                    ((knr) ((vhb1) obj3).b.get()).g("ActiveDiscoveryOnDeviceChange");
                }
                return rih1Var2;
            case 3:
                qt80 qt80Var = (qt80) obj;
                t6c1 t6c1Var = (t6c1) obj3;
                return (!(qt80Var instanceof r9w0) ? !(!(qt80Var instanceof s9w0) ? (qt80Var instanceof q9w0) && (objH1 = t6c1Var.H1(lnmVar)) == d9nVar : (objH1 = t6c1Var.H1(lnmVar)) == d9nVar) : (objH1 = t6c1Var.I1(lnmVar)) == d9nVar) ? rih1Var2 : objH1;
            case 4:
                dec1 dec1Var = (dec1) obj;
                rec1 rec1Var = (rec1) obj3;
                if (dec1Var instanceof efc1) {
                    objW = rec1Var.Z(((efc1) dec1Var).a, lnmVar);
                    if (objW == d9nVar) {
                        obj2 = objW;
                    } else {
                        obj2 = rih1Var2;
                    }
                } else if (dec1Var instanceof xdc1) {
                    objW = rec1Var.X(((xdc1) dec1Var).a, lnmVar);
                    if (objW == d9nVar) {
                        obj2 = objW;
                    } else {
                        obj2 = rih1Var2;
                    }
                } else if (dec1Var instanceof yec1) {
                    objW = rec1Var.Y(((yec1) dec1Var).a, lnmVar);
                    if (objW == d9nVar) {
                        obj2 = objW;
                    } else {
                        obj2 = rih1Var2;
                    }
                } else {
                    if (!(dec1Var instanceof kdc1)) {
                        eg.o();
                        return null;
                    }
                    kdc1 kdc1Var = (kdc1) dec1Var;
                    objW = rec1Var.W(kdc1Var.a, kdc1Var.b, lnmVar);
                    if (objW == d9nVar) {
                        obj2 = objW;
                    } else {
                        obj2 = rih1Var2;
                    }
                }
                return obj2 == d9nVar ? obj2 : rih1Var2;
            case 5:
                Object objA = ((aqd1) obj3).a((cqd1) obj, lnmVar);
                return objA == d9nVar ? objA : rih1Var2;
            case 6:
                Object objA2 = ((gqd1) obj3).a((cqd1) obj, lnmVar);
                return objA2 == d9nVar ? objA2 : rih1Var2;
            case 7:
                ((z4e1) obj3).l1.setValue(Boolean.FALSE);
                return rih1Var2;
            case 8:
                Object objEmit2 = ((dt71) ((hce1) obj3).d).emit((cce1) obj, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var2;
            case 9:
                qt80 qt80Var2 = (qt80) obj;
                iie1 iie1Var = (iie1) obj3;
                if ((qt80Var2 instanceof p5v) || (qt80Var2 instanceof n5v)) {
                    xtb0 xtb0Var = iie1Var.a;
                    float f = iie1Var.c;
                    float f2 = iie1Var.d;
                    List list = xtb0Var.h().l;
                    if (!list.isEmpty() && f2 + f > 0.0f) {
                        Iterator it2 = list.iterator();
                        if (!it2.hasNext()) {
                            hhg1.k();
                            return null;
                        }
                        Object next = it2.next();
                        if (it2.hasNext()) {
                            qtb0 qtb0Var = (qtb0) next;
                            float fAbs = Math.abs((((qtb0Var.q / 2.0f) + qtb0Var.p) - f2) + f);
                            do {
                                Object next2 = it2.next();
                                qtb0 qtb0Var2 = (qtb0) next2;
                                float fAbs2 = Math.abs((((qtb0Var2.q / 2.0f) + qtb0Var2.p) - f2) + f);
                                if (Float.compare(fAbs, fAbs2) > 0) {
                                    next = next2;
                                    fAbs = fAbs2;
                                }
                            } while (it2.hasNext());
                        }
                        iie1Var.f.t(((qtb0) next).a);
                    }
                }
                return rih1Var2;
            case 10:
                if (((Boolean) obj).booleanValue() && (mmr0Var = (h5f1Var = (h5f1) obj3).l) != null && (messageResponseToken = (MessageResponseToken) mmr0Var.a) != null) {
                    h5f1Var.c.a(messageResponseToken);
                }
                return rih1Var2;
            case 11:
                bal1 bal1Var = (bal1) obj;
                ry71 ry71Var = (ry71) obj3;
                if (bal1Var instanceof z9l1) {
                    ry71Var.invoke(Boolean.FALSE);
                } else {
                    if (!(bal1Var instanceof aal1)) {
                        eg.o();
                        return null;
                    }
                    ry71Var.invoke(Boolean.TRUE);
                }
                return rih1Var2;
            case 12:
                gcl1 gcl1Var = (gcl1) obj;
                ry71 ry71Var2 = (ry71) obj3;
                if (gcl1Var instanceof dcl1) {
                    ry71Var2.invoke(Boolean.TRUE);
                } else if (gcl1Var instanceof ecl1) {
                    ry71Var2.invoke(Boolean.FALSE);
                }
                return rih1Var2;
            case 13:
                q4g1 q4g1Var2 = (r4g1) obj;
                oe30 oe30Var = (oe30) obj3;
                msz mszVarV = EsTrafficEvents.TrafficEvent.v();
                mszVarV.t(q4g1Var2.getId().toString());
                mszVarV.x(q4g1Var2.getTimestamp());
                if (q4g1Var2 instanceof q4g1) {
                    lsz lszVarO = EsTrafficEvents.StartedEvent.o();
                    lszVarO.n(q4g1Var2.c);
                    mszVarV.w(lszVarO.build());
                } else if (q4g1Var2 instanceof o4g1) {
                    jsz jszVarQ = EsTrafficEvents.RequestReadyEvent.q();
                    o4g1 o4g1Var2 = (o4g1) q4g1Var2;
                    jszVarQ.q(z0o1.f(o4g1Var2.c));
                    x8l x8lVar = o4g1Var2.d;
                    dsz dszVarP = EsTrafficConnectionInfo.ConnectionInfo.p();
                    int iOrdinal = x8lVar.a.ordinal();
                    if (iOrdinal == 0) {
                        cszVar = csz.c;
                    } else if (iOrdinal == 1) {
                        cszVar = csz.b;
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        cszVar = csz.d;
                    }
                    dszVarP.n(cszVar);
                    jszVarQ.n(dszVarP.build());
                    mszVarV.u(jszVarQ.build());
                } else if (q4g1Var2 instanceof l4g1) {
                    gsz gszVarP = EsTrafficEvents.BytesSentEvent.p();
                    gszVarP.n(((l4g1) q4g1Var2).c);
                    mszVarV.q(gszVarP.build());
                } else if (q4g1Var2 instanceof k4g1) {
                    fsz fszVarP = EsTrafficEvents.BytesReceivedEvent.p();
                    fszVarP.n(((k4g1) q4g1Var2).c);
                    mszVarV.n(fszVarP.build());
                } else if (q4g1Var2 instanceof p4g1) {
                    ksz kszVarP = EsTrafficEvents.ResponseReceivedEvent.p();
                    xz21 xz21Var = ((p4g1) q4g1Var2).c;
                    tsz tszVarP = EsTrafficResponseInfo.ResponseInfo.p();
                    tszVarP.q(xz21Var.a);
                    tszVarP.n(xz21Var.b);
                    kszVarP.n(tszVarP.build());
                    mszVarV.v(kszVarP.build());
                } else {
                    if (!(q4g1Var2 instanceof n4g1)) {
                        if (q4g1Var2 instanceof m4g1) {
                            hsz hszVarT = EsTrafficEvents.FailedEvent.t();
                            m4g1 m4g1Var = (m4g1) q4g1Var2;
                            hszVarT.s(z0o1.f(m4g1Var.c));
                            hszVarT.n(m4g1Var.d);
                            int iC = l1d.C(m4g1Var.e);
                            if (iC == 0) {
                                nszVar = nsz.b;
                            } else if (iC == 1) {
                                nszVar = nsz.c;
                            } else if (iC == 2) {
                                nszVar = nsz.d;
                            } else if (iC == 3) {
                                nszVar = nsz.e;
                            } else {
                                eg.o();
                            }
                            hszVarT.q(nszVar);
                            j4g1 j4g1Var = m4g1Var.f;
                            if (j4g1Var != null) {
                                hszVarT.r(z0o1.e(j4g1Var));
                            }
                            mszVarV.r(hszVarT.build());
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    isz iszVarS = EsTrafficEvents.FinishedEvent.s();
                    n4g1 n4g1Var = (n4g1) q4g1Var2;
                    iszVarS.q(z0o1.f(n4g1Var.c));
                    xz21 xz21Var2 = n4g1Var.d;
                    tsz tszVarP2 = EsTrafficResponseInfo.ResponseInfo.p();
                    tszVarP2.q(xz21Var2.a);
                    tszVarP2.n(xz21Var2.b);
                    iszVarS.r(tszVarP2.build());
                    iszVarS.n(z0o1.e(n4g1Var.e));
                    mszVarV.s(iszVarS.build());
                }
                Object objA3 = oe30Var.a(mszVarV.build(), lnmVar);
                return objA3 == d9nVar ? objA3 : rih1Var2;
            case 14:
                EsTrafficEvents.TrafficEvent trafficEvent = (EsTrafficEvents.TrafficEvent) obj;
                dt71 dt71Var = ((v4g1) obj3).f;
                UUID uuidFromString = UUID.fromString(trafficEvent.getId());
                long timestamp = trafficEvent.getTimestamp();
                int iP = trafficEvent.p();
                switch (iP == 0 ? -1 : bvz.a[l1d.C(iP)]) {
                    case 1:
                        uuidFromString.getClass();
                        q4g1Var = new q4g1(uuidFromString, trafficEvent.u().getUrl(), timestamp);
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 2:
                        uuidFromString.getClass();
                        o4g1Var = new o4g1(uuidFromString, timestamp, z0o1.h(trafficEvent.s().p()), new x8l(z0o1.g(trafficEvent.s().n().n())));
                        q4g1Var = o4g1Var;
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 3:
                        uuidFromString.getClass();
                        o4g1Var = new l4g1(uuidFromString, timestamp, trafficEvent.o().n());
                        q4g1Var = o4g1Var;
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 4:
                        uuidFromString.getClass();
                        o4g1Var = new k4g1(uuidFromString, timestamp, trafficEvent.n().n());
                        q4g1Var = o4g1Var;
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 5:
                        uuidFromString.getClass();
                        EsTrafficResponseInfo.ResponseInfo responseInfoO = trafficEvent.t().o();
                        q4g1Var = new p4g1(uuidFromString, timestamp, new xz21(responseInfoO.getStatusCode(), responseInfoO.n()));
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 6:
                        j4g1 j4g1VarI = trafficEvent.r().r() ? z0o1.i(trafficEvent.r().o()) : new j4g1(0.0d, (Integer) null, 0L, 0L, z6x.a);
                        uuidFromString.getClass();
                        ep21 ep21VarH = z0o1.h(trafficEvent.r().p());
                        EsTrafficResponseInfo.ResponseInfo responseInfoQ = trafficEvent.r().q();
                        o4g1Var = new n4g1(uuidFromString, timestamp, ep21VarH, new xz21(responseInfoQ.getStatusCode(), responseInfoQ.n()), j4g1VarI);
                        q4g1Var = o4g1Var;
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 7:
                        j4g1 j4g1VarI2 = trafficEvent.q().s() ? z0o1.i(trafficEvent.q().q()) : null;
                        uuidFromString.getClass();
                        ep21 ep21VarH2 = z0o1.h(trafficEvent.q().r());
                        String strO = trafficEvent.q().o();
                        int iOrdinal2 = trafficEvent.q().p().ordinal();
                        if (iOrdinal2 == 0) {
                            i = 1;
                        } else if (iOrdinal2 == 1) {
                            i = 2;
                        } else if (iOrdinal2 == 2) {
                            i = 3;
                        } else if (iOrdinal2 != 3) {
                            if (iOrdinal2 != 4) {
                                eg.o();
                                return null;
                            }
                            i = 1;
                        } else {
                            i = 4;
                        }
                        o4g1Var = new m4g1(uuidFromString, timestamp, ep21VarH2, strO, i, j4g1VarI2);
                        q4g1Var = o4g1Var;
                        objEmit = dt71Var.emit(q4g1Var, lnmVar);
                        if (objEmit == d9nVar) {
                            return objEmit;
                        }
                        return rih1Var2;
                    case 8:
                        throw new jgo0();
                    default:
                        eg.o();
                        return null;
                }
            case 15:
                zyc zycVar = (zyc) obj;
                Bundle bundle = zycVar.e.k;
                String string = bundle != null ? bundle.getString("com.spotify.connect.EXTRA_CONNECT_STATE_IDENTIFIER") : null;
                if (string == null) {
                    v8i0.j("No Connect state identifier found for route ", zycVar.e.a);
                } else {
                    Object objA4 = ((d5l) ((lu51) obj3).e).a(string, lnmVar);
                    if (objA4 == d9nVar) {
                        return objA4;
                    }
                }
                return rih1Var2;
            case 16:
                return c(((Boolean) obj).booleanValue(), lnmVar);
            case 17:
                yah1 yah1Var = (yah1) obj;
                obh1 obh1Var = (obh1) obj3;
                List list2 = yah1Var.a;
                hrr0 hrr0Var = obh1Var.e;
                hrr0 hrr0Var2 = obh1Var.i;
                hrr0Var.setValue(list2);
                obh1Var.f.setValue(yah1Var.b);
                boolean z = yah1Var.c;
                obh1Var.g.setValue(Boolean.valueOf(z));
                LinkedHashSet linkedHashSet = yah1Var.d;
                obh1Var.h.setValue(linkedHashSet);
                if (z) {
                    hrr0Var2.setValue((Object) null);
                } else {
                    List list3 = list2;
                    boolean z2 = list3 instanceof Collection;
                    if (z2 && list3.isEmpty()) {
                        str = (String) hrr0Var2.getValue();
                        if (str != null) {
                            str2 = (String) hrr0Var2.getValue();
                            if (str2 != null) {
                                if (z2) {
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (u890.j(((lbh1) it.next()).a, str2)) {
                                        }
                                    }
                                    hrr0Var2.setValue((Object) null);
                                } else {
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (u890.j(((lbh1) it.next()).a, str2)) {
                                        }
                                    }
                                    hrr0Var2.setValue((Object) null);
                                }
                            }
                        } else {
                            str2 = (String) hrr0Var2.getValue();
                            if (str2 != null) {
                                if (z2) {
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (u890.j(((lbh1) it.next()).a, str2)) {
                                        }
                                    }
                                    hrr0Var2.setValue((Object) null);
                                } else {
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (u890.j(((lbh1) it.next()).a, str2)) {
                                        }
                                    }
                                    hrr0Var2.setValue((Object) null);
                                }
                            }
                        }
                    } else {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                str = (String) hrr0Var2.getValue();
                                if (str != null || !linkedHashSet.contains(str)) {
                                    str2 = (String) hrr0Var2.getValue();
                                    if (str2 != null) {
                                        if (z2 || !list3.isEmpty()) {
                                            it = list3.iterator();
                                            while (it.hasNext()) {
                                                if (u890.j(((lbh1) it.next()).a, str2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (((lbh1) it3.next()).f) {
                            }
                            hrr0Var2.setValue((Object) null);
                        }
                    }
                }
                return rih1Var2;
            case 18:
                atc1 atc1Var = (atc1) obj;
                if (!atc1Var.a.isEmpty()) {
                    String str3 = ((wqt) o7h.q0(atc1Var.a)).a;
                }
                p7s p7sVar = ((q7s) ((ceh1) obj3).b.get()).a;
                fn31.T(p7sVar.c, (o8n) null, 0, new eum(atc1Var, p7sVar, (lnm) null, (byte) 20), 3);
                return rih1Var2;
            case 19:
                Object objL = ((pt) obj3).L(lnmVar);
                return objL == d9nVar ? objL : rih1Var2;
            case 20:
                zhk1 zhk1Var = ((w6i1) obj3).t;
                zhk1Var.Y = (var0) obj;
                View view = zhk1Var.h;
                if (view != null) {
                    zhk1Var.c(view);
                }
                return rih1Var2;
            case 21:
                return b((rlj1) obj, lnmVar);
            case 22:
                mmr0 mmr0Var2 = (mmr0) obj;
                boj1 boj1Var = (coj1) mmr0Var2.a;
                boolean zBooleanValue2 = ((Boolean) mmr0Var2.b).booleanValue();
                ioj1 ioj1Var = (ioj1) obj3;
                OverlayHidingFrameLayout overlayHidingFrameLayout = ioj1Var.l;
                List list4 = ioj1Var.i;
                NowPlayingScrollView nowPlayingScrollView = ioj1Var.d;
                v9d1 v9d1Var = ioj1Var.m;
                BehaviorProcessor behaviorProcessor = ioj1Var.c;
                View view2 = ioj1Var.g;
                ViewGroup viewGroup = ioj1Var.f;
                Disposable disposable = ioj1Var.z;
                if (disposable != null) {
                    disposable.dispose();
                }
                ioj1Var.z = null;
                if (u890.j(boj1Var, znj1.a)) {
                    viewGroup.setVisibility(0);
                    view2.setVisibility(0);
                    ioj1Var.e.setTranslationY(0.0f);
                    view2.setTranslationY(0.0f);
                    behaviorProcessor.onNext(Boolean.FALSE);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((View) it4.next()).setVisibility(8);
                    }
                    if (!zBooleanValue2) {
                        overlayHidingFrameLayout.a(false);
                    }
                    if (v9d1Var != null) {
                        v9d1Var.setSwipeEnabled(false);
                    }
                    ioj1Var.n.setVisibility(!zBooleanValue2 ? 0 : 8);
                    ioj1Var.o.setVisibility(zBooleanValue2 ? 0 : 8);
                    rih1Var = rih1Var2;
                } else {
                    rih1Var = rih1Var2;
                    if (u890.j(boj1Var, aoj1.a)) {
                        if (ioj1Var.D instanceof boj1) {
                            ioj1Var.b(2, false, false, false);
                            dch1 dch1Var = new dch1(ioj1Var, (byte) 22);
                            db91 db91Var = new db91(48);
                            ((jhg1) db91Var).c = 200L;
                            db91Var.b(viewGroup);
                            db91Var.a(new d2g0(dch1Var, (byte) 3));
                            fjg1.a(nowPlayingScrollView, db91Var);
                        } else {
                            behaviorProcessor.onNext(Boolean.TRUE);
                        }
                        viewGroup.setVisibility(4);
                        view2.setVisibility(4);
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            ((View) it5.next()).setVisibility(8);
                        }
                        overlayHidingFrameLayout.a(false);
                        if (v9d1Var != null) {
                            v9d1Var.setSwipeEnabled(false);
                        }
                    } else {
                        if (!(boj1Var instanceof boj1)) {
                            eg.o();
                            return null;
                        }
                        ioj1Var.z = nowPlayingScrollView.k1.J(new yc31(hoj1.b)).subscribe(new foj1(ioj1Var, (byte) 3));
                        behaviorProcessor.onNext(Boolean.FALSE);
                        if (ioj1Var.D instanceof boj1) {
                            boj1 boj1Var2 = boj1Var;
                            ioj1Var.b(boj1Var2.b, boj1Var2.a, boj1Var2.c, zBooleanValue2);
                        } else {
                            ioj1Var.b(2, false, false, false);
                            vm1 vm1Var = new vm1(ioj1Var, boj1Var, zBooleanValue2, (byte) 27);
                            db91 db91Var2 = new db91(48);
                            ((jhg1) db91Var2).c = 200L;
                            db91Var2.b(viewGroup);
                            db91Var2.a(new d2g0(vm1Var, (byte) 2));
                            fjg1.a(nowPlayingScrollView, db91Var2);
                        }
                        viewGroup.setVisibility(0);
                        if (v9d1Var != null) {
                            v9d1Var.setSwipeEnabled(true);
                        }
                    }
                }
                ioj1Var.D = boj1Var;
                return rih1Var;
            case 23:
                i091 i091Var = (i091) obj;
                yuj1 yuj1Var = (yuj1) obj3;
                k091 k091Var = i091Var.h;
                if (!u890.j(k091Var, j091.a)) {
                    if (k091Var instanceof k091) {
                        h091 h091Var = k091Var.a;
                        if ((h091Var.equals(d091.a) || h091Var.equals(g091.a)) && (drj1Var2 = yuj1Var.i) != null) {
                            drj1Var2.b();
                        }
                    } else if (!u890.j(k091Var, l091.a) && !u890.j(k091Var, m091.a)) {
                        if (!u890.j(k091Var, n091.a)) {
                            eg.o();
                            return null;
                        }
                        if (i091Var.a != null && (drj1Var = yuj1Var.i) != null) {
                            drj1Var.c();
                        }
                    }
                }
                return rih1Var2;
            case 24:
                h810 h810Var = (h810) obj;
                if (!h810Var.a) {
                    ((x2l1) obj3).g.invoke(new g2l1(h810Var.d));
                }
                return rih1Var2;
            case 25:
                icl1 icl1Var = (icl1) obj;
                n8l1 n8l1Var = (n8l1) ((k42) obj3).n;
                if (icl1Var != null) {
                    z0i z0iVar = icl1Var.a;
                    boolean z3 = icl1Var.b;
                    bpb1 bpb1Var = n8l1Var.f;
                    bpb1Var.m((Object) null, m8l1.a((m8l1) bpb1Var.getValue(), false, false, false, new l8l1(z0iVar, z3), 7));
                } else {
                    n8l1Var.a();
                }
                return rih1Var2;
            case 26:
                Object objG = jkr0.g((jkr0) obj3, ((Number) obj).intValue(), (n8b1) null, lnmVar, 6);
                return objG == d9nVar ? objG : rih1Var2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                rfx0 rfx0Var = (rfx0) obj;
                tfx0 tfx0Var = (tfx0) obj3;
                if (rfx0Var instanceof pfx0) {
                    long j = ((pfx0) rfx0Var).a;
                    tfx0Var.f.setValue(Boolean.TRUE);
                    tfx0Var.h.t(Float.intBitsToFloat((int) (j >> 32)) - tfx0Var.g.s());
                } else if (rfx0Var instanceof qfx0) {
                    float f3 = ((qfx0) rfx0Var).a;
                    err0 err0Var = tfx0Var.d;
                    drr0 drr0Var = tfx0Var.c;
                    drr0 drr0Var2 = tfx0Var.h;
                    float fS = err0Var.s();
                    drr0 drr0Var3 = tfx0Var.e;
                    float fMax = Math.max(fS - (drr0Var3.s() / 2.0f), 0.0f);
                    float fMin = Math.min(drr0Var3.s() / 2.0f, fMax);
                    drr0 drr0Var4 = tfx0Var.g;
                    drr0Var4.t(drr0Var2.s() + drr0Var4.s() + f3);
                    drr0Var2.t(0.0f);
                    float fO = yoi1.o(drr0Var4.s(), fMin, fMax);
                    float f4 = fMax - fMin;
                    float fT = dm5.T(0.0f, 1.0f, yoi1.o(f4 == 0.0f ? 0.0f : (fO - fMin) / f4, 0.0f, 1.0f));
                    if (fT != drr0Var.s()) {
                        tfx0Var.a.invoke(Float.valueOf(fT));
                        drr0Var.t(yoi1.o(fT, 0.0f, 1.0f));
                    }
                } else {
                    if (!u890.j(rfx0Var, ofx0.a)) {
                        eg.o();
                        return null;
                    }
                    tfx0Var.f.setValue(Boolean.FALSE);
                    tfx0Var.b.invoke(Float.valueOf(tfx0Var.c.s()));
                }
                return rih1Var2;
            case 28:
                Object objB = ((mgl1) obj3).b((ohl1) obj, lnmVar);
                return objB == d9nVar ? objB : rih1Var2;
            default:
                npl1 npl1Var = (npl1) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    xab1 xab1Var = npl1Var.f;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    npl1Var.f = null;
                }
                return rih1Var2;
        }
    }

    public /* synthetic */ bda1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
