package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import app.p000rive.semantics.SemanticState;
import com.google.android.material.tabs.TabLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.icons.IconArrowUp;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Pattern;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lvc1 implements ix30, o4e1, cy81, Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:19:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee A[Catch: Exception -> 0x0112, LOOP:5: B:30:0x00e8->B:32:0x00ee, LOOP_END, TryCatch #2 {Exception -> 0x0112, blocks: (B:29:0x00c2, B:30:0x00e8, B:32:0x00ee, B:33:0x010e), top: B:70:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:49:0x015d  */
    /* JADX WARN: Code duplicated, block: B:53:0x016d A[LOOP:1: B:51:0x0167->B:53:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0195 A[LOOP:2: B:55:0x018f->B:57:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd A[LOOP:3: B:62:0x01c7->B:64:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public lvc1(Context context, xpv0 xpv0Var, h94 h94Var) {
        Map mapT;
        LinkedHashMap linkedHashMap;
        o3c1 o3c1Var;
        Boolean boolD1;
        Long lD0;
        ArrayList<Map.Entry> arrayList;
        ArrayList<Map.Entry> arrayList2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList4;
        this.a = (byte) 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("temporary_property_overrides", 0);
        this.b = sharedPreferences;
        mfa0 mfa0Var = nfa0.d;
        this.c = mfa0Var;
        nlc0 nlc0Var = new nlc0(chc1.a, o3c1.Companion.serializer());
        this.d = nlc0Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap3 = null;
        String string = sharedPreferences.getString("overrides", null);
        Map map = b7x.a;
        if (string != null) {
            try {
                try {
                    mapT = (Map) mfa0Var.a(string, nlc0Var);
                } catch (Exception unused) {
                    mapT = null;
                    if (mapT == null) {
                        try {
                            Map map2 = (Map) mfa0Var.a(string, new nlc0(chc1.a, o5f0.a));
                            linkedHashMap = new LinkedHashMap(zno1.s(map2.size()));
                            for (Object obj : map2.entrySet()) {
                                linkedHashMap.put(((Map.Entry) obj).getKey(), new o3c1(false, ((Number) ((Map.Entry) obj).getValue()).longValue()));
                            }
                            J(linkedHashMap);
                            linkedHashMap3 = linkedHashMap;
                        } catch (Exception unused2) {
                        }
                        if (linkedHashMap3 != null) {
                            map = linkedHashMap3;
                        }
                    }
                    Set setEntrySet = map.entrySet();
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    for (Object obj2 : setEntrySet) {
                        if (((o3c1) ((Map.Entry) obj2).getValue()).b > jCurrentTimeMillis) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        int iS = zno1.s(q7h.U(arrayList, 10));
                        linkedHashMap2 = new LinkedHashMap(iS < 16 ? 16 : iS);
                        for (Map.Entry entry : arrayList) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                        J(linkedHashMap2);
                        arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                        for (Map.Entry entry2 : arrayList2) {
                            arrayList4.add(P((String) entry2.getKey(), ((o3c1) entry2.getValue()).a));
                        }
                        o7h.p1(arrayList4);
                    }
                    if (arrayList.isEmpty()) {
                    }
                    arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    for (Map.Entry entry3 : arrayList) {
                        arrayList3.add(P((String) entry3.getKey(), ((o3c1) entry3.getValue()).a));
                    }
                    o7h.p1(arrayList3);
                }
            } catch (Exception unused3) {
                chc1 chc1Var = chc1.a;
                Map map3 = (Map) mfa0Var.a(string, new nlc0(chc1Var, chc1Var));
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry4 : map3.entrySet()) {
                    String str = (String) entry4.getKey();
                    List listQ0 = ihc1.Q0((String) entry4.getValue(), new String[]{":"}, 2, 2);
                    String str2 = (String) o7h.t0(0, listQ0);
                    if (str2 == null || (boolD1 = ihc1.d1(str2)) == null) {
                        o3c1Var = null;
                    } else {
                        boolean zBooleanValue = boolD1.booleanValue();
                        String str3 = (String) o7h.t0(1, listQ0);
                        if (str3 == null || (lD0 = nhc1.d0(10, str3)) == null) {
                            o3c1Var = null;
                        } else {
                            o3c1Var = new o3c1(zBooleanValue, lD0.longValue());
                        }
                    }
                    mmr0 mmr0Var = o3c1Var != null ? new mmr0(str, o3c1Var) : null;
                    if (mmr0Var != null) {
                        arrayList5.add(mmr0Var);
                    }
                }
                mapT = sqg0.T(arrayList5);
                J(mapT);
                if (mapT == null) {
                    Map map4 = (Map) mfa0Var.a(string, new nlc0(chc1.a, o5f0.a));
                    linkedHashMap = new LinkedHashMap(zno1.s(map4.size()));
                    while (r13.hasNext()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), new o3c1(false, ((Number) ((Map.Entry) obj).getValue()).longValue()));
                    }
                    J(linkedHashMap);
                    linkedHashMap3 = linkedHashMap;
                    if (linkedHashMap3 != null) {
                        map = linkedHashMap3;
                    }
                } else {
                    map = mapT;
                }
                Set setEntrySet2 = map.entrySet();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                while (r13.hasNext()) {
                    if (((o3c1) ((Map.Entry) obj2).getValue()).b > jCurrentTimeMillis) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    int iS2 = zno1.s(q7h.U(arrayList, 10));
                    linkedHashMap2 = new LinkedHashMap(iS2 < 16 ? 16 : iS2);
                    while (r13.hasNext()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                    J(linkedHashMap2);
                    arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                    while (r13.hasNext()) {
                        arrayList4.add(P((String) entry2.getKey(), ((o3c1) entry2.getValue()).a));
                    }
                    o7h.p1(arrayList4);
                }
                if (arrayList.isEmpty()) {
                    arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    while (r13.hasNext()) {
                        arrayList3.add(P((String) entry3.getKey(), ((o3c1) entry3.getValue()).a));
                    }
                    o7h.p1(arrayList3);
                }
            }
            map = mapT;
        }
        Set setEntrySet3 = map.entrySet();
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        while (r13.hasNext()) {
            if (((o3c1) ((Map.Entry) obj2).getValue()).b > jCurrentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            int iS3 = zno1.s(q7h.U(arrayList, 10));
            linkedHashMap2 = new LinkedHashMap(iS3 < 16 ? 16 : iS3);
            while (r13.hasNext()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            J(linkedHashMap2);
            arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
            while (r13.hasNext()) {
                arrayList4.add(P((String) entry2.getKey(), ((o3c1) entry2.getValue()).a));
            }
            o7h.p1(arrayList4);
        }
        if (arrayList.isEmpty()) {
            arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            while (r13.hasNext()) {
                arrayList3.add(P((String) entry3.getKey(), ((o3c1) entry3.getValue()).a));
            }
            o7h.p1(arrayList3);
        }
    }

    public static lvc1 B(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131626227, (ViewGroup) null, false);
        int i = 2131428386;
        TabLayout tabLayoutT = m5n1.t(viewInflate, 2131428386);
        if (tabLayoutT != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            ViewPager2 viewPager2T = m5n1.t(viewInflate, 2131428388);
            if (viewPager2T != null) {
                return new lvc1((Object) linearLayout, (Object) tabLayoutT, (Object) viewPager2T, (byte) 5);
            }
            i = 2131428388;
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static lvc1 C(Context context, int i, int[] iArr) {
        return new lvc1((Object) context, (Object) context.obtainStyledAttributes(i, iArr), (byte) 13);
    }

    public static lvc1 D(Context context, AttributeSet attributeSet, int[] iArr) {
        return new lvc1((Object) context, (Object) context.obtainStyledAttributes(attributeSet, iArr), (byte) 13);
    }

    public static lvc1 E(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new lvc1((Object) context, (Object) context.obtainStyledAttributes(attributeSet, iArr, i, 0), (byte) 13);
    }

    public static long F(String str) {
        if (Pattern.compile("[0-9]+(.[0-9])*s").matcher(str).matches()) {
            str = str.substring(0, ihc1.q0(str));
        } else if (!Pattern.compile("[0-9]+(.[0-9])*").matcher(str).matches()) {
            hhg1.n("Unexpected offset: ".concat(str));
            return 0L;
        }
        return jch0.a0(Float.parseFloat(str) * 1000.0f);
    }

    public static void N(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void O(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static fpb P(String str, boolean z) {
        int iV0 = ihc1.v0(str, '.', 0, 6);
        if (iV0 <= 0 || iV0 >= str.length() - 1) {
            hhg1.f("Invalid property ID format: ".concat(str));
            return null;
        }
        return new fpb(str.substring(iV0 + 1), str.substring(0, iV0), z);
    }

    public static ArrayList p(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(g57.a);
        arrayList2.add(g57.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!g57.a((Rational) it2.next(), size));
            }
        }
        return arrayList2;
    }

    public static Rational u(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? g57.a : g57.b;
        }
        if (i == 1) {
            return z ? g57.c : g57.d;
        }
        j2h1.p("SupportedOutputSizesCollector");
        return null;
    }

    public static HashMap x(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = p(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (g57.a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public void A() {
        yye1 yye1Var = (yye1) this.d;
        if (yye1Var != null) {
            AnimatorSet animatorSet = yye1Var.g;
            if (animatorSet != null) {
                animatorSet.end();
            }
            yye1Var.g = zpn1.s(yye1Var.a);
        }
    }

    public TypedValue G() {
        return ((TypedArray) this.c).peekValue(19);
    }

    public void H(x9e1 x9e1Var, y9e1 y9e1Var) {
        ydf0 ydf0Var = (ydf0) this.b;
        if (ydf0Var != null) {
            ydf0Var.d(new osc(x9e1Var), y9e1Var);
        } else {
            this.c = new osc(x9e1Var);
            this.d = y9e1Var;
        }
    }

    public void I() {
        ((TypedArray) this.c).recycle();
    }

    public void J(Map map) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (map.isEmpty()) {
            sharedPreferences.edit().remove("overrides").commit();
        } else {
            sharedPreferences.edit().putString("overrides", ((mfa0) this.c).b((nlc0) this.d, map)).commit();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    public void K() throws lcd1 {
        hn60 hn60Var = (hn60) this.c;
        l420 l420Var = (l420) this.b;
        l420 l420VarP = hn60Var.b.p(l420Var, ".tag");
        File file = l420Var.b;
        if (file.exists() && file.isDirectory() && file.canWrite()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) hn60Var.l(l420VarP), one.b));
                try {
                    Properties properties = new Properties();
                    properties.putAll((HashMap) this.d);
                    properties.store(bufferedWriter, String.valueOf(System.currentTimeMillis()));
                } finally {
                    uh70.a(bufferedWriter);
                }
            } catch (IOException e) {
                String message = e.getMessage();
                message.getClass();
                throw new lcd1(message);
            }
        }
    }

    public void L(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void M(aye1 aye1Var, String str) {
        AnimatorSet animatorSet;
        ViewGroup viewGroup = (ConstraintLayout) this.b;
        if (((yye1) this.d) == null) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131625358, viewGroup, false);
            this.d = new yye1(viewInflate, new gl61(this, (byte) 10));
            viewGroup.addView(viewInflate);
        }
        yye1 yye1Var = (yye1) this.d;
        yye1Var.getClass();
        String str2 = aye1Var.a;
        String str3 = aye1Var.b;
        spq0 spq0VarA = spq0.a(str);
        yye1Var.b.setText(str2);
        yye1Var.c.setText(str3);
        boolean zC = spq0VarA.c();
        Button button = yye1Var.d;
        if (zC) {
            button.setText((CharSequence) spq0VarA.b());
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
        AnimatorSet animatorSet2 = yye1Var.g;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
        View view = yye1Var.a;
        if (view.getVisibility() == 0) {
            animatorSet = null;
        } else {
            view.setTranslationY(view.getHeight());
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, a8o.x(8.0f, view.getResources()), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
            PathInterpolator pathInterpolator = hlv.f;
            objectAnimatorOfFloat.setInterpolator(pathInterpolator);
            objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet3.setDuration(300L);
            animatorSet3.start();
            animatorSet = animatorSet3;
        }
        yye1Var.g = animatorSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Q(yfe0 yfe0Var, onm onmVar) {
        qke1 qke1Var;
        if (onmVar instanceof qke1) {
            qke1Var = (qke1) onmVar;
            int i = qke1Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                qke1Var.d = i - os00.INVALID_ID;
            } else {
                qke1Var = new qke1(this, onmVar);
            }
        } else {
            qke1Var = new qke1(this, onmVar);
        }
        Object objI = qke1Var.b;
        int i2 = qke1Var.d;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarD = ((u4q0) this.b).d();
            qke1Var.a = yfe0Var;
            qke1Var.d = 1;
            objI = b5p1.i(mr20VarD, qke1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yfe0Var = qke1Var.a;
            hm5.M(objI);
        }
        tig0 tig0Var = (tig0) objI;
        if (tig0Var instanceof rig0) {
            ((lzn0) this.c).h(bsg1.d.b(((rig0) tig0Var).a));
            ff81.a((ff81) this.d, yfe0Var.a, yfe0Var.b, yfe0Var.c);
        } else {
            if (!u890.j(tig0Var, sig0.a)) {
                eg.o();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object R(onm onmVar) {
        rke1 rke1Var;
        if (onmVar instanceof rke1) {
            rke1Var = (rke1) onmVar;
            int i = rke1Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                rke1Var.c = i - os00.INVALID_ID;
            } else {
                rke1Var = new rke1(this, onmVar);
            }
        } else {
            rke1Var = new rke1(this, onmVar);
        }
        Object objI = rke1Var.a;
        int i2 = rke1Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarD = ((u4q0) this.b).d();
            rke1Var.c = 1;
            objI = b5p1.i(mr20VarD, rke1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        tig0 tig0Var = (tig0) objI;
        if (tig0Var instanceof rig0) {
            ((lzn0) this.c).h(bsg1.d.b(((rig0) tig0Var).a));
        } else {
            if (!u890.j(tig0Var, sig0.a)) {
                eg.o();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a() {
        boolean zDelete;
        ((HashMap) this.d).clear();
        hn60 hn60Var = (hn60) this.c;
        l420 l420VarP = hn60Var.b.p((l420) this.b, ".tag");
        File file = l420VarP.b;
        if (file.exists()) {
            try {
                if (file.isDirectory()) {
                    avw0.a(l420VarP);
                }
            } catch (Exception unused) {
            }
            try {
                zDelete = l420VarP.delete();
            } catch (Exception unused2) {
                zDelete = false;
            }
            if (zDelete) {
                return;
            }
            try {
                hn60Var.b.s(l420VarP).close();
            } catch (FileNotFoundException | IOException unused3) {
            }
        }
    }

    public Object apply(Object obj) {
        List list;
        p8n0 p8n0VarA;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 19:
                rsf1 rsf1Var = (rsf1) obj2;
                String str = (String) this.c;
                String link = ((CollectionTrack) this.d).s().getLink();
                hll hllVar = ((lsf1) obj).b;
                f8n0 f8n0Var = f8n0.a;
                if (hllVar == null || (list = hllVar.d) == null || !list.contains(fll.c)) {
                    Observable observableJust = Observable.just(f8n0Var);
                    observableJust.getClass();
                    return observableJust;
                }
                rok0 rok0Var = rsf1Var.s;
                huz x010Var = (((eu4) rok0Var.c).j() && (p8n0VarA = ((r8n0) rok0Var.b).a(str)) != null) ? new x010(p8n0VarA.j, rqt0.u(new m441(new xd1(p8n0VarA, link, (lnm) null, (byte) 14))), new lok0(3, (lnm) null, (byte) 3), (byte) 1) : new huz(f8n0Var, (byte) 10);
                Observable observableOnErrorReturnItem = yoi1.i(x010Var, o6x.a).onErrorReturnItem(f8n0Var);
                observableOnErrorReturnItem.getClass();
                return observableOnErrorReturnItem;
            case 20:
            default:
                return new mmr0(new mmr0(((uv00) obj).a(mdz.class, (String) obj2).b, ((mmr0) this.c).a), (va81) this.d);
            case 21:
                Integer num = (Integer) obj;
                spq0 spq0Var = (spq0) this.d;
                String str2 = ((me20) obj2).d;
                return str2 != null ? ((uny) ((yfu) ((g7t) this.c).c).c).l(str2).map(bjx0.T0).map(new ffe1(spq0Var, num, (byte) 8)) : Single.just(new hvf1((ContextTrack) spq0Var.h(), (Integer) null, num.intValue()));
            case 22:
                Boolean bool = (Boolean) obj;
                s4b1 s4b1Var = (s4b1) this.d;
                qwf1 qwf1Var = (qwf1) obj2;
                if (!qwf1Var.t.d || !bool.booleanValue()) {
                    return !qwf1Var.h.a() ? qwf1Var.d(s4b1Var) : qwf1Var.b(s4b1Var).flatMap(new pwf1(qwf1Var, s4b1Var));
                }
                return Single.just(new drn0(new Intent((Intent) this.c).setData(Uri.parse("spotify:internal:multi-song-track:" + s4b1Var.h() + "")).putExtra("is_internal_navigation", true)));
        }
    }

    public void b(n3d1 n3d1Var, Map.Entry entry) {
        final n3d1 n3d1Var2 = (n3d1) entry.getValue();
        final l29 l29Var = null;
        final l29 l29Var2 = new l29(n3d1Var.g.a, ((o19) entry.getKey()).d, n3d1Var.c ? (n3d) this.c : null, ((o19) entry.getKey()).f, ((o19) entry.getKey()).g);
        final int i = ((o19) entry.getKey()).c;
        n3d1Var2.getClass();
        w8p1.m();
        n3d1Var2.a();
        o0c.q("Consumer can only be linked once.", !n3d1Var2.j);
        n3d1Var2.j = true;
        final m3d1 m3d1Var = n3d1Var2.l;
        dce dceVarJ = poz0.J(m3d1Var.c(), new ci7() { // from class: p.l3d1
            public final n8d0 apply(Object obj) {
                m3d1 m3d1Var2 = m3d1Var;
                Surface surface = (Surface) obj;
                n3d1 n3d1Var3 = n3d1Var2;
                n3d1Var3.getClass();
                surface.getClass();
                try {
                    m3d1Var2.d();
                    d4d1 d4d1Var = new d4d1(surface, i, n3d1Var3.g.a, l29Var2, l29Var);
                    d4d1Var.t.b.b(new j3d1(m3d1Var2, (byte) 0), n5u.a());
                    o0c.q("Consumer can only be linked once.", m3d1Var2.r == null);
                    m3d1Var2.r = d4d1Var;
                    return poz0.B(d4d1Var);
                } catch (DeferrableSurface$SurfaceClosedException e) {
                    return new e280(e, (byte) 1);
                }
            }
        }, x2g0.A());
        dceVarJ.b(new nx30((Object) dceVarJ, (Object) new esa1(this, n3d1Var2), (byte) 0), x2g0.A());
    }

    public y9e1 c(x9e1 x9e1Var) {
        y9e1 y9e1Var;
        osc oscVar = new osc(x9e1Var);
        ydf0 ydf0Var = (ydf0) this.b;
        if (ydf0Var != null) {
            y9e1Var = (y9e1) ydf0Var.c(oscVar);
        } else {
            if (!u890.j((osc) this.c, oscVar)) {
                return null;
            }
            y9e1Var = (y9e1) this.d;
        }
        if (y9e1Var == null || y9e1Var.b.a.a()) {
            return null;
        }
        return y9e1Var;
    }

    public boolean d(int i, boolean z) {
        return ((TypedArray) this.c).getBoolean(i, z);
    }

    public int e() {
        return ((TypedArray) this.c).getColor(0, 0);
    }

    public void f(int i, j2i j2iVar, b0k b0kVar) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1064686090);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            es41 es41Var = (es41) this.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = l6o1.H(nim0Var, es41Var, false, 14);
            y7e1 y7e1Var = (y7e1) this.c;
            String str = (String) this.d;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (y7e1Var.d().d.length() == 0) {
                x340Var.i0(1358958556);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                long j = cbx.a(x340Var).b.b;
                zic0 zic0Var = new zic0(1);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = vxd1.Z0;
                    x340Var.s0(objT);
                }
                z = true;
                uwo1.e(str, s161.a(nim0Var, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var, 0, 0, 1712);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(1359320450);
                x340Var.r(false);
            }
            k4s0.i(6, j2iVar, x340Var, z, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(this, j2iVar, i, (byte) 24);
        }
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList colorStateListE;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListE = x74.E((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListE;
    }

    public int h(int i, int i2) {
        return ((TypedArray) this.c).getDimensionPixelOffset(i, i2);
    }

    public int i(int i, int i2) {
        return ((TypedArray) this.c).getDimensionPixelSize(i, i2);
    }

    public l420 j() {
        return (l420) this.b;
    }

    public Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : f0o1.j((Context) this.b, resourceId);
    }

    public Drawable l(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        ck5 ck5VarA = ck5.a();
        Context context = (Context) this.b;
        synchronized (ck5VarA) {
            drawableE = ck5VarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface m(int i, int i2, xk5 xk5Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.d;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.d = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.b;
        ThreadLocal threadLocal = qx21.a;
        if (context.isRestricted()) {
            return null;
        }
        return qx21.c(context, resourceId, typedValue2, i2, xk5Var, true, false);
    }

    public int n(int i, int i2) {
        return ((TypedArray) this.c).getInt(i, i2);
    }

    public int o(int i, int i2) {
        return ((TypedArray) this.c).getInteger(i, i2);
    }

    public void onFailure(Throwable th) {
        boolean z = th instanceof CancellationException;
        mzc mzcVar = (mzc) this.c;
        if (z) {
            o0c.q((String) null, mzcVar.c(new h4d1(((String) this.d).concat(" cancelled."), th)));
        } else {
            mzcVar.b((Object) null);
        }
    }

    public void onSuccess(Object obj) {
        poz0.G(true, (n8d0) this.b, (mzc) this.c, n5u.a());
    }

    public int q(int i, int i2) {
        return ((TypedArray) this.c).getResourceId(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList r(i4i1 i4i1Var) {
        Size[] sizeArr;
        Rational rational;
        l3d l3dVar = (l3d) this.b;
        cx70 cx70Var = (cx70) i4i1Var;
        List list = (List) cx70Var.h(cx70.V, (Object) null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        ft21 ft21Var = (ft21) cx70Var.h(cx70.U, (Object) null);
        List list2 = (List) cx70Var.h(cx70.T, (Object) null);
        int iM = i4i1Var.m();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iM) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = l3dVar.g(iM);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        Collections.sort(arrayList2, new oxh((byte) 0, true));
        if (arrayList2.isEmpty()) {
            j2h1.M("SupportedOutputSizesCollector");
        }
        if (ft21Var != null) {
            Size size = (Size) ((cx70) i4i1Var).h(cx70.S, (Object) null);
            cx70Var.p();
            if (!((Boolean) i4i1Var.h(i4i1.H0, Boolean.FALSE)).booleanValue()) {
                int iM2 = i4i1Var.m();
                if (ft21Var.c) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(l3dVar.e(iM2));
                    Collections.sort(arrayList3, new oxh((byte) 0, true));
                    arrayList2 = arrayList3;
                }
            }
            ft21 ft21Var2 = (ft21) cx70Var.e(cx70.U);
            Rational rational2 = (Rational) this.c;
            bbn bbnVar = ft21Var2.a;
            HashMap mapX = x(arrayList2);
            boolean z = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
            bbnVar.getClass();
            Rational rationalU = u(0, z);
            ArrayList<Rational> arrayList4 = new ArrayList(mapX.keySet());
            Collections.sort(arrayList4, new f57(rationalU, rational2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Rational rational3 : arrayList4) {
                linkedHashMap.put(rational3, (List) mapX.get(rational3));
            }
            if (size != null) {
                Size size2 = d391.a;
                int height = size.getHeight() * size.getWidth();
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (it2.hasNext()) {
                    List<Size> list3 = (List) linkedHashMap.get((Rational) it2.next());
                    ArrayList arrayList5 = new ArrayList();
                    for (Size size3 : list3) {
                        if (d391.a(size3) <= height) {
                            arrayList5.add(size3);
                        }
                    }
                    list3.clear();
                    list3.addAll(arrayList5);
                }
            }
            gt21 gt21Var = ft21Var2.b;
            if (gt21Var != null) {
                Iterator it3 = linkedHashMap.keySet().iterator();
                while (it3.hasNext()) {
                    List list4 = (List) linkedHashMap.get((Rational) it3.next());
                    if (!list4.isEmpty()) {
                        boolean z2 = gt21Var.b;
                        if (gt21Var != gt21.c) {
                            Size size4 = gt21Var.a;
                            if (z2 == 0) {
                                boolean zContains = list4.contains(size4);
                                list4.clear();
                                if (zContains) {
                                    list4.add(size4);
                                }
                            } else if (z2 == 1) {
                                N(list4, size4, true);
                            } else if (z2 == 2) {
                                N(list4, size4, false);
                            } else if (z2 == 3) {
                                O(list4, size4, true);
                            } else if (z2 == 4) {
                                O(list4, size4, false);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = linkedHashMap.values().iterator();
            while (it4.hasNext()) {
                for (Size size5 : (List) it4.next()) {
                    if (!arrayList6.contains(size5)) {
                        arrayList6.add(size5);
                    }
                }
            }
            return arrayList6;
        }
        cr50 cr50Var = (cr50) this.d;
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList<Size> arrayList7 = new ArrayList(arrayList2);
        Collections.sort(arrayList7, new oxh((byte) 0, true));
        ArrayList arrayList8 = new ArrayList();
        cx70 cx70Var2 = (cx70) i4i1Var;
        Size size6 = (Size) cx70Var2.h(cx70.S, (Object) null);
        Size size7 = (Size) arrayList7.get(0);
        if (size6 == null) {
            size6 = size7;
        } else if (d391.a(size7) < size6.getHeight() * size6.getWidth()) {
            size6 = size7;
        }
        Size sizeA = cr50Var.a(cx70Var2);
        Size size8 = d391.b;
        int iA = d391.a(size8);
        if (d391.a(size6) < iA) {
            size8 = d391.a;
        } else if (sizeA != null) {
            if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                size8 = sizeA;
            }
        }
        for (Size size9 : arrayList7) {
            if (d391.a(size9) <= size6.getHeight() * size6.getWidth()) {
                if (size9.getHeight() * size9.getWidth() >= d391.a(size8) && !arrayList8.contains(size9)) {
                    arrayList8.add(size9);
                }
            }
        }
        if (arrayList8.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size8 + "\nmaxSize = " + size6 + "\ninitial size list: " + arrayList7);
        }
        sy8 sy8Var = cx70.M;
        if (cx70Var2.g(sy8Var)) {
            rational = u(((Integer) cx70Var2.e(sy8Var)).intValue(), cr50Var.c);
        } else {
            Size sizeA2 = cr50Var.a(cx70Var2);
            if (sizeA2 != null) {
                Iterator it5 = p(arrayList8).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                        break;
                    }
                    Rational rational4 = (Rational) it5.next();
                    if (g57.a(rational4, sizeA2)) {
                        rational = rational4;
                        break;
                    }
                }
            } else {
                rational = null;
            }
        }
        if (sizeA == null) {
            sizeA = (Size) cx70Var2.h(cx70.R, (Object) null);
        }
        ArrayList arrayList9 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList9.addAll(arrayList8);
            if (sizeA != null) {
                N(arrayList9, sizeA, true);
                return arrayList9;
            }
        } else {
            HashMap mapX2 = x(arrayList8);
            if (sizeA != null) {
                Iterator it6 = mapX2.keySet().iterator();
                while (it6.hasNext()) {
                    N((List) mapX2.get((Rational) it6.next()), sizeA, true);
                }
            }
            ArrayList arrayList10 = new ArrayList(mapX2.keySet());
            Collections.sort(arrayList10, new f57(rational, (Rational) cr50Var.d));
            Iterator it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                for (Size size10 : (List) mapX2.get((Rational) it7.next())) {
                    if (!arrayList9.contains(size10)) {
                        arrayList9.add(size10);
                    }
                }
            }
        }
        return arrayList9;
    }

    public String s(int i) {
        return ((TypedArray) this.c).getString(i);
    }

    public String t(String str) {
        return (String) ((HashMap) this.d).get(str);
    }

    public CharSequence v(int i) {
        return ((TypedArray) this.c).getText(i);
    }

    public TypedArray w() {
        return (TypedArray) this.c;
    }

    public boolean y(int i) {
        return ((TypedArray) this.c).hasValue(i);
    }

    public void z() {
        ParagraphView paragraphView = (ParagraphView) this.b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        qye1 qye1Var = (qye1) this.c;
        paragraphView.x(qye1Var.h);
        ParagraphView paragraphView2 = (ParagraphView) this.d;
        paragraphView2.setVisibility(0);
        paragraphView2.setTranslationY(0.0f);
        paragraphView2.setAlpha(0.0f);
        paragraphView2.x(qye1Var.i);
    }

    public /* synthetic */ lvc1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lvc1(String str, hn60 hn60Var) {
        this(hn60Var.b.k(str), hn60Var);
        this.a = (byte) 6;
    }

    public lvc1(hsq hsqVar) {
        this.a = (byte) 8;
        this.b = hsqVar;
        this.c = new txk0((byte) 24);
        this.d = new idd1(new fjc1(this, (byte) 14));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    public lvc1(l420 l420Var, hn60 hn60Var) throws lcd1 {
        this.a = (byte) 6;
        this.b = l420Var;
        this.c = hn60Var;
        this.d = new HashMap();
        oi oiVar = hn60Var.b;
        l420 l420VarP = oiVar.p(l420Var, ".tag");
        File file = l420VarP.b;
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) oiVar.j(l420VarP), one.b));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedReader);
                    for (Map.Entry entry : properties.entrySet()) {
                        ((HashMap) this.d).put(entry.getKey().toString(), entry.getValue().toString());
                    }
                    uh70.a(bufferedReader);
                } catch (Throwable th) {
                    uh70.a(bufferedReader);
                    throw th;
                }
            } catch (IOException e) {
                String message = e.getMessage();
                message.getClass();
                throw new lcd1(message);
            }
        }
    }

    public lvc1(i8h1 i8h1Var, String str, b2r0 b2r0Var) {
        this.a = (byte) 17;
        this.b = i8h1Var;
        this.c = b2r0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new dsk0(yon1.G1("BLEND_ENTITY_TRACKAFFILIATION", "blend/entity/trackaffiliation", 219, "blend").c, str, (byte) 1);
    }

    public /* synthetic */ lvc1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lvc1(ConstraintLayout constraintLayout, IconArrowUp iconArrowUp, TextView textView, ConstraintLayout constraintLayout2) {
        this.a = (byte) 4;
        this.b = iconArrowUp;
        this.c = textView;
        this.d = constraintLayout2;
    }

    public lvc1(Flowable flowable, FlowableMap flowableMap) {
        this.a = (byte) 20;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.J(kcx0.T0).t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        this.b = new kge((moy0) flowableDistinctUntilChangedT);
        bpb1 bpb1VarB = gio1.b("");
        this.c = bpb1VarB;
        this.d = rqt0.w(hu20.e(new x010(new h4f1(bpb1VarB, (byte) 1), new kge((moy0) flowableMap), new b801(3, (lnm) null, (byte) 2), (byte) 1), new afb1((lnm) null, this, (byte) 4)), new ps20(new n811(), (byte) 0), rqt0.b);
    }

    public lvc1(l3d l3dVar, Size size) {
        Rational rational;
        boolean z = true;
        this.a = (byte) 1;
        this.b = l3dVar;
        l3dVar.a();
        l3dVar.d();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listG = l3dVar.g(SemanticState.Hidden);
            if (listG.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listG, new oxh((byte) 0, false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.c = rational;
        cr50 cr50Var = new cr50();
        cr50Var.a = l3dVar.a();
        cr50Var.b = l3dVar.d();
        cr50Var.d = rational;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        cr50Var.c = z;
        this.d = cr50Var;
    }

    public lvc1(n3d n3dVar, rts rtsVar) {
        this.a = (byte) 2;
        this.c = n3dVar;
        this.b = rtsVar;
    }

    public lvc1(int i) {
        this.a = (byte) 10;
        this.b = i != 1 ? new ydf0(i) : null;
    }
}
