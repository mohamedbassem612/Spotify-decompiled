package p;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class la4 extends ng {
    public final /* synthetic */ pa4 a;

    public la4(pa4 pa4Var) {
        this.a = pa4Var;
    }

    @Override // p.ng
    public final void addExtraDataToAccessibilityNodeInfo(int i, kg kgVar, String str, Bundle bundle) {
        this.a.a(i, kgVar, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:294:0x0670  */
    /* JADX WARN: Code duplicated, block: B:295:0x0678  */
    /* JADX WARN: Code duplicated, block: B:298:0x0683  */
    /* JADX WARN: Code duplicated, block: B:301:0x068f  */
    /* JADX WARN: Code duplicated, block: B:304:0x0695  */
    /* JADX WARN: Code duplicated, block: B:306:0x0699  */
    /* JADX WARN: Code duplicated, block: B:312:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:315:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:317:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:335:0x06de  */
    /* JADX WARN: Code duplicated, block: B:343:0x0706  */
    /* JADX WARN: Code duplicated, block: B:346:0x070c  */
    /* JADX WARN: Code duplicated, block: B:348:0x0716  */
    /* JADX WARN: Code duplicated, block: B:351:0x072c  */
    /* JADX WARN: Code duplicated, block: B:354:0x073e  */
    /* JADX WARN: Code duplicated, block: B:356:0x0748  */
    /* JADX WARN: Code duplicated, block: B:359:0x075e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0775  */
    /* JADX WARN: Code duplicated, block: B:369:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:370:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:372:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:380:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:381:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:390:0x081f  */
    /* JADX WARN: Code duplicated, block: B:392:0x082b  */
    /* JADX WARN: Code duplicated, block: B:396:0x0836  */
    /* JADX WARN: Code duplicated, block: B:398:0x083e  */
    /* JADX WARN: Code duplicated, block: B:400:0x0844  */
    /* JADX WARN: Code duplicated, block: B:408:0x085d  */
    /* JADX WARN: Code duplicated, block: B:410:0x0863  */
    /* JADX WARN: Code duplicated, block: B:412:0x086d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0876  */
    /* JADX WARN: Code duplicated, block: B:416:0x0879  */
    /* JADX WARN: Code duplicated, block: B:419:0x087e  */
    /* JADX WARN: Code duplicated, block: B:422:0x088d  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:435:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:439:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:441:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:442:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:445:0x0904  */
    /* JADX WARN: Code duplicated, block: B:452:0x0947  */
    /* JADX WARN: Code duplicated, block: B:455:0x094c  */
    /* JADX WARN: Code duplicated, block: B:458:0x0969  */
    /* JADX WARN: Code duplicated, block: B:461:0x096e  */
    /* JADX WARN: Code duplicated, block: B:464:0x0981  */
    /* JADX WARN: Code duplicated, block: B:466:0x098d  */
    /* JADX WARN: Code duplicated, block: B:469:0x0993  */
    /* JADX WARN: Code duplicated, block: B:472:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:475:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:476:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:478:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:480:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:482:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:484:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:488:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:505:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:527:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:530:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:533:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:535:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:538:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:541:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:544:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:562:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b86 A[LOOP:9: B:563:0x0b84->B:564:0x0b86, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:567:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:569:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:571:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:572:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:575:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:578:0x0bfd A[LOOP:11: B:574:0x0bf2->B:578:0x0bfd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:581:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:583:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:587:0x0c2d A[LOOP:12: B:586:0x0c2b->B:587:0x0c2d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:588:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:590:0x0c60 A[LOOP:13: B:589:0x0c5e->B:590:0x0c60, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:592:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:594:0x0c9c  */
    /* JADX WARN: Code duplicated, block: B:597:0x0cae  */
    /* JADX WARN: Code duplicated, block: B:599:0x0cb8  */
    /* JADX WARN: Code duplicated, block: B:600:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:602:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:610:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:649:0x0859 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0854 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0bfa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0c00 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x09fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    @Override // p.ng
    public final kg createAccessibilityNodeInfo(int i) {
        AccessibilityManager accessibilityManager;
        AccessibilityNodeInfo accessibilityNodeInfo;
        v161 v161Var;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        Resources resources;
        o161 o161Var;
        pm31 pm31Var;
        SpannableString spannableString;
        kg kgVar;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        pm31 pm31Var2;
        int i2;
        int i3;
        pa4 pa4Var;
        int i4;
        boolean z;
        v161 v161VarL;
        Object objG;
        vpd0 vpd0Var;
        Object objG2;
        we weVar;
        Object objG3;
        we weVar2;
        we weVar3;
        String strK;
        vfx0 vfx0Var;
        Object objG4;
        d4h d4hVar;
        ArrayList arrayList;
        Object objG5;
        boolean zV;
        int size;
        int size2;
        List listJ;
        int size3;
        int i5;
        v161 v161Var2;
        pq41 pq41Var;
        pq41 pq41Var2;
        o161 o161Var2;
        int iD;
        Bundle bundle;
        ha4 ha4Var;
        int iD2;
        String str;
        k75 k75VarQ;
        k75 k75VarQ2;
        we weVar4;
        we weVar5;
        we weVar6;
        d261 d261Var;
        List list;
        int size4;
        int i6;
        ina1 ina1Var;
        int i7;
        sdn0 sdn0VarA;
        int size5;
        int i8;
        sdn0 sdn0Var;
        edn0 edn0Var;
        int[] iArr;
        int i9;
        ArrayList arrayList2;
        int size6;
        int i10;
        int size7;
        int i11;
        epo epoVar;
        String strA;
        int iD3;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        fg fgVar;
        fg fgVar2;
        Object objG6;
        we weVar7;
        float f;
        ksg ksgVar;
        d261 d261Var2;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        we weVar8;
        String str2;
        List list2;
        hmb0 hmb0VarV;
        o161 o161VarX;
        boolean zJ;
        Object objG7;
        o161 o161VarX2;
        boolean z2;
        Object objG8;
        we weVar9;
        we weVar10;
        we weVar11;
        we weVar12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG9;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zBooleanValue;
        ArrayList arrayList4;
        int i17;
        int i18;
        boolean zJ2;
        v161 v161Var3;
        kg kgVar2;
        pa4 pa4Var2 = this.a;
        AccessibilityManager accessibilityManager2 = pa4Var2.d;
        ha4 ha4Var2 = pa4Var2.a;
        if (ha4Var2.getComposeViewContext().d().getLifecycle().b() == w8c0.a) {
            if (accessibilityManager2.isEnabled()) {
                kgVar2 = null;
            } else {
                kgVar2 = new kg(AccessibilityNodeInfo.obtain());
            }
            kg kgVar3 = kgVar2;
            i3 = i;
            kgVar = kgVar3;
            pa4Var = pa4Var2;
        } else {
            x161 x161Var = (x161) pa4Var2.j().b(i);
            if (x161Var == null) {
                if (accessibilityManager2.isEnabled()) {
                    kgVar2 = null;
                } else {
                    kgVar2 = new kg(AccessibilityNodeInfo.obtain());
                }
                kg kgVar4 = kgVar2;
                i3 = i;
                kgVar = kgVar4;
                pa4Var = pa4Var2;
            } else {
                v161 v161Var4 = x161Var.a;
                Object objG10 = v161Var4.k().a.g(z161.o);
                if (objG10 == null) {
                    objG10 = null;
                }
                boolean zJ3 = u890.j(objG10, Boolean.TRUE);
                if (!zJ3 || puo1.r(accessibilityManager2)) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    kg kgVar5 = new kg(accessibilityNodeInfoObtain);
                    if (Build.VERSION.SDK_INT >= 34) {
                        sf.J(accessibilityNodeInfoObtain, zJ3);
                    } else {
                        kgVar5.k(64, zJ3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = ha4Var2.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        kgVar5.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        v161 v161VarL2 = v161Var4.l();
                        Integer numValueOf = v161VarL2 != null ? Integer.valueOf(v161VarL2.f) : null;
                        if (numValueOf == null) {
                            qf80.d("semanticsNode " + i + " has null parent");
                            jah.d();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == ha4Var2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        kgVar5.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(ha4Var2, iIntValue);
                    }
                    kgVar5.c = i;
                    accessibilityNodeInfoObtain.setSource(ha4Var2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(pa4Var2.b(x161Var));
                    edn0 edn0Var2 = pa4.k1;
                    ddn0 ddn0Var = pa4Var2.g1;
                    ina1 ina1Var2 = pa4Var2.P0;
                    Resources resources2 = ha4Var2.getContext().getResources();
                    kgVar5.l("android.view.View");
                    o161 o161Var3 = v161Var4.d;
                    nen0 nen0Var = o161Var3.a;
                    if (nen0Var.c(z161.G)) {
                        kgVar5.l("android.widget.EditText");
                    }
                    if (nen0Var.c(z161.C)) {
                        kgVar5.l("android.widget.TextView");
                    }
                    Object objG11 = nen0Var.g(z161.z);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    pm31 pm31Var3 = (pm31) objG11;
                    if (pm31Var3 != null) {
                        int i19 = pm31Var3.a;
                        if (v161Var4.n() || v161.j(4, v161Var4).isEmpty()) {
                            accessibilityManager = accessibilityManager2;
                            if (i19 == 4) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                            } else if (i19 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                            } else {
                                String strV = flo1.v(i19);
                                if (i19 != 5 || y1a1.E(v161Var4) || o161Var3.c) {
                                    kgVar5.l(strV);
                                }
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                    }
                    accessibilityNodeInfoObtain.setPackageName(ha4Var2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(ggo1.H(v161Var4));
                    boolean zR = puo1.r(accessibilityManager);
                    List listJ2 = v161.j(4, v161Var4);
                    int size8 = listJ2.size();
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        accessibilityNodeInfo = kgVar5.a;
                        if (i20 >= size8) {
                            break;
                        }
                        int i22 = i20;
                        v161 v161Var5 = (v161) listJ2.get(i20);
                        int i23 = size8;
                        or80 or80VarJ = pa4Var2.j();
                        List list3 = listJ2;
                        int i24 = v161Var5.f;
                        if (or80VarJ.a(i24)) {
                            k75 k75Var = (k75) ha4Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(v161Var5.c);
                            if (i24 != -1) {
                                if (k75Var != null) {
                                    accessibilityNodeInfo.addChild(k75Var);
                                } else {
                                    x161 x161Var2 = (x161) pa4Var2.j().b(i24);
                                    if (x161Var2 == null || (v161Var3 = x161Var2.a) == null) {
                                        zJ2 = false;
                                    } else {
                                        Object objG12 = v161Var3.k().a.g(z161.o);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        zJ2 = u890.j(objG12, Boolean.TRUE);
                                    }
                                    if (zR || !zJ2) {
                                        accessibilityNodeInfo.addChild(ha4Var2, i24);
                                    }
                                }
                                ddn0Var.f(i24, i21);
                                i21++;
                            }
                        }
                        i20 = i22 + 1;
                        size8 = i23;
                        listJ2 = list3;
                    }
                    if (i == pa4Var2.h) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        kgVar5.b(fg.j);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        kgVar5.b(fg.i);
                    }
                    af5 af5VarY = y1a1.y(v161Var4);
                    if (af5VarY != null) {
                        g930 fontFamilyResolver = ha4Var2.getFontFamilyResolver();
                        wat density = ha4Var2.getDensity();
                        dlg1 dlg1Var = pa4Var2.c1;
                        String str3 = af5VarY.b;
                        List list4 = af5VarY.a;
                        SpannableString spannableString2 = new SpannableString(str3);
                        ArrayList arrayList5 = af5VarY.c;
                        if (arrayList5 != null) {
                            int size9 = arrayList5.size();
                            int i25 = 0;
                            while (i25 < size9) {
                                int i26 = size9;
                                ze5 ze5Var = (ze5) arrayList5.get(i25);
                                ArrayList arrayList6 = arrayList5;
                                zma1 zma1Var = (zma1) ze5Var.a;
                                int i27 = ze5Var.b;
                                int i28 = ze5Var.c;
                                int i29 = i25;
                                zma1 zma1VarA = zma1.a(zma1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65503);
                                j8e1 j8e1Var = zma1VarA.a;
                                TextGeometricTransform textGeometricTransform = zma1VarA.j;
                                o161 o161Var4 = o161Var3;
                                TextDecoration textDecoration = zma1VarA.m;
                                pm31 pm31Var4 = pm31Var3;
                                zh40 zh40Var = zma1VarA.f;
                                v161 v161Var6 = v161Var4;
                                FontStyle fontStyle = zma1VarA.d;
                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                kg kgVar6 = kgVar5;
                                y1a1.N(spannableString2, j8e1Var.a(), i27, i28);
                                SpannableString spannableString3 = spannableString2;
                                y1a1.O(spannableString3, zma1VarA.b, density, i27, i28);
                                FontWeight fontWeight = zma1VarA.c;
                                if (fontWeight == null && fontStyle == null) {
                                    i17 = 33;
                                } else {
                                    if (fontWeight == null) {
                                        fontWeight = FontWeight.t;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(wpb1.u(fontStyle != null ? fontStyle.a : 0, fontWeight));
                                    i17 = 33;
                                    spannableString3.setSpan(styleSpan, i27, i28, 33);
                                }
                                if (zh40Var == null) {
                                    i18 = i17;
                                } else if (zh40Var instanceof zh40) {
                                    spannableString3.setSpan(new TypefaceSpan(zh40Var.f), i27, i28, i17);
                                    i18 = i17;
                                } else if (Build.VERSION.SDK_INT >= 28) {
                                    FontSynthesis fontSynthesis = zma1VarA.e;
                                    i18 = 33;
                                    spannableString3.setSpan(ph5.k((Typeface) fontFamilyResolver.a(zh40Var, FontWeight.t, 0, fontSynthesis != null ? fontSynthesis.a : 65535).getValue()), i27, i28, 33);
                                } else {
                                    i18 = 33;
                                }
                                if (textDecoration != null) {
                                    if (textDecoration.a(TextDecoration.c)) {
                                        spannableString3.setSpan(new UnderlineSpan(), i27, i28, i18);
                                    }
                                    if (textDecoration.a(TextDecoration.d)) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i27, i28, i18);
                                    }
                                }
                                if (textGeometricTransform != null) {
                                    spannableString3.setSpan(new ScaleXSpan(textGeometricTransform.a), i27, i28, i18);
                                }
                                y1a1.S(spannableString3, zma1VarA.k, i27, i28);
                                long j = zma1VarA.l;
                                if (j != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(z4p1.G(j)), i27, i28, 33);
                                }
                                i25 = i29 + 1;
                                spannableString2 = spannableString3;
                                resources2 = resources2;
                                size9 = i26;
                                arrayList5 = arrayList6;
                                o161Var3 = o161Var4;
                                pm31Var3 = pm31Var4;
                                v161Var4 = v161Var6;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                kgVar5 = kgVar6;
                            }
                        }
                        v161Var = v161Var4;
                        SpannableString spannableString4 = spannableString2;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        kg kgVar7 = kgVar5;
                        resources = resources2;
                        o161Var = o161Var3;
                        pm31Var = pm31Var3;
                        int length = str3.length();
                        ArrayList arrayList7 = z6x.a;
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            int size10 = list4.size();
                            for (int i30 = 0; i30 < size10; i30++) {
                                Object obj = list4.get(i30);
                                ze5 ze5Var2 = (ze5) obj;
                                if ((ze5Var2.a instanceof uyi1) && bf5.b(0, length, ze5Var2.b, ze5Var2.c)) {
                                    arrayList4.add(obj);
                                }
                            }
                        } else {
                            arrayList4 = arrayList7;
                        }
                        int size11 = arrayList4.size();
                        for (int i31 = 0; i31 < size11; i31++) {
                            ze5 ze5Var3 = (ze5) arrayList4.get(i31);
                            uyi1 uyi1Var = (uyi1) ze5Var3.a;
                            int i32 = ze5Var3.b;
                            int i33 = ze5Var3.c;
                            if (!(uyi1Var instanceof uyi1)) {
                                eg.o();
                                return null;
                            }
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(uyi1Var.a).build(), i32, i33, 33);
                        }
                        int length2 = str3.length();
                        if (list4 != null) {
                            arrayList7 = new ArrayList(list4.size());
                            int size12 = list4.size();
                            for (int i34 = 0; i34 < size12; i34++) {
                                Object obj2 = list4.get(i34);
                                ze5 ze5Var4 = (ze5) obj2;
                                if ((ze5Var4.a instanceof h3i1) && bf5.b(0, length2, ze5Var4.b, ze5Var4.c)) {
                                    arrayList7.add(obj2);
                                }
                            }
                        }
                        int size13 = arrayList7.size();
                        for (int i35 = 0; i35 < size13; i35++) {
                            ze5 ze5Var5 = (ze5) arrayList7.get(i35);
                            h3i1 h3i1Var = (h3i1) ze5Var5.a;
                            int i36 = ze5Var5.b;
                            int i37 = ze5Var5.c;
                            WeakHashMap weakHashMap = (WeakHashMap) dlg1Var.a;
                            Object uRLSpan = weakHashMap.get(h3i1Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(h3i1Var.a);
                                weakHashMap.put(h3i1Var, uRLSpan);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan, i36, i37, 33);
                        }
                        List listA = af5VarY.a(str3.length());
                        int size14 = listA.size();
                        for (int i38 = 0; i38 < size14; i38++) {
                            ze5 ze5Var6 = (ze5) listA.get(i38);
                            int i39 = ze5Var6.b;
                            Object obj3 = ze5Var6.a;
                            int i40 = ze5Var6.c;
                            if (i39 != i40) {
                                mjc0 mjc0Var = (mjc0) obj3;
                                if ((mjc0Var instanceof ljc0) && ((ljc0) mjc0Var).c == null) {
                                    ljc0 ljc0Var = (ljc0) obj3;
                                    ze5 ze5Var7 = new ze5(i39, i40, ljc0Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) dlg1Var.b;
                                    Object uRLSpan2 = weakHashMap2.get(ze5Var7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(ljc0Var.a);
                                        weakHashMap2.put(ze5Var7, uRLSpan2);
                                    }
                                    spannableString4.setSpan((URLSpan) uRLSpan2, i39, i40, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) dlg1Var.c;
                                    Object ntjVar = weakHashMap3.get(ze5Var6);
                                    if (ntjVar == null) {
                                        ntjVar = new ntj(mjc0Var);
                                        weakHashMap3.put(ze5Var6, ntjVar);
                                    }
                                    spannableString4.setSpan((ClickableSpan) ntjVar, i39, i40, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) pa4.G(spannableString4);
                        kgVar = kgVar7;
                    } else {
                        v161Var = v161Var4;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        ddn0Var = ddn0Var;
                        resources = resources2;
                        o161Var = o161Var3;
                        pm31Var = pm31Var3;
                        spannableString = null;
                        kgVar = kgVar5;
                    }
                    kgVar.w(spannableString);
                    d261 d261Var3 = z161.O;
                    if (nen0Var.c(d261Var3)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        Object objG13 = nen0Var.g(d261Var3);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        accessibilityNodeInfo.setError((CharSequence) objG13);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    }
                    Resources resources3 = resources;
                    v161 v161Var7 = v161Var;
                    kgVar.v(y1a1.x(v161Var7, resources3));
                    accessibilityNodeInfo.setCheckable(y1a1.w(v161Var7));
                    Object objG14 = nen0Var.g(z161.L);
                    if (objG14 == null) {
                        objG14 = null;
                    }
                    rze1 rze1Var = (rze1) objG14;
                    if (rze1Var != null) {
                        if (rze1Var == rze1.a) {
                            accessibilityNodeInfo.setChecked(true);
                        } else if (rze1Var == rze1.b) {
                            accessibilityNodeInfo.setChecked(false);
                        }
                    }
                    Object objG15 = nen0Var.g(z161.K);
                    if (objG15 == null) {
                        objG15 = null;
                    }
                    Boolean bool = (Boolean) objG15;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (pm31Var == null) {
                            pm31Var2 = pm31Var;
                            i2 = 4;
                        } else {
                            pm31Var2 = pm31Var;
                            i2 = 4;
                            if (pm31Var2.a == 4) {
                                accessibilityNodeInfo.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo.setChecked(zBooleanValue2);
                    } else {
                        pm31Var2 = pm31Var;
                        i2 = 4;
                    }
                    o161 o161Var5 = o161Var;
                    if (!o161Var5.c || v161.j(i2, v161Var7).isEmpty()) {
                        Object objG16 = nen0Var.g(z161.a);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        List list5 = (List) objG16;
                        kgVar.o(list5 != null ? (String) o7h.s0(list5) : null);
                    }
                    Object objG17 = nen0Var.g(z161.A);
                    if (objG17 == null) {
                        objG17 = null;
                    }
                    String str4 = (String) objG17;
                    if (str4 != null) {
                        v161 v161VarL3 = v161Var7;
                        while (true) {
                            if (v161VarL3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            o161 o161Var6 = v161VarL3.d;
                            d261 d261Var4 = yoi1.e;
                            if (o161Var6.a.c(d261Var4)) {
                                zBooleanValue = ((Boolean) o161Var6.d(d261Var4)).booleanValue();
                                break;
                            }
                            v161VarL3 = v161VarL3.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str4);
                        }
                    }
                    Object objG18 = nen0Var.g(z161.h);
                    if (objG18 == null) {
                        objG18 = null;
                    }
                    if (((rih1) objG18) != null) {
                        kgVar.p(true);
                    }
                    Object objG19 = nen0Var.g(z161.i);
                    if (objG19 == null) {
                        objG19 = null;
                    }
                    if (((rih1) objG19) != null) {
                        kgVar.x();
                    }
                    i3 = i;
                    if (i3 != -1) {
                        int iD4 = ddn0Var.d(v161Var7.f);
                        if (iD4 != -1) {
                            accessibilityNodeInfo3.setDrawingOrder(iD4);
                        }
                    }
                    accessibilityNodeInfo.setPassword(nen0Var.c(z161.N));
                    Object objG20 = nen0Var.g(z161.Q);
                    if (objG20 == null) {
                        objG20 = null;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    accessibilityNodeInfo.setEditable(u890.j(objG20, bool2));
                    Object objG21 = nen0Var.g(z161.R);
                    if (objG21 == null) {
                        objG21 = null;
                    }
                    Integer num = (Integer) objG21;
                    accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfo.setEnabled(y1a1.l(v161Var7));
                    d261 d261Var5 = z161.l;
                    accessibilityNodeInfo.setFocusable(nen0Var.c(d261Var5));
                    if (accessibilityNodeInfo3.isFocusable()) {
                        accessibilityNodeInfo.setFocused(((Boolean) o161Var5.d(d261Var5)).booleanValue());
                        if (accessibilityNodeInfo3.isFocused()) {
                            i4 = 2;
                            kgVar.a(2);
                            pa4Var = pa4Var2;
                            pa4Var.i = i3;
                        } else {
                            pa4Var = pa4Var2;
                            i4 = 2;
                            z = true;
                            kgVar.a(1);
                        }
                        accessibilityNodeInfo.setVisibleToUser(ggo1.G(v161Var7) ^ z);
                        if (v161Var7.n()) {
                            v161VarL = v161Var7.l();
                            v161VarL.getClass();
                        } else {
                            v161VarL = v161Var7;
                        }
                        if (v161VarL.m().k()) {
                            accessibilityNodeInfo.setVisibleToUser(false);
                        }
                        objG = nen0Var.g(z161.k);
                        if (objG == null) {
                            objG = null;
                        }
                        vpd0Var = (vpd0) objG;
                        if (vpd0Var != null) {
                            z5 = vpd0Var.a;
                            if (z5 || !z5) {
                                i4 = 1;
                            }
                            accessibilityNodeInfo.setLiveRegion(i4);
                        }
                        accessibilityNodeInfo.setClickable(false);
                        objG2 = nen0Var.g(m161.b);
                        if (objG2 == null) {
                            objG2 = null;
                        }
                        weVar = (we) objG2;
                        if (weVar != null) {
                            objG9 = nen0Var.g(z161.K);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            boolean zJ4 = u890.j(objG9, bool2);
                            z3 = (pm31Var2 == null && pm31Var2.a == 4) || (pm31Var2 != null && pm31Var2.a == 3);
                            if (z3 || (z3 && !zJ4)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            accessibilityNodeInfo.setClickable(z4);
                            if (y1a1.l(v161Var7) && accessibilityNodeInfo3.isClickable()) {
                                kgVar.b(new fg(16, weVar.a));
                            }
                        }
                        accessibilityNodeInfo.setLongClickable(false);
                        objG3 = nen0Var.g(m161.c);
                        if (objG3 == null) {
                            objG3 = null;
                        }
                        weVar2 = (we) objG3;
                        if (weVar2 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (y1a1.l(v161Var7)) {
                                kgVar.b(new fg(32, weVar2.a));
                            }
                        }
                        weVar3 = (we) eko1.v(o161Var5, m161.q);
                        if (weVar3 != null) {
                            kgVar.b(new fg(TlsSocketProvider.READ_BUFFER_SIZE, weVar3.a));
                        }
                        if (y1a1.l(v161Var7)) {
                            weVar9 = (we) eko1.v(o161Var5, m161.k);
                            if (weVar9 != null) {
                                kgVar.b(new fg(2097152, weVar9.a));
                            }
                            weVar10 = (we) eko1.v(o161Var5, m161.p);
                            if (weVar10 != null) {
                                kgVar.b(new fg(android.R.id.accessibilityActionImeEnter, weVar10.a));
                            }
                            weVar11 = (we) eko1.v(o161Var5, m161.r);
                            if (weVar11 != null) {
                                kgVar.b(new fg(65536, weVar11.a));
                            }
                            weVar12 = (we) eko1.v(o161Var5, m161.s);
                            if (weVar12 != null && accessibilityNodeInfo3.isFocused()) {
                                primaryClipDescription = ha4Var2.getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    kgVar.b(new fg(32768, weVar12.a));
                                }
                            }
                        }
                        strK = pa4.k(v161Var7);
                        if (strK != null && strK.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(pa4Var.i(v161Var7), pa4Var.h(v161Var7));
                            weVar8 = (we) eko1.v(o161Var5, m161.j);
                            if (weVar8 != null) {
                                str2 = weVar8.a;
                            } else {
                                str2 = null;
                            }
                            kgVar.b(new fg(131072, str2));
                            kgVar.a(SemanticState.Hidden);
                            kgVar.a(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            list2 = (List) eko1.v(o161Var5, z161.a);
                            if ((list2 != null || list2.isEmpty()) && nen0Var.c(m161.a)) {
                                if (v161Var7.d.a.c(z161.G)) {
                                    objG8 = v161Var7.d.a.g(z161.l);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    if (u890.j(objG8, Boolean.TRUE)) {
                                        hmb0VarV = v161Var7.c.v();
                                        while (true) {
                                            if (hmb0VarV == null) {
                                                hmb0VarV = null;
                                                break;
                                            }
                                            o161VarX2 = hmb0VarV.x();
                                            if (o161VarX2 == null && o161VarX2.c) {
                                                if (o161VarX2.a.c(z161.G)) {
                                                    break;
                                                }
                                            }
                                            hmb0VarV = hmb0VarV.v();
                                        }
                                        if (hmb0VarV != null) {
                                            o161VarX = hmb0VarV.x();
                                            if (o161VarX != null) {
                                                objG7 = o161VarX.a.g(z161.l);
                                                if (objG7 == null) {
                                                    objG7 = null;
                                                }
                                                zJ = u890.j(objG7, Boolean.TRUE);
                                            } else {
                                                zJ = false;
                                            }
                                            z2 = zJ ? false : true;
                                        }
                                    }
                                } else {
                                    hmb0VarV = v161Var7.c.v();
                                    while (true) {
                                        if (hmb0VarV == null) {
                                            hmb0VarV = null;
                                            break;
                                        }
                                        o161VarX2 = hmb0VarV.x();
                                        if (o161VarX2 == null) {
                                        }
                                        hmb0VarV = hmb0VarV.v();
                                    }
                                    if (hmb0VarV != null) {
                                        o161VarX = hmb0VarV.x();
                                        if (o161VarX != null) {
                                            objG7 = o161VarX.a.g(z161.l);
                                            if (objG7 == null) {
                                                objG7 = null;
                                            }
                                            zJ = u890.j(objG7, Boolean.TRUE);
                                        } else {
                                            zJ = false;
                                        }
                                        if (zJ) {
                                        }
                                    }
                                }
                                if (!z2) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            charSequenceG = kgVar.g();
                            if (charSequenceG != null && charSequenceG.length() != 0 && nen0Var.c(m161.a)) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (nen0Var.c(z161.A)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (nen0Var.c(z161.S)) {
                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            kgVar.j(arrayList3);
                        }
                        vfx0Var = (vfx0) eko1.v(o161Var5, z161.c);
                        if (vfx0Var != null) {
                            f = vfx0Var.a;
                            ksgVar = vfx0Var.b;
                            d261Var2 = m161.i;
                            if (nen0Var.c(d261Var2)) {
                                kgVar.l("android.widget.SeekBar");
                            } else {
                                kgVar.l("android.widget.ProgressBar");
                            }
                            vfx0 vfx0Var2 = vfx0.d;
                            if (vfx0Var != vfx0.d) {
                                accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) yo31.i(((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue(), f).b);
                            }
                            if (nen0Var.c(d261Var2) && y1a1.l(v161Var7)) {
                                fFloatValue = ((Number) ksgVar.n()).floatValue();
                                fFloatValue2 = ((Number) ksgVar.m()).floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    kgVar.b(fg.k);
                                }
                                fFloatValue3 = ((Number) ksgVar.m()).floatValue();
                                fFloatValue4 = ((Number) ksgVar.n()).floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    kgVar.b(fg.l);
                                }
                            }
                        }
                        if (!v161Var7.k().a.c(z161.j)) {
                            objG6 = v161Var7.d.a.g(m161.i);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            weVar7 = (we) objG6;
                            if (weVar7 != null) {
                                kgVar.b(new fg(android.R.id.accessibilityActionSetProgress, weVar7.a));
                            }
                        }
                        objG4 = v161Var7.k().a.g(z161.f);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        d4hVar = (d4h) objG4;
                        if (d4hVar != null) {
                            kgVar.m(x5j1.h(d4hVar.a, d4hVar.b, 0, false));
                        } else {
                            arrayList = new ArrayList();
                            objG5 = v161Var7.k().a.g(z161.e);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (objG5 != null) {
                                listJ = v161.j(4, v161Var7);
                                size3 = listJ.size();
                                for (i5 = 0; i5 < size3; i5++) {
                                    v161Var2 = (v161) listJ.get(i5);
                                    if (v161Var2.k().a.c(z161.K)) {
                                        arrayList.add(v161Var2);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zV = t3p1.v(arrayList);
                                if (zV) {
                                    size = 1;
                                } else {
                                    size = arrayList.size();
                                }
                                if (zV) {
                                    size2 = arrayList.size();
                                } else {
                                    size2 = 1;
                                }
                                kgVar.m(x5j1.h(size, size2, 0, false));
                            }
                        }
                        t3p1.B(kgVar, v161Var7);
                        pq41Var = (pq41) eko1.v(o161Var5, z161.v);
                        we weVar13 = (we) eko1.v(o161Var5, m161.d);
                        if (pq41Var != null && weVar13 != null) {
                            if (!t3p1.y(v161Var7)) {
                                kgVar.l("android.widget.HorizontalScrollView");
                            }
                            if (((Number) pq41Var.b.invoke()).floatValue() > 0.0f) {
                                kgVar.t(true);
                            }
                            if (y1a1.l(v161Var7)) {
                                if (pa4.q(pq41Var)) {
                                    kgVar.b(fg.k);
                                    if (y1a1.m(v161Var7)) {
                                        fgVar2 = fg.q;
                                    } else {
                                        fgVar2 = fg.s;
                                    }
                                    kgVar.b(fgVar2);
                                }
                                if (pa4.p(pq41Var)) {
                                    kgVar.b(fg.l);
                                    if (y1a1.m(v161Var7)) {
                                        fgVar = fg.s;
                                    } else {
                                        fgVar = fg.q;
                                    }
                                    kgVar.b(fgVar);
                                }
                            }
                        }
                        pq41Var2 = (pq41) eko1.v(o161Var5, z161.w);
                        if (pq41Var2 != null && weVar13 != null) {
                            if (!t3p1.y(v161Var7)) {
                                kgVar.l("android.widget.ScrollView");
                            }
                            if (((Number) pq41Var2.b.invoke()).floatValue() > 0.0f) {
                                kgVar.t(true);
                            }
                            if (y1a1.l(v161Var7)) {
                                if (pa4.q(pq41Var2)) {
                                    kgVar.b(fg.k);
                                    kgVar.b(fg.r);
                                }
                                if (pa4.p(pq41Var2)) {
                                    kgVar.b(fg.l);
                                    kgVar.b(fg.p);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            op71.k(kgVar, v161Var7);
                        }
                        kgVar.r((CharSequence) eko1.v(o161Var5, z161.d));
                        if (y1a1.l(v161Var7)) {
                            weVar4 = (we) eko1.v(o161Var5, m161.t);
                            if (weVar4 != null) {
                                kgVar.b(new fg(262144, weVar4.a));
                            }
                            weVar5 = (we) eko1.v(o161Var5, m161.u);
                            if (weVar5 != null) {
                                kgVar.b(new fg(524288, weVar5.a));
                            }
                            weVar6 = (we) eko1.v(o161Var5, m161.v);
                            if (weVar6 != null) {
                                kgVar.b(new fg(1048576, weVar6.a));
                            }
                            d261Var = m161.x;
                            if (nen0Var.c(d261Var)) {
                                list = (List) o161Var5.d(d261Var);
                                size4 = list.size();
                                i6 = edn0Var2.b;
                                if (size4 < i6) {
                                    eg.m(gvg.e(i6, "Can't have more than ", " custom actions for one widget"));
                                    return null;
                                }
                                i7 = 0;
                                ina1Var = new ina1(0);
                                sdn0VarA = kfp0.a();
                                if (ina1Var2.a) {
                                    dio1.l(ina1Var2);
                                }
                                if (mp10.j(ina1Var2.d, i3, ina1Var2.b) >= 0) {
                                    sdn0Var = (sdn0) dio1.r(ina1Var2, i3);
                                    edn0Var = new edn0();
                                    iArr = edn0Var2.a;
                                    for (i9 = edn0Var2.b; i7 < i9; i9 = i9) {
                                        edn0Var.a(iArr[i7]);
                                        i7++;
                                    }
                                    arrayList2 = new ArrayList();
                                    size6 = list.size();
                                    i10 = 0;
                                    while (i10 < size6) {
                                        int i41 = size6;
                                        epoVar = (epo) list.get(i10);
                                        sdn0Var.getClass();
                                        int i42 = i10;
                                        if (sdn0Var.d(epoVar.a()) >= 0) {
                                            strA = epoVar.a();
                                            iD3 = sdn0Var.d(strA);
                                            if (iD3 >= 0) {
                                                i12 = sdn0Var.c[iD3];
                                            } else {
                                                bhn0.t(cy30.m("There is no key ", strA, " in the map"));
                                                i12 = 0;
                                            }
                                            ina1Var.e(i12, epoVar.a());
                                            sdn0VarA.g(i12, epoVar.a());
                                            iArr2 = edn0Var.a;
                                            i13 = edn0Var.b;
                                            i14 = 0;
                                            while (true) {
                                                if (i14 < i13) {
                                                    i15 = -1;
                                                    break;
                                                }
                                                i16 = i14;
                                                if (i12 == iArr2[i16]) {
                                                    i15 = i16;
                                                    break;
                                                }
                                                i14 = i16 + 1;
                                            }
                                            if (i15 >= 0) {
                                                edn0Var.e(i15);
                                            }
                                            kgVar.b(new fg(i12, epoVar.a()));
                                        } else {
                                            o161Var5 = o161Var5;
                                            sdn0Var = sdn0Var;
                                            arrayList2.add(epoVar);
                                        }
                                        i10 = i42 + 1;
                                        size6 = i41;
                                        sdn0Var = sdn0Var;
                                        o161Var5 = o161Var5;
                                    }
                                    o161Var2 = o161Var5;
                                    size7 = arrayList2.size();
                                    for (i11 = 0; i11 < size7; i11++) {
                                        epo epoVar2 = (epo) arrayList2.get(i11);
                                        int iC = edn0Var.c(i11);
                                        ina1Var.e(iC, epoVar2.a());
                                        sdn0VarA.g(iC, epoVar2.a());
                                        kgVar.b(new fg(iC, epoVar2.a()));
                                    }
                                } else {
                                    o161Var2 = o161Var5;
                                    size5 = list.size();
                                    for (i8 = 0; i8 < size5; i8++) {
                                        epo epoVar3 = (epo) list.get(i8);
                                        int iC2 = edn0Var2.c(i8);
                                        ina1Var.e(iC2, epoVar3.a());
                                        sdn0VarA.g(iC2, epoVar3.a());
                                        kgVar.b(new fg(iC2, epoVar3.a()));
                                    }
                                }
                                pa4Var.O0.e(i3, ina1Var);
                                ina1Var2.e(i3, sdn0VarA);
                            } else {
                                o161Var2 = o161Var5;
                            }
                        } else {
                            o161Var2 = o161Var5;
                        }
                        kgVar.s(y1a1.D(v161Var7, resources3));
                        iD = pa4Var.Y0.d(i3);
                        if (iD != -1) {
                            k75VarQ2 = flo1.q(ha4Var2.getAndroidViewsHandler$ui(), iD);
                            if (k75VarQ2 != null) {
                                accessibilityNodeInfo.setTraversalBefore(k75VarQ2);
                                ha4Var = ha4Var2;
                            } else {
                                ha4Var = ha4Var2;
                                accessibilityNodeInfo.setTraversalBefore(ha4Var, iD);
                            }
                            bundle = null;
                            pa4Var.a(i3, kgVar, pa4Var.a1, (Bundle) null);
                        } else {
                            bundle = null;
                            ha4Var = ha4Var2;
                        }
                        iD2 = pa4Var.Z0.d(i3);
                        if (iD2 != -1 && (k75VarQ = flo1.q(ha4Var.getAndroidViewsHandler$ui(), iD2)) != null) {
                            accessibilityNodeInfo.setTraversalAfter(k75VarQ);
                            pa4Var.a(i3, kgVar, pa4Var.b1, bundle);
                        }
                        str = (String) eko1.v(o161Var2, yoi1.f);
                        if (str != null) {
                            kgVar.l(str);
                        }
                    } else {
                        pa4Var = pa4Var2;
                        i4 = 2;
                    }
                    z = true;
                    accessibilityNodeInfo.setVisibleToUser(ggo1.G(v161Var7) ^ z);
                    if (v161Var7.n()) {
                        v161VarL = v161Var7.l();
                        v161VarL.getClass();
                    } else {
                        v161VarL = v161Var7;
                    }
                    if (v161VarL.m().k()) {
                        accessibilityNodeInfo.setVisibleToUser(false);
                    }
                    objG = nen0Var.g(z161.k);
                    if (objG == null) {
                        objG = null;
                    }
                    vpd0Var = (vpd0) objG;
                    if (vpd0Var != null) {
                        z5 = vpd0Var.a;
                        if (z5) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                        }
                        accessibilityNodeInfo.setLiveRegion(i4);
                    }
                    accessibilityNodeInfo.setClickable(false);
                    objG2 = nen0Var.g(m161.b);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    weVar = (we) objG2;
                    if (weVar != null) {
                        objG9 = nen0Var.g(z161.K);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        boolean zJ5 = u890.j(objG9, bool2);
                        if (pm31Var2 == null) {
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo.setClickable(z4);
                        if (y1a1.l(v161Var7)) {
                            kgVar.b(new fg(16, weVar.a));
                        }
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    objG3 = nen0Var.g(m161.c);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    weVar2 = (we) objG3;
                    if (weVar2 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (y1a1.l(v161Var7)) {
                            kgVar.b(new fg(32, weVar2.a));
                        }
                    }
                    weVar3 = (we) eko1.v(o161Var5, m161.q);
                    if (weVar3 != null) {
                        kgVar.b(new fg(TlsSocketProvider.READ_BUFFER_SIZE, weVar3.a));
                    }
                    if (y1a1.l(v161Var7)) {
                        weVar9 = (we) eko1.v(o161Var5, m161.k);
                        if (weVar9 != null) {
                            kgVar.b(new fg(2097152, weVar9.a));
                        }
                        weVar10 = (we) eko1.v(o161Var5, m161.p);
                        if (weVar10 != null) {
                            kgVar.b(new fg(android.R.id.accessibilityActionImeEnter, weVar10.a));
                        }
                        weVar11 = (we) eko1.v(o161Var5, m161.r);
                        if (weVar11 != null) {
                            kgVar.b(new fg(65536, weVar11.a));
                        }
                        weVar12 = (we) eko1.v(o161Var5, m161.s);
                        if (weVar12 != null) {
                            primaryClipDescription = ha4Var2.getClipboardManager().a().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                kgVar.b(new fg(32768, weVar12.a));
                            }
                        }
                    }
                    strK = pa4.k(v161Var7);
                    if (strK != null) {
                        accessibilityNodeInfo3.setTextSelection(pa4Var.i(v161Var7), pa4Var.h(v161Var7));
                        weVar8 = (we) eko1.v(o161Var5, m161.j);
                        if (weVar8 != null) {
                            str2 = weVar8.a;
                        } else {
                            str2 = null;
                        }
                        kgVar.b(new fg(131072, str2));
                        kgVar.a(SemanticState.Hidden);
                        kgVar.a(512);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        list2 = (List) eko1.v(o161Var5, z161.a);
                        if (list2 != null) {
                            if (v161Var7.d.a.c(z161.G)) {
                                objG8 = v161Var7.d.a.g(z161.l);
                                if (objG8 == null) {
                                    objG8 = null;
                                }
                                if (u890.j(objG8, Boolean.TRUE)) {
                                    hmb0VarV = v161Var7.c.v();
                                    while (true) {
                                        if (hmb0VarV == null) {
                                            hmb0VarV = null;
                                            break;
                                        }
                                        o161VarX2 = hmb0VarV.x();
                                        if (o161VarX2 == null) {
                                        }
                                        hmb0VarV = hmb0VarV.v();
                                    }
                                    if (hmb0VarV != null) {
                                        o161VarX = hmb0VarV.x();
                                        if (o161VarX != null) {
                                            objG7 = o161VarX.a.g(z161.l);
                                            if (objG7 == null) {
                                                objG7 = null;
                                            }
                                            zJ = u890.j(objG7, Boolean.TRUE);
                                        } else {
                                            zJ = false;
                                        }
                                        if (zJ) {
                                        }
                                    }
                                }
                            } else {
                                hmb0VarV = v161Var7.c.v();
                                while (true) {
                                    if (hmb0VarV == null) {
                                        hmb0VarV = null;
                                        break;
                                    }
                                    o161VarX2 = hmb0VarV.x();
                                    if (o161VarX2 == null) {
                                    }
                                    hmb0VarV = hmb0VarV.v();
                                }
                                if (hmb0VarV != null) {
                                    o161VarX = hmb0VarV.x();
                                    if (o161VarX != null) {
                                        objG7 = o161VarX.a.g(z161.l);
                                        if (objG7 == null) {
                                            objG7 = null;
                                        }
                                        zJ = u890.j(objG7, Boolean.TRUE);
                                    } else {
                                        zJ = false;
                                    }
                                    if (zJ) {
                                    }
                                }
                            }
                            if (!z2) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            }
                        } else {
                            if (v161Var7.d.a.c(z161.G)) {
                                objG8 = v161Var7.d.a.g(z161.l);
                                if (objG8 == null) {
                                    objG8 = null;
                                }
                                if (u890.j(objG8, Boolean.TRUE)) {
                                    hmb0VarV = v161Var7.c.v();
                                    while (true) {
                                        if (hmb0VarV == null) {
                                            hmb0VarV = null;
                                            break;
                                        }
                                        o161VarX2 = hmb0VarV.x();
                                        if (o161VarX2 == null) {
                                        }
                                        hmb0VarV = hmb0VarV.v();
                                    }
                                    if (hmb0VarV != null) {
                                        o161VarX = hmb0VarV.x();
                                        if (o161VarX != null) {
                                            objG7 = o161VarX.a.g(z161.l);
                                            if (objG7 == null) {
                                                objG7 = null;
                                            }
                                            zJ = u890.j(objG7, Boolean.TRUE);
                                        } else {
                                            zJ = false;
                                        }
                                        if (zJ) {
                                        }
                                    }
                                }
                            } else {
                                hmb0VarV = v161Var7.c.v();
                                while (true) {
                                    if (hmb0VarV == null) {
                                        hmb0VarV = null;
                                        break;
                                    }
                                    o161VarX2 = hmb0VarV.x();
                                    if (o161VarX2 == null) {
                                    }
                                    hmb0VarV = hmb0VarV.v();
                                }
                                if (hmb0VarV != null) {
                                    o161VarX = hmb0VarV.x();
                                    if (o161VarX != null) {
                                        objG7 = o161VarX.a.g(z161.l);
                                        if (objG7 == null) {
                                            objG7 = null;
                                        }
                                        zJ = u890.j(objG7, Boolean.TRUE);
                                    } else {
                                        zJ = false;
                                    }
                                    if (zJ) {
                                    }
                                }
                            }
                            if (!z2) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        arrayList3 = new ArrayList();
                        arrayList3.add("androidx.compose.ui.semantics.id");
                        charSequenceG = kgVar.g();
                        if (charSequenceG != null) {
                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (nen0Var.c(z161.A)) {
                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (nen0Var.c(z161.S)) {
                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        kgVar.j(arrayList3);
                    }
                    vfx0Var = (vfx0) eko1.v(o161Var5, z161.c);
                    if (vfx0Var != null) {
                        f = vfx0Var.a;
                        ksgVar = vfx0Var.b;
                        d261Var2 = m161.i;
                        if (nen0Var.c(d261Var2)) {
                            kgVar.l("android.widget.SeekBar");
                        } else {
                            kgVar.l("android.widget.ProgressBar");
                        }
                        vfx0 vfx0Var3 = vfx0.d;
                        if (vfx0Var != vfx0.d) {
                            accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) yo31.i(((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue(), f).b);
                        }
                        if (nen0Var.c(d261Var2)) {
                            fFloatValue = ((Number) ksgVar.n()).floatValue();
                            fFloatValue2 = ((Number) ksgVar.m()).floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f < fFloatValue) {
                                kgVar.b(fg.k);
                            }
                            fFloatValue3 = ((Number) ksgVar.m()).floatValue();
                            fFloatValue4 = ((Number) ksgVar.n()).floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f > fFloatValue3) {
                                kgVar.b(fg.l);
                            }
                        }
                    }
                    if (!v161Var7.k().a.c(z161.j)) {
                        objG6 = v161Var7.d.a.g(m161.i);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        weVar7 = (we) objG6;
                        if (weVar7 != null) {
                            kgVar.b(new fg(android.R.id.accessibilityActionSetProgress, weVar7.a));
                        }
                    }
                    objG4 = v161Var7.k().a.g(z161.f);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    d4hVar = (d4h) objG4;
                    if (d4hVar != null) {
                        kgVar.m(x5j1.h(d4hVar.a, d4hVar.b, 0, false));
                    } else {
                        arrayList = new ArrayList();
                        objG5 = v161Var7.k().a.g(z161.e);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (objG5 != null) {
                            listJ = v161.j(4, v161Var7);
                            size3 = listJ.size();
                            while (i5 < size3) {
                                v161Var2 = (v161) listJ.get(i5);
                                if (v161Var2.k().a.c(z161.K)) {
                                    arrayList.add(v161Var2);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zV = t3p1.v(arrayList);
                            if (zV) {
                                size = 1;
                            } else {
                                size = arrayList.size();
                            }
                            if (zV) {
                                size2 = arrayList.size();
                            } else {
                                size2 = 1;
                            }
                            kgVar.m(x5j1.h(size, size2, 0, false));
                        }
                    }
                    t3p1.B(kgVar, v161Var7);
                    pq41Var = (pq41) eko1.v(o161Var5, z161.v);
                    we weVar14 = (we) eko1.v(o161Var5, m161.d);
                    if (pq41Var != null) {
                        if (!t3p1.y(v161Var7)) {
                            kgVar.l("android.widget.HorizontalScrollView");
                        }
                        if (((Number) pq41Var.b.invoke()).floatValue() > 0.0f) {
                            kgVar.t(true);
                        }
                        if (y1a1.l(v161Var7)) {
                            if (pa4.q(pq41Var)) {
                                kgVar.b(fg.k);
                                if (y1a1.m(v161Var7)) {
                                    fgVar2 = fg.s;
                                } else {
                                    fgVar2 = fg.q;
                                }
                                kgVar.b(fgVar2);
                            }
                            if (pa4.p(pq41Var)) {
                                kgVar.b(fg.l);
                                if (y1a1.m(v161Var7)) {
                                    fgVar = fg.q;
                                } else {
                                    fgVar = fg.s;
                                }
                                kgVar.b(fgVar);
                            }
                        }
                    }
                    pq41Var2 = (pq41) eko1.v(o161Var5, z161.w);
                    if (pq41Var2 != null) {
                        if (!t3p1.y(v161Var7)) {
                            kgVar.l("android.widget.ScrollView");
                        }
                        if (((Number) pq41Var2.b.invoke()).floatValue() > 0.0f) {
                            kgVar.t(true);
                        }
                        if (y1a1.l(v161Var7)) {
                            if (pa4.q(pq41Var2)) {
                                kgVar.b(fg.k);
                                kgVar.b(fg.r);
                            }
                            if (pa4.p(pq41Var2)) {
                                kgVar.b(fg.l);
                                kgVar.b(fg.p);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        op71.k(kgVar, v161Var7);
                    }
                    kgVar.r((CharSequence) eko1.v(o161Var5, z161.d));
                    if (y1a1.l(v161Var7)) {
                        o161Var2 = o161Var5;
                    } else {
                        weVar4 = (we) eko1.v(o161Var5, m161.t);
                        if (weVar4 != null) {
                            kgVar.b(new fg(262144, weVar4.a));
                        }
                        weVar5 = (we) eko1.v(o161Var5, m161.u);
                        if (weVar5 != null) {
                            kgVar.b(new fg(524288, weVar5.a));
                        }
                        weVar6 = (we) eko1.v(o161Var5, m161.v);
                        if (weVar6 != null) {
                            kgVar.b(new fg(1048576, weVar6.a));
                        }
                        d261Var = m161.x;
                        if (nen0Var.c(d261Var)) {
                            list = (List) o161Var5.d(d261Var);
                            size4 = list.size();
                            i6 = edn0Var2.b;
                            if (size4 < i6) {
                                eg.m(gvg.e(i6, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            i7 = 0;
                            ina1Var = new ina1(0);
                            sdn0VarA = kfp0.a();
                            if (ina1Var2.a) {
                                dio1.l(ina1Var2);
                            }
                            if (mp10.j(ina1Var2.d, i3, ina1Var2.b) >= 0) {
                                sdn0Var = (sdn0) dio1.r(ina1Var2, i3);
                                edn0Var = new edn0();
                                iArr = edn0Var2.a;
                                while (i7 < i9) {
                                    edn0Var.a(iArr[i7]);
                                    i7++;
                                }
                                arrayList2 = new ArrayList();
                                size6 = list.size();
                                i10 = 0;
                                while (i10 < size6) {
                                    int i43 = size6;
                                    epoVar = (epo) list.get(i10);
                                    sdn0Var.getClass();
                                    int i44 = i10;
                                    if (sdn0Var.d(epoVar.a()) >= 0) {
                                        strA = epoVar.a();
                                        iD3 = sdn0Var.d(strA);
                                        if (iD3 >= 0) {
                                            i12 = sdn0Var.c[iD3];
                                        } else {
                                            bhn0.t(cy30.m("There is no key ", strA, " in the map"));
                                            i12 = 0;
                                        }
                                        ina1Var.e(i12, epoVar.a());
                                        sdn0VarA.g(i12, epoVar.a());
                                        iArr2 = edn0Var.a;
                                        i13 = edn0Var.b;
                                        i14 = 0;
                                        while (true) {
                                            if (i14 < i13) {
                                                i15 = -1;
                                                break;
                                            }
                                            i16 = i14;
                                            if (i12 == iArr2[i16]) {
                                                i15 = i16;
                                                break;
                                            }
                                            i14 = i16 + 1;
                                        }
                                        if (i15 >= 0) {
                                            edn0Var.e(i15);
                                        }
                                        kgVar.b(new fg(i12, epoVar.a()));
                                    } else {
                                        o161Var5 = o161Var5;
                                        sdn0Var = sdn0Var;
                                        arrayList2.add(epoVar);
                                    }
                                    i10 = i44 + 1;
                                    size6 = i43;
                                    sdn0Var = sdn0Var;
                                    o161Var5 = o161Var5;
                                }
                                o161Var2 = o161Var5;
                                size7 = arrayList2.size();
                                while (i11 < size7) {
                                    epo epoVar4 = (epo) arrayList2.get(i11);
                                    int iC3 = edn0Var.c(i11);
                                    ina1Var.e(iC3, epoVar4.a());
                                    sdn0VarA.g(iC3, epoVar4.a());
                                    kgVar.b(new fg(iC3, epoVar4.a()));
                                }
                            } else {
                                o161Var2 = o161Var5;
                                size5 = list.size();
                                while (i8 < size5) {
                                    epo epoVar5 = (epo) list.get(i8);
                                    int iC4 = edn0Var2.c(i8);
                                    ina1Var.e(iC4, epoVar5.a());
                                    sdn0VarA.g(iC4, epoVar5.a());
                                    kgVar.b(new fg(iC4, epoVar5.a()));
                                }
                            }
                            pa4Var.O0.e(i3, ina1Var);
                            ina1Var2.e(i3, sdn0VarA);
                        } else {
                            o161Var2 = o161Var5;
                        }
                    }
                    kgVar.s(y1a1.D(v161Var7, resources3));
                    iD = pa4Var.Y0.d(i3);
                    if (iD != -1) {
                        k75VarQ2 = flo1.q(ha4Var2.getAndroidViewsHandler$ui(), iD);
                        if (k75VarQ2 != null) {
                            accessibilityNodeInfo.setTraversalBefore(k75VarQ2);
                            ha4Var = ha4Var2;
                        } else {
                            ha4Var = ha4Var2;
                            accessibilityNodeInfo.setTraversalBefore(ha4Var, iD);
                        }
                        bundle = null;
                        pa4Var.a(i3, kgVar, pa4Var.a1, (Bundle) null);
                    } else {
                        bundle = null;
                        ha4Var = ha4Var2;
                    }
                    iD2 = pa4Var.Z0.d(i3);
                    if (iD2 != -1) {
                        accessibilityNodeInfo.setTraversalAfter(k75VarQ);
                        pa4Var.a(i3, kgVar, pa4Var.b1, bundle);
                    }
                    str = (String) eko1.v(o161Var2, yoi1.f);
                    if (str != null) {
                        kgVar.l(str);
                    }
                } else {
                    pa4Var = pa4Var2;
                    i3 = i;
                    kgVar = null;
                }
            }
        }
        if (pa4Var.Y) {
            if (i3 == pa4Var.h) {
                pa4Var.t = kgVar;
            }
            if (i3 == pa4Var.i) {
                pa4Var.X = kgVar;
            }
        }
        return kgVar;
    }

    @Override // p.ng
    public final kg findFocus(int i) {
        pa4 pa4Var = this.a;
        if (i != 1) {
            if (i == 2) {
                return createAccessibilityNodeInfo(pa4Var.h);
            }
            hhg1.n(f4i1.c(i, "Unknown focus type: "));
            return null;
        }
        int i2 = pa4Var.i;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x0265  */
    /* JADX WARN: Code duplicated, block: B:278:0x0447  */
    /* JADX WARN: Code duplicated, block: B:279:0x0449  */
    /* JADX WARN: Code duplicated, block: B:282:0x044e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0450  */
    /* JADX WARN: Code duplicated, block: B:286:0x0456  */
    /* JADX WARN: Code duplicated, block: B:287:0x0458  */
    /* JADX WARN: Code duplicated, block: B:290:0x045e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0460  */
    /* JADX WARN: Code duplicated, block: B:294:0x0466  */
    /* JADX WARN: Code duplicated, block: B:295:0x0468  */
    /* JADX WARN: Code duplicated, block: B:298:0x046e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0470  */
    /* JADX WARN: Code duplicated, block: B:306:0x047c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0488  */
    /* JADX WARN: Code duplicated, block: B:316:0x048d  */
    /* JADX WARN: Code duplicated, block: B:318:0x0495  */
    /* JADX WARN: Code duplicated, block: B:321:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:326:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:328:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:331:0x04da  */
    /* JADX WARN: Code duplicated, block: B:334:0x04df  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:338:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:341:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:343:0x0506  */
    /* JADX WARN: Code duplicated, block: B:345:0x0523  */
    /* JADX WARN: Code duplicated, block: B:348:0x0528  */
    /* JADX WARN: Code duplicated, block: B:353:0x0542  */
    /* JADX WARN: Code duplicated, block: B:356:0x054b  */
    /* JADX WARN: Code duplicated, block: B:360:0x0552  */
    /* JADX WARN: Code duplicated, block: B:362:0x055c  */
    /* JADX WARN: Code duplicated, block: B:365:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:408:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:411:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:414:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:416:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:417:0x0602  */
    /* JADX WARN: Code duplicated, block: B:419:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x060d  */
    /* JADX WARN: Code duplicated, block: B:423:0x0612  */
    /* JADX WARN: Code duplicated, block: B:426:0x0619  */
    /* JADX WARN: Code duplicated, block: B:428:0x0621  */
    /* JADX WARN: Code duplicated, block: B:435:0x063d  */
    /* JADX WARN: Code duplicated, block: B:437:0x0641  */
    /* JADX WARN: Code duplicated, block: B:439:0x0649  */
    /* JADX WARN: Code duplicated, block: B:440:0x064b  */
    /* JADX WARN: Code duplicated, block: B:442:0x064f  */
    /* JADX WARN: Code duplicated, block: B:444:0x0655  */
    /* JADX WARN: Code duplicated, block: B:445:0x0657  */
    /* JADX WARN: Code duplicated, block: B:448:0x065c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0797  */
    /* JADX WARN: Code duplicated, block: B:552:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:559:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:561:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:563:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:565:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0144  */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x01b8, code lost:
    
        r1 = null;
     */
    @Override // p.ng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAction(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.la4.performAction(int, int, android.os.Bundle):boolean");
    }
}
