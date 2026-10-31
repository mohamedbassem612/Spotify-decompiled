package p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.FileOrigin;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ilf0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ ilf0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        zch0 zch0Var;
        Object wch0Var;
        if (lnmVar instanceof zch0) {
            zch0Var = (zch0) lnmVar;
            int i = zch0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zch0Var.b = i - Integer.MIN_VALUE;
            } else {
                zch0Var = new zch0(this, lnmVar);
            }
        } else {
            zch0Var = new zch0(this, lnmVar);
        }
        Object obj2 = zch0Var.a;
        int i2 = zch0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            spq0 spq0VarPlaybackQuality = ((PlayerState) obj).playbackQuality();
            boolean zC = spq0VarPlaybackQuality.c();
            zfc1 zfc1Var = zfc1.a;
            if (zC) {
                PlaybackQuality playbackQuality = (PlaybackQuality) spq0VarPlaybackQuality.b();
                if (playbackQuality.fileOrigin() != FileOrigin.EXTERNAL) {
                    BitrateLevel bitrateLevelHighestAvailableQuality = playbackQuality.highestAvailableQuality();
                    switch (bitrateLevelHighestAvailableQuality == null ? -1 : ych0.a[bitrateLevelHighestAvailableQuality.ordinal()]) {
                        case -1:
                        case 1:
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 0:
                        default:
                            eg.o();
                            return null;
                        case 2:
                            zfc1Var = zfc1.b;
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 3:
                            zfc1Var = zfc1.c;
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 4:
                            zfc1Var = zfc1.d;
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 5:
                            zfc1Var = zfc1.e;
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 6:
                            zfc1Var = zfc1.f;
                            wch0Var = new wch0(zfc1Var);
                            break;
                        case 7:
                            zfc1Var = zfc1.g;
                            wch0Var = new wch0(zfc1Var);
                            break;
                    }
                } else {
                    wch0Var = vch0.a;
                }
            } else {
                wch0Var = new wch0(zfc1Var);
            }
            zch0Var.b = 1;
            Object objEmit = this.b.emit(wch0Var, zch0Var);
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
        edh0 edh0Var;
        if (lnmVar instanceof edh0) {
            edh0Var = (edh0) lnmVar;
            int i = edh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                edh0Var.b = i - Integer.MIN_VALUE;
            } else {
                edh0Var = new edh0(this, lnmVar);
            }
        } else {
            edh0Var = new edh0(this, lnmVar);
        }
        Object obj2 = edh0Var.a;
        int i2 = edh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            bdh0 bdh0Var = new bdh0((zfc1) obj);
            edh0Var.b = 1;
            Object objEmit = this.b.emit(bdh0Var, edh0Var);
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
        fdh0 fdh0Var;
        if (lnmVar instanceof fdh0) {
            fdh0Var = (fdh0) lnmVar;
            int i = fdh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdh0Var.b = i - Integer.MIN_VALUE;
            } else {
                fdh0Var = new fdh0(this, lnmVar);
            }
        } else {
            fdh0Var = new fdh0(this, lnmVar);
        }
        Object obj2 = fdh0Var.a;
        int i2 = fdh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            cdh0 cdh0Var = new cdh0((xch0) obj);
            fdh0Var.b = 1;
            Object objEmit = this.b.emit(cdh0Var, fdh0Var);
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
        keh0 keh0Var;
        int i;
        if (lnmVar instanceof keh0) {
            keh0Var = (keh0) lnmVar;
            int i2 = keh0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keh0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                keh0Var = new keh0(this, lnmVar);
            }
        } else {
            keh0Var = new keh0(this, lnmVar);
        }
        Object obj2 = keh0Var.a;
        int i3 = keh0Var.b;
        if (i3 == 0) {
            hm5.M(obj2);
            ap90 ap90Var = (ap90) obj;
            vo90 vo90Var = ap90Var.b.a;
            int i4 = ap90Var.e.a;
            if (i4 != 0) {
                int iC = l1d.C(i4);
                if (iC == 0) {
                    i = 3;
                } else if (iC == 1) {
                    i = 4;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 5;
                }
            } else {
                i = 0;
            }
            ey90 ey90Var = new ey90(vo90Var, i);
            keh0Var.b = 1;
            Object objEmit = this.b.emit(ey90Var, keh0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        leh0 leh0Var;
        if (lnmVar instanceof leh0) {
            leh0Var = (leh0) lnmVar;
            int i = leh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                leh0Var.b = i - Integer.MIN_VALUE;
            } else {
                leh0Var = new leh0(this, lnmVar);
            }
        } else {
            leh0Var = new leh0(this, lnmVar);
        }
        Object obj2 = leh0Var.a;
        int i2 = leh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            fy90 fy90Var = new fy90((gbl) obj);
            leh0Var.b = 1;
            Object objEmit = this.b.emit(fy90Var, leh0Var);
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
    private final Object h(Object obj, lnm lnmVar) {
        meh0 meh0Var;
        cy90 cy90Var;
        if (lnmVar instanceof meh0) {
            meh0Var = (meh0) lnmVar;
            int i = meh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                meh0Var.b = i - Integer.MIN_VALUE;
            } else {
                meh0Var = new meh0(this, lnmVar);
            }
        } else {
            meh0Var = new meh0(this, lnmVar);
        }
        Object obj2 = meh0Var.a;
        int i2 = meh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            feh0 feh0Var = (heh0) obj;
            if (feh0Var instanceof feh0) {
                cy90Var = new cy90(feh0Var.a);
            } else if (feh0Var instanceof eeh0) {
                cy90Var = by90.a;
            } else {
                if (!(feh0Var instanceof geh0)) {
                    eg.o();
                    return null;
                }
                cy90Var = dy90.a;
            }
            meh0Var.b = 1;
            Object objEmit = this.b.emit(cy90Var, meh0Var);
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
        veh0 veh0Var;
        if (lnmVar instanceof veh0) {
            veh0Var = (veh0) lnmVar;
            int i = veh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                veh0Var.b = i - Integer.MIN_VALUE;
            } else {
                veh0Var = new veh0(this, lnmVar);
            }
        } else {
            veh0Var = new veh0(this, lnmVar);
        }
        Object obj2 = veh0Var.a;
        int i2 = veh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            v0a0 v0a0Var = new v0a0((Set) obj, ko90.a);
            veh0Var.b = 1;
            Object objEmit = this.b.emit(v0a0Var, veh0Var);
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
    private final Object j(Object obj, lnm lnmVar) {
        weh0 weh0Var;
        if (lnmVar instanceof weh0) {
            weh0Var = (weh0) lnmVar;
            int i = weh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                weh0Var.b = i - Integer.MIN_VALUE;
            } else {
                weh0Var = new weh0(this, lnmVar);
            }
        } else {
            weh0Var = new weh0(this, lnmVar);
        }
        Object obj2 = weh0Var.a;
        int i2 = weh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new y0a0(((z7u) it.next()).a, b7x.a));
            }
            Set setP1 = o7h.p1(arrayList);
            weh0Var.b = 1;
            Object objEmit = this.b.emit(setP1, weh0Var);
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
    private final Object k(Object obj, lnm lnmVar) {
        kih0 kih0Var;
        if (lnmVar instanceof kih0) {
            kih0Var = (kih0) lnmVar;
            int i = kih0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kih0Var.b = i - Integer.MIN_VALUE;
            } else {
                kih0Var = new kih0(this, lnmVar);
            }
        } else {
            kih0Var = new kih0(this, lnmVar);
        }
        Object obj2 = kih0Var.a;
        int i2 = kih0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            th61 th61Var = (th61) obj;
            if (!th61Var.c && !th61Var.d) {
                kih0Var.b = 1;
                Object objEmit = this.b.emit(obj, kih0Var);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
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

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x020b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0214  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:112:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0259  */
    /* JADX WARN: Code duplicated, block: B:118:0x026d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0296  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e0 A[PHI: r4 r7 r13
      0x02e0: PHI (r4v65 java.lang.String) = (r4v31 java.lang.String), (r4v34 java.lang.String) binds: [B:129:0x02de, B:682:0x02e0] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r7v23 boolean) = (r7v9 boolean), (r7v13 boolean) binds: [B:129:0x02de, B:682:0x02e0] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r13v17 java.util.Iterator) = (r13v2 java.util.Iterator), (r13v4 java.util.Iterator) binds: [B:129:0x02de, B:682:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x036d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0375  */
    /* JADX WARN: Code duplicated, block: B:165:0x0381  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a4 A[LOOP:2: B:166:0x039e->B:168:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:178:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:180:0x040c  */
    /* JADX WARN: Code duplicated, block: B:182:0x040f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0414  */
    /* JADX WARN: Code duplicated, block: B:185:0x0417  */
    /* JADX WARN: Code duplicated, block: B:186:0x041a  */
    /* JADX WARN: Code duplicated, block: B:194:0x044a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0451  */
    /* JADX WARN: Code duplicated, block: B:198:0x045d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0475  */
    /* JADX WARN: Code duplicated, block: B:202:0x0478 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x047d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0480  */
    /* JADX WARN: Code duplicated, block: B:206:0x0483  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x051a  */
    /* JADX WARN: Code duplicated, block: B:226:0x052c  */
    /* JADX WARN: Code duplicated, block: B:298:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:314:0x0739  */
    /* JADX WARN: Code duplicated, block: B:336:0x078b  */
    /* JADX WARN: Code duplicated, block: B:369:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:385:0x0841  */
    /* JADX WARN: Code duplicated, block: B:407:0x0892  */
    /* JADX WARN: Code duplicated, block: B:425:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:448:0x0936  */
    /* JADX WARN: Code duplicated, block: B:466:0x097d  */
    /* JADX WARN: Code duplicated, block: B:484:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:523:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:606:0x0bd2  */
    /* JADX WARN: Code duplicated, block: B:628:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:662:0x0cb2  */
    /* JADX WARN: Code duplicated, block: B:675:0x050a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:92:0x019b  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /* JADX WARN: Instruction removed from duplicated block: B:226:0x052c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Throwable, p.ioj0] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r6v112 */
    /* JADX WARN: Type inference failed for: r6v98 */
    /* JADX WARN: Type inference failed for: r6v99 */
    public final Object emit(Object obj, lnm lnmVar) {
        hlf0 hlf0Var;
        oof0 oof0Var;
        ouf0 ouf0Var;
        xvf0 xvf0Var;
        nzf0 nzf0Var;
        k0g0 k0g0Var;
        a3g0 a3g0Var;
        d3g0 d3g0Var;
        exg0 exg0Var;
        iyg0 iyg0Var;
        jyg0 jyg0Var;
        czg0 czg0Var;
        int i;
        f4h0 f4h0Var;
        g4h0 g4h0Var;
        h4h0 h4h0Var;
        i4h0 i4h0Var;
        Object b3h0Var;
        j4h0 j4h0Var;
        k4h0 k4h0Var;
        y6h0 y6h0Var;
        rih1 rih1Var;
        int iNextIndex;
        ?? r5;
        ?? r6;
        l5h0 l5h0Var;
        ?? r30;
        rih1 rih1Var2;
        int i2;
        Iterator it;
        String str;
        c380 c380Var;
        String str2;
        Map map;
        Iterator it2;
        String str3;
        ux01 ux01Var;
        boolean z;
        z6x arrayList;
        boolean z2;
        Iterator it3;
        int i3;
        Object next;
        int i4;
        ux01 ux01Var2;
        String str4;
        lpu lpuVar;
        y6h0 y6h0Var2;
        vr20 vr20Var;
        d9n d9nVar;
        int i5;
        v5h0 u5h0Var;
        v5h0 k5h0Var;
        int i6;
        qx01 qx01Var;
        String str5;
        ArrayList arrayList2;
        Iterator it4;
        c380 c380VarA;
        int i7;
        boolean z3;
        boolean z4;
        z6x z6xVarSingletonList;
        d5h0 d5h0Var;
        l7c1 l7c1Var;
        String str6;
        z4h0 z4h0Var;
        xv2 xv2Var;
        boolean z5;
        int i8;
        String str7;
        ?? r23;
        String strI;
        z6x z6xVarSingletonList2;
        ?? r31;
        ?? r32;
        hah0 hah0Var;
        dmh0 dmh0Var;
        byte b = this.a;
        rih1 rih1Var3 = rih1.a;
        vr20 vr20Var2 = this.b;
        d9n d9nVar2 = d9n.a;
        int i9 = 1;
        ?? r11 = 0;
        switch (b) {
            case 0:
                if (lnmVar instanceof hlf0) {
                    hlf0Var = (hlf0) lnmVar;
                    int i10 = hlf0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        hlf0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        hlf0Var = new hlf0(this, lnmVar);
                    }
                } else {
                    hlf0Var = new hlf0(this, lnmVar);
                }
                Object obj2 = hlf0Var.a;
                int i11 = hlf0Var.b;
                if (i11 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((w8c0) obj).a(w8c0.d));
                    hlf0Var.b = 1;
                    if (vr20Var2.emit(boolValueOf, hlf0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1Var3;
            case 1:
                if (lnmVar instanceof oof0) {
                    oof0Var = (oof0) lnmVar;
                    int i12 = oof0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        oof0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        oof0Var = new oof0(this, lnmVar);
                    }
                } else {
                    oof0Var = new oof0(this, lnmVar);
                }
                Object obj3 = oof0Var.a;
                int i13 = oof0Var.b;
                if (i13 == 0) {
                    hm5.M(obj3);
                    uof0 uof0Var = new uof0((cay) obj);
                    oof0Var.b = 1;
                    if (vr20Var2.emit(uof0Var, oof0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i13 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                return rih1Var3;
            case 2:
                if (lnmVar instanceof ouf0) {
                    ouf0Var = (ouf0) lnmVar;
                    int i14 = ouf0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ouf0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        ouf0Var = new ouf0(this, lnmVar);
                    }
                } else {
                    ouf0Var = new ouf0(this, lnmVar);
                }
                Object obj4 = ouf0Var.a;
                int i15 = ouf0Var.b;
                if (i15 == 0) {
                    hm5.M(obj4);
                    if (((Boolean) obj).booleanValue()) {
                        ouf0Var.b = 1;
                        if (vr20Var2.emit(obj, ouf0Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var3;
            case 3:
                if (lnmVar instanceof xvf0) {
                    xvf0Var = (xvf0) lnmVar;
                    int i16 = xvf0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        xvf0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        xvf0Var = new xvf0(this, lnmVar);
                    }
                } else {
                    xvf0Var = new xvf0(this, lnmVar);
                }
                Object obj5 = xvf0Var.a;
                int i17 = xvf0Var.b;
                if (i17 == 0) {
                    hm5.M(obj5);
                    jn41 jn41Var = (ln41) obj;
                    Object zvf0Var = jn41Var instanceof jn41 ? new zvf0(((ui8) jn41Var.a).d()) : awf0.a;
                    xvf0Var.b = 1;
                    if (vr20Var2.emit(zvf0Var, xvf0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var3;
            case 4:
                if (lnmVar instanceof nzf0) {
                    nzf0Var = (nzf0) lnmVar;
                    int i18 = nzf0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        nzf0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        nzf0Var = new nzf0(this, lnmVar);
                    }
                } else {
                    nzf0Var = new nzf0(this, lnmVar);
                }
                Object obj6 = nzf0Var.a;
                int i19 = nzf0Var.b;
                if (i19 == 0) {
                    hm5.M(obj6);
                    Integer num = new Integer(((Number) obj).intValue());
                    Integer num2 = num.intValue() == 0 ? null : num;
                    nzf0Var.b = 1;
                    if (vr20Var2.emit(num2, nzf0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var3;
            case 5:
                if (lnmVar instanceof k0g0) {
                    k0g0Var = (k0g0) lnmVar;
                    int i20 = k0g0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        k0g0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        k0g0Var = new k0g0(this, lnmVar);
                    }
                } else {
                    k0g0Var = new k0g0(this, lnmVar);
                }
                Object obj7 = k0g0Var.a;
                int i21 = k0g0Var.b;
                if (i21 == 0) {
                    hm5.M(obj7);
                    ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                    t0g0 t0g0Var = (contextTrack != null ? l4o1.f0(contextTrack) : null) == null ? t0g0.b : s0g0.b;
                    k0g0Var.b = 1;
                    if (vr20Var2.emit(t0g0Var, k0g0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var3;
            case 6:
                if (lnmVar instanceof a3g0) {
                    a3g0Var = (a3g0) lnmVar;
                    int i22 = a3g0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        a3g0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        a3g0Var = new a3g0(this, lnmVar);
                    }
                } else {
                    a3g0Var = new a3g0(this, lnmVar);
                }
                Object obj8 = a3g0Var.a;
                int i23 = a3g0Var.b;
                if (i23 == 0) {
                    hm5.M(obj8);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : (List) obj) {
                        if (!((cpt) obj9).k) {
                            arrayList3.add(obj9);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj10 : arrayList3) {
                        if (((cpt) obj10).n != 11) {
                            arrayList4.add(obj10);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj11 : arrayList4) {
                        if (((cpt) obj11).l) {
                            arrayList5.add(obj11);
                        } else {
                            arrayList6.add(obj11);
                        }
                    }
                    ArrayList arrayListN0 = o7h.N0(arrayList6, o7h.d1(arrayList5, 1));
                    a3g0Var.b = 1;
                    if (vr20Var2.emit(arrayListN0, a3g0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var3;
            case 7:
                if (lnmVar instanceof d3g0) {
                    d3g0Var = (d3g0) lnmVar;
                    int i24 = d3g0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        d3g0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        d3g0Var = new d3g0(this, lnmVar);
                    }
                } else {
                    d3g0Var = new d3g0(this, lnmVar);
                }
                Object obj12 = d3g0Var.a;
                int i25 = d3g0Var.b;
                if (i25 == 0) {
                    hm5.M(obj12);
                    mmr0 mmr0Var = (mmr0) obj;
                    ily0 ily0Var = (ily0) mmr0Var.a;
                    List list = (List) mmr0Var.b;
                    ArrayList arrayList7 = ily0Var.a;
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj13 : arrayList7) {
                        if (((pr31) obj13).m) {
                            arrayList8.add(obj13);
                        }
                    }
                    mmr0 mmr0Var2 = new mmr0(arrayList8, list);
                    d3g0Var.b = 1;
                    if (vr20Var2.emit(mmr0Var2, d3g0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var3;
            case 8:
                if (lnmVar instanceof exg0) {
                    exg0Var = (exg0) lnmVar;
                    int i26 = exg0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        exg0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        exg0Var = new exg0(this, lnmVar);
                    }
                } else {
                    exg0Var = new exg0(this, lnmVar);
                }
                Object obj14 = exg0Var.a;
                int i27 = exg0Var.b;
                if (i27 == 0) {
                    hm5.M(obj14);
                    i5w0 i5w0VarD = spq0.d((lx0) obj);
                    exg0Var.b = 1;
                    if (vr20Var2.emit(i5w0VarD, exg0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var3;
            case 9:
                if (lnmVar instanceof iyg0) {
                    iyg0Var = (iyg0) lnmVar;
                    int i28 = iyg0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        iyg0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        iyg0Var = new iyg0(this, lnmVar);
                    }
                } else {
                    iyg0Var = new iyg0(this, lnmVar);
                }
                Object obj15 = iyg0Var.a;
                int i29 = iyg0Var.b;
                if (i29 == 0) {
                    hm5.M(obj15);
                    if (((Number) obj).intValue() > 0) {
                        iyg0Var.b = 1;
                        if (vr20Var2.emit(obj, iyg0Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var3;
            case 10:
                if (lnmVar instanceof jyg0) {
                    jyg0Var = (jyg0) lnmVar;
                    int i30 = jyg0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        jyg0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        jyg0Var = new jyg0(this, lnmVar);
                    }
                } else {
                    jyg0Var = new jyg0(this, lnmVar);
                }
                Object obj16 = jyg0Var.a;
                int i31 = jyg0Var.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    p6i1 p6i1VarL = i1o1.l(((rnc0) obj).b);
                    if (p6i1VarL != null) {
                        jyg0Var.b = 1;
                        if (vr20Var2.emit(p6i1VarL, jyg0Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var3;
            case 11:
                boolean z6 = false;
                if (lnmVar instanceof czg0) {
                    czg0Var = (czg0) lnmVar;
                    int i32 = czg0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        czg0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        czg0Var = new czg0(this, lnmVar);
                    }
                } else {
                    czg0Var = new czg0(this, lnmVar);
                }
                Object obj17 = czg0Var.a;
                int i33 = czg0Var.b;
                if (i33 == 0) {
                    hm5.M(obj17);
                    PlayerState playerState = (PlayerState) obj;
                    String strO = o4p1.o(playerState);
                    ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                    if (contextTrack2 != null) {
                        i = 1;
                        if (l4o1.G(contextTrack2)) {
                            z6 = true;
                        }
                    } else {
                        i = 1;
                    }
                    xyg0 xyg0Var = new xyg0(strO, z6);
                    czg0Var.b = i;
                    if (vr20Var2.emit(xyg0Var, czg0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var3;
            case 12:
                if (lnmVar instanceof f4h0) {
                    f4h0Var = (f4h0) lnmVar;
                    int i34 = f4h0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        f4h0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        f4h0Var = new f4h0(this, lnmVar);
                    }
                } else {
                    f4h0Var = new f4h0(this, lnmVar);
                }
                Object obj18 = f4h0Var.a;
                int i35 = f4h0Var.b;
                if (i35 == 0) {
                    hm5.M(obj18);
                    if (((Boolean) obj).booleanValue()) {
                        f4h0Var.b = 1;
                        if (vr20Var2.emit(obj, f4h0Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var3;
            case 13:
                boolean z7 = false;
                if (lnmVar instanceof g4h0) {
                    g4h0Var = (g4h0) lnmVar;
                    int i36 = g4h0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        g4h0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        g4h0Var = new g4h0(this, lnmVar);
                    }
                } else {
                    g4h0Var = new g4h0(this, lnmVar);
                }
                Object obj19 = g4h0Var.a;
                int i37 = g4h0Var.b;
                if (i37 == 0) {
                    hm5.M(obj19);
                    PlayerState playerState2 = (PlayerState) obj;
                    if (playerState2.isPlaying() && !playerState2.isPaused()) {
                        z7 = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z7);
                    g4h0Var.b = 1;
                    if (vr20Var2.emit(boolValueOf2, g4h0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var3;
            case 14:
                if (lnmVar instanceof h4h0) {
                    h4h0Var = (h4h0) lnmVar;
                    int i38 = h4h0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        h4h0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        h4h0Var = new h4h0(this, lnmVar);
                    }
                } else {
                    h4h0Var = new h4h0(this, lnmVar);
                }
                Object obj20 = h4h0Var.a;
                int i39 = h4h0Var.b;
                if (i39 == 0) {
                    hm5.M(obj20);
                    ((Boolean) obj).getClass();
                    h4h0Var.b = 1;
                    if (vr20Var2.emit(l2h0.a, h4h0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var3;
            case 15:
                if (lnmVar instanceof i4h0) {
                    i4h0Var = (i4h0) lnmVar;
                    int i40 = i4h0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        i4h0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        i4h0Var = new i4h0(this, lnmVar);
                    }
                } else {
                    i4h0Var = new i4h0(this, lnmVar);
                }
                Object obj21 = i4h0Var.a;
                int i41 = i4h0Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj21);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                k680 k680Var = (l680) obj;
                if (k680Var instanceof k680) {
                    String str8 = k680Var.c;
                    b3h0Var = str8 != null ? new d3h0(str8) : null;
                } else if (k680Var instanceof i680) {
                    i680 i680Var = (i680) k680Var;
                    b3h0Var = new b3h0(i680Var.b, i680Var.c);
                } else if (k680Var instanceof j680) {
                    b3h0Var = c3h0.a;
                } else if (k680Var != null) {
                    eg.o();
                    return null;
                }
                if (b3h0Var != null) {
                    i4h0Var.b = 1;
                    if (vr20Var2.emit(b3h0Var, i4h0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                }
                return rih1Var3;
            case 16:
                if (lnmVar instanceof j4h0) {
                    j4h0Var = (j4h0) lnmVar;
                    int i42 = j4h0Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        j4h0Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        j4h0Var = new j4h0(this, lnmVar);
                    }
                } else {
                    j4h0Var = new j4h0(this, lnmVar);
                }
                Object obj22 = j4h0Var.a;
                int i43 = j4h0Var.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    PlayerState playerState3 = (PlayerState) obj;
                    k3h0 k3h0Var = new k3h0(playerState3.isPlaying() || playerState3.isPaused());
                    j4h0Var.b = 1;
                    if (vr20Var2.emit(k3h0Var, j4h0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i43 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var3;
            case 17:
                if (lnmVar instanceof k4h0) {
                    k4h0Var = (k4h0) lnmVar;
                    int i44 = k4h0Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        k4h0Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        k4h0Var = new k4h0(this, lnmVar);
                    }
                } else {
                    k4h0Var = new k4h0(this, lnmVar);
                }
                Object obj23 = k4h0Var.a;
                int i45 = k4h0Var.b;
                if (i45 == 0) {
                    hm5.M(obj23);
                    y3h0 y3h0Var = new y3h0(((Boolean) obj).booleanValue());
                    k4h0Var.b = 1;
                    if (vr20Var2.emit(y3h0Var, k4h0Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i45 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var3;
            case 18:
                if (lnmVar instanceof y6h0) {
                    y6h0Var = (y6h0) lnmVar;
                    int i46 = y6h0Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        y6h0Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        y6h0Var = new y6h0(this, lnmVar);
                    }
                } else {
                    y6h0Var = new y6h0(this, lnmVar);
                }
                Object obj24 = y6h0Var.a;
                int i47 = y6h0Var.b;
                if (i47 == 0) {
                    hm5.M(obj24);
                    g6h0 g6h0Var = (g6h0) obj;
                    c380 c380Var2 = g6h0Var.a;
                    lpu lpuVar2 = g6h0Var.h;
                    boolean z8 = g6h0Var.i;
                    ArrayList arrayList9 = new ArrayList(q7h.U(c380Var2, 10));
                    Iterator it5 = c380Var2.iterator();
                    int i48 = 0;
                    while (true) {
                        boolean zHasNext = it5.hasNext();
                        z6x z6xVarA = z6x.a;
                        if (zHasNext) {
                            Object next2 = it5.next();
                            int i49 = i48 + 1;
                            if (i48 < 0) {
                                ?? r33 = r11;
                                p7h.T();
                                throw r33;
                            }
                            h5h0 h5h0Var = (h5h0) next2;
                            String str9 = g6h0Var.b;
                            if (z8) {
                                se11 se11Var = a7h0.a;
                                if ((h5h0Var instanceof e5h0) || (h5h0Var instanceof x4h0)) {
                                    rih1Var2 = rih1Var3;
                                    r31 = r11;
                                } else {
                                    if (h5h0Var instanceof y4h0) {
                                        z6xVarSingletonList2 = Collections.singletonList(new q5h0(26, f4i1.c(i48, "loadingDots:"), g6h0Var.d));
                                    } else if (h5h0Var instanceof c5h0) {
                                        z6xVarSingletonList2 = Collections.singletonList(new q5h0(14, f4i1.c(i48, "stoppedIndicator:"), r11));
                                    } else if (h5h0Var instanceof w4h0) {
                                        z6xVarSingletonList2 = Collections.singletonList(new q5h0(22, l1d.l(((w4h0) h5h0Var).a, "cancelled-recognition:"), r11));
                                    } else {
                                        r30 = r11;
                                        if (h5h0Var instanceof z4h0) {
                                            z4h0Var = (z4h0) h5h0Var;
                                            xv2Var = z4h0Var.a;
                                            z5 = g6h0Var.g;
                                            i8 = i9;
                                            str7 = xv2Var.a;
                                            rih1Var2 = rih1Var3;
                                            String strF = f4i1.f("message:", str7, ":null");
                                            String strI2 = f3o1.i(str7);
                                            if (z5) {
                                                r23 = 0;
                                            } else if (a7h0.a.e(k1o1.i(xv2Var))) {
                                                r23 = i8;
                                            } else {
                                                r23 = 0;
                                            }
                                            n5h0 n5h0Var = new n5h0(strF, str9, strI2, z4h0Var, r23);
                                            if (!xv2Var.d) {
                                                String strF2 = f4i1.f("feedbackRow:", str7, ":null");
                                                String str10 = xv2Var.a;
                                                strI = z4h0Var.b;
                                                if (strI == null) {
                                                    strI = k1o1.i(xv2Var);
                                                }
                                                z6xVarA = Collections.singletonList(new l5h0(strF2, str9, str10, strI));
                                            }
                                            z6xVarSingletonList = o7h.N0((Iterable) z6xVarA, Collections.singletonList(n5h0Var));
                                        } else {
                                            rih1Var2 = rih1Var3;
                                            i2 = i9;
                                            if (h5h0Var instanceof e5h0) {
                                                m5h0 m5h0Var = new m5h0(f4i1.c(i48, "greetingHeader:"));
                                                t5h0 t5h0Var = new t5h0(f4i1.c(i48, "suggestionPills:"), ((e5h0) h5h0Var).a);
                                                z5h0[] z5h0VarArr = new z5h0[2];
                                                z5h0VarArr[0] = m5h0Var;
                                                z5h0VarArr[i2] = t5h0Var;
                                                z6xVarSingletonList = p7h.M(z5h0VarArr);
                                            } else if (h5h0Var instanceof x4h0) {
                                                z6xVarSingletonList = a7h0.a(((x4h0) h5h0Var).a, i48, lpuVar2);
                                            } else if (h5h0Var instanceof d5h0) {
                                                d5h0Var = (d5h0) h5h0Var;
                                                l7c1Var = d5h0Var.a;
                                                str6 = l7c1Var.a;
                                                s5h0 s5h0Var = new s5h0(str6, str9, str6, d5h0Var);
                                                if (d5h0Var.b) {
                                                    z6xVarA = Collections.singletonList(new r5h0("sourceChips:".concat(str6), str6, l7c1Var.d));
                                                }
                                                z6xVarSingletonList = o7h.N0(Collections.singletonList(new l5h0("feedbackRow:".concat(str6), str9, l7c1Var.a, "")), o7h.N0((Iterable) z6xVarA, Collections.singletonList(s5h0Var)));
                                            } else if (h5h0Var instanceof g5h0) {
                                                g5h0 g5h0Var = (g5h0) h5h0Var;
                                                z6xVarSingletonList = Collections.singletonList(new x5h0(g5h0Var.a, str9, g5h0Var));
                                            } else if (h5h0Var instanceof b5h0) {
                                                b5h0 b5h0Var = (b5h0) h5h0Var;
                                                String str11 = b5h0Var.a;
                                                z6xVarSingletonList = Collections.singletonList(new p5h0(f4i1.c(str11.hashCode(), "retry:"), str9, str11, b5h0Var.b));
                                            } else if (h5h0Var instanceof a5h0) {
                                                a5h0 a5h0Var = (a5h0) h5h0Var;
                                                str = a5h0Var.a;
                                                c380Var = a5h0Var.b;
                                                str2 = g6h0Var.e;
                                                map = g6h0Var.f;
                                                se11 se11Var2 = a7h0.a;
                                                if (c380Var.isEmpty()) {
                                                    str3 = str9;
                                                    z8 = z8;
                                                    it = it5;
                                                    z = false;
                                                } else {
                                                    it2 = c380Var.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            str3 = str9;
                                                            ux01Var = (ux01) it2.next();
                                                            z8 = z8;
                                                            if ((ux01Var instanceof qx01) || ((qx01) ux01Var).b == 2) {
                                                                z8 = z8;
                                                                str9 = str3;
                                                                it5 = it5;
                                                                i2 = 1;
                                                            } else if (c380Var.isEmpty()) {
                                                                it = it5;
                                                                z = false;
                                                            } else {
                                                                Iterator it6 = c380Var.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        ux01 ux01Var3 = (ux01) it6.next();
                                                                        Iterator it7 = it6;
                                                                        if (ux01Var3 instanceof rx01) {
                                                                            it = it5;
                                                                            if (((rx01) ux01Var3).b != 2) {
                                                                            }
                                                                            z = true;
                                                                        } else {
                                                                            it = it5;
                                                                        }
                                                                        if ((ux01Var3 instanceof sx01) && ((sx01) ux01Var3).b == i2) {
                                                                            z = true;
                                                                        } else {
                                                                            it6 = it7;
                                                                            it5 = it;
                                                                            i2 = 1;
                                                                        }
                                                                    } else {
                                                                        it = it5;
                                                                        z = false;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str3 = str9;
                                                            z8 = z8;
                                                            it = it5;
                                                            z = false;
                                                        }
                                                    }
                                                }
                                                z2 = z;
                                                arrayList = new ArrayList(q7h.U(c380Var, 10));
                                                it3 = c380Var.iterator();
                                                i3 = 0;
                                                while (it3.hasNext()) {
                                                    next = it3.next();
                                                    i4 = i3 + 1;
                                                    if (i3 >= 0) {
                                                        p7h.T();
                                                        throw r30;
                                                    }
                                                    ux01Var2 = (ux01) next;
                                                    Iterator it8 = it3;
                                                    str4 = "null";
                                                    if (ux01Var2 instanceof qx01) {
                                                        qx01Var = (qx01) ux01Var2;
                                                        str5 = qx01Var.a;
                                                        d9nVar = d9nVar2;
                                                        c380 c380Var3 = qx01Var.c;
                                                        vr20Var = vr20Var2;
                                                        lpuVar = lpuVar2;
                                                        y6h0Var2 = y6h0Var;
                                                        arrayList2 = new ArrayList(q7h.U(c380Var3, 10));
                                                        it4 = c380Var3.iterator();
                                                        while (it4.hasNext()) {
                                                            arrayList2.add(((eof1) it4.next()).a);
                                                        }
                                                        c380VarA = mqo1.A(arrayList2);
                                                        i7 = qx01Var.b;
                                                        if (i7 == 2) {
                                                            StringBuilder sbS = l1d.s(i48, "trackListPreview:", str, ":", ":");
                                                            sbS.append(i3);
                                                            sbS.append(":");
                                                            sbS.append(str5);
                                                            String string = sbS.toString();
                                                            String strI3 = f3o1.i(str);
                                                            String str12 = qx01Var.a;
                                                            boolean z9 = qx01Var.d;
                                                            boolean z10 = qx01Var.e;
                                                            String str13 = (String) map.get(str12);
                                                            boolean zJ = u890.j(str2, str5);
                                                            if (str2 != null) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            k5h0Var = new v5h0(string, str3, strI3, str12, c380VarA, z9, z10, str13, zJ, z4);
                                                        } else {
                                                            StringBuilder sbS2 = l1d.s(i48, "collectionPreview:", str, ":", ":");
                                                            sbS2.append(i3);
                                                            sbS2.append(":");
                                                            if (i7 != 1) {
                                                                str4 = "PLAYLIST";
                                                            } else if (i7 != 2) {
                                                                str4 = "LIST";
                                                            } else if (i7 == 3) {
                                                                str4 = "ALBUM";
                                                            }
                                                            sbS2.append(str4);
                                                            sbS2.append(":");
                                                            sbS2.append(str5);
                                                            String string2 = sbS2.toString();
                                                            String strI4 = f3o1.i(str);
                                                            String str14 = qx01Var.a;
                                                            int i50 = qx01Var.b;
                                                            boolean z11 = qx01Var.d;
                                                            boolean z12 = qx01Var.e;
                                                            if (!z2 || qx01Var.f) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            k5h0Var = new i5h0(string2, str3, strI4, str14, i50, c380VarA, z11, z12, z3);
                                                        }
                                                    } else {
                                                        lpuVar = lpuVar2;
                                                        y6h0Var2 = y6h0Var;
                                                        vr20Var = vr20Var2;
                                                        d9nVar = d9nVar2;
                                                        if (ux01Var2 instanceof rx01) {
                                                            rx01 rx01Var = (rx01) ux01Var2;
                                                            i6 = rx01Var.b;
                                                            String str15 = rx01Var.a;
                                                            StringBuilder sbS3 = l1d.s(i48, "entityPreview:", str, ":", ":");
                                                            sbS3.append(i3);
                                                            sbS3.append(":");
                                                            if (i6 != 1) {
                                                                str4 = "ARTIST";
                                                            } else if (i6 != 2) {
                                                                str4 = "TRACK";
                                                            } else if (i6 == 3) {
                                                                str4 = "CONCERT";
                                                            }
                                                            sbS3.append(str4);
                                                            sbS3.append(":");
                                                            sbS3.append(str15);
                                                            k5h0Var = new k5h0(sbS3.toString(), str3, f3o1.i(str), rx01Var.a, rx01Var.b, rx01Var.c);
                                                        } else {
                                                            if (ux01Var2 instanceof sx01) {
                                                                eg.o();
                                                                return r30;
                                                            }
                                                            sx01 sx01Var = (sx01) ux01Var2;
                                                            String str16 = sx01Var.a;
                                                            i5 = sx01Var.b;
                                                            StringBuilder sbS4 = l1d.s(i48, "talkRichContent:", str, ":", ":");
                                                            sbS4.append(i3);
                                                            sbS4.append(":");
                                                            if (i5 != 1) {
                                                                str4 = "EPISODE";
                                                            } else if (i5 == 2) {
                                                                str4 = "SHOW";
                                                            }
                                                            sbS4.append(str4);
                                                            sbS4.append(":");
                                                            sbS4.append(str16);
                                                            String str17 = str3;
                                                            str3 = str17;
                                                            u5h0Var = new u5h0(sx01Var.b, sbS4.toString(), str17, f3o1.i(str), str16);
                                                        }
                                                        arrayList.add(u5h0Var);
                                                        i3 = i4;
                                                        it3 = it8;
                                                        d9nVar2 = d9nVar;
                                                        vr20Var2 = vr20Var;
                                                        y6h0Var = y6h0Var2;
                                                        lpuVar2 = lpuVar;
                                                    }
                                                    u5h0Var = k5h0Var;
                                                    arrayList.add(u5h0Var);
                                                    i3 = i4;
                                                    it3 = it8;
                                                    d9nVar2 = d9nVar;
                                                    vr20Var2 = vr20Var;
                                                    y6h0Var = y6h0Var2;
                                                    lpuVar2 = lpuVar;
                                                }
                                                lpuVar2 = lpuVar2;
                                                y6h0Var = y6h0Var;
                                                vr20Var2 = vr20Var2;
                                                d9nVar2 = d9nVar2;
                                                z6xVarA = arrayList;
                                                r32 = r30;
                                            } else {
                                                lpuVar2 = lpuVar2;
                                                y6h0Var = y6h0Var;
                                                vr20Var2 = vr20Var2;
                                                z8 = z8;
                                                d9nVar2 = d9nVar2;
                                                it = it5;
                                                if (h5h0Var instanceof f5h0) {
                                                    eg.o();
                                                    return r30;
                                                }
                                                f5h0 f5h0Var = (f5h0) h5h0Var;
                                                se11 se11Var3 = a7h0.a;
                                                String str18 = f5h0Var.a;
                                                z6xVarA = Collections.singletonList(new w5h0("updateNotification:" + str18 + ":" + f5h0Var.b, str9, f3o1.i(str18), f5h0Var.c, f5h0Var.d, f5h0Var.e, f5h0Var.f, f5h0Var.g, f5h0Var.h));
                                                r32 = r30;
                                            }
                                        }
                                        z6xVarA = z6xVarSingletonList;
                                        r31 = r30;
                                    }
                                    z6xVarA = z6xVarSingletonList2;
                                    rih1Var2 = rih1Var3;
                                    r31 = r11;
                                }
                                it = it5;
                                r32 = r31;
                            } else {
                                if (h5h0Var instanceof y4h0) {
                                    z6xVarSingletonList2 = Collections.singletonList(new q5h0(26, f4i1.c(i48, "loadingDots:"), g6h0Var.d));
                                } else if (h5h0Var instanceof c5h0) {
                                    z6xVarSingletonList2 = Collections.singletonList(new q5h0(14, f4i1.c(i48, "stoppedIndicator:"), r11));
                                } else if (h5h0Var instanceof w4h0) {
                                    z6xVarSingletonList2 = Collections.singletonList(new q5h0(22, l1d.l(((w4h0) h5h0Var).a, "cancelled-recognition:"), r11));
                                } else {
                                    r30 = r11;
                                    if (h5h0Var instanceof z4h0) {
                                        z4h0Var = (z4h0) h5h0Var;
                                        xv2Var = z4h0Var.a;
                                        z5 = g6h0Var.g;
                                        i8 = i9;
                                        str7 = xv2Var.a;
                                        rih1Var2 = rih1Var3;
                                        String strF3 = f4i1.f("message:", str7, ":null");
                                        String strI5 = f3o1.i(str7);
                                        if (z5) {
                                            r23 = 0;
                                        } else if (a7h0.a.e(k1o1.i(xv2Var))) {
                                            r23 = i8;
                                        } else {
                                            r23 = 0;
                                        }
                                        n5h0 n5h0Var2 = new n5h0(strF3, str9, strI5, z4h0Var, r23);
                                        if (!xv2Var.d) {
                                            String strF4 = f4i1.f("feedbackRow:", str7, ":null");
                                            String str19 = xv2Var.a;
                                            strI = z4h0Var.b;
                                            if (strI == null) {
                                                strI = k1o1.i(xv2Var);
                                            }
                                            z6xVarA = Collections.singletonList(new l5h0(strF4, str9, str19, strI));
                                        }
                                        z6xVarSingletonList = o7h.N0((Iterable) z6xVarA, Collections.singletonList(n5h0Var2));
                                    } else {
                                        rih1Var2 = rih1Var3;
                                        i2 = i9;
                                        if (h5h0Var instanceof e5h0) {
                                            m5h0 m5h0Var2 = new m5h0(f4i1.c(i48, "greetingHeader:"));
                                            t5h0 t5h0Var2 = new t5h0(f4i1.c(i48, "suggestionPills:"), ((e5h0) h5h0Var).a);
                                            z5h0[] z5h0VarArr2 = new z5h0[2];
                                            z5h0VarArr2[0] = m5h0Var2;
                                            z5h0VarArr2[i2] = t5h0Var2;
                                            z6xVarSingletonList = p7h.M(z5h0VarArr2);
                                        } else if (h5h0Var instanceof x4h0) {
                                            z6xVarSingletonList = a7h0.a(((x4h0) h5h0Var).a, i48, lpuVar2);
                                        } else if (h5h0Var instanceof d5h0) {
                                            d5h0Var = (d5h0) h5h0Var;
                                            l7c1Var = d5h0Var.a;
                                            str6 = l7c1Var.a;
                                            s5h0 s5h0Var2 = new s5h0(str6, str9, str6, d5h0Var);
                                            if (d5h0Var.b) {
                                                z6xVarA = Collections.singletonList(new r5h0("sourceChips:".concat(str6), str6, l7c1Var.d));
                                            }
                                            z6xVarSingletonList = o7h.N0(Collections.singletonList(new l5h0("feedbackRow:".concat(str6), str9, l7c1Var.a, "")), o7h.N0((Iterable) z6xVarA, Collections.singletonList(s5h0Var2)));
                                        } else if (h5h0Var instanceof g5h0) {
                                            g5h0 g5h0Var2 = (g5h0) h5h0Var;
                                            z6xVarSingletonList = Collections.singletonList(new x5h0(g5h0Var2.a, str9, g5h0Var2));
                                        } else if (h5h0Var instanceof b5h0) {
                                            b5h0 b5h0Var2 = (b5h0) h5h0Var;
                                            String str110 = b5h0Var2.a;
                                            z6xVarSingletonList = Collections.singletonList(new p5h0(f4i1.c(str110.hashCode(), "retry:"), str9, str110, b5h0Var2.b));
                                        } else if (h5h0Var instanceof a5h0) {
                                            a5h0 a5h0Var2 = (a5h0) h5h0Var;
                                            str = a5h0Var2.a;
                                            c380Var = a5h0Var2.b;
                                            str2 = g6h0Var.e;
                                            map = g6h0Var.f;
                                            se11 se11Var4 = a7h0.a;
                                            if (c380Var.isEmpty()) {
                                                str3 = str9;
                                                z8 = z8;
                                                it = it5;
                                                z = false;
                                            } else {
                                                it2 = c380Var.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        str3 = str9;
                                                        ux01Var = (ux01) it2.next();
                                                        z8 = z8;
                                                        if (ux01Var instanceof qx01) {
                                                        }
                                                        z8 = z8;
                                                        str9 = str3;
                                                        it5 = it5;
                                                        i2 = 1;
                                                    } else {
                                                        str3 = str9;
                                                        z8 = z8;
                                                        it = it5;
                                                        z = false;
                                                    }
                                                }
                                            }
                                            z2 = z;
                                            arrayList = new ArrayList(q7h.U(c380Var, 10));
                                            it3 = c380Var.iterator();
                                            i3 = 0;
                                            while (it3.hasNext()) {
                                                next = it3.next();
                                                i4 = i3 + 1;
                                                if (i3 >= 0) {
                                                    p7h.T();
                                                    throw r30;
                                                }
                                                ux01Var2 = (ux01) next;
                                                Iterator it9 = it3;
                                                str4 = "null";
                                                if (ux01Var2 instanceof qx01) {
                                                    qx01Var = (qx01) ux01Var2;
                                                    str5 = qx01Var.a;
                                                    d9nVar = d9nVar2;
                                                    c380 c380Var4 = qx01Var.c;
                                                    vr20Var = vr20Var2;
                                                    lpuVar = lpuVar2;
                                                    y6h0Var2 = y6h0Var;
                                                    arrayList2 = new ArrayList(q7h.U(c380Var4, 10));
                                                    it4 = c380Var4.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList2.add(((eof1) it4.next()).a);
                                                    }
                                                    c380VarA = mqo1.A(arrayList2);
                                                    i7 = qx01Var.b;
                                                    if (i7 == 2) {
                                                        StringBuilder sbS5 = l1d.s(i48, "trackListPreview:", str, ":", ":");
                                                        sbS5.append(i3);
                                                        sbS5.append(":");
                                                        sbS5.append(str5);
                                                        String string3 = sbS5.toString();
                                                        String strI6 = f3o1.i(str);
                                                        String str111 = qx01Var.a;
                                                        boolean z13 = qx01Var.d;
                                                        boolean z14 = qx01Var.e;
                                                        String str112 = (String) map.get(str111);
                                                        boolean zJ2 = u890.j(str2, str5);
                                                        if (str2 != null) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        k5h0Var = new v5h0(string3, str3, strI6, str111, c380VarA, z13, z14, str112, zJ2, z4);
                                                    } else {
                                                        StringBuilder sbS6 = l1d.s(i48, "collectionPreview:", str, ":", ":");
                                                        sbS6.append(i3);
                                                        sbS6.append(":");
                                                        if (i7 != 1) {
                                                            str4 = "PLAYLIST";
                                                        } else if (i7 != 2) {
                                                            str4 = "LIST";
                                                        } else if (i7 == 3) {
                                                            str4 = "ALBUM";
                                                        }
                                                        sbS6.append(str4);
                                                        sbS6.append(":");
                                                        sbS6.append(str5);
                                                        String string4 = sbS6.toString();
                                                        String strI7 = f3o1.i(str);
                                                        String str113 = qx01Var.a;
                                                        int i51 = qx01Var.b;
                                                        boolean z15 = qx01Var.d;
                                                        boolean z16 = qx01Var.e;
                                                        if (z2) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        k5h0Var = new i5h0(string4, str3, strI7, str113, i51, c380VarA, z15, z16, z3);
                                                    }
                                                } else {
                                                    lpuVar = lpuVar2;
                                                    y6h0Var2 = y6h0Var;
                                                    vr20Var = vr20Var2;
                                                    d9nVar = d9nVar2;
                                                    if (ux01Var2 instanceof rx01) {
                                                        rx01 rx01Var2 = (rx01) ux01Var2;
                                                        i6 = rx01Var2.b;
                                                        String str114 = rx01Var2.a;
                                                        StringBuilder sbS7 = l1d.s(i48, "entityPreview:", str, ":", ":");
                                                        sbS7.append(i3);
                                                        sbS7.append(":");
                                                        if (i6 != 1) {
                                                            str4 = "ARTIST";
                                                        } else if (i6 != 2) {
                                                            str4 = "TRACK";
                                                        } else if (i6 == 3) {
                                                            str4 = "CONCERT";
                                                        }
                                                        sbS7.append(str4);
                                                        sbS7.append(":");
                                                        sbS7.append(str114);
                                                        k5h0Var = new k5h0(sbS7.toString(), str3, f3o1.i(str), rx01Var2.a, rx01Var2.b, rx01Var2.c);
                                                    } else {
                                                        if (ux01Var2 instanceof sx01) {
                                                            eg.o();
                                                            return r30;
                                                        }
                                                        sx01 sx01Var2 = (sx01) ux01Var2;
                                                        String str115 = sx01Var2.a;
                                                        i5 = sx01Var2.b;
                                                        StringBuilder sbS8 = l1d.s(i48, "talkRichContent:", str, ":", ":");
                                                        sbS8.append(i3);
                                                        sbS8.append(":");
                                                        if (i5 != 1) {
                                                            str4 = "EPISODE";
                                                        } else if (i5 == 2) {
                                                            str4 = "SHOW";
                                                        }
                                                        sbS8.append(str4);
                                                        sbS8.append(":");
                                                        sbS8.append(str115);
                                                        String str116 = str3;
                                                        str3 = str116;
                                                        u5h0Var = new u5h0(sx01Var2.b, sbS8.toString(), str116, f3o1.i(str), str115);
                                                    }
                                                    arrayList.add(u5h0Var);
                                                    i3 = i4;
                                                    it3 = it9;
                                                    d9nVar2 = d9nVar;
                                                    vr20Var2 = vr20Var;
                                                    y6h0Var = y6h0Var2;
                                                    lpuVar2 = lpuVar;
                                                }
                                                u5h0Var = k5h0Var;
                                                arrayList.add(u5h0Var);
                                                i3 = i4;
                                                it3 = it9;
                                                d9nVar2 = d9nVar;
                                                vr20Var2 = vr20Var;
                                                y6h0Var = y6h0Var2;
                                                lpuVar2 = lpuVar;
                                            }
                                            lpuVar2 = lpuVar2;
                                            y6h0Var = y6h0Var;
                                            vr20Var2 = vr20Var2;
                                            d9nVar2 = d9nVar2;
                                            z6xVarA = arrayList;
                                            r32 = r30;
                                        } else {
                                            lpuVar2 = lpuVar2;
                                            y6h0Var = y6h0Var;
                                            vr20Var2 = vr20Var2;
                                            z8 = z8;
                                            d9nVar2 = d9nVar2;
                                            it = it5;
                                            if (h5h0Var instanceof f5h0) {
                                                eg.o();
                                                return r30;
                                            }
                                            f5h0 f5h0Var2 = (f5h0) h5h0Var;
                                            se11 se11Var5 = a7h0.a;
                                            String str117 = f5h0Var2.a;
                                            z6xVarA = Collections.singletonList(new w5h0("updateNotification:" + str117 + ":" + f5h0Var2.b, str9, f3o1.i(str117), f5h0Var2.c, f5h0Var2.d, f5h0Var2.e, f5h0Var2.f, f5h0Var2.g, f5h0Var2.h));
                                            r32 = r30;
                                        }
                                    }
                                    z6xVarA = z6xVarSingletonList;
                                    r31 = r30;
                                    it = it5;
                                    r32 = r31;
                                }
                                z6xVarA = z6xVarSingletonList2;
                                rih1Var2 = rih1Var3;
                                r31 = r11;
                                it = it5;
                                r32 = r31;
                            }
                            arrayList9.add(z6xVarA);
                            z8 = z8;
                            i48 = i49;
                            r11 = r32;
                            rih1Var3 = rih1Var2;
                            it5 = it;
                            d9nVar2 = d9nVar2;
                            vr20Var2 = vr20Var2;
                            y6h0Var = y6h0Var;
                            lpuVar2 = lpuVar2;
                            i9 = 1;
                        } else {
                            lpu lpuVar3 = lpuVar2;
                            y6h0 y6h0Var3 = y6h0Var;
                            rih1Var = rih1Var3;
                            vr20 vr20Var3 = vr20Var2;
                            boolean z17 = z8;
                            d9n d9nVar3 = d9nVar2;
                            ?? r34 = r11;
                            int i52 = 0;
                            se11 se11Var6 = a7h0.a;
                            ArrayList<z5h0> arrayList10 = new ArrayList();
                            int i53 = 0;
                            ?? r7 = r34;
                            for (Object obj25 : c380Var2) {
                                int i54 = i53 + 1;
                                if (i53 < 0) {
                                    p7h.T();
                                    throw r34;
                                }
                                if (!(((h5h0) obj25) instanceof a5h0)) {
                                    if (r7 != 0) {
                                        arrayList10.add(r7);
                                    }
                                    r5 = r34;
                                }
                                r5 = r7;
                                List list2 = (List) arrayList9.get(i53);
                                Object objC0 = o7h.C0(list2);
                                if (objC0 instanceof l5h0) {
                                    l5h0Var = (l5h0) objC0;
                                } else {
                                    r6 = r34;
                                }
                                if (r6 == 0) {
                                    r6 = l5h0Var;
                                    arrayList10.addAll(list2);
                                } else if (i54 >= c380Var2.size() || !(c380Var2.get(i54) instanceof a5h0)) {
                                    r6 = l5h0Var;
                                    r6 = l5h0Var;
                                    arrayList10.addAll(list2);
                                } else {
                                    r6 = l5h0Var;
                                    arrayList10.addAll(list2.subList(i52, list2.size() - 1));
                                    r5 = r6;
                                }
                                i53 = i54;
                                i52 = 0;
                                r7 = r5;
                            }
                            if (r7 != 0) {
                                arrayList10.add(r7);
                            }
                            if (g6h0Var.c) {
                                ListIterator listIterator = arrayList10.listIterator(arrayList10.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        iNextIndex = -1;
                                    } else if (((z5h0) listIterator.previous()) instanceof l5h0) {
                                        iNextIndex = listIterator.nextIndex();
                                    }
                                }
                                if (iNextIndex != -1) {
                                    ArrayList arrayList11 = new ArrayList(arrayList10);
                                    l5h0 l5h0Var2 = (l5h0) arrayList11.get(iNextIndex);
                                    arrayList11.set(iNextIndex, new l5h0(l5h0Var2.a, l5h0Var2.b, l5h0Var2.c, l5h0Var2.d, l5h0Var2.e, true));
                                    arrayList10 = arrayList11;
                                }
                            }
                            if (z17) {
                                if (c380Var2.isEmpty()) {
                                    z6xVarA = a7h0.a(fg91.b, 0, lpuVar3);
                                } else {
                                    Iterator it10 = c380Var2.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            h5h0 h5h0Var2 = (h5h0) it10.next();
                                            if ((h5h0Var2 instanceof e5h0) || (h5h0Var2 instanceof x4h0)) {
                                            }
                                        } else {
                                            z6xVarA = a7h0.a(fg91.b, 0, lpuVar3);
                                        }
                                    }
                                }
                                arrayList10 = o7h.N0(arrayList10, (Collection) z6xVarA);
                            }
                            ArrayList arrayList12 = new ArrayList(q7h.U(arrayList10, 10));
                            for (z5h0 z5h0Var : arrayList10) {
                                arrayList12.add(new h8k1(z5h0Var, z5h0Var.getId()));
                            }
                            hj50 hj50Var = new hj50(arrayList12, (ioj0) r34);
                            y6h0Var3.b = 1;
                            if (vr20Var3.emit(hj50Var, y6h0Var3) == d9nVar3) {
                                return d9nVar3;
                            }
                        }
                    }
                } else {
                    if (i47 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                    rih1Var = rih1Var3;
                }
                return rih1Var;
            case 19:
                if (lnmVar instanceof hah0) {
                    hah0Var = (hah0) lnmVar;
                    int i55 = hah0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        hah0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        hah0Var = new hah0(this, lnmVar);
                    }
                } else {
                    hah0Var = new hah0(this, lnmVar);
                }
                Object obj26 = hah0Var.a;
                int i56 = hah0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj26);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var3;
                }
                hah0Var.b = 1;
                return vr20Var2.emit(obj, hah0Var) == d9nVar2 ? d9nVar2 : rih1Var3;
            case 20:
                return b(obj, lnmVar);
            case 21:
                return c(obj, lnmVar);
            case 22:
                return e(obj, lnmVar);
            case 23:
                return f(obj, lnmVar);
            case 24:
                return g(obj, lnmVar);
            case 25:
                return h(obj, lnmVar);
            case 26:
                return i(obj, lnmVar);
            case 27:
                return j(obj, lnmVar);
            case 28:
                return k(obj, lnmVar);
            default:
                if (lnmVar instanceof dmh0) {
                    dmh0Var = (dmh0) lnmVar;
                    int i57 = dmh0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dmh0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        dmh0Var = new dmh0(this, lnmVar);
                    }
                } else {
                    dmh0Var = new dmh0(this, lnmVar);
                }
                Object obj27 = dmh0Var.a;
                int i58 = dmh0Var.b;
                if (i58 == 0) {
                    hm5.M(obj27);
                    r1f r1fVar = new r1f((xwu) obj);
                    dmh0Var.b = 1;
                    return vr20Var2.emit(r1fVar, dmh0Var) == d9nVar2 ? d9nVar2 : rih1Var3;
                }
                if (i58 == 1) {
                    hm5.M(obj27);
                    return rih1Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ ilf0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
