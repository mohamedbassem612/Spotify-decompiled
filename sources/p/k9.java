package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import androidx.emoji2.emojipicker.EmojiView;
import com.comscore.streaming.WindowState;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class k9 implements yl01, ve5, y95, vmy {
    public final /* synthetic */ byte a;
    public Object b;

    public k9(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = new HashMap();
                break;
            case 10:
                fdn0 fdn0Var = pr80.a;
                this.b = new fdn0();
                break;
            case 14:
                this.b = new bz71();
                break;
            case 16:
                this.b = new Object();
                break;
            case 18:
                this.b = v8r.q(Boolean.FALSE);
                break;
            case 19:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public static oa30 K0(oa30[] oa30VarArr, int i) {
        int i2 = (i & 1) == 0 ? WindowState.NORMAL : 700;
        boolean z = (i & 2) != 0;
        oa30 oa30Var = null;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        for (oa30 oa30Var2 : oa30VarArr) {
            int iAbs = (Math.abs(oa30Var2.c - i2) * 2) + (oa30Var2.d == z ? 0 : 1);
            if (oa30Var == null || i3 > iAbs) {
                oa30Var = oa30Var2;
                i3 = iAbs;
            }
        }
        return oa30Var;
    }

    public static long b1(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void s0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static final /* synthetic */ uu00 t0(k9 k9Var) {
        return (uu00) k9Var.b;
    }

    public abstract Object A0(YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity);

    public k9 B0(TypedArray typedArray) {
        bz71 bz71Var = (bz71) this.b;
        if (typedArray.hasValue(3)) {
            bz71Var.n = typedArray.getBoolean(3, bz71Var.n);
        }
        if (typedArray.hasValue(0)) {
            bz71Var.o = typedArray.getBoolean(0, bz71Var.o);
        }
        if (typedArray.hasValue(1)) {
            n1(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            q1(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            p1(typedArray.getInt(7, (int) bz71Var.s));
        }
        if (typedArray.hasValue(14)) {
            bz71Var.q = typedArray.getInt(14, bz71Var.q);
        }
        if (typedArray.hasValue(15)) {
            long j = typedArray.getInt(15, (int) bz71Var.t);
            if (j < 0) {
                hhg1.n(l1d.l(j, "Given a negative repeat delay: "));
                return null;
            }
            bz71Var.t = j;
        }
        if (typedArray.hasValue(16)) {
            bz71Var.r = typedArray.getInt(16, bz71Var.r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, bz71Var.c);
            if (i == 1) {
                bz71Var.c = (byte) 1;
            } else if (i == 2) {
                bz71Var.c = (byte) 2;
            } else if (i != 3) {
                bz71Var.c = (byte) 0;
            } else {
                bz71Var.c = (byte) 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, bz71Var.f ? 1 : 0) != 1) {
                bz71Var.f = false;
            } else {
                bz71Var.f = true;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, bz71Var.l);
            if (f < 0.0f) {
                uh61.k("Given invalid dropoff value: ", f);
                return null;
            }
            bz71Var.l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, bz71Var.g);
            if (dimensionPixelSize < 0) {
                hhg1.n(f4i1.c(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            bz71Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, bz71Var.h);
            if (dimensionPixelSize2 < 0) {
                hhg1.n(f4i1.c(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            bz71Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, bz71Var.k);
            if (f2 < 0.0f) {
                uh61.k("Given invalid intensity value: ", f2);
                return null;
            }
            bz71Var.k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, bz71Var.i);
            if (f3 < 0.0f) {
                uh61.k("Given invalid width ratio: ", f3);
                return null;
            }
            bz71Var.i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, bz71Var.j);
            if (f4 < 0.0f) {
                uh61.k("Given invalid height ratio: ", f4);
                return null;
            }
            bz71Var.j = f4;
        }
        if (typedArray.hasValue(18)) {
            bz71Var.m = typedArray.getFloat(18, bz71Var.m);
        }
        return a1();
    }

    public abstract Object C0(Object obj);

    public abstract Typeface D0(Context context, w930 w930Var, Resources resources, int i);

    public abstract Typeface E0(Context context, oa30[] oa30VarArr, int i);

    public Typeface F0(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface G0(Context context, Resources resources, int i, String str, int i2) {
        File fileW = jhc1.w(context);
        if (fileW == null) {
            return null;
        }
        try {
            if (jhc1.n(fileW, resources, i)) {
                return Typeface.createFromFile(fileW.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileW.delete();
        }
    }

    public Object H0(u8 u8Var) {
        wl60 wl60Var = (wl60) u8Var;
        ul60 ul60VarR = vl60.r();
        ul60VarR.i();
        ul60VarR.h(wl60Var.o());
        byte[] bArrA = eqz0.a(wl60Var.n());
        ul60VarR.g(ohc.d(0, bArrA, bArrA.length));
        return ul60VarR.a();
    }

    public Typeface I0(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public abstract void J0();

    public Object L0(Object obj) {
        synchronized (((HashMap) this.b)) {
            try {
                if (((HashMap) this.b).containsKey(obj)) {
                    return ((HashMap) this.b).get(obj);
                }
                Object objC0 = C0(obj);
                ((HashMap) this.b).put(obj, objC0);
                return objC0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract jsb0 M0(long j, int i, int i2, int i3);

    public Integer N0(ArrayList arrayList, ksc kscVar) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ie30 ie30Var = (ie30) kscVar.d.invoke(Integer.valueOf(((Number) ((mmr0) obj).a).intValue()));
            if (kscVar.b || (kscVar.c.contains(ie30Var) && ie30Var.k >= kscVar.a.k)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            List list = (List) jo31.t(o6x.a, new nsc(this, arrayList2, kscVar, (lnm) null));
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int i = ((ie30) ((mmr0) next).b).k;
                        do {
                            Object next2 = it.next();
                            int i2 = ((ie30) ((mmr0) next2).b).k;
                            if (i < i2) {
                                next = next2;
                                i = i2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                mmr0 mmr0Var = (mmr0) next;
                if (mmr0Var != null) {
                    return (Integer) mmr0Var.a;
                }
            }
        }
        return null;
    }

    public abstract Context O0();

    public abstract Object P0();

    public abstract View.OnClickListener Q0();

    public Object R0() {
        return this.b;
    }

    public int S0() {
        return 6;
    }

    public int T0() {
        return 3;
    }

    public foa1 U0() {
        return (foa1) this.b;
    }

    public List V0(isb0 isb0Var, int i, long j) {
        fdn0 fdn0Var = (fdn0) this.b;
        List list = (List) fdn0Var.b(i);
        if (list != null) {
            return list;
        }
        List listA = isb0Var.a(i);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((afh0) listA.get(i2)).H(j));
        }
        fdn0Var.i(i, arrayList);
        return arrayList;
    }

    public abstract LinearLayout W0();

    public abstract View X0();

    public abstract Object Y0();

    public int[][] Z0() {
        int[][] iArr = (int[][]) this.b;
        if (iArr != null) {
            return iArr;
        }
        u890.C("template");
        throw null;
    }

    public abstract List c1();

    public boolean d1() {
        return ((Boolean) ((hrr0) this.b).getValue()).booleanValue();
    }

    public abstract Object e1(vjh0 vjh0Var, fe6 fe6Var);

    public boolean f1() {
        int i;
        foa1 foa1Var = (foa1) this.b;
        View view = foa1Var.c.j1;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        hhg1.n(f4i1.c(visibility, "Unknown visibility "));
                        return false;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = foa1Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public Observable g1(String str, String str2) {
        mwm1 mwm1Var = (mwm1) this.b;
        zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
        zsm1VarP.q(str);
        if (str2.length() == 0) {
            str2 = " ";
        }
        zsm1VarP.r(k1(str2));
        Observable map = mwm1Var.c(zsm1VarP.build()).map(s9w.Z).map(new dg8(this, (byte) 3));
        map.getClass();
        return map;
    }

    public fg5 getAnnotations() {
        fg5 fg5Var = (fg5) this.b;
        if (fg5Var != null) {
            return fg5Var;
        }
        s0(1);
        throw null;
    }

    public a8b0 getType() {
        a8b0 a8b0Var = (a8b0) this.b;
        if (a8b0Var != null) {
            return a8b0Var;
        }
        r0(1);
        throw null;
    }

    public rmy h1(ez00 ez00Var) {
        gh3 gh3Var = (gh3) ez00Var;
        return new rmy(gh3Var.b, gh3Var.c.a, 1, o7h.y0(gh3Var.d, (CharSequence) null, (String) null, (String) null, ra3.V0, 31));
    }

    public Object i1() {
        return ((iu30) this.b).invoke(UUID.randomUUID().toString());
    }

    public u8 j1(ohc ohcVar) {
        return wl60.p(ohcVar, tz00.a());
    }

    public YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs k1(String str) {
        return YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.o();
    }

    public List l0() {
        return (List) this.b;
    }

    public abstract iu30 l1(r261 r261Var);

    public abstract void m1(jfe jfeVar);

    public k9 n1(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        bz71 bz71Var = (bz71) this.b;
        bz71Var.e = (iMin << 24) | (bz71Var.e & 16777215);
        return a1();
    }

    public boolean o0() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((sua0) list.get(0)).c());
    }

    public abstract void o1(Object obj);

    public k9 p1(long j) {
        if (j >= 0) {
            ((bz71) this.b).s = j;
            return a1();
        }
        hhg1.n(l1d.l(j, "Given a negative duration: "));
        return null;
    }

    public k9 q1(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        bz71 bz71Var = (bz71) this.b;
        bz71Var.d = (iMin << 24) | (bz71Var.d & 16777215);
        return a1();
    }

    public void r1(boolean z) {
        ((hrr0) this.b).setValue(Boolean.valueOf(z));
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u1(u8 u8Var) {
        wl60 wl60Var = (wl60) u8Var;
        if (wl60Var.n() >= 16) {
            zl60.Q(wl60Var.o());
        } else {
            k220.r("key too short");
        }
    }

    public void w0() {
        EmojiView emojiView;
        for (int[] iArr : Z0()) {
            LinearLayout linearLayout = new LinearLayout(O0());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            for (int i : iArr) {
                int i2 = 2;
                AttributeSet attributeSet = null;
                if (i == 0) {
                    emojiView = new EmojiView(O0(), attributeSet, i2, attributeSet);
                } else {
                    EmojiView emojiView2 = new EmojiView(O0(), attributeSet, i2, attributeSet);
                    emojiView2.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
                    emojiView2.setEmoji((CharSequence) c1().get(i - 1));
                    emojiView2.setOnClickListener(Q0());
                    if (i == 1) {
                        W0().post(new fss((Object) emojiView2, (byte) 16));
                    }
                    emojiView = emojiView2;
                }
                emojiView.setLayoutParams(new ViewGroup.LayoutParams(X0().getWidth(), X0().getHeight()));
                linearLayout.addView(emojiView);
            }
            W0().addView(linearLayout);
        }
    }

    public bz71 x0() {
        bz71 bz71Var = (bz71) this.b;
        boolean z = bz71Var.f;
        int[] iArr = bz71Var.b;
        if (!z) {
            int i = bz71Var.e;
            iArr[0] = i;
            int i2 = bz71Var.d;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
        } else {
            int i3 = bz71Var.d;
            iArr[0] = i3;
            iArr[1] = i3;
            int i4 = bz71Var.e;
            iArr[2] = i4;
            iArr[3] = i4;
        }
        float[] fArr = bz71Var.a;
        if (!z) {
            fArr[0] = Math.max(((1.0f - bz71Var.k) - bz71Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - bz71Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((bz71Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((bz71Var.k + 1.0f) + bz71Var.l) / 2.0f, 1.0f);
            return bz71Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(bz71Var.k, 1.0f);
        fArr[2] = Math.min(bz71Var.k + bz71Var.l, 1.0f);
        fArr[3] = 1.0f;
        return bz71Var;
    }

    public abstract void y0(r261 r261Var);

    public abstract void z0();

    public k9 a1() {
        return this;
    }

    public void t1() {
    }

    public void u0() {
    }

    public void v0() {
    }

    public void s1(mhg1 mhg1Var) {
    }

    public k9(Resources resources) {
        this.a = (byte) 13;
        resources.getClass();
        this.b = new WeakReference(resources);
    }

    public k9(fg5 fg5Var) {
        this.a = (byte) 1;
        if (fg5Var != null) {
            this.b = fg5Var;
        } else {
            s0(0);
            throw null;
        }
    }

    public k9(a8b0 a8b0Var) {
        this.a = (byte) 0;
        if (a8b0Var != null) {
            this.b = a8b0Var;
        } else {
            r0(0);
            throw null;
        }
    }

    public /* synthetic */ k9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
