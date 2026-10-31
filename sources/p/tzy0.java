package p;

import android.icu.text.DateTimePatternGenerator;
import androidx.compose.ui.geometry.Offset;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tzy0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public tzy0(Set set, iu30 iu30Var, n631 n631Var) {
        this.a = (byte) 14;
        this.b = set;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        gq41 gq41Var;
        if (lnmVar instanceof gq41) {
            gq41Var = (gq41) lnmVar;
            int i = gq41Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq41Var.b = i - Integer.MIN_VALUE;
            } else {
                gq41Var = new gq41(this, lnmVar);
            }
        } else {
            gq41Var = new gq41(this, lnmVar);
        }
        Object obj2 = gq41Var.a;
        int i2 = gq41Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            mmr0 mmr0Var = new mmr0((wa71) obj, (tv80) this.c);
            gq41Var.b = 1;
            Object objEmit = vr20Var.emit(mmr0Var, gq41Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(Object obj, lnm lnmVar) {
        yo51 yo51Var;
        if (lnmVar instanceof yo51) {
            yo51Var = (yo51) lnmVar;
            int i = yo51Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yo51Var.b = i - Integer.MIN_VALUE;
            } else {
                yo51Var = new yo51(this, lnmVar);
            }
        } else {
            yo51Var = new yo51(this, lnmVar);
        }
        Object obj2 = yo51Var.a;
        int i2 = yo51Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue() && ((c8u0) this.c).a.n());
            yo51Var.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, yo51Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        wq51 wq51Var;
        hi40 hi40Var;
        if (lnmVar instanceof wq51) {
            wq51Var = (wq51) lnmVar;
            int i = wq51Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wq51Var.b = i - Integer.MIN_VALUE;
            } else {
                wq51Var = new wq51(this, lnmVar);
            }
        } else {
            wq51Var = new wq51(this, lnmVar);
        }
        Object obj2 = wq51Var.a;
        int i2 = wq51Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            List list = (List) obj;
            if (list != null) {
                hi40Var = new hi40(new n5f0(((vve1) list.get(0)).a, ((vve1) list.get(1)).a));
            } else {
                uq51 uq51Var = (uq51) this.c;
                hi40Var = new hi40(new n5f0(uq51Var.a, uq51Var.b));
            }
            wq51Var.b = 1;
            Object objEmit = vr20Var.emit(hi40Var, wq51Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        ry51 ry51Var;
        if (lnmVar instanceof ry51) {
            ry51Var = (ry51) lnmVar;
            int i = ry51Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry51Var.b = i - Integer.MIN_VALUE;
            } else {
                ry51Var = new ry51(this, lnmVar);
            }
        } else {
            ry51Var = new ry51(this, lnmVar);
        }
        Object obj2 = ry51Var.a;
        int i2 = ry51Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            ga01 ga01Var = new ga01(8, ((ty51) this.c).f.a, (String) obj, false);
            ry51Var.b = 1;
            Object objEmit = vr20Var.emit(ga01Var, ry51Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    private final Object g(Object obj, lnm lnmVar) {
        Offset offset = (Offset) obj;
        long j = offset.a;
        o95 o95Var = (o95) this.b;
        long j2 = ((Offset) o95Var.e()).a & 9223372034707292159L;
        rih1 rih1Var = rih1.a;
        if (j2 == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) o95Var.e()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objG = o95Var.g(offset, lnmVar);
            return objG == d9n.a ? objG : rih1Var;
        }
        fn31.T((c9n) this.c, (o8n) null, 0, new kv2(o95Var, j, (lnm) null, (byte) 12), 3);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object h(Object obj, lnm lnmVar) {
        xb61 xb61Var;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        vb61 vb61Var;
        if (lnmVar instanceof xb61) {
            xb61Var = (xb61) lnmVar;
            int i = xb61Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xb61Var.b = i - Integer.MIN_VALUE;
            } else {
                xb61Var = new xb61(this, lnmVar);
            }
        } else {
            xb61Var = new xb61(this, lnmVar);
        }
        Object obj2 = xb61Var.a;
        int i2 = xb61Var.b;
        int i3 = 1;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            kby kbyVar = (kby) obj;
            dc61 dc61Var = (dc61) this.c;
            Map map = kbyVar.q;
            String str = (String) map.get("correlation-id");
            String str2 = str == null ? "" : str;
            List list = kbyVar.z;
            ArrayList<ll81> arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (ihc1.h0(((ll81) next).a, "session_control_display", false)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayListE = foo1.E(map);
            ArrayList arrayList3 = new ArrayList();
            for (ll81 ll81Var : arrayList2) {
                String str3 = ll81Var.a;
                String str4 = ll81Var.a;
                String str5 = (String) map.get("session_control_display.displayName.".concat(ihc1.X0(str3, "$")));
                if (str5 != null) {
                    hux huxVar = ihc1.h0(str4, "video_first_with_icon", z) ? xtx.c : null;
                    ArrayList arrayList4 = arrayList3;
                    String str6 = ll81Var.a;
                    rb61 rb61Var = arrayListE.contains(str6) ? rb61.b : rb61.c;
                    nfa0 nfa0Var = dc61Var.a;
                    nma0 nma0VarSerializer = rg01.Companion.serializer();
                    String strX0 = ihc1.X0(str4, "$");
                    z2 = false;
                    String str7 = (String) o7h.t0(1, ihc1.Q0(str4, new String[]{"$"}, 0, 6));
                    if (str7 == null) {
                        str7 = "";
                    }
                    List<Map.Entry> listA1 = o7h.a1(fga0.l(nfa0.d.c(nfa0Var.b(nma0VarSerializer, new rg01(strX0, str7)))).a.entrySet(), new be21((byte) 8));
                    int iS = zno1.s(q7h.U(listA1, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (Map.Entry entry : listA1) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    arrayList = arrayList4;
                    vb61Var = new vb61(str6, str5, rb61Var, str2, new uga0(linkedHashMap).toString(), w7x.a, "", huxVar);
                } else {
                    arrayList = arrayList3;
                    z2 = z;
                    vb61Var = null;
                }
                if (vb61Var != null) {
                    arrayList.add(vb61Var);
                }
                arrayList3 = arrayList;
                z = z2;
                arrayListE = arrayListE;
                map = map;
                i3 = 1;
                dc61Var = dc61Var;
            }
            xb61Var.b = i3;
            Object objEmit = vr20Var.emit(arrayList3, xb61Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        fc61 fc61Var;
        if (lnmVar instanceof fc61) {
            fc61Var = (fc61) lnmVar;
            int i = fc61Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc61Var.b = i - Integer.MIN_VALUE;
            } else {
                fc61Var = new fc61(this, lnmVar);
            }
        } else {
            fc61Var = new fc61(this, lnmVar);
        }
        Object obj2 = fc61Var.a;
        int i2 = fc61Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            m021 m021Var = (m021) ((w4y0) this.c).f;
            kby kbyVar = ((cxc0) obj).f;
            Boolean boolValueOf = Boolean.valueOf(m021Var.m(kbyVar.z, kbyVar.q));
            fc61Var.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, fc61Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01df  */
    /* JADX WARN: Code duplicated, block: B:201:0x0337  */
    /* JADX WARN: Code duplicated, block: B:221:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:247:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:344:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:399:0x064e  */
    /* JADX WARN: Code duplicated, block: B:419:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:438:0x0704  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:470:0x0788  */
    /* JADX WARN: Code duplicated, block: B:475:0x0794  */
    /* JADX WARN: Code duplicated, block: B:493:0x0803  */
    /* JADX WARN: Code duplicated, block: B:514:0x086c  */
    /* JADX WARN: Code duplicated, block: B:545:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:570:0x0936  */
    /* JADX WARN: Code duplicated, block: B:593:0x0993  */
    /* JADX WARN: Code duplicated, block: B:614:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final Object emit(Object obj, lnm lnmVar) {
        szy0 szy0Var;
        vzy0 vzy0Var;
        nez0 nez0Var;
        d701 d701Var;
        m701 m701Var;
        w590 w590VarA;
        bf01 bf01Var;
        dyh1 zxh1Var;
        bm01 bm01Var;
        ym01 ym01Var;
        OffsetDateTime offsetDateTime;
        String str;
        String str2;
        OffsetDateTime m231Var;
        iu01 iu01Var;
        c511 c511Var;
        la11 la11Var;
        List list;
        fi11 fi11Var;
        e2l e2lVar;
        n021 n021Var;
        ResumptionProgressEsperanto.ResumePoint resumePointP;
        String uri;
        mmr0 mmr0Var;
        tb31 tb31Var;
        Object db31Var;
        float f;
        do31 do31Var;
        hz31 hz31Var;
        m641 m641Var;
        io70 io70Var;
        ud41 ud41Var;
        ed61 ed61Var;
        byte b = this.a;
        boolean z = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        str = null;
        String str3 = null;
        bu61Var = null;
        bu61 bu61Var = null;
        String str4 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof szy0) {
                    szy0Var = (szy0) lnmVar;
                    int i = szy0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        szy0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        szy0Var = new szy0(this, lnmVar);
                    }
                } else {
                    szy0Var = new szy0(this, lnmVar);
                }
                Object obj4 = szy0Var.a;
                int i2 = szy0Var.b;
                if (i2 == 0) {
                    hm5.M(obj4);
                    vr20 vr20Var = (vr20) obj2;
                    Boolean boolValueOf = Boolean.valueOf(((rzy0) obj) == ((rzy0) obj3));
                    szy0Var.b = 1;
                    if (vr20Var.emit(boolValueOf, szy0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof vzy0) {
                    vzy0Var = (vzy0) lnmVar;
                    int i3 = vzy0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vzy0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vzy0Var = new vzy0(this, lnmVar);
                    }
                } else {
                    vzy0Var = new vzy0(this, lnmVar);
                }
                Object obj5 = vzy0Var.a;
                int i4 = vzy0Var.b;
                if (i4 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var2 = (vr20) obj2;
                    qzy0 qzy0Var = ((Boolean) obj).booleanValue() ? (qzy0) obj3 : qzy0.VERY_HIGH;
                    vzy0Var.b = 1;
                    if (vr20Var2.emit(qzy0Var, vzy0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof nez0) {
                    nez0Var = (nez0) lnmVar;
                    int i5 = nez0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        nez0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        nez0Var = new nez0(this, lnmVar);
                    }
                } else {
                    nez0Var = new nez0(this, lnmVar);
                }
                Object obj6 = nez0Var.a;
                int i6 = nez0Var.b;
                if (i6 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var3 = (vr20) obj2;
                    bma1 bma1Var = oez0.e;
                    String str5 = (String) ((cma1) obj).a;
                    List listQ0 = str5 != null ? ihc1.Q0(str5, new String[]{"\n"}, 0, 6) : null;
                    if (listQ0 == null) {
                        listQ0 = (List) ((oez0) obj3).d.getValue();
                    }
                    nez0Var.b = 1;
                    if (vr20Var3.emit(listQ0, nez0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof d701) {
                    d701Var = (d701) lnmVar;
                    int i7 = d701Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        d701Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        d701Var = new d701(this, lnmVar);
                    }
                } else {
                    d701Var = new d701(this, lnmVar);
                }
                Object obj7 = d701Var.a;
                int i8 = d701Var.b;
                if (i8 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var4 = (vr20) obj2;
                    k1r k1rVar = (k1r) obj;
                    k1rVar.getClass();
                    Object a701Var = k1rVar instanceof j1r ? b701.a : k1rVar instanceof i1r ? new a701((v601) u890.k(k1rVar, (d0r) null, (n4r) null)) : new a701((v601) obj3);
                    d701Var.b = 1;
                    if (vr20Var4.emit(a701Var, d701Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof m701) {
                    m701Var = (m701) lnmVar;
                    int i9 = m701Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        m701Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        m701Var = new m701(this, lnmVar);
                    }
                } else {
                    m701Var = new m701(this, lnmVar);
                }
                Object obj8 = m701Var.a;
                int i10 = m701Var.b;
                if (i10 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var5 = (vr20) obj2;
                    r091 r091Var = (r091) ((wdm) ((sd5) obj3).b).X;
                    sr20 sr20Var = (r091Var == null || (w590VarA = r091Var.a()) == null) ? null : w590VarA.f;
                    sr20 sr20Var2 = sr20Var != null ? sr20Var : null;
                    if (sr20Var2 != null) {
                        m701Var.b = 1;
                        if (vr20Var5.emit(sr20Var2, m701Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof bf01) {
                    bf01Var = (bf01) lnmVar;
                    int i11 = bf01Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bf01Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        bf01Var = new bf01(this, lnmVar);
                    }
                } else {
                    bf01Var = new bf01(this, lnmVar);
                }
                Object obj9 = bf01Var.a;
                int i12 = bf01Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                vr20 vr20Var6 = (vr20) obj2;
                dyh1 dyh1Var = (dyh1) obj;
                String str6 = ((ze01) obj3).b;
                if (!(dyh1Var instanceof ayh1)) {
                    if (dyh1Var instanceof cyh1) {
                        zxh1Var = new cyh1(str6, ((cyh1) dyh1Var).a);
                    } else if (dyh1Var instanceof byh1) {
                        zxh1Var = new byh1(((byh1) dyh1Var).a, str6);
                    } else {
                        if (!(dyh1Var instanceof zxh1)) {
                            eg.o();
                            return null;
                        }
                        zxh1Var = new zxh1(((zxh1) dyh1Var).a, str6);
                    }
                    dyh1Var = zxh1Var;
                }
                bf01Var.b = 1;
                if (vr20Var6.emit(dyh1Var, bf01Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                eh01 eh01Var = (eh01) obj;
                p811 p811Var = (p811) obj2;
                iix0 iix0Var = (iix0) p811Var.a;
                if (iix0Var == null) {
                    iix0Var = eh01Var.a;
                    p811Var.a = iix0Var;
                }
                ((nsw0) obj3).setValue(new eh01(iix0Var, eh01Var.b));
                return rih1Var;
            case 7:
                if (lnmVar instanceof bm01) {
                    bm01Var = (bm01) lnmVar;
                    int i13 = bm01Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bm01Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        bm01Var = new bm01(this, lnmVar);
                    }
                } else {
                    bm01Var = new bm01(this, lnmVar);
                }
                Object obj10 = bm01Var.a;
                int i14 = bm01Var.b;
                if (i14 == 0) {
                    hm5.M(obj10);
                    String str7 = (String) ((cma1) obj).a;
                    bma1 bma1Var2 = cm01.c;
                    ((cm01) obj3).getClass();
                    List listC = cm01.c(str7);
                    bm01Var.b = 1;
                    if (((vr20) obj2).emit(listC, bm01Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 8:
                Locale locale = (Locale) obj3;
                if (lnmVar instanceof ym01) {
                    ym01Var = (ym01) lnmVar;
                    int i15 = ym01Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ym01Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ym01Var = new ym01(this, lnmVar);
                    }
                } else {
                    ym01Var = new ym01(this, lnmVar);
                }
                Object obj11 = ym01Var.a;
                int i16 = ym01Var.b;
                if (i16 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var7 = (vr20) obj2;
                    aqk aqkVar = (aqk) obj;
                    locale.getClass();
                    lhe0 lhe0Var = aqkVar.b;
                    j6k j6kVar = aqkVar.a;
                    if (j6kVar != null) {
                        k7r k7rVar = j6kVar.c.a;
                        try {
                            m231Var = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        offsetDateTime = m231Var;
                    } else {
                        offsetDateTime = null;
                    }
                    String str8 = offsetDateTime != null ? offsetDateTime.format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(locale).getBestPattern("EEEMMMd"), locale)) : null;
                    snt sntVar = lhe0Var != null ? lhe0Var.b : null;
                    rnt rntVar = sntVar instanceof rnt ? (rnt) sntVar : null;
                    if (rntVar != null) {
                        str = rntVar.a;
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (lhe0Var != null) {
                        str2 = lhe0Var.a;
                        if (ihc1.y0(str2)) {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    String strY0 = o7h.y0(f46.i0(new String[]{str2, str}), ", ", (String) null, (String) null, (iu30) null, 62);
                    if (ihc1.y0(strY0)) {
                        strY0 = null;
                    }
                    mfk mfkVar = new mfk(o7h.y0(f46.i0(new String[]{str8, strY0}), " • ", (String) null, (String) null, (iu30) null, 62), offsetDateTime != null ? new yj60(offsetDateTime.getMonth().getDisplayName(TextStyle.SHORT, locale), String.valueOf(offsetDateTime.getDayOfMonth())) : null);
                    ym01Var.b = 1;
                    if (vr20Var7.emit(mfkVar, ym01Var) == d9nVar) {
                        return d9nVar;
                    }
                    break;
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 9:
                if (lnmVar instanceof iu01) {
                    iu01Var = (iu01) lnmVar;
                    int i17 = iu01Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        iu01Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        iu01Var = new iu01(this, lnmVar);
                    }
                } else {
                    iu01Var = new iu01(this, lnmVar);
                }
                Object obj12 = iu01Var.a;
                int i18 = iu01Var.b;
                if (i18 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var8 = (vr20) obj2;
                    h1r h1rVar = (k1r) obj;
                    if (h1rVar instanceof h1r) {
                        n57.s("Recents: Failed to load Kodiak data. Error: " + h1rVar.a);
                    }
                    k1r map = h1rVar.map(new hu01((cm0) obj3, (byte) 0));
                    iu01Var.b = 1;
                    if (vr20Var8.emit(map, iu01Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 10:
                if (lnmVar instanceof c511) {
                    c511Var = (c511) lnmVar;
                    int i19 = c511Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        c511Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        c511Var = new c511(this, lnmVar);
                    }
                } else {
                    c511Var = new c511(this, lnmVar);
                }
                Object obj13 = c511Var.a;
                int i20 = c511Var.b;
                if (i20 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var9 = (vr20) obj2;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str9 = (String) ((a511) obj3).c.get("recsplanation");
                    b511 b511Var = new b511(str9 != null ? str9 : "", zBooleanValue);
                    c511Var.b = 1;
                    if (vr20Var9.emit(b511Var, c511Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i20 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 11:
                if (lnmVar instanceof la11) {
                    la11Var = (la11) lnmVar;
                    int i21 = la11Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        la11Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        la11Var = new la11(this, lnmVar);
                    }
                } else {
                    la11Var = new la11(this, lnmVar);
                }
                Object obj14 = la11Var.a;
                int i22 = la11Var.b;
                if (i22 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var10 = (vr20) obj2;
                    i1r i1rVar = (k1r) obj;
                    String str10 = ((ka11) obj3).a;
                    o3r o3rVar = ja11.a;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    ha11 ha11Var = (ha11) (i1rVar2 != null ? i1rVar2.a : null);
                    qa11 qa11Var = pa11.a;
                    if (ha11Var != null) {
                        blc0 blc0VarA = ja11.a(str10);
                        int i23 = blc0VarA == null ? -1 : ia11.a[blc0VarA.ordinal()];
                        if (i23 == 1) {
                            i1r i1rVar3 = ha11Var.a;
                            i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                            if (mp10.w((qxc0) (i1rVar4 != null ? i1rVar4.a : null))) {
                                qa11Var = new qa11(str10);
                            }
                        } else if (i23 == 2) {
                            i1r i1rVar5 = ha11Var.b;
                            i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                            hll hllVar = (hll) (i1rVar6 != null ? i1rVar6.a : null);
                            if (hllVar != null && (list = hllVar.d) != null && list.contains(fll.f)) {
                                qa11Var = new qa11(str10);
                            }
                        }
                    }
                    la11Var.b = 1;
                    if (vr20Var10.emit(qa11Var, la11Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i22 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof fi11) {
                    fi11Var = (fi11) lnmVar;
                    int i24 = fi11Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        fi11Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        fi11Var = new fi11(this, lnmVar);
                    }
                } else {
                    fi11Var = new fi11(this, lnmVar);
                }
                Object obj15 = fi11Var.a;
                int i25 = fi11Var.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                vr20 vr20Var11 = (vr20) obj2;
                PlayerState playerState = (PlayerState) obj;
                hi11 hi11Var = (hi11) obj3;
                boolean z2 = playerState.track().c() && l4o1.W((ContextTrack) playerState.track().b());
                boolean zContains = playerState.restrictions().disallowTapToPlayTrackInNextTracksReasons().contains("mft_plus_disallow");
                String strA = hi11.a(playerState);
                boolean z3 = strA != null && strA.length() > 0;
                boolean z4 = !u890.j(strA, hi11Var.e.a.e(u5l.b, (String) null));
                c7l c7lVar = (c7l) hi11Var.c.e.h();
                if (c7lVar != null) {
                    Iterator it = c7lVar.c.iterator();
                    do {
                        if (!it.hasNext()) {
                            bhn0.t("Collection contains no element matching the predicate.");
                            return null;
                        }
                        e2lVar = (e2l) it.next();
                    } while (!e2lVar.a);
                    str4 = e2lVar.o;
                }
                String strDeviceIdentifier = playerState.playOrigin().deviceIdentifier();
                t5l t5lVar = new t5l(z2, zContains, z3, z4, (str4 == null || str4.length() == 0 || strDeviceIdentifier == null || strDeviceIdentifier.length() == 0 || !str4.equals(strDeviceIdentifier)) ? false : true, strA == null ? "" : strA, playerState.contextUri());
                fi11Var.b = 1;
                if (vr20Var11.emit(t5lVar, fi11Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 13:
                if (lnmVar instanceof n021) {
                    n021Var = (n021) lnmVar;
                    int i26 = n021Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        n021Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        n021Var = new n021(this, lnmVar);
                    }
                } else {
                    n021Var = new n021(this, lnmVar);
                }
                Object obj16 = n021Var.a;
                int i27 = n021Var.b;
                if (i27 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var12 = (vr20) obj2;
                    l0l l0lVar = (l0l) ((spq0) obj).h();
                    if (l0lVar != null) {
                        if (l0lVar.l()) {
                            l0lVar = null;
                        }
                        if (l0lVar != null) {
                            rtt rttVarP = hqq0.P(l0lVar);
                            bu61Var = new bu61(sqe.t(l0lVar.getType(), l0lVar.z(), 0), (Integer) null, j9k1.n(((o021) obj3).a, rttVarP != null ? rttVarP.a : l0lVar.getName(), rttVarP != null ? rttVarP.c : l0lVar.getType(), l0lVar.l(), l0lVar.v(), rttVarP != null ? rttVarP.a : null, rttVarP != null ? rttVarP.b : null, rttVarP != null ? rttVarP.c : null), new Integer(2131963441), new yt61(), 18);
                        }
                    }
                    n021Var.b = 1;
                    if (vr20Var12.emit(bu61Var, n021Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 14:
                ResumptionProgressEsperanto.GetResumePointResponse getResumePointResponse = (ResumptionProgressEsperanto.GetResumePointResponse) obj;
                ArrayList arrayList = new ArrayList();
                for (String str11 : (Set) obj2) {
                    ResumptionProgressEsperanto.ItemResumePoint itemResumePoint = (ResumptionProgressEsperanto.ItemResumePoint) getResumePointResponse.o().get(str11);
                    if (itemResumePoint == null || itemResumePoint.o() != r831.c || (resumePointP = itemResumePoint.p()) == null || (uri = resumePointP.getUri()) == null) {
                        mmr0Var = null;
                    } else {
                        if (uri.length() <= 0) {
                            uri = null;
                        }
                        if (uri == null) {
                            mmr0Var = null;
                        } else {
                            mmr0Var = new mmr0(str11, new j3r(new l631(uri)));
                        }
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((iu30) obj3).invoke(arrayList);
                }
                return rih1Var;
            case 15:
                if (lnmVar instanceof tb31) {
                    tb31Var = (tb31) lnmVar;
                    int i28 = tb31Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        tb31Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        tb31Var = new tb31(this, lnmVar);
                    }
                } else {
                    tb31Var = new tb31(this, lnmVar);
                }
                Object obj17 = tb31Var.a;
                int i29 = tb31Var.b;
                if (i29 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var13 = (vr20) obj2;
                    Object obj18 = ((e331) obj).a;
                    if (e331.a(obj18) == null) {
                        rsn rsnVar = (rsn) obj18;
                        db31Var = new db31(rsnVar.a, rsnVar.b, rsnVar.c, ((wa31) obj3).b);
                    } else {
                        db31Var = bb31.a;
                    }
                    tb31Var.b = 1;
                    if (vr20Var13.emit(db31Var, tb31Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case 16:
                t9w0 t9w0Var = (qt80) obj;
                t05 t05Var = (t05) obj2;
                if (!(t9w0Var instanceof t9w0)) {
                    c9n c9nVar = (c9n) obj3;
                    vrv0 vrv0Var = t05Var.T0;
                    if (vrv0Var == null) {
                        vrv0Var = new vrv0(t05Var.S0, t05Var.P0);
                        ha71.x(t05Var);
                        t05Var.T0 = vrv0Var;
                    }
                    vrv0 vrv0Var2 = vrv0Var;
                    ArrayList arrayList2 = (ArrayList) vrv0Var2.e;
                    if (t9w0Var instanceof dy60) {
                        arrayList2.add(t9w0Var);
                    } else if (t9w0Var instanceof ey60) {
                        arrayList2.remove(((ey60) t9w0Var).a);
                    } else if (t9w0Var instanceof ry20) {
                        arrayList2.add(t9w0Var);
                    } else if (t9w0Var instanceof sy20) {
                        arrayList2.remove(((sy20) t9w0Var).a);
                    } else if (t9w0Var instanceof o5v) {
                        arrayList2.add(t9w0Var);
                    } else if (t9w0Var instanceof p5v) {
                        arrayList2.remove(((p5v) t9w0Var).a);
                    } else if (t9w0Var instanceof n5v) {
                        arrayList2.remove(((n5v) t9w0Var).a);
                    }
                    qt80 qt80Var = (qt80) o7h.C0(arrayList2);
                    if (!u890.j((qt80) vrv0Var2.f, qt80Var)) {
                        if (qt80Var != null) {
                            uh31 uh31Var = (uh31) ((Function0) vrv0Var2.c).invoke();
                            boolean z5 = qt80Var instanceof dy60;
                            if (z5) {
                                f = uh31Var.c;
                            } else if (qt80Var instanceof ry20) {
                                f = uh31Var.b;
                            } else {
                                f = qt80Var instanceof o5v ? uh31Var.a : 0.0f;
                            }
                            float f2 = f;
                            pxg1 pxg1Var = zh31.a;
                            if (!z5 && ((qt80Var instanceof ry20) || (qt80Var instanceof o5v))) {
                                pxg1Var = new pxg1(45, mlv.d, 2);
                            }
                            fn31.T(c9nVar, (o8n) null, 0, new xb5(vrv0Var2, f2, pxg1Var, (lnm) null, (byte) 1), 3);
                        } else {
                            qt80 qt80Var2 = (qt80) vrv0Var2.f;
                            pxg1 pxg1Var2 = zh31.a;
                            if (!(qt80Var2 instanceof dy60) && !(qt80Var2 instanceof ry20) && (qt80Var2 instanceof o5v)) {
                                pxg1Var2 = new pxg1(150, mlv.d, 2);
                            }
                            fn31.T(c9nVar, (o8n) null, 0, new sb91(vrv0Var2, pxg1Var2, (lnm) null, (byte) 25), 3);
                        }
                        vrv0Var2.f = qt80Var;
                    }
                } else if (t05Var.W0) {
                    t05Var.H1(t9w0Var);
                } else {
                    t05Var.X0.b(t9w0Var);
                }
                return rih1Var;
            case 17:
                if (lnmVar instanceof do31) {
                    do31Var = (do31) lnmVar;
                    int i30 = do31Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        do31Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        do31Var = new do31(this, lnmVar);
                    }
                } else {
                    do31Var = new do31(this, lnmVar);
                }
                Object obj19 = do31Var.a;
                int i31 = do31Var.b;
                if (i31 == 0) {
                    hm5.M(obj19);
                    ((wen0) ((wdm) obj3).X).l((Object) null);
                    vp3 vp3Var = new vp3((String) obj);
                    do31Var.b = 1;
                    if (((vr20) obj2).emit(vp3Var, do31Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case 18:
                iz31 iz31Var = (iz31) obj3;
                if (lnmVar instanceof hz31) {
                    hz31Var = (hz31) lnmVar;
                    int i32 = hz31Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        hz31Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        hz31Var = new hz31(this, lnmVar);
                    }
                } else {
                    hz31Var = new hz31(this, lnmVar);
                }
                Object obj20 = hz31Var.a;
                int i33 = hz31Var.b;
                if (i33 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var14 = (vr20) obj2;
                    tl10 tl10Var = (vl10) obj;
                    if (iz31Var.b.a()) {
                        tl10 tl10Var2 = tl10Var instanceof tl10 ? tl10Var : null;
                        if ((tl10Var2 != null ? tl10Var2.b : null) instanceof kd) {
                            z = true;
                        }
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    hz31Var.b = 1;
                    if (vr20Var14.emit(boolValueOf2, hz31Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case 19:
                String str12 = ((p541) obj3).a;
                if (lnmVar instanceof m641) {
                    m641Var = (m641) lnmVar;
                    int i34 = m641Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        m641Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        m641Var = new m641(this, lnmVar);
                    }
                } else {
                    m641Var = new m641(this, lnmVar);
                }
                Object obj21 = m641Var.a;
                int i35 = m641Var.b;
                if (i35 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var15 = (vr20) obj2;
                    i1r i1rVar7 = (i1r) obj;
                    Set set = s4b1.f;
                    if (uic.x(str12).c == blc0.Ef) {
                        jo70 jo70Var = ((h641) i1rVar7.a).a;
                        if (jo70Var != null && (io70Var = jo70Var.e) != null) {
                            str3 = io70Var.b;
                        }
                    } else {
                        str3 = str12;
                    }
                    m641Var.b = 1;
                    if (vr20Var15.emit(str3, m641Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case 20:
                if (lnmVar instanceof ud41) {
                    ud41Var = (ud41) lnmVar;
                    int i36 = ud41Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ud41Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        ud41Var = new ud41(this, lnmVar);
                    }
                } else {
                    ud41Var = new ud41(this, lnmVar);
                }
                Object obj22 = ud41Var.a;
                int i37 = ud41Var.b;
                if (i37 == 0) {
                    hm5.M(obj22);
                    vr20 vr20Var16 = (vr20) obj2;
                    if (((Boolean) obj).booleanValue() && ((add) ((e821) obj3).b).l()) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    ud41Var.b = 1;
                    if (vr20Var16.emit(boolValueOf3, ud41Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return b(obj, lnmVar);
            case 22:
                String str13 = (String) obj;
                p811 p811Var2 = (p811) obj2;
                if (!u890.j(str13, p811Var2.a)) {
                    p811Var2.a = str13;
                    ((iu30) obj3).invoke(new c451(str13));
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return c(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return e(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return f(obj, lnmVar);
            case 26:
                return g(obj, lnmVar);
            case 27:
                return h(obj, lnmVar);
            case 28:
                return i(obj, lnmVar);
            default:
                ncc0 ncc0Var = (ncc0) obj3;
                if (lnmVar instanceof ed61) {
                    ed61Var = (ed61) lnmVar;
                    int i38 = ed61Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        ed61Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        ed61Var = new ed61(this, lnmVar);
                    }
                } else {
                    ed61Var = new ed61(this, lnmVar);
                }
                Object obj23 = ed61Var.a;
                int i39 = ed61Var.b;
                if (i39 == 0) {
                    hm5.M(obj23);
                    vr20 vr20Var17 = (vr20) obj2;
                    cxc0 cxc0Var = (cxc0) obj;
                    le30 le30VarA = ncc0Var.d.a(cxc0Var.f.p);
                    d2f1 d2f1Var = ncc0Var.c;
                    String str14 = ncc0Var.b;
                    kby kbyVar = cxc0Var.f;
                    Boolean boolValueOf4 = Boolean.valueOf(d2f1Var.b(new cij1(str14, kbyVar.D, le30VarA, kbyVar.z, kbyVar.w, kbyVar.q)) == 3);
                    ed61Var.b = 1;
                    if (vr20Var17.emit(boolValueOf4, ed61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ tzy0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public tzy0(vr20 vr20Var, cf01 cf01Var, ze01 ze01Var) {
        this.a = (byte) 5;
        this.b = vr20Var;
        this.c = ze01Var;
    }
}
