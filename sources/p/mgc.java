package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.media.AudioManager;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.protobuf.StringValue;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mgc implements Function, s891, ObservableOnSubscribe, sh, hx30 {
    public static final k0d e = new k0d((byte) 29);
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    public mgc(tr80 tr80Var, mmo1 mmo1Var) {
        Object k5sVar;
        this.a = (byte) 23;
        mgc mgcVarB = mmo1Var.B();
        int i = ((rr80) tr80Var).a;
        if (i < 0) {
            tf80.c("negative nearestRange.first");
        }
        int iMin = Math.min(((rr80) tr80Var).b, mgcVarB.b - 1);
        if (iMin < i) {
            this.c = kfp0.a;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        sdn0 sdn0Var = new sdn0(i2);
        bfn0 bfn0Var = (bfn0) mgcVarB.c;
        if (i < 0 || i >= mgcVarB.b) {
            tf80.e("Index " + i + ", size " + mgcVarB.b);
        }
        if (iMin < 0 || iMin >= mgcVarB.b) {
            tf80.e("Index " + iMin + ", size " + mgcVarB.b);
        }
        if (iMin < i) {
            tf80.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iM = brl.m(i, bfn0Var);
        int i3 = ((g890) bfn0Var.a[iM]).a;
        while (i3 <= iMin) {
            g890 g890Var = (g890) bfn0Var.a[iM];
            iu30 key = ((trb0) g890Var.c).getKey();
            int i4 = g890Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (g890Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        k5sVar = key.invoke(Integer.valueOf(iMax - i4));
                        k5sVar = k5sVar == null ? new k5s(iMax) : k5sVar;
                    }
                    sdn0Var.g(iMax, k5sVar);
                    ((Object[]) this.d)[iMax - this.b] = k5sVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += g890Var.b;
            iM++;
        }
        this.c = sdn0Var;
    }

    public static int O(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((tub0) list.get(i3)).a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static mgc i(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        int i2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        byte b = 12;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = lah.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new mgc(obj, colorStateListB, colorStateListB.getDefaultColor(), b);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = xzn1.F(resources, theme, attributeSetAsAttributeSet, eoz0.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = xzn1.F(resources, theme, attributeSetAsAttributeSet, eoz0.f);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f11 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f4 = f;
            f5 = f2;
        }
        ro30 ro30Var = arrayList2.size() > 0 ? new ro30(arrayList2, arrayList) : null;
        if (ro30Var == null) {
            ro30Var = z ? new ro30(color, color2, color3) : new ro30(color, color3);
        }
        if (i3 == 1) {
            i2 = 0;
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = (int[]) ro30Var.b;
            float[] fArr = (float[]) ro30Var.c;
            if (i4 != 1) {
                tileMode = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr, fArr, tileMode);
        } else if (i3 != 2) {
            int[] iArr2 = (int[]) ro30Var.b;
            float[] fArr2 = (float[]) ro30Var.c;
            if (i4 != 1) {
                tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            i2 = 0;
            radialGradient = new LinearGradient(f3, f, f2, f6, iArr2, fArr2, tileMode2);
        } else {
            i2 = 0;
            radialGradient = new SweepGradient(f7, f8, (int[]) ro30Var.b, (float[]) ro30Var.c);
        }
        return new mgc(radialGradient, (Object) null, i2, (byte) 12);
    }

    public Shader A() {
        return (Shader) this.c;
    }

    public int B() {
        return this.b;
    }

    public int C() {
        return this.b;
    }

    public boolean D(Object obj) {
        go20 go20Var = (go20) this.d;
        return ((((Number) ((xla0) this.c).get(obj)).intValue() >>> go20Var.a) & ((1 << go20Var.b) - 1)) == go20Var.c;
    }

    public fgl1[] E() {
        return (fgl1[]) this.d;
    }

    public boolean F() {
        return ((Shader) this.c) != null;
    }

    public boolean G() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void H(d2e0 d2e0Var, int i, int i2, ie30 ie30Var, int i3, Object obj, long j, long j2) {
        j(new t2i0(this, d2e0Var, new qqh0(i, i2, ie30Var, i3, obj, zoi1.n0(j), zoi1.n0(j2)), (byte) 1));
    }

    public void I(d2e0 d2e0Var, int i, int i2, ie30 ie30Var, int i3, Object obj, long j, long j2) {
        j(new t2i0(this, d2e0Var, new qqh0(i, i2, ie30Var, i3, obj, zoi1.n0(j), zoi1.n0(j2)), (byte) 0));
    }

    public void J(d2e0 d2e0Var, int i, int i2, ie30 ie30Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        j(new u2i0(this, d2e0Var, new qqh0(i, i2, ie30Var, i3, obj, zoi1.n0(j), zoi1.n0(j2)), iOException, z));
    }

    public void K(d2e0 d2e0Var, int i, IOException iOException, boolean z) {
        J(d2e0Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void L(d2e0 d2e0Var, int i, int i2, ie30 ie30Var, int i3, Object obj, long j, long j2, int i4) {
        j(new oxh0(this, d2e0Var, new qqh0(i, i2, ie30Var, i3, obj, zoi1.n0(j), zoi1.n0(j2)), i4, (byte) 2));
    }

    public void M() {
        f46.f0(0, 0, 6, (int[]) this.c);
        ((n36) this.d).clear();
    }

    public synchronized void N(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= 4096) {
                ((ArrayList) this.c).add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.d, bArr, e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.d).add(iBinarySearch, bArr);
                this.b += bArr.length;
                synchronized (this) {
                    while (this.b > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.c).remove(0);
                        ((ArrayList) this.d).remove(bArr2);
                        this.b -= bArr2.length;
                    }
                }
            }
        }
    }

    public void P(ow3 ow3Var) {
        this.c = ow3Var;
    }

    public void Q(int i, int[] iArr) {
        n36 n36Var = (n36) this.d;
        int iO = O(i, n36Var);
        if (iO < 0) {
            if (iArr == null) {
                return;
            }
            n36Var.add(-(iO + 1), new tub0(i, iArr));
        } else if (iArr == null) {
            n36Var.c(iO);
        } else {
            ((tub0) n36Var.get(iO)).b = iArr;
        }
    }

    public void R(int i, int i2) {
        if (i < 0) {
            tf80.a("Negative lanes are not supported");
        }
        m(i);
        ((int[]) this.c)[i - this.b] = i2 + 1;
    }

    public void S(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.d = onAudioFocusChangeListener;
    }

    public void T(int i) {
        this.b = i;
    }

    public void U(int i) {
        this.b = i;
    }

    public void V(String str) {
        this.c = str;
    }

    public void W(long j) {
        this.d = Long.valueOf(j);
    }

    public void X() {
        String str;
        int i = this.b;
        if (i != 0 && ((t45) this.d) == null) {
            t45 t45VarA = ((zle1) this.c).a("load_listening_activity_carousel");
            t45VarA.h = "android-listening-activity-carousel";
            if (i == 1) {
                str = "side_drawer";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "listening_stats";
            }
            t45VarA.g.put("surface", str);
            t45.m(t45VarA, "load_listening_activity_carousel", 4);
            this.d = t45VarA;
        }
    }

    public boolean Y() {
        return F() || this.b != 0;
    }

    public void a(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.d)[4] = objArr;
            this.d = objArr;
            i = 0;
        }
        ((Object[]) this.d)[i] = obj;
        this.b = i + 1;
    }

    public Object apply(Object obj) {
        Observable map;
        PlayerQueue playerQueueBuild;
        do91 do91Var;
        switch (this.a) {
            case 1:
                lk3 lk3Var = (kk3) obj;
                pv80 pv80Var = (pv80) ((en1) this.c).c;
                String str = (String) this.d;
                int i = this.b;
                lk3 lk3Var2 = lk3Var instanceof lk3 ? lk3Var : null;
                String strD = lk3Var2 != null ? lk3Var2.d() : null;
                if (strD == null) {
                    strD = "";
                }
                i8h1 i8h1Var = pv80Var.a;
                r6h1 r6h1Var = pv80Var.b;
                Integer numValueOf = Integer.valueOf(i);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-entity-item-list-item";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = numValueOf;
                x6h1VarI.d = str;
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", strD), new mmr0("item_to_be_added", str)})), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            case 13:
                List list = (List) obj;
                nzl nzlVar = (nzl) this.d;
                azl azlVar = (azl) this.c;
                String str2 = azlVar.f;
                if (list.size() >= this.b || ihc1.y0(str2)) {
                    Observable observableJust = Observable.just(list);
                    observableJust.getClass();
                    return observableJust;
                }
                em3 em3Var = nzlVar.a;
                Optional optional = (Optional) em3Var.c;
                if (optional.isPresent()) {
                    optional.get().getClass();
                    bhn0.d();
                    return null;
                }
                Observable observableDoOnSubscribe = ioo1.O(((qm3) ((yo31) em3Var.b).b).b("allboarding".concat(str2)).map(vap1.e)).map(new v1k(nzlVar, azlVar, list, (byte) 10)).doOnSubscribe(new a21(nzlVar, azlVar, (byte) 24));
                observableDoOnSubscribe.getClass();
                return observableDoOnSubscribe;
            case 15:
                return new CompletableFromAction(new o68((aas) this.c, (bz1) obj, this.b, (String) this.d));
            case 24:
                spq0 spq0Var = (spq0) obj;
                pf81 pf81Var = (pf81) ((fip0) this.c).f;
                String str3 = (String) this.d;
                yrc0 yrc0Var = (yrc0) spq0Var.h();
                enm d4e0Var = ((yrc0Var != null ? yrc0Var.f : 0) == 5 || this.b == 5) ? new d4e0((byte) 25) : null;
                pf81Var.getClass();
                rku rkuVar = new rku();
                inm inmVar = pf81Var.a;
                if (d4e0Var == null || (map = inmVar.a(str3, d4e0Var).map(y1x0.Y)) == null) {
                    map = inmVar.a(str3, inmVar.e).map(a2x0.Z);
                }
                Observable observableFlatMapObservable = pf81Var.d.flatMapObservable(new nn61(pf81Var, str3, false, (byte) 18));
                Observable map2 = pf81Var.f.filter(new hdn1(str3, (byte) 6)).map(bjx0.Y);
                p4u0 p4u0Var = pf81Var.c;
                v3u0 v3u0Var = p4u0Var.b;
                p4u0Var.a.getClass();
                return Observable.combineLatest(map, observableFlatMapObservable, map2.startWith(v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetShuffleState", StringValue.r(sto1.m(str3) ? "spotify:collection:tracks" : str3)).map(yj20.W0).map(f610.X0).map(djx0.Y).startWith(Observable.just(j5.a))), njx0.Y).doOnNext(new qg7(rkuVar, pf81Var, str3, (byte) 26)).map(w1x0.Q0).distinctUntilChanged().doFinally(new hnm(rkuVar, (byte) 1)).map(new swm0(spq0Var, (byte) 11));
            case 25:
                Map map3 = (Map) obj;
                dts0 dts0Var = (dts0) this.c;
                r9c r9cVar = (r9c) this.d;
                return dts0Var.e.y(r9cVar, this.b).firstOrError().flatMap(new cts0(r9cVar, dts0Var, y7y0.L(map3), rh11.c(map3)));
            case 26:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                List list2 = (List) this.c;
                int iC = l1d.C(this.b);
                if (iC == 0) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dcu0.e((ContextTrack) it.next(), true));
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(l4o1.c0((ContextTrack) it2.next()));
                    }
                    Set setP1 = o7h.p1(arrayList2);
                    ArrayList arrayListC = dcu0.c(playerQueue);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListC) {
                        ContextTrack contextTrack = (ContextTrack) obj2;
                        contextTrack.getClass();
                        if (!setP1.contains(l4o1.c0(contextTrack))) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayListA = dcu0.a(playerQueue);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayListA) {
                        ContextTrack contextTrack2 = (ContextTrack) obj3;
                        contextTrack2.getClass();
                        if (!setP1.contains(l4o1.c0(contextTrack2))) {
                            arrayList4.add(obj3);
                        }
                    }
                    playerQueueBuild = playerQueue.toBuilder().nextTracks(b380.p(o7h.N0(arrayList4, o7h.N0(arrayList3, arrayList)))).build();
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    List list4 = list2;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(dcu0.e((ContextTrack) it3.next(), true));
                    }
                    playerQueueBuild = playerQueue.toBuilder().nextTracks(b380.p(o7h.N0(dcu0.a(playerQueue), o7h.N0(arrayList5, dcu0.c(playerQueue))))).build();
                }
                return ((tuz) this.d).b(dcu0.d(playerQueueBuild));
            default:
                s981 s981Var = (s981) obj;
                p1f0 p1f0Var = (p1f0) this.c;
                if (!(s981Var instanceof r981)) {
                    if (s981Var instanceof q981) {
                        return Single.just(in91.b);
                    }
                    eg.o();
                    return null;
                }
                io91 io91Var = (io91) p1f0Var.f;
                String str4 = (String) this.d;
                int iC2 = l1d.C(this.b);
                if (iC2 == 0) {
                    do91Var = eo91.c;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    do91Var = do91.c;
                }
                io91Var.getClass();
                return new CompletableFromAction(new wf0(io91Var, str4, do91Var, (byte) 20)).e(Single.just(in91.a));
        }
    }

    public void b() {
        String str;
        oxb oxbVar = (oxb) this.c;
        int i = this.b;
        w4l0 w4l0Var = (w4l0) this.d;
        synchronized (oxbVar) {
            if (i != oxbVar.N0.get()) {
                oxbVar.N0.get();
                return;
            }
            if (oxbVar.Y != null && (str = oxbVar.Z) != null) {
                oxbVar.g.l(hut.e, str, w4l0Var);
            }
            ccb1 ccb1Var = oxbVar.X;
            if (ccb1Var != null) {
                ccb1Var.invoke(new md21(jfu.a));
            }
            oxbVar.Y = null;
            oxbVar.Z = null;
            oxbVar.X = null;
        }
    }

    public void c(String str, g1r g1rVar) {
        long j;
        lp51 lp51Var = (lp51) this.d;
        long j2 = g1rVar.a;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            int size = g1rVar.b.size();
            if (size > this.b) {
                return;
            }
            mp51 mp51Var = (mp51) lp51Var.get(str);
            long j3 = ((long) size) + j2;
            TreeMap treeMap = mp51Var.a;
            Map.Entry entryFloorEntry = treeMap.floorEntry(Long.valueOf(j2));
            if (entryFloorEntry != null) {
                g1r g1rVar2 = (g1r) entryFloorEntry.getValue();
                j = j2;
                if (g1rVar2.a + ((long) g1rVar2.b.size()) > j) {
                    return;
                }
            } else {
                j = j2;
            }
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Long.valueOf(j));
            if (entryCeilingEntry == null || ((g1r) entryCeilingEntry.getValue()).a >= j3) {
                treeMap.put(Long.valueOf(j), g1rVar);
                lp51Var.put(str, new mp51(treeMap, mp51Var.b + size));
            }
        } finally {
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }

    public void d(ypb1 ypb1Var) {
        int i = this.b;
        int iIdentityHashCode = System.identityHashCode(ypb1Var);
        int i2 = -1;
        if (i > 0) {
            int i3 = this.b - 1;
            int i4 = 0;
            while (true) {
                if (i4 > i3) {
                    i2 = -(i4 + 1);
                    break;
                }
                int i5 = (i4 + i3) >>> 1;
                int i6 = ((int[]) this.c)[i5];
                if (i6 < iIdentityHashCode) {
                    i4 = i5 + 1;
                } else if (i6 > iIdentityHashCode) {
                    i3 = i5 - 1;
                } else {
                    Reference reference = ((fgl1[]) this.d)[i5];
                    if (ypb1Var == (reference != null ? reference.get() : null)) {
                        i2 = i5;
                        break;
                    }
                    int i7 = i5 - 1;
                    while (true) {
                        if (-1 >= i7 || ((int[]) this.c)[i7] != iIdentityHashCode) {
                            i5++;
                            int i8 = this.b;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(this.b + 1);
                                    break;
                                }
                                if (((int[]) this.c)[i5] != iIdentityHashCode) {
                                    i2 = -(i5 + 1);
                                    break;
                                }
                                Reference reference2 = ((fgl1[]) this.d)[i5];
                                if ((reference2 != null ? reference2.get() : null) == ypb1Var) {
                                    i2 = i5;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            Reference reference3 = ((fgl1[]) this.d)[i7];
                            if ((reference3 != null ? reference3.get() : null) == ypb1Var) {
                                i2 = i7;
                                break;
                            }
                            i7--;
                        }
                    }
                }
            }
            if (i2 >= 0) {
                return;
            }
        }
        int i9 = -(i2 + 1);
        fgl1[] fgl1VarArr = (fgl1[]) this.d;
        int length = fgl1VarArr.length;
        if (i == length) {
            int i10 = length * 2;
            fgl1[] fgl1VarArr2 = new fgl1[i10];
            int[] iArr = new int[i10];
            int i11 = i9 + 1;
            System.arraycopy(fgl1VarArr, i9, fgl1VarArr2, i11, i - i9);
            System.arraycopy((fgl1[]) this.d, 0, fgl1VarArr2, 0, i9);
            f46.P(i11, i9, i, (int[]) this.c, iArr);
            f46.V(0, i9, 6, (int[]) this.c, iArr);
            this.d = fgl1VarArr2;
            this.c = iArr;
        } else {
            int i12 = i9 + 1;
            System.arraycopy(fgl1VarArr, i9, fgl1VarArr, i12, i - i9);
            int[] iArr2 = (int[]) this.c;
            f46.P(i12, i9, i, iArr2, iArr2);
        }
        ((fgl1[]) this.d)[i9] = new fgl1(ypb1Var);
        ((int[]) this.c)[i9] = iIdentityHashCode;
        this.b++;
    }

    public void e(int i, Object obj) {
        if (i < 0) {
            tf80.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        g890 g890Var = new g890(this.b, i, obj);
        this.b += i;
        ((bfn0) this.c).b(g890Var);
    }

    public boolean f(int i, int i2) {
        int iZ = z(i);
        return iZ == i2 || iZ == -1 || iZ == -2;
    }

    public av7 g() {
        return new av7(this.b, (Boolean) null, (ow3) this.c, (AudioManager.OnAudioFocusChangeListener) this.d, (Handler) null, (Boolean) null, 0);
    }

    public r29 h() {
        if ("".isEmpty()) {
            return new r29(((Long) this.d).longValue(), this.b, (String) this.c);
        }
        eg.m("Missing required properties:".concat(""));
        return null;
    }

    public void j(akl aklVar) {
        for (v2i0 v2i0Var : (CopyOnWriteArrayList) this.d) {
            zoi1.c0(v2i0Var.a, new zyh0((Object) aklVar, (Object) v2i0Var.b, (byte) 6));
        }
    }

    public void k(int i, ie30 ie30Var, int i2, Object obj, long j) {
        j(new x8a0((Object) this, (Object) new qqh0(1, i, ie30Var, i2, obj, zoi1.n0(j), -9223372036854775807L), (byte) 21));
    }

    public void l(int i, int i2) {
        if (i > 131072) {
            tf80.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.c;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            f46.V(i2, 0, 12, (int[]) this.c, iArr2);
            this.c = iArr2;
        }
    }

    public void m(int i) {
        n36 n36Var = (n36) this.d;
        int i2 = this.b;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (((int[]) this.c).length / 2), 0);
            this.b = iMax;
            int i4 = iMax - i2;
            int[] iArr = (int[]) this.c;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    f46.P(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.c;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.c).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    l(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        f46.P(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = (int[]) this.c;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            l(i3 + 1, 0);
        }
        while (!n36Var.isEmpty() && ((tub0) n36Var.first()).a < this.b) {
            n36Var.removeFirst();
        }
        while (!n36Var.isEmpty() && ((tub0) n36Var.last()).a > this.b + ((int[]) this.c).length) {
            n36Var.removeLast();
        }
    }

    public int n(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!f(i, i2));
        return i;
    }

    public void o(int i) {
        String str;
        t45 t45Var = (t45) this.d;
        if (t45Var != null) {
            if (i == 1) {
                str = "success";
            } else if (i == 2) {
                str = "empty";
            } else if (i == 3) {
                str = "load_failed";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "cancelled";
            }
            t45Var.g.put("outcome", str);
            t45Var.g("load_listening_activity_carousel");
            ((zle1) this.c).b(t45Var.e());
        }
        this.d = null;
    }

    public void onSuccess(Object obj) {
        List list = (List) obj;
        e0i0 e0i0Var = (e0i0) this.d;
        fzh0 fzh0Var = e0i0Var.d;
        ixh0 ixh0Var = (ixh0) this.c;
        int i = this.b;
        fzh0Var.getClass();
        fzh0Var.x = ixh0Var;
        fzh0 fzh0Var2 = e0i0Var.d;
        if (i == -1) {
            fzh0Var2.C();
            fzh0Var2.t.T0(list);
        } else {
            fzh0Var2.C();
            fzh0Var2.t.M0(i, list);
        }
        l8u0 l8u0Var = new l8u0();
        l8u0Var.a.c(20);
        fzh0Var2.v(ixh0Var, l8u0Var.d());
        fzh0Var.x = null;
    }

    public void p(yia yiaVar) {
        Object[] objArr;
        for (Object[] objArr2 = (Object[]) this.c; objArr2 != null; objArr2 = objArr2[4]) {
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                yiaVar.test(objArr);
            }
        }
    }

    public g890 q(int i) {
        if (i < 0 || i >= this.b) {
            tf80.e("Index " + i + ", size " + this.b);
        }
        g890 g890Var = (g890) this.d;
        if (g890Var != null) {
            int i2 = g890Var.a;
            if (i < g890Var.b + i2 && i2 <= i) {
                return g890Var;
            }
        }
        bfn0 bfn0Var = (bfn0) this.c;
        g890 g890Var2 = (g890) bfn0Var.a[brl.m(i, bfn0Var)];
        this.d = g890Var2;
        return g890Var2;
    }

    public boolean r(View view) {
        ((hv41) this.c).D((y3g) this.d, this.b);
        return true;
    }

    public synchronized byte[] s(int i) {
        for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.d).get(i2);
            if (bArr.length >= i) {
                this.b -= bArr.length;
                ((ArrayList) this.d).remove(i2);
                ((ArrayList) this.c).remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        jeh0 jeh0Var = (jeh0) this.c;
        NsdManager.RegistrationListener vv4Var = new vv4(observableEmitter, jeh0Var, (byte) 0);
        NsdManager nsdManager = (NsdManager) this.d;
        int i = this.b;
        List list = r110.a;
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setPort(i);
        vo90 vo90Var = jeh0Var.a;
        vo90Var.getClass();
        nsdServiceInfo.setServiceType("_spotify-social-listening._tcp");
        nsdServiceInfo.setServiceName(vo90Var.b);
        for (Map.Entry entry : vo90Var.d.entrySet()) {
            nsdServiceInfo.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        nsdManager.registerService(nsdServiceInfo, 1, vv4Var);
        observableEmitter.setCancellable(new pc6(nsdManager, vv4Var, (byte) 3));
    }

    public List t() {
        return (ArrayList) this.c;
    }

    public int u() {
        return this.b;
    }

    public int[] v(int i) {
        n36 n36Var = (n36) this.d;
        tub0 tub0Var = (tub0) o7h.t0(O(i, n36Var), n36Var);
        if (tub0Var != null) {
            return tub0Var.b;
        }
        return null;
    }

    public int[] w() {
        return (int[]) this.c;
    }

    public int x(Object obj) {
        sdn0 sdn0Var = (sdn0) this.c;
        int iD = sdn0Var.d(obj);
        if (iD >= 0) {
            return sdn0Var.c[iD];
        }
        return -1;
    }

    public Object y(int i) {
        Object[] objArr = (Object[]) this.d;
        int i2 = i - this.b;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public int z(int i) {
        int i2 = this.b;
        if (i < i2) {
            return -1;
        }
        int[] iArr = (int[]) this.c;
        if (i >= iArr.length + i2) {
            return -1;
        }
        return iArr[i - i2] - 1;
    }

    public void onFailure(Throwable th) {
    }

    public /* synthetic */ mgc(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public /* synthetic */ mgc(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ mgc(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public mgc(cu71 cu71Var, rok0 rok0Var) {
        this.a = (byte) 21;
        this.c = cu71Var;
        this.d = rok0Var;
        this.b = -1;
    }

    public mgc(int i, byte b) {
        this.a = b;
        switch (b) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.b = i;
                this.c = new ReentrantReadWriteLock();
                this.d = new lp51(i);
                break;
            default:
                this.b = i;
                break;
        }
    }

    public mgc(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = (byte) 3;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            hhg1.n("changes cannot be empty");
            throw null;
        }
    }

    public mgc(xla0 xla0Var, go20 go20Var) {
        this.a = (byte) 7;
        this.c = xla0Var;
        this.d = go20Var;
        if (go20Var.b == 1 && go20Var.c == 1) {
            this.b = 1 << go20Var.a;
        } else {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var, " was passed");
            throw null;
        }
    }

    public /* synthetic */ mgc(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public mgc(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.d = objArr;
                break;
            case 6:
                break;
            case 17:
                this.c = new int[16];
                this.d = new n36();
                break;
            case 22:
                this.c = new bfn0(0, new g890[16]);
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.c = new int[16];
                this.d = new fgl1[16];
                break;
            default:
                this.c = new ArrayList();
                this.d = new ArrayList(64);
                this.b = 0;
                break;
        }
    }

    public mgc(CopyOnWriteArrayList copyOnWriteArrayList, int i, p2i0 p2i0Var) {
        this.a = (byte) 20;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = p2i0Var;
    }

    public mgc(String str, int i) {
        this.a = (byte) 9;
        this.c = str;
        this.b = i;
    }

    public mgc(e0i0 e0i0Var, ixh0 ixh0Var, int i) {
        this.a = (byte) 19;
        this.d = e0i0Var;
        this.c = ixh0Var;
        this.b = i;
    }
}
