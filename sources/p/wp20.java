package p;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.player.model.ContextTrack;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wp20 implements h0x, Function, p2r0, k2i1, uor0 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public wp20(List list, af5 af5Var, wat watVar, f930 f930Var, lee1 lee1Var, boolean z) {
        int i;
        af5 af5Var2 = af5Var;
        lee1 lee1Var2 = lee1Var;
        this.a = af5Var2;
        this.b = list;
        final byte b = 0;
        this.c = dm5.S(3, new Function0(this) { // from class: p.asm0
            public final /* synthetic */ wp20 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                Object obj = null;
                int i2 = 1;
                wp20 wp20Var = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) wp20Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fE = ((tor0) obj2).a.e();
                            int iL = p7h.L(arrayList);
                            if (1 <= iL) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fE2 = ((tor0) obj3).a.e();
                                    if (Float.compare(fE, fE2) < 0) {
                                        obj2 = obj3;
                                        fE = fE2;
                                    }
                                    if (i2 != iL) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        tor0 tor0Var = (tor0) obj;
                        return Float.valueOf(tor0Var != null ? tor0Var.a.e() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) wp20Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fA = ((tor0) obj4).a.i.a();
                            int iL2 = p7h.L(arrayList2);
                            if (1 <= iL2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fA2 = ((tor0) obj5).a.i.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj4 = obj5;
                                        fA = fA2;
                                    }
                                    if (i2 != iL2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        tor0 tor0Var2 = (tor0) obj;
                        return Float.valueOf(tor0Var2 != null ? tor0Var2.a.i.a() : 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.d = dm5.S(3, new Function0(this) { // from class: p.asm0
            public final /* synthetic */ wp20 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                Object obj = null;
                int i2 = 1;
                wp20 wp20Var = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) wp20Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fE = ((tor0) obj2).a.e();
                            int iL = p7h.L(arrayList);
                            if (1 <= iL) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fE2 = ((tor0) obj3).a.e();
                                    if (Float.compare(fE, fE2) < 0) {
                                        obj2 = obj3;
                                        fE = fE2;
                                    }
                                    if (i2 != iL) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        tor0 tor0Var = (tor0) obj;
                        return Float.valueOf(tor0Var != null ? tor0Var.a.e() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) wp20Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fA = ((tor0) obj4).a.i.a();
                            int iL2 = p7h.L(arrayList2);
                            if (1 <= iL2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fA2 = ((tor0) obj5).a.i.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj4 = obj5;
                                        fA = fA2;
                                    }
                                    if (i2 != iL2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        tor0 tor0Var2 = (tor0) obj;
                        return Float.valueOf(tor0Var2 != null ? tor0Var2.a.i.a() : 0.0f);
                }
            }
        });
        cpr0 cpr0Var = lee1Var2.b;
        af5 af5Var3 = bf5.a;
        ArrayList arrayList = af5Var2.d;
        String str = af5Var2.b;
        List list2 = z6x.a;
        List listA1 = arrayList != null ? o7h.a1(arrayList, new k0d((byte) 21)) : list2;
        ArrayList arrayList2 = new ArrayList();
        n36 n36Var = new n36();
        int size = listA1.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            ze5 ze5Var = (ze5) listA1.get(i2);
            ze5 ze5VarA = ze5.a(ze5Var, cpr0Var.a((cpr0) ze5Var.a), b, b, 14);
            Object obj = ze5VarA.a;
            int i4 = ze5VarA.c;
            int i5 = ze5VarA.b;
            while (i3 < i5 && !n36Var.isEmpty()) {
                ze5 ze5Var2 = (ze5) n36Var.last();
                listA1 = listA1;
                int i6 = ze5Var2.c;
                list2 = list2;
                Object obj2 = ze5Var2.a;
                if (i5 < i6) {
                    arrayList2.add(new ze5(i3, i5, obj2));
                    i3 = i5;
                } else {
                    int i7 = size;
                    arrayList2.add(new ze5(i3, i6, obj2));
                    i3 = ze5Var2.c;
                    while (!n36Var.isEmpty() && i3 == ((ze5) n36Var.last()).c) {
                        n36Var.removeLast();
                    }
                    size = i7;
                }
            }
            List list3 = listA1;
            List list4 = list2;
            int i8 = size;
            if (i3 < i5) {
                arrayList2.add(new ze5(i3, i5, cpr0Var));
                i3 = i5;
            }
            ze5 ze5Var3 = (ze5) n36Var.k();
            if (ze5Var3 != null) {
                int i9 = ze5Var3.c;
                Object obj3 = ze5Var3.a;
                int i10 = ze5Var3.b;
                if (i10 == i5 && i9 == i4) {
                    n36Var.removeLast();
                    n36Var.addLast(new ze5(i5, i4, ((cpr0) obj3).a((cpr0) obj)));
                } else if (i10 == i9) {
                    arrayList2.add(new ze5(i10, i9, obj3));
                    n36Var.removeLast();
                    n36Var.addLast(new ze5(i5, i4, obj));
                } else {
                    if (i9 < i4) {
                        bhn0.q();
                        throw null;
                    }
                    n36Var.addLast(new ze5(i5, i4, ((cpr0) obj3).a((cpr0) obj)));
                }
            } else {
                n36Var.addLast(new ze5(i5, i4, obj));
            }
            i2++;
            listA1 = list3;
            list2 = list4;
            size = i8;
            b = 0;
        }
        List list5 = list2;
        while (i3 <= str.length() && !n36Var.isEmpty()) {
            ze5 ze5Var4 = (ze5) n36Var.last();
            Object obj4 = ze5Var4.a;
            int i11 = ze5Var4.c;
            arrayList2.add(new ze5(i3, i11, obj4));
            while (!n36Var.isEmpty() && i11 == ((ze5) n36Var.last()).c) {
                n36Var.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str.length()) {
            arrayList2.add(new ze5(i3, str.length(), cpr0Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ze5(0, 0, cpr0Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i12 = i;
        while (i12 < size2) {
            ze5 ze5Var5 = (ze5) arrayList2.get(i12);
            int i13 = ze5Var5.b;
            int i14 = ze5Var5.c;
            String strSubstring = i13 != i14 ? str.substring(i13, i14) : "";
            List listA = bf5.a(af5Var2, i13, i14, new z9((byte) 21));
            af5 af5Var4 = new af5(strSubstring, listA == null ? list5 : listA);
            cpr0 cpr0Var2 = (cpr0) ze5Var5.a;
            if (cpr0Var2.b == 0) {
                cpr0Var2 = new cpr0(cpr0Var2.a, cpr0Var.b, cpr0Var2.c, cpr0Var2.d, cpr0Var2.e, cpr0Var2.f, cpr0Var2.g, cpr0Var2.h, cpr0Var2.i);
            }
            lee1 lee1Var3 = new lee1(lee1Var2.a, cpr0Var.a(cpr0Var2));
            List list6 = af5Var4.a;
            List list7 = list6 == null ? list5 : list6;
            List list8 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list8.size());
            int size3 = list8.size();
            int i15 = 0;
            while (i15 < size3) {
                ze5 ze5Var6 = (ze5) list8.get(i15);
                cpr0 cpr0Var3 = cpr0Var;
                int i16 = ze5Var6.b;
                lee1 lee1Var4 = lee1Var3;
                int i17 = ze5Var6.c;
                if (bf5.b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        rf80.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new ze5(i16 - i13, i17 - i13, ze5Var6.a));
                }
                i15++;
                list8 = list8;
                lee1Var3 = lee1Var4;
                cpr0Var = cpr0Var3;
            }
            arrayList3.add(new tor0(new rw4(strSubstring, lee1Var3, list7, arrayList4, f930Var, watVar, z), i13, i14));
            i12++;
            af5Var2 = af5Var;
            lee1Var2 = lee1Var;
            str = str;
        }
        this.e = arrayList3;
    }

    public static int[] S(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            vp20 vp20Var = (vp20) it.next();
            int i3 = vp20Var.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, vp20Var.b);
            i2++;
        }
        return iArr;
    }

    public static ArrayList n(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        tp20 tp20Var = new tp20();
        tp20Var.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(tp20Var);
            }
            arrayList.add((tp20) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(tp20Var);
            }
        }
        return arrayList;
    }

    public List A() {
        return (ArrayList) this.e;
    }

    public j9c0 B(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                for (j9c0 j9c0Var : ((HashMap) this.c).keySet()) {
                    if (iac0Var.equals(j9c0Var.b)) {
                        return j9c0Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List C() {
        return (List) this.b;
    }

    public boolean D(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                j9c0 j9c0VarB = B(iac0Var);
                if (j9c0VarB == null) {
                    return false;
                }
                Iterator it = ((Set) ((HashMap) this.c).get(j9c0VarB)).iterator();
                while (it.hasNext()) {
                    i9c0 i9c0Var = (i9c0) ((HashMap) this.b).get((i19) it.next());
                    i9c0Var.getClass();
                    if (!i9c0Var.b().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E(View view, String str, long j) {
        Object tag = view.getTag(2131428133);
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        view.setTag(2131428133, null);
        long jB = ((yqg) this.a).b();
        if (jB >= j) {
            view.clearAnimation();
            view.setBackgroundColor(0);
            return;
        }
        ((LinkedHashMap) this.d).put(str, Long.valueOf(j));
        view.setBackgroundColor(((TypedValue) this.b).data);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ryd(view, (byte) 1));
        valueAnimatorOfInt.setStartDelay(j - jB);
        valueAnimatorOfInt.start();
        view.setTag(2131428133, valueAnimatorOfInt);
    }

    public void F(View view, ekh ekhVar) {
        Comment comment = ekhVar.b;
        boolean z = comment.p() == 1 && u890.j(comment.E().getUsername(), (String) this.c);
        long jB = ((yqg) this.a).b();
        Long l = (Long) ((LinkedHashMap) this.d).get(comment.r());
        long jLongValue = 0;
        if (z && l != null && l.longValue() - jB > 0) {
            jLongValue = l.longValue();
        } else if (z && jB - comment.t() < 3000) {
            jLongValue = jB + 3000;
        }
        E(view, comment.r(), jLongValue);
    }

    public void G(View view, hkh hkhVar) {
        Reply reply = hkhVar.b;
        boolean z = reply.n() == 1 && u890.j(reply.x().getUsername(), (String) this.c);
        long jB = ((yqg) this.a).b();
        Long l = (Long) ((LinkedHashMap) this.d).get(reply.o());
        long jLongValue = 0;
        if (z && l != null && l.longValue() - jB > 0) {
            jLongValue = l.longValue();
        } else if (z && jB - reply.p() < 3000) {
            jLongValue = jB + 3000;
        }
        E(view, reply.o(), jLongValue);
    }

    public void H(View view, tp20 tp20Var, int i, int i2, int i3, int i4) {
        sp20 sp20Var = (sp20) view.getLayoutParams();
        rp20 rp20Var = (rp20) this.a;
        int alignItems = rp20Var.getAlignItems();
        if (sp20Var.E() != -1) {
            alignItems = sp20Var.E();
        }
        int i5 = tp20Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (rp20Var.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - sp20Var.E0(), i3, i6 - sp20Var.E0());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int iR = sp20Var.R() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, iR, i3, sp20Var.R() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iR2 = ((sp20Var.R() + (i5 - view.getMeasuredHeight())) - sp20Var.E0()) / 2;
                if (rp20Var.getFlexWrap() != 2) {
                    int i7 = i2 + iR2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iR2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = rp20Var.getFlexWrap();
                int i9 = tp20Var.l;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), sp20Var.R());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), sp20Var.E0());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (rp20Var.getFlexWrap() != 2) {
            view.layout(i, sp20Var.R() + i2, i3, sp20Var.R() + i4);
        } else {
            view.layout(i, i2 - sp20Var.E0(), i3, i4 - sp20Var.E0());
        }
    }

    public void I(View view, tp20 tp20Var, boolean z, int i, int i2, int i3, int i4) {
        sp20 sp20Var = (sp20) view.getLayoutParams();
        int alignItems = ((rp20) this.a).getAlignItems();
        if (sp20Var.E() != -1) {
            alignItems = sp20Var.E();
        }
        int i5 = tp20Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - sp20Var.X0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - sp20Var.X0(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(sp20Var.F0() + measuredWidth + (i - i5), i2, sp20Var.F0() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - sp20Var.X0(), i2, i3 - sp20Var.X0(), i4);
        } else {
            view.layout(sp20Var.F0() + i, i2, sp20Var.F0() + i3, i4);
        }
    }

    public void J(Context context, boolean z) {
        View viewInflate = ((LayoutInflater) this.e).inflate(context.getResources().getLayout(2131625132), (ViewGroup) null);
        Button button = (Button) viewInflate.findViewById(2131429755);
        TextView textView = (TextView) viewInflate.findViewById(2131429756);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, 5).setView(viewInflate).create();
        if (!z) {
            textView.setVisibility(8);
        }
        button.setOnClickListener(new hid0(alertDialogCreate, (byte) 0));
        alertDialogCreate.show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r11 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object K(p.km61 r7, p.qxn0 r8, java.lang.String r9, p.tqw r10, p.onm r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof p.vxn0
            if (r0 == 0) goto L13
            r0 = r11
            p.vxn0 r0 = (p.vxn0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.vxn0 r0 = new p.vxn0
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            p.rih1 r2 = p.rih1.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r11)
            return r2
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r5
        L31:
            p.hm5.M(r11)
            goto L6b
        L35:
            p.hm5.M(r11)
            p.pxn0 r8 = r8.b
            boolean r11 = r8 instanceof p.nxn0
            if (r11 == 0) goto L4a
            java.lang.Object r6 = r6.a
            p.lzn0 r6 = (p.lzn0) r6
            p.nxn0 r8 = (p.nxn0) r8
            android.os.Bundle r7 = r8.b
            p.hqn1.q(r6, r9, r10, r7)
            return r2
        L4a:
            boolean r11 = r8 instanceof p.oxn0
            p.d9n r1 = p.d9n.a
            if (r11 == 0) goto L78
            android.net.Uri r7 = android.net.Uri.parse(r9)
            p.oxn0 r8 = (p.oxn0) r8
            boolean r8 = r8.b
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r6.b
            p.g341 r8 = (p.g341) r8
            io.reactivex.rxjava3.core.Single r7 = r8.c(r7)
            r0.c = r4
            java.lang.Object r11 = p.fc11.j(r7, r0)
            if (r11 != r1) goto L6b
            goto L8e
        L6b:
            r7 = r11
            android.net.Uri r7 = (android.net.Uri) r7
        L6e:
            java.lang.Object r6 = r6.d
            p.z710 r6 = (p.z710) r6
            r8 = 0
            r9 = 6
            p.z710.c(r6, r7, r8, r9)
            return r2
        L78:
            boolean r6 = r8 instanceof p.mxn0
            if (r6 == 0) goto L90
            p.mxn0 r8 = (p.mxn0) r8
            p.zu30 r6 = r8.c
            if (r10 == 0) goto L86
            p.tv80 r5 = p.n3o1.y(r10)
        L86:
            r0.c = r3
            java.lang.Object r6 = r6.J(r7, r9, r5, r0)
            if (r6 != r1) goto L8f
        L8e:
            return r1
        L8f:
            return r2
        L90:
            p.eg.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wp20.K(p.km61, p.qxn0, java.lang.String, p.tqw, p.onm):java.lang.Object");
    }

    public void L(i9c0 i9c0Var) {
        iac0 iac0Var;
        synchronized (this.a) {
            try {
                synchronized (i9c0Var.a) {
                    iac0Var = i9c0Var.b;
                }
                a5d a5dVar = i9c0Var.c;
                i19 i19Var = new i19(iac0Var, a5d.t(a5dVar.P0, a5dVar.Q0));
                j9c0 j9c0VarB = B(iac0Var);
                Set hashSet = j9c0VarB != null ? (Set) ((HashMap) this.c).get(j9c0VarB) : new HashSet();
                hashSet.add(i19Var);
                ((HashMap) this.b).put(i19Var, i9c0Var);
                if (j9c0VarB == null) {
                    j9c0 j9c0Var = new j9c0(iac0Var, this);
                    ((HashMap) this.c).put(j9c0Var, hashSet);
                    iac0Var.getLifecycle().a(j9c0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CompletableResumeNext M(Context context) {
        return gid0.a((gid0) this.a, (String) null, 1, (Object) null).subscribeOn((Scheduler) this.c).observeOn((Scheduler) this.d).flatMapCompletable(new ye90(this, context, (byte) 26)).p(new fad0(this, context, (byte) 1));
    }

    public mr20 N(ContextTrack contextTrack) {
        huz huzVarE;
        if (!((at4) this.e).j() || l4o1.C(contextTrack)) {
            String strA0 = l4o1.a0(contextTrack, "image_url");
            return new huz(strA0 != null ? strA0 : "", (byte) 10);
        }
        String strB0 = l4o1.b0(contextTrack);
        if (strB0.length() == 0) {
            return new huz("", (byte) 10);
        }
        q0i0 q0i0Var = (q0i0) this.d;
        q0i0Var.getClass();
        boolean zM = f7p1.m(strB0);
        vu21 vu21Var = tu21.a;
        if (zM) {
            mq70 mq70Var = d7p1.k(strB0).a;
            if (!mq70Var.a.isEmpty()) {
                vu21Var = new vu21(mq70Var);
            }
            huzVarE = new huz(vu21Var, (byte) 10);
        } else {
            huzVarE = hu20.e(q0i0Var.a, new c6e0((lnm) null, new n0i0(strB0, q0i0Var, (byte) 1), vu21Var, (byte) 2));
        }
        return new f8f0(huzVarE, (byte) 18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void O(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                if (D(iac0Var)) {
                    if (((ArrayDeque) this.d).isEmpty()) {
                        ((ArrayDeque) this.d).push(iac0Var);
                    } else {
                        fdc fdcVar = (fdc) this.e;
                        if (fdcVar == null || fdcVar.b != 2) {
                            iac0 iac0Var2 = (iac0) ((ArrayDeque) this.d).peek();
                            if (!iac0Var.equals(iac0Var2)) {
                                W(iac0Var2);
                                ((ArrayDeque) this.d).remove(iac0Var);
                                ((ArrayDeque) this.d).push(iac0Var);
                            }
                        }
                    }
                    Z(iac0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void P(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                ((ArrayDeque) this.d).remove(iac0Var);
                W(iac0Var);
                if (!((ArrayDeque) this.d).isEmpty()) {
                    Z((iac0) ((ArrayDeque) this.d).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Q(int i, View.OnClickListener onClickListener) {
        dg30 dg30Var = (dg30) this.d;
        er91 er91Var = new er91((fs91) null, dg30Var.getString(i), (Integer) null, dg30Var.getString(2131959894), (Integer) null, onClickListener, (cvr) null, (xq91) null, false);
        kt91 kt91Var = (kt91) this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }

    public void R(int i, int i2, tp20 tp20Var, int i3, int i4, boolean z) {
        float f;
        boolean z2;
        int iMax;
        boolean z3;
        int iY0;
        float f2;
        rp20 rp20Var = (rp20) this.a;
        int i5 = tp20Var.e;
        float f3 = tp20Var.k;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        tp20Var.e = i4 + tp20Var.f;
        if (!z) {
            tp20Var.g = os00.INVALID_ID;
        }
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < tp20Var.h) {
            int i8 = tp20Var.o + i6;
            View viewG = rp20Var.g(i8);
            if (viewG == null || viewG.getVisibility() == 8) {
                f = f4;
                f5 = f5;
                z2 = z4;
                i6 = i6;
            } else {
                sp20 sp20Var = (sp20) viewG.getLayoutParams();
                int flexDirection = rp20Var.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f5 = f5;
                    z2 = z4;
                    int measuredWidth = viewG.getMeasuredWidth();
                    long[] jArr = (long[]) this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewG.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.b)[i8] || sp20Var.G() <= f) {
                        i6 = i6;
                    } else {
                        float fG = measuredWidth - (sp20Var.G() * f5);
                        if (i6 == tp20Var.h - 1) {
                            fG += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fG);
                        if (iRound < sp20Var.J()) {
                            iRound = sp20Var.J();
                            ((boolean[]) this.b)[i8] = true;
                            tp20Var.k -= sp20Var.G();
                            z2 = true;
                        } else {
                            float f7 = (fG - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                            f6 = f7;
                        }
                        int iY = y(i2, sp20Var, tp20Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewG.measure(iMakeMeasureSpec, iY);
                        int measuredWidth2 = viewG.getMeasuredWidth();
                        int measuredHeight2 = viewG.getMeasuredHeight();
                        a0(i8, iMakeMeasureSpec, iY, viewG);
                        rp20Var.e(viewG, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, rp20Var.f(viewG) + sp20Var.E0() + sp20Var.R() + measuredHeight);
                    tp20Var.e = sp20Var.X0() + sp20Var.F0() + measuredWidth + tp20Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewG.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewG.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.b)[i8] || sp20Var.G() <= f) {
                        z3 = z4;
                    } else {
                        float fG2 = measuredHeight3 - (sp20Var.G() * f5);
                        if (i6 == tp20Var.h - 1) {
                            fG2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fG2);
                        if (iRound2 < sp20Var.Y0()) {
                            iY0 = sp20Var.Y0();
                            ((boolean[]) this.b)[i8] = true;
                            tp20Var.k -= sp20Var.G();
                            z3 = true;
                        } else {
                            float f8 = (fG2 - iRound2) + f6;
                            boolean z5 = z4;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iY0 = iRound2 + 1;
                                f2 = f8 - 1.0f;
                            } else if (d2 < -1.0d) {
                                iY0 = iRound2 - 1;
                                f2 = f8 + 1.0f;
                            } else {
                                iY0 = iRound2;
                                z3 = z5;
                                f6 = f8;
                            }
                            f6 = f2;
                            z3 = z5;
                        }
                        int iZ = z(i, sp20Var, tp20Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iY0, 1073741824);
                        viewG.measure(iZ, iMakeMeasureSpec2);
                        int measuredWidth4 = viewG.getMeasuredWidth();
                        int measuredHeight4 = viewG.getMeasuredHeight();
                        a0(i8, iZ, iMakeMeasureSpec2, viewG);
                        rp20Var.e(viewG, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, rp20Var.f(viewG) + sp20Var.X0() + sp20Var.F0() + measuredWidth3);
                    tp20Var.e = sp20Var.E0() + sp20Var.R() + measuredHeight3 + tp20Var.e;
                    z2 = z3;
                    i6 = i6;
                }
                tp20Var.g = Math.max(tp20Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            z4 = z2;
            f5 = f5;
        }
        if (!z4 || i5 == tp20Var.e) {
            return;
        }
        R(i, i2, tp20Var, i3, i4, true);
    }

    public void T(View view, int i, int i2) {
        sp20 sp20Var = (sp20) view.getLayoutParams();
        int iF0 = (i - sp20Var.F0()) - sp20Var.X0();
        rp20 rp20Var = (rp20) this.a;
        int iMin = Math.min(Math.max(iF0 - rp20Var.f(view), sp20Var.J()), sp20Var.o0());
        long[] jArr = (long[]) this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        a0(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        rp20Var.e(view, i2);
    }

    public void U(View view, int i, int i2) {
        sp20 sp20Var = (sp20) view.getLayoutParams();
        int iR = (i - sp20Var.R()) - sp20Var.E0();
        rp20 rp20Var = (rp20) this.a;
        int iMin = Math.min(Math.max(iR - rp20Var.f(view), sp20Var.Y0()), sp20Var.c1());
        long[] jArr = (long[]) this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        a0(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        rp20Var.e(view, i2);
    }

    public void V(int i) {
        View viewG;
        rp20 rp20Var = (rp20) this.a;
        if (i >= rp20Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = rp20Var.getFlexDirection();
        if (rp20Var.getAlignItems() != 4) {
            for (tp20 tp20Var : rp20Var.getFlexLinesInternal()) {
                for (Integer num : tp20Var.n) {
                    View viewG2 = rp20Var.g(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        U(viewG2, tp20Var.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            hhg1.n(f4i1.c(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        T(viewG2, tp20Var.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.c;
        List flexLinesInternal = rp20Var.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            tp20 tp20Var2 = (tp20) flexLinesInternal.get(i2);
            int i3 = tp20Var2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = tp20Var2.o + i4;
                if (i4 < rp20Var.getFlexItemCount() && (viewG = rp20Var.g(i5)) != null && viewG.getVisibility() != 8) {
                    sp20 sp20Var = (sp20) viewG.getLayoutParams();
                    if (sp20Var.E() == -1 || sp20Var.E() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            U(viewG, tp20Var2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                hhg1.n(f4i1.c(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            T(viewG, tp20Var2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public void W(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                j9c0 j9c0VarB = B(iac0Var);
                if (j9c0VarB == null) {
                    return;
                }
                Iterator it = ((Set) ((HashMap) this.c).get(j9c0VarB)).iterator();
                while (it.hasNext()) {
                    i9c0 i9c0Var = (i9c0) ((HashMap) this.b).get((i19) it.next());
                    i9c0Var.getClass();
                    i9c0Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object X(String str, ubc0 ubc0Var, onm onmVar) {
        s230 s230Var;
        if (onmVar instanceof s230) {
            s230Var = (s230) onmVar;
            int i = s230Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                s230Var.d = i - os00.INVALID_ID;
            } else {
                s230Var = new s230(this, onmVar);
            }
        } else {
            s230Var = new s230(this, onmVar);
        }
        Object obj = s230Var.b;
        int i2 = s230Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            ccc0 ccc0Var = (ccc0) this.a;
            s230Var.a = str;
            s230Var.d = 1;
            Object objH = ccc0.h(ccc0Var, str, ubc0Var, s230Var, 2);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = s230Var.a;
            hm5.M(obj);
        }
        Q(2131963275, new t230(this, str, (byte) 0));
        return rih1.a;
    }

    public void Y() {
        iac0 iac0Var;
        synchronized (this.a) {
            Iterator it = ((HashMap) this.b).keySet().iterator();
            while (it.hasNext()) {
                i9c0 i9c0Var = (i9c0) ((HashMap) this.b).get((i19) it.next());
                synchronized (i9c0Var.a) {
                    a5d a5dVar = i9c0Var.c;
                    a5dVar.z((ArrayList) a5dVar.w());
                }
                synchronized (i9c0Var.a) {
                    iac0Var = i9c0Var.b;
                }
                P(iac0Var);
            }
        }
    }

    public void Z(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) ((HashMap) this.c).get(B(iac0Var))).iterator();
                while (it.hasNext()) {
                    i9c0 i9c0Var = (i9c0) ((HashMap) this.b).get((i19) it.next());
                    i9c0Var.getClass();
                    if (!i9c0Var.b().isEmpty()) {
                        i9c0Var.i();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((tor0) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    public void a0(int i, int i2, int i3, View view) {
        long[] jArr = (long[]) this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    public Object apply(Object obj) {
        return new wpd0((String) this.a, (String) this.b, (String) this.c, (String) this.d, new xpd0((String) this.e, (String) obj), (nqd0) null, (String) null, 96);
    }

    public void b(Uri uri) {
        Logger.g(h4b1.d(uri, "Showing logout dialog due to URI "), new Object[0]);
        Context context = (Context) this.a;
        Parcelable wvfVar = new wvf(context.getString(2131956347), context.getString(2131956345), context.getString(2131956346), context.getString(R.string.cancel));
        dwf dwfVar = new dwf();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_KEY", wvfVar);
        dwfVar.T0(bundle);
        dwfVar.g1((th30) this.b, "LOGOUT_DIALOG_TAG");
    }

    @Override // p.h0x
    public List c(boolean z, vu30 vu30Var) {
        adp adpVar = (adp) this.a;
        oaj1 oaj1Var = new oaj1(vu30Var, null, 5);
        iac0 iac0Var = (iac0) this.b;
        return p7h.M(new dsw[]{adpVar.a(new qaj1("embeddedad-playlist", oaj1Var, iac0Var), new lbj1("embeddedad-playlist", new jbj1(1, 1), new kbj1(new s55(2, (lnm) null, (byte) 14), vu30Var), iac0Var), ((ge4) this.c).l()), ((cdp) this.d).a(new uxb0(2, false)), ((bdp) this.e).a(new aiu(new zhu(1, vu30Var), iac0Var, 1, z))});
    }

    public float d() {
        return ((Number) ((znb0) this.d).getValue()).floatValue();
    }

    public float e() {
        return ((Number) ((znb0) this.c).getValue()).floatValue();
    }

    public void f(qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, b0k b0kVar, int i) {
        int i2;
        qcb1 qcb1Var2;
        jha1 jha1Var2;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-16270740);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qcb1Var) : x340Var.i(qcb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jha1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zI = x340Var.i(jha1Var) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new xr00(jha1Var, this, (lnm) null, (byte) 29);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            int iOrdinal = qcb1Var.t.ordinal();
            if (iOrdinal == 1) {
                qcb1Var2 = qcb1Var;
                jha1Var2 = jha1Var;
                iu30Var2 = iu30Var;
                x340Var.i0(1543709250);
                ajq0 ajq0Var = (ajq0) this.b;
                boolean zI2 = x340Var.i(this);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new ww50(this, (byte) 0);
                    x340Var.s0(objT2);
                }
                ajq0Var.b(qcb1Var2, iu30Var2, jha1Var2, (iu30) objT2, nim0Var, x340Var, (i2 & 1022) | ((i2 << 3) & 57344));
                x340Var.r(false);
            } else if (iOrdinal != 2) {
                x340Var.i0(1543727202);
                g2z g2zVar = (g2z) this.c;
                boolean zI3 = x340Var.i(this);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new ww50(this, (byte) 2);
                    x340Var.s0(objT3);
                }
                jha1Var2 = jha1Var;
                qcb1Var2 = qcb1Var;
                g2zVar.p(qcb1Var2, iu30Var, jha1Var2, (iu30) objT3, nim0Var, x340Var, (i2 & 1022) | ((i2 << 3) & 57344));
                iu30Var2 = iu30Var;
                x340Var.r(false);
            } else {
                qcb1Var2 = qcb1Var;
                iu30Var2 = iu30Var;
                x340Var.i0(1543718597);
                ro30 ro30Var = (ro30) this.d;
                boolean zI4 = x340Var.i(this);
                Object objT4 = x340Var.T();
                if (zI4 || objT4 == m4cVar) {
                    objT4 = new ww50(this, (byte) 1);
                    x340Var.s0(objT4);
                }
                ro30Var.b(qcb1Var2, jha1Var, (iu30) objT4, nim0Var, x340Var, (i2 & 14) | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 7168));
                jha1Var2 = jha1Var;
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            qcb1Var2 = qcb1Var;
            jha1Var2 = jha1Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(this, qcb1Var2, iu30Var2, jha1Var2, i);
        }
    }

    public void g(Class cls, String str, xhg0 xhg0Var) {
        ((HashMap) this.c).put(cls, xhg0Var);
        if (str != null) {
            ((HashMap) this.d).put(str, cls);
            ((HashMap) this.e).put(cls, str);
        }
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        q7e0 q7e0Var = (q7e0) this.a;
        q6e0 q6e0Var = (q6e0) this.b;
        u7r0 u7r0Var = (u7r0) this.c;
        iu30 iu30Var = (iu30) this.d;
        n7e0 n7e0Var = (n7e0) this.e;
        g2z g2zVar = new g2z();
        g2zVar.b = q7e0Var;
        g2zVar.c = q7r0Var;
        g2zVar.d = u7r0Var;
        g2zVar.e = iu30Var;
        g2zVar.f = n7e0Var;
        g2zVar.a = new w6e0(new jzm(q7e0Var, q6e0Var, q7r0Var, bundle, (byte) 27), new p7e0(q6e0Var, (byte) 0));
        return g2zVar;
    }

    public void i(List list, tp20 tp20Var, int i, int i2) {
        tp20Var.m = i2;
        ((rp20) this.a).j(tp20Var);
        tp20Var.f141p = i;
        list.add(tp20Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(i9c0 i9c0Var, Collection collection, fdc fdcVar) {
        iac0 iac0Var;
        z6x z6xVar = z6x.a;
        synchronized (this.a) {
            try {
                o0c.l(!collection.isEmpty());
                this.e = fdcVar;
                synchronized (i9c0Var.a) {
                    iac0Var = i9c0Var.b;
                }
                j9c0 j9c0VarB = B(iac0Var);
                if (j9c0VarB == null) {
                    return;
                }
                Set set = (Set) ((HashMap) this.c).get(j9c0VarB);
                fdc fdcVar2 = (fdc) this.e;
                if (fdcVar2 == null || fdcVar2.b != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        i9c0 i9c0Var2 = (i9c0) ((HashMap) this.b).get((i19) it.next());
                        i9c0Var2.getClass();
                        if (!i9c0Var2.equals(i9c0Var) && !i9c0Var2.b().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    synchronized (i9c0Var.c.X) {
                    }
                    a5d a5dVar = i9c0Var.c;
                    synchronized (a5dVar.X) {
                        a5dVar.i = z6xVar;
                    }
                    synchronized (i9c0Var.a) {
                        i9c0Var.c.b(collection);
                    }
                    if (iac0Var.getLifecycle().b().a(w8c0.d)) {
                        O(iac0Var);
                    }
                } catch (CameraUseCaseAdapter.CameraException e) {
                    throw new IllegalArgumentException((Throwable) e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    public void k(up20 up20Var, int i, int i2, int i3, int i4, int i5, List list) {
        int iD;
        sp20 sp20Var;
        int i6;
        boolean z;
        int i7 = i;
        rp20 rp20Var = (rp20) this.a;
        boolean zK = rp20Var.k();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        up20Var.b = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zK ? rp20Var.getPaddingStart() : rp20Var.getPaddingTop();
        int paddingEnd = zK ? rp20Var.getPaddingEnd() : rp20Var.getPaddingBottom();
        int paddingTop = zK ? rp20Var.getPaddingTop() : rp20Var.getPaddingStart();
        int paddingBottom = zK ? rp20Var.getPaddingBottom() : rp20Var.getPaddingEnd();
        tp20 tp20Var = new tp20();
        int i8 = i4;
        int i9 = 1;
        tp20Var.o = i8;
        int i10 = paddingStart + paddingEnd;
        tp20Var.e = i10;
        int flexItemCount = rp20Var.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewG = rp20Var.g(i8);
            if (viewG != null) {
                if (viewG.getVisibility() == 8) {
                    tp20Var.i++;
                    tp20Var.h++;
                    if (i8 == i14 - 1 && tp20Var.a() != 0) {
                        i(arrayList, tp20Var, i8, i12);
                    }
                } else {
                    if (viewG instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewG;
                        sp20 sp20Var2 = (sp20) compoundButton.getLayoutParams();
                        int iJ = sp20Var2.J();
                        int iY0 = sp20Var2.Y0();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iJ == -1) {
                            iJ = minimumWidth;
                        }
                        sp20Var2.D0(iJ);
                        if (iY0 == -1) {
                            iY0 = minimumHeight;
                        }
                        sp20Var2.V(iY0);
                    }
                    sp20 sp20Var3 = (sp20) viewG.getLayoutParams();
                    if (sp20Var3.E() == 4) {
                        tp20Var.n.add(Integer.valueOf(i8));
                    }
                    int width = zK ? sp20Var3.getWidth() : sp20Var3.getHeight();
                    if (sp20Var3.Y() != -1.0f && mode == 1073741824) {
                        width = Math.round(sp20Var3.Y() * size);
                    }
                    if (zK) {
                        iD = rp20Var.b(i7, sp20Var3.X0() + sp20Var3.F0() + i10, width);
                        int iD2 = rp20Var.d(i2, sp20Var3.E0() + sp20Var3.R() + paddingTop + paddingBottom + i12, sp20Var3.getHeight());
                        viewG.measure(iD, iD2);
                        a0(i8, iD, iD2, viewG);
                    } else {
                        int iB = rp20Var.b(i2, sp20Var3.X0() + sp20Var3.F0() + paddingTop + paddingBottom + i12, sp20Var3.getWidth());
                        iD = rp20Var.d(i7, sp20Var3.E0() + sp20Var3.R() + i10, width);
                        viewG.measure(iB, iD);
                        a0(i8, iB, iD, viewG);
                    }
                    rp20Var.e(viewG, i8);
                    l(viewG, i8);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewG.getMeasuredState());
                    int i15 = tp20Var.e;
                    int measuredWidth = (zK ? viewG.getMeasuredWidth() : viewG.getMeasuredHeight()) + (zK ? sp20Var3.F0() : sp20Var3.R()) + (zK ? sp20Var3.X0() : sp20Var3.E0());
                    int size2 = arrayList.size();
                    if (rp20Var.getFlexWrap() != 0) {
                        if (sp20Var3.h0()) {
                            sp20Var = sp20Var3;
                        } else {
                            if (mode == 0) {
                                sp20Var = sp20Var3;
                            } else {
                                sp20Var = sp20Var3;
                                int maxLine = rp20Var.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int i16 = rp20Var.i(viewG, i8, i13);
                                    if (i16 > 0) {
                                        measuredWidth += i16;
                                    }
                                    if (size < i15 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            tp20Var.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (tp20Var.a() > 0) {
                            arrayList = arrayList;
                            i(arrayList, tp20Var, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += tp20Var.g;
                        }
                        if (zK) {
                            arrayList = arrayList;
                            if (sp20Var.getHeight() == -1) {
                                viewG.measure(iD, rp20Var.d(i2, sp20Var.E0() + sp20Var.R() + rp20Var.getPaddingBottom() + rp20Var.getPaddingTop() + i12, sp20Var.getHeight()));
                                l(viewG, i8);
                            }
                        } else {
                            arrayList = arrayList;
                            if (sp20Var.getWidth() == -1) {
                                viewG.measure(rp20Var.b(i2, sp20Var.X0() + sp20Var.F0() + rp20Var.getPaddingRight() + rp20Var.getPaddingLeft() + i12, sp20Var.getWidth()), iD);
                                l(viewG, i8);
                            }
                        }
                        tp20Var = new tp20();
                        tp20Var.h = i9;
                        i10 = i10;
                        tp20Var.e = i10;
                        tp20Var.o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        sp20Var = sp20Var3;
                        i10 = i10;
                        arrayList = arrayList;
                        tp20Var.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    tp20Var.q |= sp20Var.X() != 0.0f;
                    tp20Var.r |= sp20Var.G() != 0.0f;
                    int[] iArr = (int[]) this.c;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    tp20Var.e = (zK ? viewG.getMeasuredWidth() : viewG.getMeasuredHeight()) + (zK ? sp20Var.F0() : sp20Var.R()) + (zK ? sp20Var.X0() : sp20Var.E0()) + tp20Var.e;
                    tp20Var.j = sp20Var.X() + tp20Var.j;
                    tp20Var.k = sp20Var.G() + tp20Var.k;
                    rp20Var.h(viewG, i8, i13, tp20Var);
                    int iMax = Math.max(i6, rp20Var.f(viewG) + (zK ? viewG.getMeasuredHeight() : viewG.getMeasuredWidth()) + (zK ? sp20Var.R() : sp20Var.F0()) + (zK ? sp20Var.E0() : sp20Var.X0()));
                    tp20Var.g = Math.max(tp20Var.g, iMax);
                    if (zK) {
                        int flexWrap = rp20Var.getFlexWrap();
                        int i17 = tp20Var.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            tp20Var.l = Math.max(i17, sp20Var.R() + viewG.getBaseline());
                        } else {
                            tp20Var.l = Math.max(i17, sp20Var.E0() + (viewG.getMeasuredHeight() - viewG.getBaseline()));
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && tp20Var.a() != 0) {
                        i(arrayList, tp20Var, i8, i12);
                        i12 += tp20Var.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        i9 = 1;
                        if (((tp20) arrayList.get(arrayList.size() - 1)).f141p >= i5 && i8 >= i5 && !z3) {
                            i12 = -tp20Var.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    } else {
                        i9 = 1;
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
            } else if (i8 == i14 - 1 && tp20Var.a() != 0) {
                i(arrayList, tp20Var, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
        }
        up20Var.a = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void l(View view, int i) {
        boolean z;
        sp20 sp20Var = (sp20) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= sp20Var.J()) {
            if (measuredWidth > sp20Var.o0()) {
                measuredWidth = sp20Var.o0();
            } else {
                z = false;
            }
            if (measuredHeight < sp20Var.Y0()) {
                measuredHeight = sp20Var.Y0();
            } else if (measuredHeight > sp20Var.c1()) {
                measuredHeight = sp20Var.c1();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                a0(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                ((rp20) this.a).e(view, i);
            }
        }
        measuredWidth = sp20Var.J();
        z = true;
        if (measuredHeight < sp20Var.Y0()) {
            measuredHeight = sp20Var.Y0();
        } else if (measuredHeight > sp20Var.c1()) {
            measuredHeight = sp20Var.c1();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            a0(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            ((rp20) this.a).e(view, i);
        }
    }

    public void m(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public i9c0 o(iac0 iac0Var, a5d a5dVar) {
        synchronized (this.a) {
            try {
                o0c.k("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.b).get(new i19(iac0Var, a5dVar.e)) == null);
                i9c0 i9c0Var = new i9c0(iac0Var, a5dVar);
                if (((ArrayList) a5dVar.w()).isEmpty()) {
                    i9c0Var.e();
                }
                if (iac0Var.getLifecycle().b() == w8c0.a) {
                    return i9c0Var;
                }
                L(i9c0Var);
                return i9c0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList p(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            sp20 sp20Var = (sp20) ((rp20) this.a).c(i2).getLayoutParams();
            vp20 vp20Var = new vp20();
            vp20Var.b = sp20Var.getOrder();
            vp20Var.a = i2;
            arrayList.add(vp20Var);
        }
        return arrayList;
    }

    public void q(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        rp20 rp20Var = (rp20) this.a;
        int flexDirection = rp20Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            hhg1.n(f4i1.c(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<tp20> flexLinesInternal = rp20Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = rp20Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((tp20) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = rp20Var.getAlignContent();
                if (alignContent == 1) {
                    tp20 tp20Var = new tp20();
                    tp20Var.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, tp20Var);
                    return;
                }
                if (alignContent == 2) {
                    rp20Var.setFlexLines(n(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((tp20) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            tp20 tp20Var2 = new tp20();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                tp20Var2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                tp20Var2.g = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                tp20Var2.g = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                tp20Var2.g = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(tp20Var2);
                        }
                        i4++;
                    }
                    rp20Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        rp20Var.setFlexLines(n(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    tp20 tp20Var3 = new tp20();
                    tp20Var3.g = size5;
                    for (tp20 tp20Var4 : flexLinesInternal) {
                        arrayList2.add(tp20Var3);
                        arrayList2.add(tp20Var4);
                        arrayList2.add(tp20Var3);
                    }
                    rp20Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        tp20 tp20Var5 = (tp20) flexLinesInternal.get(i4);
                        float f4 = tp20Var5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        tp20Var5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public void r(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        wp20 wp20Var;
        int i4;
        int i5;
        rp20 rp20Var = (rp20) this.a;
        int flexItemCount = rp20Var.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.b;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= rp20Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = rp20Var.getFlexDirection();
        int flexDirection2 = rp20Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = rp20Var.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = rp20Var.getPaddingLeft();
            paddingRight = rp20Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                hhg1.n(f4i1.c(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = rp20Var.getLargestMainSize();
            }
            paddingLeft = rp20Var.getPaddingTop();
            paddingRight = rp20Var.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = (int[]) this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = rp20Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            tp20 tp20Var = (tp20) flexLinesInternal.get(i8);
            int i9 = tp20Var.e;
            if (i9 >= i7 || !tp20Var.q) {
                wp20Var = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && tp20Var.r) {
                    wp20Var.R(i4, i5, tp20Var, i7, i6, false);
                }
            } else {
                wp20Var = this;
                i4 = i;
                i5 = i2;
                wp20Var.v(i4, i5, tp20Var, i7, i6, false);
            }
            i8++;
            this = wp20Var;
            i = i4;
            i2 = i5;
        }
    }

    public void s(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.c = Arrays.copyOf(iArr, i);
        }
    }

    public void t(int i) {
        long[] jArr = (long[]) this.d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.d = Arrays.copyOf(jArr, i);
        }
    }

    public void u(int i) {
        long[] jArr = (long[]) this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(jArr, i);
        }
    }

    public void v(int i, int i2, tp20 tp20Var, int i3, int i4, boolean z) {
        int i5;
        float f;
        int iMax;
        double d;
        double d2;
        rp20 rp20Var = (rp20) this.a;
        float f2 = tp20Var.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = tp20Var.e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        tp20Var.e = i4 + tp20Var.f;
        if (!z) {
            tp20Var.g = os00.INVALID_ID;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < tp20Var.h) {
            int i8 = tp20Var.o + i6;
            View viewG = rp20Var.g(i8);
            if (viewG == null || viewG.getVisibility() == 8) {
                f = f3;
                f4 = f4;
                z2 = z2;
            } else {
                sp20 sp20Var = (sp20) viewG.getLayoutParams();
                int flexDirection = rp20Var.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    boolean z3 = z2;
                    int measuredWidth = viewG.getMeasuredWidth();
                    long[] jArr = (long[]) this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewG.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.b)[i8] || sp20Var.X() <= f) {
                        z2 = z3;
                    } else {
                        float fX = (sp20Var.X() * f4) + measuredWidth;
                        if (i6 == tp20Var.h - 1) {
                            fX += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fX);
                        if (iRound > sp20Var.o0()) {
                            iRound = sp20Var.o0();
                            ((boolean[]) this.b)[i8] = true;
                            tp20Var.j -= sp20Var.X();
                            z2 = true;
                        } else {
                            float f6 = (fX - iRound) + f5;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f5 = f6;
                                z2 = z3;
                            }
                            f6 = (float) d;
                            f5 = f6;
                            z2 = z3;
                        }
                        int iY = y(i2, sp20Var, tp20Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewG.measure(iMakeMeasureSpec, iY);
                        int measuredWidth2 = viewG.getMeasuredWidth();
                        int measuredHeight2 = viewG.getMeasuredHeight();
                        a0(i8, iMakeMeasureSpec, iY, viewG);
                        rp20Var.e(viewG, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, rp20Var.f(viewG) + sp20Var.E0() + sp20Var.R() + measuredHeight);
                    tp20Var.e = sp20Var.X0() + sp20Var.F0() + measuredWidth + tp20Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewG.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewG.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.b)[i8] || sp20Var.X() <= f) {
                        f4 = f4;
                        z2 = z2;
                    } else {
                        float fX2 = (sp20Var.X() * f4) + measuredHeight3;
                        if (i6 == tp20Var.h - 1) {
                            fX2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fX2);
                        if (iRound2 > sp20Var.c1()) {
                            iRound2 = sp20Var.c1();
                            ((boolean[]) this.b)[i8] = true;
                            tp20Var.j -= sp20Var.X();
                            z2 = true;
                        } else {
                            float f7 = (fX2 - iRound2) + f5;
                            boolean z4 = z2;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = f7;
                                z2 = z4;
                            }
                            f7 = (float) d2;
                            f5 = f7;
                            z2 = z4;
                        }
                        int iZ = z(i, sp20Var, tp20Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewG.measure(iZ, iMakeMeasureSpec2);
                        int measuredWidth4 = viewG.getMeasuredWidth();
                        int measuredHeight4 = viewG.getMeasuredHeight();
                        a0(i8, iZ, iMakeMeasureSpec2, viewG);
                        rp20Var.e(viewG, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, rp20Var.f(viewG) + sp20Var.X0() + sp20Var.F0() + measuredWidth3);
                    tp20Var.e = sp20Var.E0() + sp20Var.R() + measuredHeight3 + tp20Var.e;
                }
                tp20Var.g = Math.max(tp20Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == tp20Var.e) {
            return;
        }
        v(i, i2, tp20Var, i3, i4, true);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object w(String str, boolean z, ubc0 ubc0Var, onm onmVar) {
        q230 q230Var;
        String str2;
        if (onmVar instanceof q230) {
            q230Var = (q230) onmVar;
            int i = q230Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                q230Var.e = i - os00.INVALID_ID;
            } else {
                q230Var = new q230(this, onmVar);
            }
        } else {
            q230Var = new q230(this, onmVar);
        }
        q230 q230Var2 = q230Var;
        Object obj = q230Var2.c;
        int i2 = q230Var2.e;
        if (i2 == 0) {
            hm5.M(obj);
            ccc0 ccc0Var = (ccc0) this.a;
            q230Var2.a = str;
            q230Var2.b = z;
            q230Var2.e = 1;
            Object objB = ccc0.b(ccc0Var, str, false, ubc0Var, q230Var2, 2);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = q230Var2.b;
            str2 = q230Var2.a;
            hm5.M(obj);
        }
        Q(2131963274, new r230(this, z, str2));
        return rih1.a;
    }

    public af5 x() {
        return (af5) this.a;
    }

    public int y(int i, sp20 sp20Var, int i2) {
        rp20 rp20Var = (rp20) this.a;
        int iD = rp20Var.d(i, sp20Var.E0() + sp20Var.R() + rp20Var.getPaddingBottom() + rp20Var.getPaddingTop() + i2, sp20Var.getHeight());
        int size = View.MeasureSpec.getSize(iD);
        if (size > sp20Var.c1()) {
            return View.MeasureSpec.makeMeasureSpec(sp20Var.c1(), View.MeasureSpec.getMode(iD));
        }
        return size < sp20Var.Y0() ? View.MeasureSpec.makeMeasureSpec(sp20Var.Y0(), View.MeasureSpec.getMode(iD)) : iD;
    }

    public int z(int i, sp20 sp20Var, int i2) {
        rp20 rp20Var = (rp20) this.a;
        int iB = rp20Var.b(i, sp20Var.X0() + sp20Var.F0() + rp20Var.getPaddingRight() + rp20Var.getPaddingLeft() + i2, sp20Var.getWidth());
        int size = View.MeasureSpec.getSize(iB);
        if (size > sp20Var.o0()) {
            return View.MeasureSpec.makeMeasureSpec(sp20Var.o0(), View.MeasureSpec.getMode(iB));
        }
        return size < sp20Var.J() ? View.MeasureSpec.makeMeasureSpec(sp20Var.J(), View.MeasureSpec.getMode(iB)) : iB;
    }

    public wp20(FlowableMap flowableMap, xrn0 xrn0Var, xe50 xe50Var, Scheduler scheduler) {
        this.a = flowableMap;
        this.b = xrn0Var;
        this.c = xe50Var;
        this.d = scheduler;
        this.e = new vku();
    }

    public wp20(muz muzVar, Activity activity, j5q j5qVar, i8h1 i8h1Var) {
        this.a = muzVar;
        this.b = activity;
        this.c = j5qVar;
        this.d = i8h1Var;
        this.e = new idd1(new u090(this, (byte) 0));
    }

    public wp20(Context context, iac0 iac0Var, th30 th30Var, fyf fyfVar, i8h1 i8h1Var, pf61 pf61Var) {
        this.a = context;
        this.b = th30Var;
        this.c = fyfVar;
        this.d = i8h1Var;
        this.e = pf61Var;
        th30Var.j0("checkout_dialog", iac0Var, new hod0(this, (byte) 6));
    }

    public wp20(dg30 dg30Var, Observable observable, yqg yqgVar) {
        this.a = yqgVar;
        TypedValue typedValue = new TypedValue();
        this.b = typedValue;
        this.d = new LinkedHashMap();
        this.e = observable.filter(f610.f).firstOrError().subscribe(new od30(this, (byte) 16), k530.N0);
        ((f0i) dg30Var).a.a(new i83(this, (byte) 8));
        dg30Var.getTheme().resolveAttribute(2130968740, typedValue, true);
    }

    public wp20(gw70 gw70Var, Context context, akp1 akp1Var, ye90 ye90Var) {
        String upperCase;
        this.a = ye90Var;
        String str = akp1Var.b;
        if (ihc1.y0(str)) {
            upperCase = "?";
        } else {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            upperCase = str.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
        }
        hv41 hv41Var = new hv41(upperCase, gw70Var, new gs90(this, (byte) 16));
        this.c = hv41Var;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(12);
        this.d = gridLayoutManager;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624000, (ViewGroup) null, false);
        int i = 2131427668;
        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131427668);
        if (recyclerViewT != null) {
            i = 2131428502;
            EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428502);
            if (encoreButtonT != null) {
                i = 2131429031;
                View viewT = m5n1.t(constraintLayoutInflate, 2131429031);
                if (viewT != null) {
                    i = 2131431411;
                    FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431411);
                    if (frameLayout != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        oj80 oj80Var = new oj80(constraintLayout, recyclerViewT, encoreButtonT, viewT, frameLayout);
                        Context context2 = constraintLayout.getContext();
                        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(context2, constraintLayout);
                        glueToolbarCreateGlueToolbar.setTitle(context2.getString(2131957127));
                        EncoreButton encoreButton = new EncoreButton(context2, (AttributeSet) null, 2130969240, (eix) null, 8, (DefaultConstructorMarker) null);
                        encoreButton.setIconResource(2131232946);
                        encoreButton.setOnClickListener(new o1b0(this, (byte) 1));
                        glueToolbarCreateGlueToolbar.addView(ToolbarSide.START, encoreButton, 2131431410);
                        frameLayout.addView(glueToolbarCreateGlueToolbar.getView());
                        recyclerViewT.setAdapter(hv41Var);
                        recyclerViewT.setLayoutManager(gridLayoutManager);
                        recyclerViewT.setItemAnimator((e611) null);
                        recyclerViewT.post(new xwn1(recyclerViewT, oj80Var, (byte) 23));
                        encoreButtonT.setOnClickListener(new o1b0(this, (byte) 0));
                        this.e = oj80Var;
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public wp20(rbt rbtVar, ajq0 ajq0Var, g2z g2zVar, ro30 ro30Var) {
        this.a = rbtVar;
        this.b = ajq0Var;
        this.c = g2zVar;
        this.d = ro30Var;
        this.e = gio1.b(new l160(0, 0, 3));
    }

    public wp20(ConstraintLayout constraintLayout, ImageView imageView, View view, View view2, EncoreTextView encoreTextView, EncoreTextView encoreTextView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = view2;
        this.d = encoreTextView;
        this.e = encoreTextView2;
    }

    public /* synthetic */ wp20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public wp20(byte b) {
        switch (b) {
            case 25:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                break;
            default:
                this.a = new Object();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new ArrayDeque();
                break;
        }
    }

    public wp20(rp20 rp20Var) {
        this.a = rp20Var;
    }
}
