package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j3y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3y0(kls0 kls0Var, dt01 dt01Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 29;
        this.b = dt01Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0458  */
    /* JADX WARN: Code duplicated, block: B:177:0x0462  */
    /* JADX WARN: Code duplicated, block: B:181:0x0475  */
    /* JADX WARN: Code duplicated, block: B:187:0x0496 A[LOOP:6: B:185:0x0490->B:187:0x0496, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:208:0x04db  */
    /* JADX WARN: Code duplicated, block: B:210:0x04df  */
    /* JADX WARN: Code duplicated, block: B:211:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x0505  */
    /* JADX WARN: Code duplicated, block: B:221:0x0524  */
    /* JADX WARN: Code duplicated, block: B:224:0x0530 A[LOOP:9: B:219:0x051e->B:224:0x0530, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x0545  */
    /* JADX WARN: Code duplicated, block: B:228:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0555 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0565  */
    /* JADX WARN: Code duplicated, block: B:235:0x056b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0576  */
    /* JADX WARN: Code duplicated, block: B:239:0x057c  */
    /* JADX WARN: Code duplicated, block: B:328:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[LOOP:8: B:212:0x04ff->B:339:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x052e A[SYNTHETIC] */
    public final Object invoke(Object obj) {
        jdy0 jdy0Var;
        t480 t480Var;
        int iIndexOf;
        ListIterator listIterator;
        int iNextIndex;
        Iterator it;
        int i;
        mmr0 mmr0Var;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it2;
        Iterator it3;
        int i2;
        int iIndexOf2;
        hjf1 hjf1Var;
        RecyclerView recyclerView;
        int i3;
        int i4;
        byte b = 23;
        byte b2 = 14;
        byte b3 = 1;
        vhx0 at01Var = null;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                rb3 rb3Var = (rb3) this.c;
                qpj1 qpj1Var = (qpj1) rb3Var.c;
                kby kbyVar = ((cxc0) obj).f;
                boolean zA = ((xyl1) qpj1Var.c).a(kbyVar.q);
                String str2 = (String) kbyVar.q.get("progress_details");
                if (str2 != null) {
                    try {
                        at01Var = (vhx0) nfa0.d.a(str2, vhx0.Companion.serializer());
                    } catch (Exception unused) {
                    }
                }
                return new uf40(str, zA, at01Var, (wen0) rb3Var.d);
            case 1:
                int iIntValue = ((Number) obj).intValue();
                kdy0 kdy0Var = (kdy0) this.b;
                View view = (View) this.c;
                n7h1 n7h1Var = (n7h1) kdy0Var.d;
                if (n7h1Var != null && (jdy0Var = (jdy0) ((LinkedHashMap) kdy0Var.b).get(view)) != null) {
                    ldy0 ldy0Var = new ldy0(jdy0Var.b);
                    Object objD = ((i7h1) kdy0Var.e).d(ldy0Var, ldy0Var, (op80) null);
                    l7h1 l7h1Var = objD instanceof l7h1 ? (l7h1) objD : null;
                    if (l7h1Var != null) {
                        if (iIntValue >= 50 && jdy0Var.c == null) {
                            jdy0Var.c = n7h1Var.h(l7h1Var);
                        } else if (iIntValue < 50 && (t480Var = jdy0Var.c) != null) {
                            n7h1Var.e(t480Var);
                            jdy0Var.c = null;
                        }
                    }
                }
                return rih1.a;
            case 2:
                if (!((is20) this.b).f) {
                    is20 is20Var = (is20) this.b;
                    is20Var.e = obj;
                    is20Var.c(((poy0) this.c).c.invoke(is20Var.d, obj));
                }
                return rih1.a;
            case 3:
                return new k0z0((xnn0) obj, (xm41) this.b, (q8n) this.c);
            case 4:
                lsl lslVar = (lsl) obj;
                tob1 tob1Var = (tob1) this.c;
                lslVar.s1();
                es41 es41Var = (es41) this.b;
                if (!es41Var.h.b() && ((Number) tob1Var.getValue()).floatValue() <= 0.0f) {
                    b3 = 0;
                }
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 4.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - fIntBitsToFloat) / es41Var.f.s();
                if (b3 != 0) {
                    DrawScope.g0(lslVar, u7h.b(u7h.f, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) - lslVar.X0(4.0f))) << 32) | (((long) Float.floatToRawIntBits(es41Var.a.s() * fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(lslVar.X0(4.0f))) << 32), (((long) Float.floatToRawIntBits(lslVar.X0(2.0f))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(lslVar.X0(2.0f)))), (DrawStyle) null, 0.0f, 0, 240);
                }
                return rih1.a;
            case 5:
                ewe eweVar = (ewe) this.b;
                ((tso) eweVar.g).a.e = new g1x0(eweVar, (ven0) this.c, b);
                return new xwm0(eweVar, (byte) 13);
            case 6:
                return new w9d0((InputMethodManager) this.b, (IBinder) this.c, (byte) 12);
            case 7:
                oy1 oy1Var = (oy1) this.c;
                fn31.T(cto1.q(oy1Var.d), oy1Var.e, 0, new glu0((Object) oy1Var, this.b, obj, (lnm) null, (byte) 19), 2);
                return rih1.a;
            case 8:
                hjf1 hjf1Var2 = (hjf1) obj;
                obz0 obz0Var = (obz0) this.c;
                boolean z2 = hjf1Var2.g;
                ContextTrack contextTrack = hjf1Var2.h;
                List list = (List) this.b;
                int i5 = -1;
                if (list != null) {
                    Iterator it4 = list.iterator();
                    int i6 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            vg51 vg51Var = (caz0) it4.next();
                            if (!(vg51Var instanceof vg51) || ((i4 = vg51Var.a) != 1 && i4 != 2)) {
                                i6++;
                            }
                        } else {
                            i6 = -1;
                        }
                    }
                    if (i6 >= 0) {
                        Iterator it5 = list.iterator();
                        int i7 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                                ivf1 ivf1Var = (caz0) it5.next();
                                if (!(ivf1Var instanceof ivf1) || !ivf1Var.a.equals(hjf1Var2)) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        Iterator it6 = obz0Var.X.iterator();
                        int i8 = 0;
                        while (true) {
                            if (it6.hasNext()) {
                                ivf1 ivf1Var2 = (caz0) it6.next();
                                if (!(ivf1Var2 instanceof ivf1) || !ivf1Var2.a.equals(hjf1Var2)) {
                                    i8++;
                                }
                            } else {
                                i8 = -1;
                            }
                        }
                        Iterator it7 = obz0Var.X.iterator();
                        int i9 = 0;
                        while (true) {
                            if (it7.hasNext()) {
                                vg51 vg51Var2 = (caz0) it7.next();
                                if (!(vg51Var2 instanceof vg51) || ((i3 = vg51Var2.a) != 1 && i3 != 2)) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i7 < 0 || i8 < 0 || i9 < 0) {
                            if (l4o1.I(contextTrack) || z2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof ivf1) {
                                    arrayList.add(obj2);
                                }
                            }
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((ivf1) it2.next()).a);
                            }
                            it3 = arrayList2.iterator();
                            i2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    hjf1Var = (hjf1) it3.next();
                                    if (l4o1.I(hjf1Var.h) || hjf1Var.g) {
                                        i2++;
                                    }
                                } else {
                                    i2 = -1;
                                }
                            }
                            if (i2 >= 0 && (iIndexOf2 = obz0Var.A().indexOf(hjf1Var2)) >= 0 && ((z && iIndexOf2 < i2) || (!z && iIndexOf2 >= i2))) {
                                recyclerView = obz0Var.Z;
                                if (recyclerView != null) {
                                    recyclerView.post(new jyh0(obz0Var, list, (byte) 11));
                                }
                            } else {
                                iIndexOf = obz0Var.A().indexOf(hjf1Var2);
                                ArrayList arrayListA = obz0Var.A();
                                listIterator = arrayListA.listIterator(arrayListA.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        iNextIndex = -1;
                                    } else if (((hjf1) listIterator.previous()).g) {
                                        iNextIndex = listIterator.nextIndex();
                                    }
                                }
                                it = obz0Var.A().iterator();
                                i = 0;
                                while (it.hasNext()) {
                                    if (((hjf1) it.next()).g) {
                                        i++;
                                    } else {
                                        i5 = i;
                                        int iMax = Math.max(i5, 0);
                                        int iMin = Math.min(iNextIndex, iMax);
                                        int iMax2 = Math.max(iNextIndex, iMax);
                                        if (hjf1Var2.i == ezf1.d) {
                                            mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                                        } else if (!z2 && iIndexOf >= iMin) {
                                            mmr0Var = new mmr0(Integer.valueOf(iMin), Boolean.TRUE);
                                        } else if (z2 && iIndexOf <= iMax2) {
                                            mmr0Var = new mmr0(Integer.valueOf(iMax2), Boolean.FALSE);
                                        }
                                        int iIntValue2 = ((Number) mmr0Var.a).intValue();
                                        boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                                        obz0Var.O0 = true;
                                        obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue2, zBooleanValue));
                                    }
                                }
                                int iMax3 = Math.max(i5, 0);
                                int iMin2 = Math.min(iNextIndex, iMax3);
                                int iMax4 = Math.max(iNextIndex, iMax3);
                                if (hjf1Var2.i == ezf1.d) {
                                    mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                                } else if (!z2) {
                                    mmr0Var = z2 ? new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex)) : new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                                } else if (z2) {
                                }
                                int iIntValue3 = ((Number) mmr0Var.a).intValue();
                                boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                                obz0Var.O0 = true;
                                obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue3, zBooleanValue2));
                            }
                        } else if ((i7 < i6) != (i8 < i9)) {
                            recyclerView = obz0Var.Z;
                            if (recyclerView != null) {
                                recyclerView.post(new jyh0(obz0Var, list, (byte) 11));
                            }
                        } else {
                            iIndexOf = obz0Var.A().indexOf(hjf1Var2);
                            ArrayList arrayListA2 = obz0Var.A();
                            listIterator = arrayListA2.listIterator(arrayListA2.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    iNextIndex = -1;
                                } else if (((hjf1) listIterator.previous()).g) {
                                    iNextIndex = listIterator.nextIndex();
                                }
                            }
                            it = obz0Var.A().iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if (((hjf1) it.next()).g) {
                                    i5 = i;
                                    int iMax5 = Math.max(i5, 0);
                                    int iMin3 = Math.min(iNextIndex, iMax5);
                                    int iMax6 = Math.max(iNextIndex, iMax5);
                                    if (hjf1Var2.i == ezf1.d) {
                                        mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                                    } else if (!z2) {
                                        if (z2) {
                                        }
                                    } else if (z2) {
                                    }
                                    int iIntValue4 = ((Number) mmr0Var.a).intValue();
                                    boolean zBooleanValue3 = ((Boolean) mmr0Var.b).booleanValue();
                                    obz0Var.O0 = true;
                                    obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue4, zBooleanValue3));
                                } else {
                                    i++;
                                }
                            }
                            int iMax7 = Math.max(i5, 0);
                            int iMin4 = Math.min(iNextIndex, iMax7);
                            int iMax8 = Math.max(iNextIndex, iMax7);
                            if (hjf1Var2.i == ezf1.d) {
                                mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                            } else if (!z2) {
                                if (z2) {
                                }
                            } else if (z2) {
                            }
                            int iIntValue5 = ((Number) mmr0Var.a).intValue();
                            boolean zBooleanValue4 = ((Boolean) mmr0Var.b).booleanValue();
                            obz0Var.O0 = true;
                            obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue5, zBooleanValue4));
                        }
                    } else {
                        if (l4o1.I(contextTrack)) {
                            z = false;
                        } else {
                            z = false;
                        }
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            if (obj2 instanceof ivf1) {
                                arrayList.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((ivf1) it2.next()).a);
                        }
                        it3 = arrayList2.iterator();
                        i2 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                hjf1Var = (hjf1) it3.next();
                                if (l4o1.I(hjf1Var.h)) {
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 >= 0) {
                            recyclerView = obz0Var.Z;
                            if (recyclerView != null) {
                                recyclerView.post(new jyh0(obz0Var, list, (byte) 11));
                            }
                        }
                        iIndexOf = obz0Var.A().indexOf(hjf1Var2);
                        ArrayList arrayListA3 = obz0Var.A();
                        listIterator = arrayListA3.listIterator(arrayListA3.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                iNextIndex = -1;
                            } else if (((hjf1) listIterator.previous()).g) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        }
                        it = obz0Var.A().iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((hjf1) it.next()).g) {
                                i5 = i;
                                int iMax9 = Math.max(i5, 0);
                                int iMin5 = Math.min(iNextIndex, iMax9);
                                int iMax10 = Math.max(iNextIndex, iMax9);
                                if (hjf1Var2.i == ezf1.d) {
                                    mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                                } else if (!z2) {
                                    if (z2) {
                                    }
                                } else if (z2) {
                                }
                                int iIntValue6 = ((Number) mmr0Var.a).intValue();
                                boolean zBooleanValue5 = ((Boolean) mmr0Var.b).booleanValue();
                                obz0Var.O0 = true;
                                obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue6, zBooleanValue5));
                            } else {
                                i++;
                            }
                        }
                        int iMax11 = Math.max(i5, 0);
                        int iMin6 = Math.min(iNextIndex, iMax11);
                        int iMax12 = Math.max(iNextIndex, iMax11);
                        if (hjf1Var2.i == ezf1.d) {
                            mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                        } else if (!z2) {
                            if (z2) {
                            }
                        } else if (z2) {
                        }
                        int iIntValue7 = ((Number) mmr0Var.a).intValue();
                        boolean zBooleanValue6 = ((Boolean) mmr0Var.b).booleanValue();
                        obz0Var.O0 = true;
                        obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue7, zBooleanValue6));
                    }
                } else {
                    iIndexOf = obz0Var.A().indexOf(hjf1Var2);
                    ArrayList arrayListA4 = obz0Var.A();
                    listIterator = arrayListA4.listIterator(arrayListA4.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            iNextIndex = -1;
                        } else if (((hjf1) listIterator.previous()).g) {
                            iNextIndex = listIterator.nextIndex();
                        }
                    }
                    it = obz0Var.A().iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((hjf1) it.next()).g) {
                            i5 = i;
                            int iMax13 = Math.max(i5, 0);
                            int iMin7 = Math.min(iNextIndex, iMax13);
                            int iMax14 = Math.max(iNextIndex, iMax13);
                            if (hjf1Var2.i == ezf1.d) {
                                mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                            } else if (!z2) {
                                if (z2) {
                                }
                            } else if (z2) {
                            }
                            int iIntValue8 = ((Number) mmr0Var.a).intValue();
                            boolean zBooleanValue7 = ((Boolean) mmr0Var.b).booleanValue();
                            obz0Var.O0 = true;
                            obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue8, zBooleanValue7));
                        } else {
                            i++;
                        }
                    }
                    int iMax15 = Math.max(i5, 0);
                    int iMin8 = Math.min(iNextIndex, iMax15);
                    int iMax16 = Math.max(iNextIndex, iMax15);
                    if (hjf1Var2.i == ezf1.d) {
                        mmr0Var = new mmr0(Integer.valueOf(iIndexOf), Boolean.valueOf(iIndexOf <= iNextIndex));
                    } else if (!z2) {
                        if (z2) {
                        }
                    } else if (z2) {
                    }
                    int iIntValue9 = ((Number) mmr0Var.a).intValue();
                    boolean zBooleanValue8 = ((Boolean) mmr0Var.b).booleanValue();
                    obz0Var.O0 = true;
                    obz0Var.h.invoke(new n8z0(contextTrack, hjf1Var2.f, iIntValue9, zBooleanValue8));
                }
                return rih1.a;
            case 9:
                oy1 oy1Var2 = (oy1) this.b;
                fn31.T(cto1.q(oy1Var2.d), oy1Var2.e, 0, new glu0((Object) oy1Var2, this.c, obj, (lnm) null, (byte) 21), 2);
                return rih1.a;
            case 10:
                return new hp0(((yjz0) this.b).a.c(new ppv0((iu30) this.c, (byte) 22)), (byte) 13);
            case 11:
                qpj1 qpj1Var2 = (qpj1) this.c;
                bcl1.f((bcl1) qpj1Var2.c, qpj1Var2.p(), (String) this.b, (String) obj, (String) null, gbm1.e, 8);
                return rih1.a;
            case 12:
                return new hp0(((los) ((ngs0) this.b).d).c(new ppv0((iu30) this.c, (byte) 23)), (byte) 14);
            case 13:
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                String str3 = ((osz0) this.b).a;
                ven0 ven0Var = (ven0) this.c;
                ven0Var.setValue(zBooleanValue9 ? dm61.x0(str3, (Set) ven0Var.getValue()) : dm61.u0(str3, (Set) ven0Var.getValue()));
                return rih1.a;
            case 14:
                ((rrz0) this.b).b.D((y341) obj, (mrz0) this.c);
                return rih1.a;
            case 15:
                rrz0 rrz0Var = (rrz0) this.b;
                Map map = (Map) this.c;
                en31 en31Var = rrz0Var.a;
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    int iIntValue10 = ((Number) entry.getValue()).intValue();
                    mrz0 mrz0Var = (mrz0) qyo1.x(en31Var, true, false, new q4z0(str4, (byte) 5));
                    if (mrz0Var == null) {
                        qyo1.x(en31Var, false, true, new j3y0(rrz0Var, new mrz0(fno1.h(), iIntValue10, str4), b2));
                    } else if (mrz0Var.b != iIntValue10) {
                        qyo1.x(en31Var, false, true, new qrz0(fno1.h(), iIntValue10, str4));
                    }
                }
                return rih1.a;
            case 16:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                tka0 tka0Var = dtw.C;
                return mhc.b(frameLayout.getContext(), frameLayout, (htz0) ((et90) this.b).c, new vsz0(((tsz0) this.c).a), (ipb1) null, 112).w;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                u501 u501Var = (u501) obj;
                if (!(u501Var instanceof u501)) {
                    eg.o();
                    return null;
                }
                if (u501Var.c) {
                    ((fbz0) this.b).invoke(u501Var.b);
                } else {
                    ((h001) this.c).b.f(new dwn0(pcf.j(u501Var.a), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                fn31.T((c9n) this.b, (o8n) null, 0, new b201((sen0) this.c, (z101) obj, at01Var, b3), 3);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new mmr0(((List) this.b).get(((Number) obj).intValue()), ((a401) this.c).a.a);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                rih1 rih1Var = rih1.a;
                ixb ixbVar = (ixb) obj;
                ohd ohdVar = (ohd) this.c;
                if (ixbVar == ((ixb) this.b) && (ohdVar.s() instanceof ago0)) {
                    ohdVar.k(k301.h, rih1Var);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                u501 u501Var2 = (u501) obj;
                if (u501Var2 instanceof u501) {
                    ((tbr0) this.b).a(new y231(new t501(((q501) this.c).c.a, u501Var2.a, u501Var2.b, u501Var2.c)));
                    return rih1.a;
                }
                eg.o();
                return null;
            case 22:
                vgq0 vgq0Var = (vgq0) ((exh) this.b).b;
                q2p0 q2p0Var = (q2p0) this.c;
                return ((g701) vgq0Var.b).c(q2p0Var.i(), q2p0Var.e(), q2p0Var.f(), (iac0) obj, q2p0Var.c().d()).element();
            case 23:
                ((y2s) obj).b(BehaviorProcessor.e0((List) this.b), new fbz0((s59) this.c, (byte) 27));
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (((Boolean) obj).booleanValue()) {
                    ((iu30) this.b).invoke((fd01) this.c);
                }
                return rih1.a;
            case 25:
                g3h1 g3h1Var = new g3h1(((ll01) this.b).g);
                h3h1 h3h1Var = new h3h1(new cb1((r6h1) this.c, (byte) 26));
                wch wchVar = q6x.b;
                if (!g3h1Var.equals(wchVar) || !h3h1Var.equals(wchVar)) {
                    if (g3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    if (h3h1Var.equals(wchVar)) {
                        return g3h1Var;
                    }
                    wchVar = new wch(g3h1Var, h3h1Var);
                }
                return wchVar;
            case 26:
                ((gm01) this.b).b.D((y341) obj, (hm01) this.c);
                return rih1.a;
            case 27:
                ((qtr) obj).b(new woy((iu30) this.b, (ne) this.c, (lnm) null, (byte) 2));
                return rih1.a;
            case 28:
                zfx zfxVar = (zfx) this.b;
                di4 di4Var = (di4) this.c;
                boolean zS = di4Var.S();
                boolean zO0 = di4Var.o0();
                boolean zB = di4Var.b();
                boolean zO = di4Var.O();
                wfx wfxVar = zfxVar.b;
                c1s c1sVar = new c1s(wfxVar.b, wfxVar.a, zS, zO0, zB, zO);
                ((ConstraintLayout) c1sVar.f.b).setTag(2131429147, c1sVar);
                return c1sVar;
            default:
                lix lixVar = (mix) obj;
                dt01 dt01Var = (dt01) this.b;
                m9m m9mVar = dt01Var.a;
                c380 c380Var = dt01Var.c;
                if (lixVar.equals(gix.a)) {
                    at01Var = xs01.a;
                } else if (lixVar instanceof jix) {
                    m9m m9mVarD = bw8.d(((jix) lixVar).a);
                    if (m9mVarD != null) {
                        at01Var = new zs01(bw8.a(c380Var, m9mVarD), m9mVarD);
                    }
                } else if (lixVar instanceof iix) {
                    m9m m9mVarD2 = bw8.d(((iix) lixVar).a);
                    if (m9mVarD2 != null) {
                        at01Var = new ys01(bw8.a(c380Var, m9mVarD2), m9mVarD2);
                    }
                } else if (lixVar instanceof lix) {
                    br01 br01VarC = bw8.c(lixVar.a);
                    if (m9mVar != null && br01VarC != null) {
                        at01Var = new bt01(bw8.b(c380Var, m9mVar, br01VarC), m9mVar, br01VarC);
                    }
                } else if (lixVar instanceof kix) {
                    br01 br01VarC2 = bw8.c(((kix) lixVar).a);
                    if (m9mVar != null && br01VarC2 != null) {
                        at01Var = new at01(bw8.b(c380Var, m9mVar, br01VarC2), m9mVar, br01VarC2);
                    }
                } else if (!lixVar.equals(hix.a)) {
                    eg.o();
                    return null;
                }
                if (at01Var != null) {
                    ((iu30) this.c).invoke(at01Var);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3y0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3y0(byte b, Object obj, String str) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = str;
    }
}
