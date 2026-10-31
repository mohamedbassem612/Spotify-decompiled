package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import com.spotify.player.model.ErrorType;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o860 implements Function, vd70 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public o860(d0r d0rVar, z9k0 z9k0Var) {
        this.a = (byte) 28;
        this.b = d0rVar;
        this.c = z9k0Var;
        this.d = w3p1.o(new l4r(pwc0.o, 1, u0e0.N0, new j4r(u0e0.R0), u0e0.O0), u0e0.S0);
        jd11 jd11Var = rc11.a;
        this.e = w3p1.m(new l4r(new xv00(jd11Var.b(uia.class)), 2, u0e0.t, new j4r(u0e0.g), u0e0.X), new l4r(new xv00(jd11Var.b(hll.class)), 1, u0e0.P0, new j4r(u0e0.h), u0e0.Q0), new l4r(new xv00(jd11Var.b(ro7.class)), 2, u0e0.Y, new j4r(u0e0.i), u0e0.Z), j830.b1);
    }

    public static ArrayList i(List list) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((hpc1) obj).h;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        Collection<List> collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
        for (List list2 : collectionValues) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((hpc1) next).d != 1);
            hpc1 hpc1Var = (hpc1) next;
            if (hpc1Var == null) {
                hpc1Var = (hpc1) o7h.q0(list2);
            }
            arrayList.add(hpc1Var);
        }
        return arrayList;
    }

    public static vab0 y(hpc1 hpc1Var) {
        return new vab0(ago1.q(hpc1Var.f), hpc1Var.h, hpc1Var.g, hpc1Var.e == 2, hpc1Var.d == 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r11 == r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(java.lang.String r9, java.lang.String r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.h6e0
            if (r0 == 0) goto L14
            r0 = r11
            p.h6e0 r0 = (p.h6e0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            p.h6e0 r0 = new p.h6e0
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.c
            int r0 = r5.e
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r7 = p.d9n.a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            goto L6c
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r3
        L33:
            java.lang.String r10 = r5.b
            java.lang.String r9 = r5.a
            p.hm5.M(r11)
        L3a:
            r2 = r9
            goto L4c
        L3c:
            p.hm5.M(r11)
            r5.a = r9
            r5.b = r10
            r5.e = r2
            java.io.Serializable r11 = r8.d(r10, r5)
            if (r11 != r7) goto L3a
            goto L6b
        L4c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L7c
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            p.bfd r8 = (p.bfd) r8     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            java.util.List r4 = java.util.Collections.singletonList(r10)     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            r5.a = r3     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            r5.b = r3     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            r5.e = r1     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            r6 = 0
            r3 = 0
            r1 = r8
            java.lang.Object r11 = r1.f(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            if (r11 != r7) goto L6c
        L6b:
            return r7
        L6c:
            p.goe r11 = (p.goe) r11     // Catch: java.lang.Throwable -> L6f java.util.concurrent.CancellationException -> L72
            return r11
        L6f:
            r0 = move-exception
            r8 = r0
            goto L75
        L72:
            r0 = move-exception
            r8 = r0
            goto L7b
        L75:
            p.m231 r9 = new p.m231
            r9.<init>(r8)
            return r9
        L7b:
            throw r8
        L7c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "User isnt trusted"
            r8.<init>(r9)
            p.m231 r9 = new p.m231
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o860.A(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:4: B:79:0x01f0->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x015c A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x018e A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4 A[Catch: all -> 0x017b, LOOP:2: B:69:0x01ae->B:71:0x01b4, LOOP_END, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6 A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0222 A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x022c A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:53:0x014d, B:54:0x0156, B:56:0x015c, B:58:0x016c, B:62:0x017d, B:63:0x0188, B:65:0x018e, B:67:0x019b, B:68:0x019f, B:69:0x01ae, B:71:0x01b4, B:72:0x01c2, B:73:0x01d7, B:75:0x01dd, B:78:0x01ec, B:79:0x01f0, B:81:0x01f6, B:83:0x0207, B:84:0x020b, B:86:0x0222, B:88:0x022f, B:87:0x022c), top: B:101:0x014d }] */
    public Object B(Map map, onm onmVar) throws Throwable {
        d080 d080Var;
        Map map2;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        Map map3;
        LinkedHashMap linkedHashMap;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        String str;
        Iterator it2;
        nbm1 nbm1Var;
        Bitmap bitmap;
        yqg yqgVar = (yqg) this.d;
        rol1 rol1Var = (rol1) this.c;
        e080 e080Var = (e080) this.e;
        if (onmVar instanceof d080) {
            d080Var = (d080) onmVar;
            int i2 = d080Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d080Var.g = i2 - Integer.MIN_VALUE;
            } else {
                d080Var = new d080(this, onmVar);
            }
        } else {
            d080Var = new d080(this, onmVar);
        }
        Object objS = d080Var.e;
        int i3 = d080Var.g;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objS);
                vgn0 vgn0Var3 = e080Var.a;
                map2 = map;
                d080Var.a = map2;
                d080Var.b = vgn0Var3;
                d080Var.d = 0;
                d080Var.g = 1;
                if (vgn0Var3.a(d080Var) == d9nVar) {
                    return d9nVar;
                }
                vgn0Var = vgn0Var3;
                i = 0;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = d080Var.c;
                    vgn0Var2 = d080Var.b;
                    map3 = d080Var.a;
                    try {
                        hm5.M(objS);
                        try {
                            List<mmr0> list = (List) objS;
                            for (mmr0 mmr0Var : list) {
                                nbm1Var = (nbm1) mmr0Var.a;
                                bitmap = (Bitmap) mmr0Var.b;
                                if (bitmap != null) {
                                    rol1Var.a.put((String) sqg0.G(nbm1Var, linkedHashMap), bitmap);
                                }
                            }
                            arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (((Bitmap) ((mmr0) obj3).b) == null) {
                                    arrayList.add(obj3);
                                }
                            }
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((nbm1) ((mmr0) it.next()).a);
                            }
                            Set setKeySet = sqg0.U(rol1Var.a).keySet();
                            arrayList3 = new ArrayList();
                            for (Object obj4 : setKeySet) {
                                str = (String) obj4;
                                if (arrayList2.isEmpty()) {
                                    it2 = arrayList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (nhc1.Y(str, vy9.d((nbm1) it2.next()), false)) {
                                                arrayList3.add(obj4);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            r(dm61.y0(o7h.p1(linkedHashMap.values()), arrayList3));
                            if (arrayList2.isEmpty()) {
                                obj2 = null;
                                e080Var.b = null;
                            } else {
                                e080Var.b = map3;
                                e080Var.c = yqgVar.e();
                                obj2 = null;
                            }
                            rih1 rih1Var = rih1.a;
                            vgn0Var2.c(obj2);
                            return rih1Var;
                        } catch (Throwable th) {
                            th = th;
                            obj = null;
                            vgn0Var2.c(obj);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        vgn0Var2.c(obj);
                        throw th;
                    }
                }
                int i4 = d080Var.d;
                vgn0Var = d080Var.b;
                Map map4 = d080Var.a;
                hm5.M(objS);
                i = i4;
                map2 = map4;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map2.size()));
            for (Object obj5 : map2.entrySet()) {
                try {
                    Object key = ((Map.Entry) obj5).getKey();
                    Map.Entry entry = (Map.Entry) obj5;
                    nbm1 nbm1Var2 = (nbm1) entry.getKey();
                    String str2 = (String) entry.getValue();
                    linkedHashMap2.put(key, vy9.d(nbm1Var2) + str2.hashCode());
                } catch (Throwable th3) {
                    th = th3;
                    vgn0Var2 = vgn0Var;
                    obj = null;
                    vgn0Var2.c(obj);
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!rol1Var.a.containsKey((String) sqg0.G((nbm1) entry2.getKey(), linkedHashMap2))) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!linkedHashMap3.isEmpty()) {
                if (!u890.j(e080Var.b, map2) || yqgVar.e() - e080Var.c >= 600000) {
                    f530 f530Var = new f530(linkedHashMap3, this, (lnm) null, (byte) 21);
                    d080Var.a = map2;
                    d080Var.b = vgn0Var;
                    d080Var.c = linkedHashMap2;
                    d080Var.d = i;
                    d080Var.g = 2;
                    objS = smo1.s(f530Var, d080Var);
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    map3 = map2;
                    vgn0Var2 = vgn0Var;
                    linkedHashMap = linkedHashMap2;
                    List<mmr0> list2 = (List) objS;
                    while (r8.hasNext()) {
                        nbm1Var = (nbm1) mmr0Var.a;
                        bitmap = (Bitmap) mmr0Var.b;
                        if (bitmap != null) {
                            rol1Var.a.put((String) sqg0.G(nbm1Var, linkedHashMap), bitmap);
                        }
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        if (((Bitmap) ((mmr0) obj3).b) == null) {
                            arrayList.add(obj3);
                        }
                    }
                    arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((nbm1) ((mmr0) it.next()).a);
                    }
                    Set setKeySet2 = sqg0.U(rol1Var.a).keySet();
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        str = (String) obj4;
                        if (arrayList2.isEmpty()) {
                            it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (nhc1.Y(str, vy9.d((nbm1) it2.next()), false)) {
                                        arrayList3.add(obj4);
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    r(dm61.y0(o7h.p1(linkedHashMap.values()), arrayList3));
                    if (arrayList2.isEmpty()) {
                        e080Var.b = map3;
                        e080Var.c = yqgVar.e();
                    } else {
                        obj2 = null;
                        e080Var.b = null;
                    }
                    rih1 rih1Var2 = rih1.a;
                    vgn0Var2.c(obj2);
                    return rih1Var2;
                }
                obj2 = null;
                rih1 rih1Var3 = rih1.a;
                vgn0Var2.c(obj2);
                return rih1Var3;
            }
            r(o7h.p1(linkedHashMap2.values()));
            vgn0Var2 = vgn0Var;
            obj2 = null;
            rih1 rih1Var4 = rih1.a;
            vgn0Var2.c(obj2);
            return rih1Var4;
        } catch (Throwable th4) {
            th = th4;
            vgn0Var2 = vgn0Var;
            obj = null;
            vgn0Var2.c(obj);
            throw th;
        }
    }

    public void a(String str, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        Object b6r0Var;
        int i2;
        boolean z;
        lnm lnmVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2092953378);
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Flowable flowable = (Flowable) this.c;
            boolean zI = x340Var.i(this) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fz40(this, ven0Var, (byte) 23);
                x340Var.s0(objT2);
            }
            qxd0.i(flowable, (iu30) objT2, x340Var);
            dg30 dg30Var = (dg30) x340Var.k(mce0.a);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            q7r0 q7r0VarG = cir0Var.g();
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                hxp hxpVar = (hxp) this.d;
                iwr iwrVar = new iwr(ven0Var2, (byte) 29);
                ib3 ib3Var = (ib3) hxpVar.a.c;
                mwn0 mwn0Var = (mwn0) ((r8r0) ib3Var.a).h.get();
                c8o.l(mwn0Var);
                lzn0 lzn0Var = (lzn0) ((r8r0) ib3Var.a).i.get();
                c8o.l(lzn0Var);
                s8r0 s8r0Var = new s8r0(mwn0Var, iwrVar, lzn0Var);
                x340Var.s0(s8r0Var);
                objT4 = s8r0Var;
            }
            s8r0 s8r0Var2 = (s8r0) objT4;
            boolean zG = x340Var.g(s8r0Var2) | x340Var.g(cir0Var) | x340Var.g(q7r0VarG);
            Object objT5 = x340Var.T();
            if (zG || objT5 == m4cVar) {
                uo5 uo5Var = (uo5) this.e;
                i2 = 6;
                b6r0Var = new b6r0(dg30Var, cir0Var.d(), (o7r0) uo5Var.b, new mr30(dg30Var, false), (wbr0) null, (sbr0) null, new qa2(q7r0VarG, (byte) 18), s5o0.a, ((dg0) uo5Var.c).a(dg30Var), Observable.just(Boolean.TRUE), new pa2((byte) 6), s8r0Var2, new p350(0, (kly0) uo5Var.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), 240);
                x340Var.s0(b6r0Var);
            } else {
                b6r0Var = objT5;
                i2 = 6;
            }
            b6r0 b6r0Var2 = (b6r0) b6r0Var;
            if (ven0Var.getValue() != null) {
                x340Var.i0(1135009538);
                Object[] objArr = new Object[0];
                boolean zI2 = x340Var.i(j2h1.b);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == m4cVar) {
                    z = true;
                    objT6 = new qd81(1, (byte) 20);
                    x340Var.s0(objT6);
                } else {
                    z = true;
                }
                iu30 iu30Var = (iu30) objT6;
                if ((((i3 & 14) ^ i2) <= 4 || !x340Var.i(str)) && (i3 & i2) != 4) {
                    z = false;
                }
                Object objT7 = x340Var.T();
                if (z || objT7 == m4cVar) {
                    objT7 = new hqa1(str, (byte) 13);
                    x340Var.s0(objT7);
                }
                n8d1 n8d1VarN = xfo1.n(objArr, iu30Var, (iu30) objT7, x340Var, 0, 4);
                boolean zI3 = x340Var.i(ven0Var2) | x340Var.i(n8d1VarN);
                Object objT8 = x340Var.T();
                if (zI3 || objT8 == m4cVar) {
                    lnmVar = null;
                    objT8 = new y160(n8d1VarN, ven0Var2, lnmVar, (byte) 3);
                    x340Var.s0(objT8);
                } else {
                    lnmVar = null;
                }
                qxd0.t(n8d1VarN, x340Var, (vu30) objT8);
                Object objT9 = x340Var.T();
                if (objT9 == m4cVar) {
                    objT9 = v8r.q(lnmVar);
                    x340Var.s0(objT9);
                }
                ven0 ven0Var3 = (ven0) objT9;
                j2i j2iVarR = apo.r(322593635, new uk20(n8d1VarN, ven0Var, b6r0Var2, ven0Var3, this), x340Var);
                j2iVar2 = j2iVar;
                j2iVar2.J(ven0Var3, j2iVarR, x340Var, 432);
                x340Var.r(false);
            } else {
                j2iVar2 = j2iVar;
                x340Var.i0(1136237696);
                x340Var.r(false);
            }
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50(this, str, j2iVar2, i, (byte) 14);
        }
    }

    public Object apply(Object obj) {
        n381 n381Var = (n381) this.b;
        zs60 zs60Var = (zs60) this.c;
        return rca.o((rca) n381Var.b, new hb(zs60Var.b, (String) obj), (fq21) null, 2, (Object) null).compose(new b8p1(zs60Var.c, (k9r) this.d, 1, zs60Var.d, (byte) 7)).map(new ro30((Object) zs60Var, this.e, (byte) 15)).toObservable();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object b(n0k0 n0k0Var, onm onmVar) {
        r5e0 r5e0Var;
        nig1 nig1Var;
        n0k0 n0k0Var2;
        n0k0 n0k0Var3 = n0k0Var;
        d0r d0rVar = (d0r) this.b;
        if (onmVar instanceof r5e0) {
            r5e0Var = (r5e0) onmVar;
            int i = r5e0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5e0Var.e = i - Integer.MIN_VALUE;
            } else {
                r5e0Var = new r5e0(this, onmVar);
            }
        } else {
            r5e0Var = new r5e0(this, onmVar);
        }
        Object objJ = r5e0Var.c;
        int i2 = r5e0Var.e;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ay8 ay8VarF = d3p1.F(d0rVar, (o3r) this.d, new hy31(n0k0Var3.a, n0k0Var3.b, n0k0Var3.d, n0k0Var3.e));
                fca0 fca0Var = new fca0(2, (lnm) null, (byte) 10);
                r5e0Var.a = n0k0Var3;
                r5e0Var.e = 1;
                objJ = b5p1.j(ay8VarF, fca0Var, r5e0Var);
                if (objJ == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                n0k0Var3 = r5e0Var.a;
                hm5.M(objJ);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nig1 nig1Var2 = r5e0Var.b;
                n0k0Var2 = r5e0Var.a;
                hm5.M(objJ);
                nig1Var = nig1Var2;
            }
            q5e0 q5e0Var = (q5e0) u890.k((k1r) objJ, (d0r) null, (n4r) null);
            return new w3k0(n0k0Var2.b, n0k0Var2.c, n0k0Var2.e, n0k0Var2.g, nig1Var, q5e0Var.a, q5e0Var.b, q5e0Var.c);
            nig1 nig1Var3 = (nig1) u890.k((k1r) objJ, (d0r) null, (n4r) null);
            ay8 ay8VarF2 = d3p1.F(d0rVar, (o3r) this.e, nig1Var3.a.b.d);
            fca0 fca0Var2 = new fca0(2, (lnm) null, (byte) 9);
            r5e0Var.a = n0k0Var3;
            r5e0Var.b = nig1Var3;
            r5e0Var.e = 2;
            Object objJ2 = b5p1.j(ay8VarF2, fca0Var2, r5e0Var);
            if (objJ2 != d9nVar) {
                nig1Var = nig1Var3;
                objJ = objJ2;
                n0k0Var2 = n0k0Var3;
                q5e0 q5e0Var2 = (q5e0) u890.k((k1r) objJ, (d0r) null, (n4r) null);
                return new w3k0(n0k0Var2.b, n0k0Var2.c, n0k0Var2.e, n0k0Var2.g, nig1Var, q5e0Var2.a, q5e0Var2.b, q5e0Var2.c);
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z9k0.a((z9k0) this.c, r9k0.a);
            return v3k0.a;
        }
    }

    public pe70 c(pe70 pe70Var, ViewGroup viewGroup, y570 y570Var, y570 y570Var2) {
        pe70 pe70VarT = ((zsc) this.b).t(pe70Var, y570Var2, viewGroup, y570Var.s().indexOf(y570Var2));
        View view = pe70VarT.b;
        if (view.getParent() != viewGroup) {
            xap1.y(view);
        }
        return pe70VarT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(String str, onm onmVar) {
        d6e0 d6e0Var;
        Boolean m231Var;
        if (onmVar instanceof d6e0) {
            d6e0Var = (d6e0) onmVar;
            int i = d6e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d6e0Var.c = i - Integer.MIN_VALUE;
            } else {
                d6e0Var = new d6e0(this, onmVar);
            }
        } else {
            d6e0Var = new d6e0(this, onmVar);
        }
        Object objB = d6e0Var.a;
        int i2 = d6e0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                bfd bfdVar = (bfd) this.b;
                d6e0Var.c = 1;
                bfdVar.getClass();
                objB = bfd.b(bfdVar, str, d6e0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            mfd mfdVar = (mfd) objB;
            m231Var = Boolean.valueOf(mfdVar != null ? mfdVar.b : false);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(onm onmVar) {
        b080 b080Var;
        xgn0 xgn0Var;
        e080 e080Var = (e080) this.e;
        if (onmVar instanceof b080) {
            b080Var = (b080) onmVar;
            int i = b080Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b080Var.d = i - Integer.MIN_VALUE;
            } else {
                b080Var = new b080(this, onmVar);
            }
        } else {
            b080Var = new b080(this, onmVar);
        }
        Object obj = b080Var.b;
        int i2 = b080Var.d;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            Set setKeySet = sqg0.U(((rol1) this.c).a).keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (nhc1.Y((String) it.next(), "wrapped_background_", false)) {
                        xgn0 xgn0Var2 = e080Var.a;
                        b080Var.a = xgn0Var2;
                        b080Var.d = 1;
                        Object objA = xgn0Var2.a(b080Var);
                        d9n d9nVar = d9n.a;
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                        xgn0Var = xgn0Var2;
                    }
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xgn0Var = b080Var.a;
        hm5.M(obj);
        try {
            r(w7x.a);
            e080Var.b = null;
            return rih1Var;
        } finally {
            xgn0Var.c((Object) null);
        }
    }

    public void f(me70 me70Var) {
        String str;
        Context context = (Context) this.b;
        md70 md70Var = ((od70) me70Var).a;
        for (String str2 : md70Var.b) {
            r630 r630Var = (r630) this.d;
            jik1 jik1Var = (jik1) this.c;
            if ("toggle-follow".equals(str2) && (str = md70Var.a) != null) {
                Set set = s4b1.f;
                n57.k(uic.x(str).c == blc0.ee, "Invalid link type, %s, owner: %s", new Object[]{str, jik1Var.getViewUri()});
                i430 i430VarC = r630Var.c(str);
                if (i430VarC != null) {
                    r630Var.k(str, !i430VarC.b);
                    return;
                }
                n57.e("Follow Data missing for URI: " + str + ", owner: " + String.valueOf(jik1Var.getViewUri()));
                return;
            }
        }
        String str3 = md70Var.a;
        if (str3 != null) {
            context.startActivity(new fwn0(context.getApplicationContext(), (String) this.e).a(new dwn0(str3, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null)));
        }
    }

    public py8 g(qs31 qs31Var) {
        vu30 vu30Var = (vu30) this.c;
        Intent intent = qs31Var.a;
        return new py8(qs31Var, (String) ((iu30) this.e).invoke(intent), (String) this.d, ((Single) vu30Var.invoke(intent, qs31Var.b)).flatMap(new ouz((Scheduler) this.b, (byte) 14)));
    }

    public jhm h(p860 p860Var) {
        return new jhm("hide_from_home", (hux) bpx.c, (fhm) null, (Integer) 2131956588, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(new zi50(p860Var, (byte) 11), v160.Z0), new fz40(this, p860Var, (byte) 18)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(nbm1 nbm1Var, String str, onm onmVar) {
        c080 c080Var;
        if (onmVar instanceof c080) {
            c080Var = (c080) onmVar;
            int i = c080Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c080Var.d = i - Integer.MIN_VALUE;
            } else {
                c080Var = new c080(this, onmVar);
            }
        } else {
            c080Var = new c080(this, onmVar);
        }
        Object objA = c080Var.b;
        int i2 = c080Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                f5t0 f5t0VarE = vy9.e(nbm1Var);
                jw70 jw70Var = (jw70) ((kly0) this.b).get();
                short s = f5t0VarE.a;
                short s2 = f5t0VarE.b;
                c080Var.a = str;
                c080Var.d = 1;
                objA = jw70Var.a(str, s, s2, c080Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = c080Var.a;
                hm5.M(objA);
            }
            return (Bitmap) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "[WrappedBackground] Failed to fetch %s", new Object[]{str});
            return null;
        }
    }

    public qfv k(d0r d0rVar) {
        byte b;
        xvu xvuVar;
        esw eswVar = (esw) this.b;
        iu30 iu30Var = (iu30) this.c;
        qlp qlpVar = eswVar.d;
        switch (qlpVar.a) {
            case 0:
                b = 27;
                urk0 urk0Var = new urk0((byte) 4);
                kop kopVar = (kop) qlpVar.b.c;
                mr20 mr20VarU = kopVar.a.u();
                c8o.l(mr20VarU);
                f8b f8bVarE0 = kopVar.a.E0();
                c8o.l(f8bVarE0);
                yqg yqgVar = (yqg) kopVar.d.get();
                di4 di4VarD = kopVar.d();
                kopVar.getClass();
                ggv ggvVarF0 = kopVar.a.F0();
                c8o.l(ggvVarF0);
                cn01 cn01Var = new cn01(ggvVarF0, (yqg) kopVar.d.get(), kopVar.n());
                ne neVarR = kopVar.r();
                gw70 gw70VarB = kopVar.a.b();
                c8o.l(gw70VarB);
                xvuVar = new xvu(urk0Var, mr20VarU, f8bVarE0, yqgVar, di4VarD, cn01Var, neVarR, gw70VarB, new dgb((byte) 27), kopVar.k(), new hz5((byte) 8), (tb51) kopVar.t.get(), iu30Var, d0rVar);
                break;
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                apq apqVar = (apq) qlpVar.b.c;
                mr20 mr20VarU2 = apqVar.a.u();
                c8o.l(mr20VarU2);
                f8b f8bVarE1 = apqVar.a.E0();
                c8o.l(f8bVarE1);
                yqg yqgVar2 = (yqg) apqVar.d.get();
                di4 di4VarD2 = apqVar.d();
                apqVar.getClass();
                ggv ggvVarF1 = apqVar.a.F0();
                c8o.l(ggvVarF1);
                cn01 cn01Var2 = new cn01(ggvVarF1, (yqg) apqVar.d.get(), apqVar.m());
                ne neVarQ = apqVar.q();
                gw70 gw70VarB2 = apqVar.a.b();
                c8o.l(gw70VarB2);
                b = 27;
                xvuVar = new xvu(urk0Var2, mr20VarU2, f8bVarE1, yqgVar2, di4VarD2, cn01Var2, neVarQ, gw70VarB2, new dgb((byte) 27), apqVar.j(), new hz5((byte) 8), (tb51) apqVar.r.get(), iu30Var, d0rVar);
                break;
        }
        xvu xvuVar2 = xvuVar;
        xm20 xm20Var = xm20.a;
        ym20 ym20Var = ym20.b;
        return fdg1.m0(new xzq(new w83(new ujo(xvuVar2), ((y751) this.e).b, new yy80(this, (byte) 16)), new hu90(this, b)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
    }

    public ConcurrentHashMap l() {
        return (ConcurrentHashMap) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    public dm20 m(jl20 jl20Var) {
        kl20 kl20Var;
        hn21 hn21Var;
        int i;
        di4 di4Var = (di4) this.d;
        kl20 kl20Var2 = kl20.t;
        String uri = jl20Var.getUri();
        if (sgy.d(uri)) {
            kl20Var = kl20.Y;
        } else if (sgy.i(uri)) {
            kl20Var = kl20.t;
        } else if (sgy.a(uri)) {
            kl20Var = kl20.X;
        } else if (nik1.N.a(uri)) {
            kl20Var = kl20.Z;
        } else if (nik1.E.a(uri)) {
            kl20Var = kl20.S0;
        } else if (nik1.P4.a(uri)) {
            kl20Var = kl20.V0;
        } else if (sgy.b(uri)) {
            kl20Var = kl20.P0;
        } else if (sgy.f(uri)) {
            kl20Var = kl20.Q0;
        } else {
            Set set = s4b1.f;
            if (uic.g(uri, blc0.de)) {
                kl20Var = kl20.O0;
            } else {
                blc0[] blc0VarArr = sgy.b;
                if (uic.h(uri, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length))) {
                    kl20Var = kl20.N0;
                } else if (uic.h(uri, new blc0[]{blc0.J2, blc0.K2})) {
                    kl20Var = kl20.R0;
                } else if (uic.g(uri, blc0.ij)) {
                    kl20Var = kl20.T0;
                } else {
                    if (!sgy.c(uri)) {
                        hhg1.n("Unsupported first-step entity URI: ".concat(uri));
                        return null;
                    }
                    kl20Var = kl20.U0;
                }
            }
        }
        kl20 kl20Var3 = kl20Var;
        String uri2 = jl20Var.getUri();
        String strB = jl20Var.b();
        int iOrdinal = kl20Var3.ordinal();
        int i2 = 3;
        if (iOrdinal == 3) {
            hn21Var = new hn21(di4Var.S() ? 2 : 0, di4Var.b(), di4Var.O());
        } else if (iOrdinal != 7) {
            hn21Var = iOrdinal != 9 ? new hn21(0, false, false) : new hn21(1, false, false);
        } else {
            hn21Var = new hn21(di4Var.o0() ? 2 : 0, false, false);
        }
        if (jon1.i(kl20Var3, di4Var).a) {
            i = 3;
        } else if (kl20Var3 != kl20.t) {
            i = 1;
        } else {
            vdj1 vdj1VarM = r1p1.m(kl20Var3, di4Var);
            if (vdj1VarM == null || !vdj1VarM.a) {
                i = 2;
            } else {
                i = 3;
            }
        }
        sgg sggVar = new sgg(i);
        vdj1 vdj1VarM2 = r1p1.m(kl20Var3, di4Var);
        String uri3 = jl20Var.getUri();
        kl20 kl20Var4 = kl20.R0;
        li40 li40Var = new li40(kl20Var3 == kl20Var4 && ihc1.h0(uri3, ":genre:", false), kl20Var3 == kl20Var4);
        int iOrdinal2 = kl20Var3.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 2;
        } else if (iOrdinal2 != 2 && iOrdinal2 != 11) {
            i2 = 1;
        }
        return new dm20(uri2, strB, kl20Var3, hn21Var, sggVar, vdj1VarM2, li40Var, i2, jon1.i(kl20Var3, di4Var), jl20Var.a(), new q8b(z6x.a, false), jl20Var.getPosition(), jl20Var.getRequestId(), jl20Var.c());
    }

    public Map n() {
        b7a0 b7a0Var = (b7a0) this.e;
        b7a0Var.a.a.remove(b7a0Var);
        b7a0Var.d = false;
        int i = b7a0Var.b;
        double d = b7a0Var.c;
        double d2 = i;
        return sqg0.J(new mmr0[]{new mmr0("jank_frames", Double.valueOf(d)), new mmr0("frames_rendered", Double.valueOf(d2)), new mmr0("jank_frames_ratio", Double.valueOf(d / d2))});
    }

    public boolean o() {
        b7a0 b7a0Var = (b7a0) this.e;
        b7a0Var.a.a.remove(b7a0Var);
        b7a0Var.d = false;
        return b7a0Var.b > 10;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010a A[Catch: all -> 0x0040, CancellationException -> 0x0146, TryCatch #2 {CancellationException -> 0x0146, all -> 0x0040, blocks: (B:15:0x0037, B:59:0x0130, B:61:0x0136, B:22:0x0055, B:52:0x0104, B:54:0x010a, B:55:0x0114, B:26:0x006d, B:44:0x00d8, B:46:0x00dc, B:48:0x00e6, B:29:0x007a, B:36:0x00a8, B:40:0x00b4, B:63:0x0143, B:32:0x0083), top: B:73:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0114 A[Catch: all -> 0x0040, CancellationException -> 0x0146, TryCatch #2 {CancellationException -> 0x0146, all -> 0x0040, blocks: (B:15:0x0037, B:59:0x0130, B:61:0x0136, B:22:0x0055, B:52:0x0104, B:54:0x010a, B:55:0x0114, B:26:0x006d, B:44:0x00d8, B:46:0x00dc, B:48:0x00e6, B:29:0x007a, B:36:0x00a8, B:40:0x00b4, B:63:0x0143, B:32:0x0083), top: B:73:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(kg21 kg21Var, onm onmVar) {
        e6e0 e6e0Var;
        m231 m231Var;
        int i;
        o860 o860Var;
        boolean z;
        kg21 kg21Var2;
        boolean z2;
        boolean z3;
        o860 o860Var2;
        int i2;
        String str;
        Object objT;
        boolean z4;
        boolean z5;
        String str2;
        boolean z6;
        Object objA;
        kg21 kg21Var3;
        if (onmVar instanceof e6e0) {
            e6e0Var = (e6e0) onmVar;
            int i3 = e6e0Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6e0Var.t = i3 - Integer.MIN_VALUE;
            } else {
                e6e0Var = new e6e0(this, onmVar);
            }
        } else {
            e6e0Var = new e6e0(this, onmVar);
        }
        Object obj = e6e0Var.h;
        int i4 = e6e0Var.t;
        m231 m231Var2 = ch21.a;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj);
                boolean z7 = ((ahu0) this.e).f;
                mr20 mr20VarB = ((kbd) this.d).b();
                e6e0Var.a = kg21Var;
                e6e0Var.b = this;
                i = 0;
                e6e0Var.e = 0;
                e6e0Var.f = z7;
                e6e0Var.t = 1;
                Object objI = b5p1.i(mr20VarB, e6e0Var);
                if (objI != d9nVar) {
                    o860Var = this;
                    z = z7;
                    obj = objI;
                }
                return d9nVar;
            }
            if (i4 == 1) {
                z = e6e0Var.f;
                int i5 = e6e0Var.e;
                o860Var = e6e0Var.b;
                kg21 kg21Var4 = e6e0Var.a;
                hm5.M(obj);
                i = i5;
                kg21Var = kg21Var4;
            } else {
                if (i4 == 2) {
                    z3 = e6e0Var.g;
                    z2 = e6e0Var.f;
                    i2 = e6e0Var.e;
                    o860Var2 = e6e0Var.b;
                    kg21Var2 = e6e0Var.a;
                    hm5.M(obj);
                    str = (String) obj;
                    if (str == null && !u890.j(kg21Var2.a.b, str)) {
                        String str3 = kg21Var2.a.b;
                        e6e0Var.a = kg21Var2;
                        e6e0Var.b = o860Var2;
                        e6e0Var.c = str;
                        e6e0Var.e = i2;
                        e6e0Var.f = z2;
                        e6e0Var.g = z3;
                        e6e0Var.t = 3;
                        objT = o860Var2.t(str, str3, e6e0Var);
                        if (objT != d9nVar) {
                            z4 = z2;
                            z5 = z3;
                            str2 = str;
                            z6 = z4;
                            if (e331.a(objT) != null) {
                                m231Var = new bh21(kg21Var2.a, (goe) objT, str2);
                            } else {
                                String str4 = kg21Var2.a.b;
                                e6e0Var.a = kg21Var2;
                                e6e0Var.b = null;
                                e6e0Var.c = null;
                                e6e0Var.d = str2;
                                e6e0Var.e = i2;
                                e6e0Var.f = z6;
                                e6e0Var.g = z5;
                                e6e0Var.t = 4;
                                objA = o860Var2.A(str2, str4, e6e0Var);
                                if (objA != d9nVar) {
                                    kg21Var3 = kg21Var2;
                                }
                            }
                        }
                        return d9nVar;
                    }
                    m231Var = m231Var2;
                    if (e331.a(m231Var) == null) {
                        return m231Var;
                    }
                    return m231Var2;
                }
                if (i4 == 3) {
                    boolean z8 = e6e0Var.g;
                    boolean z9 = e6e0Var.f;
                    i2 = e6e0Var.e;
                    String str5 = e6e0Var.c;
                    o860Var2 = e6e0Var.b;
                    kg21Var2 = e6e0Var.a;
                    hm5.M(obj);
                    z4 = z9;
                    z5 = z8;
                    str2 = str5;
                    objT = ((e331) obj).a;
                    z6 = z4;
                    if (e331.a(objT) != null) {
                        String str6 = kg21Var2.a.b;
                        e6e0Var.a = kg21Var2;
                        e6e0Var.b = null;
                        e6e0Var.c = null;
                        e6e0Var.d = str2;
                        e6e0Var.e = i2;
                        e6e0Var.f = z6;
                        e6e0Var.g = z5;
                        e6e0Var.t = 4;
                        objA = o860Var2.A(str2, str6, e6e0Var);
                        if (objA != d9nVar) {
                            kg21Var3 = kg21Var2;
                        }
                        return d9nVar;
                    }
                    m231Var = new bh21(kg21Var2.a, (goe) objT, str2);
                    if (e331.a(m231Var) == null) {
                        return m231Var;
                    }
                    return m231Var2;
                }
                if (i4 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = e6e0Var.d;
                kg21Var3 = e6e0Var.a;
                hm5.M(obj);
                objA = ((e331) obj).a;
            }
            if (e331.a(objA) == null) {
                m231Var = new bh21(kg21Var3.a, (goe) objA, str2);
            } else {
                m231Var = m231Var2;
            }
            if (e331.a(m231Var) == null) {
                return m231Var;
            }
            return m231Var2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue && z) {
                mnc0 mnc0Var = new mnc0((mr20) o860Var.c, (byte) 24);
                e6e0Var.a = kg21Var;
                e6e0Var.b = o860Var;
                e6e0Var.e = i;
                e6e0Var.f = z;
                e6e0Var.g = zBooleanValue;
                e6e0Var.t = 2;
                Object objK = b5p1.k(mnc0Var, e6e0Var);
                if (objK != d9nVar) {
                    kg21Var2 = kg21Var;
                    z2 = z;
                    z3 = zBooleanValue;
                    obj = objK;
                    o860Var2 = o860Var;
                    i2 = i;
                    str = (String) obj;
                    if (str == null) {
                    }
                    m231Var = m231Var2;
                }
                return d9nVar;
            }
            m231Var = zg21.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) == null) {
            return m231Var;
        }
        return m231Var2;
    }

    public void q(tv80 tv80Var) {
        mwn0 mwn0Var = (mwn0) this.d;
        yrn0 yrn0Var = tv80Var != null ? new yrn0(tv80Var.a) : new yrn0((ou80) null);
        mwn0Var.e(yrn0Var);
        mwn0Var.f(yrn0Var);
    }

    public void r(Set set) {
        rol1 rol1Var = (rol1) this.c;
        Set<String> setKeySet = sqg0.U(rol1Var.a).keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return;
        }
        for (String str : setKeySet) {
            if (nhc1.Y(str, "wrapped_background_", false) && !set.contains(str)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    String str2 = (String) obj;
                    if (!nhc1.Y(str2, "wrapped_background_", false) || set.contains(str2)) {
                        arrayList.add(obj);
                    }
                }
                rol1Var.a.keySet().retainAll(o7h.p1(arrayList));
                return;
            }
        }
    }

    public void s(mqj0 mqj0Var, long j) {
        synchronized (this.c) {
            try {
                h890 h890Var = (h890) ((LinkedHashMap) this.e).get(Long.valueOf(j));
                if (h890Var != null) {
                    nqj0 nqj0Var = mqj0Var.a.b;
                    uqj0 uqj0Var = nqj0Var.c;
                    if (uqj0Var instanceof sqj0) {
                        h890Var.b.remove(nqj0Var);
                        if (h890Var.b.isEmpty() && h890Var.c.isEmpty()) {
                            h890Var.a.d((CancellationException) null);
                            ((LinkedHashMap) this.e).remove(Long.valueOf(j));
                        }
                    } else if (!(uqj0Var instanceof tqj0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(String str, String str2, onm onmVar) {
        g6e0 g6e0Var;
        if (onmVar instanceof g6e0) {
            g6e0Var = (g6e0) onmVar;
            int i = g6e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g6e0Var.c = i - Integer.MIN_VALUE;
            } else {
                g6e0Var = new g6e0(this, onmVar);
            }
        } else {
            g6e0Var = new g6e0(this, onmVar);
        }
        Object objQ = g6e0Var.a;
        int i2 = g6e0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                bfd bfdVar = (bfd) this.b;
                List listM = p7h.M(new String[]{str, str2});
                g6e0Var.c = 1;
                objQ = bfdVar.q(listM, false, g6e0Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            return (goe) objQ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "\n            Aspect: scroll_performance\n            Experience: page_session\n            Dimensions: " + ((ConcurrentHashMap) this.c) + "\n            Metrics: " + n() + "\n            Meta: " + ((ConcurrentHashMap) this.d) + "\n            ";
            default:
                return super.toString();
        }
    }

    public void u(mqj0 mqj0Var, long j) {
        synchronized (this.c) {
            try {
                if (!(mqj0Var.a.b.c instanceof tqj0)) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
                    Long lValueOf = Long.valueOf(j);
                    Object h890Var = linkedHashMap.get(lValueOf);
                    if (h890Var == null) {
                        h890Var = new h890(fn31.T((llm) this.d, (o8n) null, 0, new i890(j, this, (lnm) null), 3), new LinkedHashSet(), new LinkedHashMap());
                        linkedHashMap.put(lValueOf, h890Var);
                    }
                    h890 h890Var2 = (h890) h890Var;
                    nqj0 nqj0Var = mqj0Var.a.b;
                    uqj0 uqj0Var = nqj0Var.c;
                    if (uqj0Var instanceof sqj0) {
                        h890Var2.b.add(nqj0Var);
                    } else if (!(uqj0Var instanceof tqj0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f A[Catch: Exception -> 0x0028, CancellationException -> 0x0073, PHI: r4
      0x005f: PHI (r4v1 p.hpc1) = (r4v0 p.hpc1), (r4v3 p.hpc1) binds: [B:18:0x0033, B:27:0x005c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0073, Exception -> 0x0028, blocks: (B:11:0x0024, B:20:0x0036, B:21:0x0044, B:23:0x004a, B:26:0x005a, B:29:0x005f), top: B:39:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(String str, onm onmVar) {
        cbb0 cbb0Var;
        Object objI;
        d9n d9nVar;
        if (onmVar instanceof cbb0) {
            cbb0Var = (cbb0) onmVar;
            int i = cbb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbb0Var.c = i - Integer.MIN_VALUE;
            } else {
                cbb0Var = new cbb0(this, onmVar);
            }
        } else {
            cbb0Var = new cbb0(this, onmVar);
        }
        Object obj = cbb0Var.a;
        int i2 = cbb0Var.c;
        rih1 rih1Var = rih1.a;
        hpc1 hpc1Var = null;
        Object obj2 = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (str == null) {
                Completable completableA = ((nqc1) this.c).a(hpc1Var);
                cbb0Var.c = 1;
                objI = fc11.i(completableA, cbb0Var);
                d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                for (Object obj3 : i(((pqc1) this.b).f)) {
                    if (u890.j(((hpc1) obj3).h, str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                hpc1Var = (hpc1) obj2;
                if (hpc1Var != null) {
                    Completable completableA2 = ((nqc1) this.c).a(hpc1Var);
                    cbb0Var.c = 1;
                    objI = fc11.i(completableA2, cbb0Var);
                    d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "Failed to save subtitle selection", new Object[0]);
            return rih1Var;
        }
    }

    public void w() {
        b7a0 b7a0Var = (b7a0) this.e;
        if (b7a0Var.d) {
            return;
        }
        b7a0Var.a.a.add(b7a0Var);
        b7a0Var.d = true;
    }

    public void x() {
        b7a0 b7a0Var = (b7a0) this.e;
        b7a0Var.a.a.remove(b7a0Var);
        b7a0Var.d = false;
    }

    public ufg1 z(ha70 ha70Var, int i) {
        int iOrdinal = ha70Var.ordinal();
        if (iOrdinal == 2) {
            return i == 3 ? (nw70) this.d : (ow70) this.b;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return i == 3 ? (nw70) this.e : (ow70) this.c;
    }

    public o860(b7a0 b7a0Var) {
        this.a = (byte) 1;
        this.b = UUID.randomUUID();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = b7a0Var;
    }

    public o860(p680 p680Var, z3c z3cVar, exn0 exn0Var) {
        this.a = (byte) 11;
        this.b = p680Var;
        this.c = z3cVar;
        this.d = exn0Var;
        this.e = new idd1(new nd70(this, (byte) 21));
    }

    public o860(Context context) {
        this.a = (byte) 7;
        this.b = new ow70(context, true);
        this.c = new ow70(context, false);
        this.d = new nw70(context, true);
        this.e = new nw70(context, false);
    }

    public o860(p5a0 p5a0Var, d6c d6cVar, vun vunVar, sjb sjbVar, k9r k9rVar) {
        this.a = (byte) 15;
        this.b = p5a0Var;
        this.c = d6cVar;
        this.d = vunVar;
        this.e = k9rVar;
    }

    public o860(ConstraintLayout constraintLayout) {
        this.a = (byte) 24;
        this.b = constraintLayout;
        this.c = new idd1(new x4c0(this, (byte) 2));
        this.d = new idd1(new x4c0(this, (byte) 1));
        this.e = new idd1(new x4c0(this, (byte) 0));
    }

    public o860(Observable observable, FlowableMap flowableMap, c9c c9cVar, Scheduler scheduler) {
        this.a = (byte) 26;
        this.b = observable;
        this.c = flowableMap;
        this.d = scheduler;
        this.e = p7h.M(new ErrorType[]{ErrorType.PLAYBACK_ERROR, ErrorType.TRACK_UNAVAILABLE_OFFLINE, ErrorType.VIDEO_GEORESTRICTED, ErrorType.VIDEO_MANIFEST_DELETED, ErrorType.VIDEO_PLAYBACK_ERROR, ErrorType.VIDEO_UNAVAILABLE, ErrorType.VIDEO_CATALOGUE_RESTRICTED});
    }

    public o860(wh41 wh41Var, vr51 vr51Var, Context context, ol71 ol71Var) {
        this.a = (byte) 27;
        this.c = wh41Var;
        this.d = vr51Var;
        this.b = context;
        this.e = ol71Var;
    }

    public o860(o8n o8nVar, yih0 yih0Var) {
        this.a = (byte) 13;
        this.b = yih0Var;
        this.c = new Object();
        this.d = smo1.e(flo1.l(guo1.B(), o8nVar));
        this.e = new LinkedHashMap();
    }

    public /* synthetic */ o860(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public o860(l670 l670Var) {
        this.a = (byte) 5;
        uo5 uo5Var = new uo5(l670Var);
        this.b = new zsc(l670Var, uo5Var, new yfu(uo5Var));
    }

    public o860(pqc1 pqc1Var, nqc1 nqc1Var) {
        this.a = (byte) 20;
        this.b = pqc1Var;
        this.c = nqc1Var;
        BehaviorProcessor behaviorProcessor = pqc1Var.h;
        vbm[] vbmVarArr = q601.a;
        ht20 ht20Var = new ht20(hu20.d(new mr20[]{new dy20(new kge(behaviorProcessor), (byte) 3), new dy20(new kge(pqc1Var.i), (byte) 4)}), new pk50(2, (lnm) null, (byte) 4));
        this.d = rqt0.u(new kbb0(ht20Var, this, (byte) 0));
        this.e = rqt0.u(new kbb0(ht20Var, this, (byte) 1));
    }

    public o860(wnh1 wnh1Var, w1r0 w1r0Var, mwn0 mwn0Var) {
        this.a = (byte) 21;
        this.b = wnh1Var;
        this.c = w1r0Var;
        this.d = mwn0Var;
        this.e = new tdl0((byte) 8);
    }

    public o860(Context context, jik1 jik1Var, r630 r630Var, String str) {
        this.a = (byte) 4;
        context.getClass();
        this.b = context;
        jik1Var.getClass();
        this.c = jik1Var;
        this.d = r630Var;
        this.e = str;
    }

    public o860(CoordinatorLayout coordinatorLayout, EditModeBarContainerView editModeBarContainerView, View view, QueueControlsLayout queueControlsLayout, FrameLayout frameLayout, SessionModifierContainerView sessionModifierContainerView) {
        this.a = (byte) 22;
        this.b = editModeBarContainerView;
        this.c = view;
        this.d = queueControlsLayout;
        this.e = sessionModifierContainerView;
    }

    public o860(RelativeLayout relativeLayout, EncoreButton encoreButton, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = (byte) 25;
        this.b = encoreButton;
        this.c = linearLayout;
        this.d = textView;
        this.e = textView2;
    }

    public o860(s061 s061Var, r2r r2rVar, nlj1 nlj1Var, dtt0 dtt0Var, saz0 saz0Var, gpm gpmVar, co9 co9Var, ztw0 ztw0Var, mwc0 mwc0Var, imc0 imc0Var, co9 co9Var2, a4d0 a4d0Var, q0d0 q0d0Var, co9 co9Var3, iuc0 iuc0Var, l27 l27Var, z7y0 z7y0Var, a9q a9qVar, lrh lrhVar, six0 six0Var, yaq yaqVar, yko ykoVar, cyu cyuVar, h3v h3vVar, nyl1 nyl1Var, fum fumVar, rcp rcpVar, wop wopVar, scp scpVar, w4b0 w4b0Var, a5b0 a5b0Var, a7n a7nVar, xop xopVar, yop yopVar, zop zopVar, r3d0 r3d0Var, String str, haa0 haa0Var, roc0 roc0Var, k0d0 k0d0Var, n6r0 n6r0Var, String str2, bpb1 bpb1Var) {
        this.a = (byte) 18;
        this.b = rcpVar.a(s061Var);
        this.c = scpVar.a(s061Var);
        j3r j3rVar = rzq.y;
        rzq rzqVarF = l2p1.f(r2rVar.a("android-list-entity-music-kodiakdataloader", new d5b0(h3vVar, w4b0Var, a5b0Var, a7nVar, nlj1Var, dtt0Var, saz0Var, ztw0Var, gpmVar, q0d0Var, this, co9Var3, lrhVar, six0Var, n6r0Var, fumVar, nyl1Var, cyuVar, a4d0Var, r3d0Var, iuc0Var, haa0Var, a9qVar, yaqVar, k0d0Var, ykoVar, str, co9Var, l27Var, mwc0Var, imc0Var, wopVar, roc0Var, z7y0Var, bpb1Var, co9Var2, xopVar, yopVar, zopVar, str2)));
        this.d = rzqVarF;
        this.e = new rhg0(rzqVarF, (ukj0) null);
    }

    public o860(uw0 uw0Var, b1h1 b1h1Var, znb0 znb0Var) {
        this.a = (byte) 23;
        this.b = uw0Var;
        this.c = b1h1Var;
        this.d = znb0Var;
        this.e = new st60(this, b1h1Var);
    }
}
