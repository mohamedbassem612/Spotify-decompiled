package p;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import app.p000rive.semantics.SemanticState;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rw4 implements uor0 {
    public final boolean X;
    public final int Y;
    public final int Z;
    public final String a;
    public final lee1 b;
    public final List c;
    public final List d;
    public final f930 e;
    public final wat f;
    public final o45 g;
    public final CharSequence h;
    public final olb0 i;
    public dlg1 t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.f5x */
    /* JADX WARN: Code duplicated, block: B:10:0x0064  */
    /* JADX WARN: Code duplicated, block: B:229:0x0463  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:244:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:246:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:254:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:256:0x050a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0523  */
    /* JADX WARN: Code duplicated, block: B:261:0x052f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0542  */
    /* JADX WARN: Code duplicated, block: B:283:0x055d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0599  */
    /* JADX WARN: Code duplicated, block: B:288:0x059f  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:295:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:297:0x05e1 A[LOOP:9: B:296:0x05df->B:297:0x05e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:302:0x0602  */
    /* JADX WARN: Code duplicated, block: B:304:0x0609  */
    /* JADX WARN: Code duplicated, block: B:306:0x060d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0616  */
    /* JADX WARN: Code duplicated, block: B:309:0x0620  */
    /* JADX WARN: Code duplicated, block: B:320:0x0658  */
    /* JADX WARN: Code duplicated, block: B:325:0x0677  */
    /* JADX WARN: Code duplicated, block: B:327:0x0683  */
    /* JADX WARN: Code duplicated, block: B:334:0x0697  */
    /* JADX WARN: Code duplicated, block: B:376:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:378:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:380:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:400:0x0837  */
    /* JADX WARN: Code duplicated, block: B:402:0x0848  */
    /* JADX WARN: Code duplicated, block: B:403:0x084d  */
    /* JADX WARN: Code duplicated, block: B:405:0x0858  */
    /* JADX WARN: Code duplicated, block: B:406:0x085f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0862  */
    /* JADX WARN: Code duplicated, block: B:411:0x086a  */
    /* JADX WARN: Code duplicated, block: B:413:0x0876  */
    /* JADX WARN: Code duplicated, block: B:414:0x0879  */
    /* JADX WARN: Code duplicated, block: B:416:0x087d  */
    /* JADX WARN: Code duplicated, block: B:423:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:427:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:429:0x08e1 A[LOOP:8: B:428:0x08df->B:429:0x08e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:432:0x090d  */
    /* JADX WARN: Code duplicated, block: B:434:0x0916  */
    /* JADX WARN: Code duplicated, block: B:436:0x0921  */
    /* JADX WARN: Code duplicated, block: B:437:0x0924  */
    /* JADX WARN: Code duplicated, block: B:440:0x093a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0941  */
    /* JADX WARN: Code duplicated, block: B:443:0x094c  */
    /* JADX WARN: Code duplicated, block: B:444:0x094e  */
    /* JADX WARN: Code duplicated, block: B:447:0x0954  */
    /* JADX WARN: Code duplicated, block: B:448:0x0958  */
    /* JADX WARN: Code duplicated, block: B:450:0x095b  */
    /* JADX WARN: Code duplicated, block: B:451:0x095e  */
    /* JADX WARN: Code duplicated, block: B:453:0x0961  */
    /* JADX WARN: Code duplicated, block: B:454:0x0964  */
    /* JADX WARN: Code duplicated, block: B:456:0x0967  */
    /* JADX WARN: Code duplicated, block: B:457:0x0969  */
    /* JADX WARN: Code duplicated, block: B:459:0x096c  */
    /* JADX WARN: Code duplicated, block: B:460:0x096f  */
    /* JADX WARN: Code duplicated, block: B:462:0x0972  */
    /* JADX WARN: Code duplicated, block: B:463:0x0975  */
    /* JADX WARN: Code duplicated, block: B:465:0x0978  */
    /* JADX WARN: Code duplicated, block: B:472:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:484:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0830 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x098d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0060  */
    /* JADX WARN: Instruction removed from duplicated block: B:427:0x08c7, please report this as an issue */
    public rw4(String str, lee1 lee1Var, List list, List list2, f930 f930Var, wat watVar, boolean z) throws f5x {
        boolean zBooleanValue;
        Locale locale;
        int i;
        f5x f5xVar;
        Object obj;
        qw4 qw4Var;
        CharSequence charSequenceH;
        int i2;
        u8e1 u8e1Var;
        qw4 qw4Var2;
        float f;
        List list3;
        ArrayList arrayList;
        List list4;
        int size;
        int i3;
        FontFamily fontFamily;
        f5x zma1Var;
        gjm gjmVar;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        Collection collection;
        int i6;
        int i7;
        int i8;
        int size4;
        f5x f5xVarD;
        int i9;
        ArrayList arrayList2;
        f5x f5xVar2;
        int i10;
        int i11;
        int i12;
        List list5;
        int size5;
        int i13;
        boolean z2;
        boolean z3;
        Spannable spannable;
        u8e1 u8e1Var2;
        float f2;
        int size6;
        int i14;
        int size7;
        int i15;
        int i16;
        long jB;
        int i17;
        long jB2;
        int i18;
        byte b;
        int i19;
        Object obj2;
        f5x f5xVar3;
        float f3;
        float fK;
        long j;
        long jB3;
        float fC;
        int size8;
        int i20;
        ze5 ze5Var;
        zma1 zma1Var2;
        int i21;
        ze5 ze5Var2;
        Object obj3;
        int i22;
        TextDecoration textDecoration;
        Spannable spannable2;
        int i23;
        int i24;
        TextDecoration textDecoration2;
        int i25;
        ze5 ze5Var3;
        Object obj4;
        zma1 zma1Var3;
        int i26;
        long j2;
        long j3;
        long jB4;
        float fC2;
        long jB5;
        float fC3;
        edt0 edt0Var;
        edt0 edt0Var2;
        this.a = str;
        this.b = lee1Var;
        this.c = list;
        this.d = list2;
        this.e = f930Var;
        this.f = watVar;
        float fH = watVar.h();
        o45 o45Var = new o45(1);
        ((TextPaint) o45Var).density = fH;
        o45Var.b = TextDecoration.b;
        o45Var.c = (byte) 3;
        o45Var.d = Shadow.d;
        this.g = o45Var;
        boolean zS = mgo1.s(lee1Var);
        zma1 zma1Var4 = lee1Var.a;
        cpr0 cpr0Var = lee1Var.b;
        if (zS) {
            her herVar = e4x.a;
            zBooleanValue = ((Boolean) e4x.a.g().getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.X = zBooleanValue;
        int i27 = cpr0Var.b;
        LocaleList localeList = zma1Var4.k;
        if (i27 == 4) {
            i = 2;
        } else if (i27 == 5) {
            i = 3;
        } else if (i27 == 1) {
            i = 0;
        } else if (i27 == 2) {
            i = 1;
        } else {
            if (i27 != 3 && i27 != 0) {
                eg.m("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((localeList == null || (locale = localeList.b().a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.Y = i;
        this.Z = -1;
        qw4 qw4Var3 = new qw4(this, (byte) 0);
        gbe1 gbe1Var = cpr0Var.i;
        gbe1Var = gbe1Var == null ? gbe1.c : gbe1Var;
        o45Var.setFlags(gbe1Var.b ? o45Var.getFlags() | SemanticState.Focused : o45Var.getFlags() & (-129));
        int i28 = gbe1Var.a;
        if (i28 == 1) {
            o45Var.setFlags(o45Var.getFlags() | 64);
            o45Var.setHinting(0);
        } else if (i28 == 2) {
            o45Var.getFlags();
            o45Var.setHinting(1);
        } else if (i28 == 3) {
            o45Var.getFlags();
            o45Var.setHinting(0);
        } else {
            o45Var.getFlags();
        }
        int size9 = list.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size9) {
                f5xVar = null;
                obj = null;
                break;
            } else {
                obj = list.get(i29);
                f5xVar = null;
                if (((ze5) obj).a instanceof zma1) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        boolean z4 = obj != null;
        long j4 = zma1Var4.b;
        FontWeight fontWeight = zma1Var4.c;
        FontStyle fontStyle = zma1Var4.d;
        String str2 = zma1Var4.g;
        LocaleList localeList2 = zma1Var4.k;
        j8e1 j8e1Var = zma1Var4.a;
        TextGeometricTransform textGeometricTransform = zma1Var4.j;
        long j5 = zma1Var4.h;
        long jB6 = TextUnit.b(j4);
        boolean z5 = z4;
        if (wee1.a(jB6, 4294967296L)) {
            o45Var.setTextSize(watVar.q0(j4));
        } else if (wee1.a(jB6, 8589934592L)) {
            o45Var.setTextSize(TextUnit.c(j4) * o45Var.getTextSize());
        }
        FontFamily fontFamily2 = zma1Var4.f;
        if (fontFamily2 == null && fontStyle == null && fontWeight == null) {
            qw4Var = qw4Var3;
        } else {
            FontWeight fontWeight2 = fontWeight == null ? FontWeight.t : fontWeight;
            FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.a : 0);
            FontSynthesis fontSynthesis = zma1Var4.e;
            qw4Var = qw4Var3;
            o45Var.setTypeface((Typeface) qw4Var.J(fontFamily2, fontWeight2, fontStyle2, new FontSynthesis(fontSynthesis != null ? fontSynthesis.a : 65535)));
        }
        if (localeList2 != null) {
            LocaleList localeList3 = LocaleList.c;
            if (!localeList2.equals(uct0.a.i())) {
                ArrayList arrayList3 = new ArrayList(q7h.U(localeList2, 10));
                Iterator it = localeList2.a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ehe0) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                o45Var.setTextLocales(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            o45Var.setFontFeatureSettings(str2);
        }
        if (textGeometricTransform != null && !textGeometricTransform.equals(TextGeometricTransform.c)) {
            o45Var.setTextScaleX(o45Var.getTextScaleX() * textGeometricTransform.a);
            o45Var.setTextSkewX(o45Var.getTextSkewX() + textGeometricTransform.b);
        }
        o45Var.d(j8e1Var.a());
        o45Var.c(j8e1Var.c(), 9205357640488583168L, j8e1Var.b());
        o45Var.f(zma1Var4.n);
        o45Var.g(zma1Var4.m);
        o45Var.e(zma1Var4.p);
        if (wee1.a(TextUnit.b(j5), 4294967296L) && TextUnit.c(j5) != 0.0f) {
            float textScaleX = o45Var.getTextScaleX() * o45Var.getTextSize();
            float fQ0 = watVar.q0(j5);
            if (textScaleX != 0.0f) {
                o45Var.setLetterSpacing(fQ0 / textScaleX);
            }
        } else if (wee1.a(TextUnit.b(j5), 8589934592L)) {
            o45Var.setLetterSpacing(TextUnit.c(j5));
        }
        long j6 = zma1Var4.l;
        f5x f5xVar4 = zma1Var4.i;
        boolean z6 = z5 && wee1.a(TextUnit.b(j5), 4294967296L) && TextUnit.c(j5) != 0.0f;
        long j7 = u7h.k;
        boolean z7 = (z4h1.b(j6, j7) || z4h1.b(j6, u7h.j)) ? false : true;
        boolean z8 = (f5xVar4 == null || Float.compare(((BaselineShift) f5xVar4).a, 0.0f) == 0) ? false : true;
        f5x zma1Var5 = (z6 || z7 || z8) ? new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, z6 ? j5 : TextUnit.c, z8 ? f5xVar4 : f5xVar, (TextGeometricTransform) null, (LocaleList) null, z7 ? j6 : j7, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63103) : f5xVar;
        List list6 = this.c;
        if (zma1Var5 != null) {
            int size10 = list6.size() + 1;
            ArrayList arrayList4 = new ArrayList(size10);
            int i30 = 0;
            while (i30 < size10) {
                arrayList4.add(i30 == 0 ? new ze5(0, this.a.length(), zma1Var5) : (ze5) this.c.get(i30 - 1));
                i30++;
            }
            list6 = arrayList4;
        }
        String str3 = this.a;
        float textSize = this.g.getTextSize();
        lee1 lee1Var2 = this.b;
        List list7 = this.d;
        wat watVar2 = this.f;
        boolean z9 = this.X;
        String str4 = this.a;
        if (this.Z == -1) {
            this.Z = (str4.length() > 512 || ihc1.i0(str4, '\n')) ? 1 : 0;
        }
        ow4 ow4Var = pw4.a;
        if (z9 && a4x.d()) {
            wdt0 wdt0Var = lee1Var2.c;
            f5x f5xVar5 = (wdt0Var == null || (edt0Var2 = wdt0Var.b) == null) ? f5xVar : new f5x(edt0Var2.b);
            charSequenceH = a4x.a().h(0, str3.length(), (f5xVar5 != null && f5xVar5.a == 2) ? 1 : 0, str3);
            charSequenceH.getClass();
        } else {
            charSequenceH = str3;
        }
        if (!list6.isEmpty() || !list7.isEmpty() || !u890.j(lee1Var2.b.d, u8e1.c) || (lee1Var2.b.c & 1095216660480L) != 0) {
            Spannable spannableString = charSequenceH instanceof Spannable ? (Spannable) charSequenceH : new SpannableString(charSequenceH);
            zma1 zma1Var6 = lee1Var2.a;
            zma1 zma1Var7 = lee1Var2.a;
            cpr0 cpr0Var2 = lee1Var2.b;
            TextDecoration textDecoration3 = zma1Var6.m;
            TextDecoration textDecoration4 = TextDecoration.c;
            if (u890.j(textDecoration3, textDecoration4)) {
                spannableString.setSpan(pw4.a, 0, str3.length(), 33);
            }
            wdt0 wdt0Var2 = lee1Var2.c;
            if (((wdt0Var2 == null || (edt0Var = wdt0Var2.b) == null) ? false : edt0Var.a) && cpr0Var2.f == null) {
                float fL = y1a1.L(cpr0Var2.c, textSize, watVar2);
                if (!Float.isNaN(fL)) {
                    spannableString.setSpan(new nhc0(fL), 0, spannableString.length(), 33);
                }
            } else {
                BaselineShift baselineShift = zma1Var7.i;
                shc0 shc0Var = cpr0Var2.f;
                shc0Var = shc0Var == null ? shc0.d : shc0Var;
                float fL2 = y1a1.L(cpr0Var2.c, textSize, watVar2);
                if (!Float.isNaN(fL2)) {
                    int length = (spannableString.length() == 0 || ihc1.z0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i31 = shc0Var.b;
                    i2 = 0;
                    spannableString.setSpan(new thc0((i31 & 1) > 0, length, shc0Var.c, (i31 & 16) > 0, fL2, shc0Var.a), 0, spannableString.length(), 33);
                }
                u8e1Var = cpr0Var2.d;
                if (u8e1Var != null) {
                    i26 = i2;
                    j2 = u8e1Var.a;
                    j3 = u8e1Var.b;
                    qw4Var2 = qw4Var;
                    list3 = list7;
                    if ((!TextUnit.a(j2, fc11.G(i26)) && TextUnit.a(j3, fc11.G(i26))) || (j2 & 1095216660480L) == r13 || (j3 & 1095216660480L) == 0) {
                        f = textSize;
                    } else {
                        jB4 = TextUnit.b(j2);
                        f = textSize;
                        if (wee1.a(jB4, 4294967296L)) {
                            fC2 = watVar2.q0(j2);
                        } else if (wee1.a(jB4, 8589934592L)) {
                            fC2 = TextUnit.c(j2) * f;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB5 = TextUnit.b(j3);
                        if (wee1.a(jB5, 4294967296L)) {
                            fC3 = watVar2.q0(j3);
                        } else if (wee1.a(jB5, 8589934592L)) {
                            fC3 = TextUnit.c(j3) * f;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                } else {
                    qw4Var2 = qw4Var;
                    f = textSize;
                    list3 = list7;
                }
                arrayList = new ArrayList(list6.size());
                list4 = list6;
                size = list4.size();
                for (i3 = 0; i3 < size; i3++) {
                    ze5Var3 = (ze5) list6.get(i3);
                    obj4 = ze5Var3.a;
                    if (obj4 instanceof zma1) {
                        zma1Var3 = (zma1) obj4;
                        if (zma1Var3.f == null || zma1Var3.d != null || zma1Var3.c != null || zma1Var3.e != null) {
                            arrayList.add(ze5Var3);
                        }
                    }
                }
                fontFamily = zma1Var7.f;
                if (fontFamily != null && zma1Var7.d == null && zma1Var7.c == null && zma1Var7.e == null) {
                    zma1Var = f5xVar;
                } else {
                    zma1Var = new zma1(0L, 0L, zma1Var7.c, zma1Var7.d, zma1Var7.e, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65475);
                }
                gjmVar = new gjm(spannableString, qw4Var2, (byte) 2);
                if (arrayList.size() <= 1) {
                    if (!arrayList.isEmpty()) {
                        zma1 zma1Var8 = (zma1) ((ze5) arrayList.get(0)).a;
                        gjmVar.invoke(zma1Var != null ? zma1Var.d(zma1Var8) : zma1Var8, Integer.valueOf(((ze5) arrayList.get(0)).b), Integer.valueOf(((ze5) arrayList.get(0)).c));
                    }
                    collection = list4;
                } else {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    i5 = 0;
                    while (i5 < size3) {
                        ze5 ze5Var4 = (ze5) arrayList.get(i5);
                        iArr[i5] = ze5Var4.b;
                        iArr[i5 + size2] = ze5Var4.c;
                        i5++;
                        list4 = list4;
                    }
                    collection = list4;
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        bhn0.t("Array is empty.");
                        throw f5xVar;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            f5xVar2 = zma1Var;
                            i10 = i4;
                        } else {
                            size4 = arrayList.size();
                            f5xVarD = zma1Var;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList5 = arrayList;
                                ze5 ze5Var5 = (ze5) arrayList.get(i9);
                                f5x f5xVar6 = zma1Var;
                                i11 = ze5Var5.b;
                                int i32 = i4;
                                i12 = ze5Var5.c;
                                if (i11 == i12 && bf5.b(i6, i8, i11, i12)) {
                                    f5x f5xVar7 = (zma1) ze5Var5.a;
                                    f5xVarD = f5xVarD != null ? f5xVarD.d(f5xVar7) : f5xVar7;
                                }
                                i9++;
                                zma1Var = f5xVar6;
                                arrayList = arrayList5;
                                i4 = i32;
                            }
                            arrayList2 = arrayList;
                            f5xVar2 = zma1Var;
                            i10 = i4;
                            if (f5xVarD != null) {
                                gjmVar.invoke(f5xVarD, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7++;
                        list3 = list3;
                        zma1Var = f5xVar2;
                        arrayList = arrayList2;
                        i4 = i10;
                    }
                }
                list5 = list3;
                size5 = collection.size();
                i13 = 0;
                z2 = false;
                while (i13 < size5) {
                    ze5Var2 = (ze5) list6.get(i13);
                    obj3 = ze5Var2.a;
                    if (obj3 instanceof zma1) {
                        i23 = ze5Var2.b;
                        int i33 = ze5Var2.c;
                        if (i23 >= 0 || i23 >= spannableString.length() || i33 <= i23 || i33 > spannableString.length()) {
                            size5 = size5;
                            i22 = i13;
                            textDecoration = textDecoration4;
                            z2 = z2;
                            spannable2 = spannableString;
                        } else {
                            zma1 zma1Var9 = (zma1) obj3;
                            long j8 = zma1Var9.h;
                            BaselineShift baselineShift2 = zma1Var9.i;
                            j8e1 j8e1Var2 = zma1Var9.a;
                            if (baselineShift2 != null) {
                                spannableString.setSpan(new oda((byte) 0, baselineShift2.a), i23, i33, 33);
                            }
                            i22 = i13;
                            y1a1.N(spannableString, j8e1Var2.a(), i23, i33);
                            n6a1 n6a1VarC = j8e1Var2.c();
                            float fB = j8e1Var2.b();
                            if (n6a1VarC == null) {
                                i24 = 33;
                            } else if (n6a1VarC instanceof n6a1) {
                                y1a1.N(spannableString, n6a1VarC.a, i23, i33);
                                i24 = 33;
                            } else {
                                aw61 aw61Var = new aw61((zv61) n6a1VarC, fB);
                                i24 = 33;
                                spannableString.setSpan(aw61Var, i23, i33, 33);
                            }
                            TextDecoration textDecoration5 = zma1Var9.m;
                            if (textDecoration5 != null) {
                                textDecoration2 = textDecoration4;
                                i24 = 33;
                                spannableString.setSpan(new w3e1(textDecoration5.a(textDecoration2), textDecoration5.a(TextDecoration.d)), i23, i33, 33);
                            } else {
                                textDecoration2 = textDecoration4;
                            }
                            textDecoration = textDecoration2;
                            y1a1.O(spannableString, zma1Var9.b, watVar2, i23, i33);
                            spannable2 = spannableString;
                            String str5 = zma1Var9.g;
                            if (str5 != null) {
                                spannable2.setSpan(new qlg(str5, (byte) 3), i23, i33, i24);
                            }
                            TextGeometricTransform textGeometricTransform2 = zma1Var9.j;
                            if (textGeometricTransform2 != null) {
                                spannable2.setSpan(new ScaleXSpan(textGeometricTransform2.a), i23, i33, i24);
                                spannable2.setSpan(new oda((byte) 1, textGeometricTransform2.b), i23, i33, i24);
                            }
                            y1a1.S(spannable2, zma1Var9.k, i23, i33);
                            long j9 = zma1Var9.l;
                            if (j9 != 16) {
                                spannable2.setSpan(new BackgroundColorSpan(z4p1.G(j9)), i23, i33, 33);
                            }
                            Shadow shadow = zma1Var9.n;
                            if (shadow != null) {
                                long j10 = shadow.b;
                                ew61 ew61Var = new ew61(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), k5p1.l(shadow.c), z4p1.G(shadow.a));
                                i25 = 33;
                                spannable2.setSpan(ew61Var, i23, i33, 33);
                            } else {
                                i25 = 33;
                            }
                            DrawStyle drawStyle = zma1Var9.p;
                            if (drawStyle != null) {
                                spannable2.setSpan(new o7v(drawStyle), i23, i33, i25);
                            }
                            if (wee1.a(TextUnit.b(j8), 4294967296L) || wee1.a(TextUnit.b(j8), 8589934592L)) {
                                z2 = true;
                            }
                        }
                    } else {
                        size5 = size5;
                        i22 = i13;
                        textDecoration = textDecoration4;
                        z2 = z2;
                        spannable2 = spannableString;
                    }
                    spannableString = spannable2;
                    z2 = z2;
                    textDecoration4 = textDecoration;
                    i13 = i22 + 1;
                    size5 = size5;
                }
                z3 = z2;
                spannable = spannableString;
                if (z3) {
                    size8 = collection.size();
                    for (i20 = 0; i20 < size8; i20++) {
                        ze5Var = (ze5) list6.get(i20);
                        zma1Var2 = (we5) ze5Var.a;
                        if (zma1Var2 instanceof zma1) {
                            i21 = ze5Var.b;
                            int i34 = ze5Var.c;
                            if (i21 < 0 && i21 < spannable.length() && i34 > i21 && i34 <= spannable.length()) {
                                long j11 = zma1Var2.h;
                                long jB7 = TextUnit.b(j11);
                                f5x g3c0Var = wee1.a(jB7, 4294967296L) ? new g3c0(watVar2.q0(j11)) : wee1.a(jB7, 8589934592L) ? new f3c0(TextUnit.c(j11)) : f5xVar;
                                if (g3c0Var != null) {
                                    spannable.setSpan(g3c0Var, i21, i34, 33);
                                }
                            }
                        }
                    }
                }
                u8e1Var2 = cpr0Var2.d;
                if (u8e1Var2 != null) {
                    j = u8e1Var2.a;
                    jB3 = TextUnit.b(j);
                    if (wee1.a(jB3, 4294967296L)) {
                        fC = watVar2.q0(j);
                    } else if (wee1.a(jB3, 8589934592L)) {
                        fC = TextUnit.c(j) * f;
                    } else {
                        fC = 0.0f;
                    }
                    f2 = fC;
                } else {
                    f2 = 0.0f;
                }
                size6 = collection.size();
                i14 = 0;
                while (i14 < size6) {
                    ze5 ze5Var6 = (ze5) list6.get(i14);
                    obj2 = ze5Var6.a;
                    if (obj2 instanceof gcc) {
                        f5xVar3 = (gcc) obj2;
                    } else {
                        f5xVar3 = f5xVar;
                    }
                    if (f5xVar3 != null) {
                        f3 = f;
                        fK = y1a1.K(f5xVar3.a, f3, watVar2);
                        float fK2 = y1a1.K(f5xVar3.b, f3, watVar2);
                        float fK3 = y1a1.K(f5xVar3.c, f3, watVar2);
                        if (Float.isNaN(fK) && !Float.isNaN(fK2) && !Float.isNaN(fK3)) {
                            wat watVar3 = watVar2;
                            watVar2 = watVar3;
                            spannable.setSpan(new wpo(fK, fK2, fK3, watVar3, f2), ze5Var6.b, ze5Var6.c, 33);
                        }
                    } else {
                        f3 = f;
                    }
                    i14++;
                    f = f3;
                }
                size7 = list5.size();
                i15 = 0;
                while (i15 < size7) {
                    List list8 = list5;
                    ze5 ze5Var7 = (ze5) list8.get(i15);
                    d6t0 d6t0Var = (d6t0) ze5Var7.a;
                    int i35 = ze5Var7.b;
                    int i36 = ze5Var7.c;
                    for (Object obj5 : spannable.getSpans(i35, i36, b2h1.class)) {
                        spannable.removeSpan((b2h1) obj5);
                    }
                    long j12 = d6t0Var.a;
                    long j13 = d6t0Var.b;
                    float fC4 = TextUnit.c(j12);
                    int i37 = size7;
                    int i38 = i15;
                    jB = TextUnit.b(d6t0Var.a);
                    Spannable spannable3 = spannable;
                    list5 = list8;
                    if (wee1.a(jB, 4294967296L)) {
                        i17 = 0;
                    } else if (wee1.a(jB, 8589934592L)) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    wat watVar4 = watVar2;
                    float fC5 = TextUnit.c(j13);
                    jB2 = TextUnit.b(j13);
                    if (wee1.a(jB2, 4294967296L)) {
                        i18 = 0;
                    } else if (wee1.a(jB2, 8589934592L)) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    b = d6t0Var.c;
                    if (b == 1) {
                        i19 = 0;
                    } else if (b == 2) {
                        i19 = 1;
                    } else {
                        i19 = 3;
                        if (b == 3) {
                            i19 = 2;
                        } else if (b != 4) {
                            if (b == 5) {
                                i19 = 4;
                            } else if (b == 6) {
                                i19 = 5;
                            } else {
                                if (b == 7) {
                                    eg.m("Invalid PlaceholderVerticalAlign");
                                    throw f5xVar;
                                }
                                i19 = 6;
                            }
                        }
                    }
                    n6t0 n6t0Var = new n6t0(fC4, i17, fC5, i18, watVar4, i19);
                    watVar2 = watVar4;
                    spannable3.setSpan(n6t0Var, i35, i36, 33);
                    i15 = i38 + 1;
                    size7 = i37;
                    spannable = spannable3;
                }
                charSequenceH = spannable;
            }
            i2 = 0;
            u8e1Var = cpr0Var2.d;
            if (u8e1Var != null) {
                i26 = i2;
                j2 = u8e1Var.a;
                j3 = u8e1Var.b;
                qw4Var2 = qw4Var;
                list3 = list7;
                if (!TextUnit.a(j2, fc11.G(i26))) {
                    jB4 = TextUnit.b(j2);
                    f = textSize;
                    if (wee1.a(jB4, 4294967296L)) {
                        fC2 = watVar2.q0(j2);
                    } else if (wee1.a(jB4, 8589934592L)) {
                        fC2 = TextUnit.c(j2) * f;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB5 = TextUnit.b(j3);
                    if (wee1.a(jB5, 4294967296L)) {
                        fC3 = watVar2.q0(j3);
                    } else if (wee1.a(jB5, 8589934592L)) {
                        fC3 = TextUnit.c(j3) * f;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                } else {
                    jB4 = TextUnit.b(j2);
                    f = textSize;
                    if (wee1.a(jB4, 4294967296L)) {
                        fC2 = watVar2.q0(j2);
                    } else if (wee1.a(jB4, 8589934592L)) {
                        fC2 = TextUnit.c(j2) * f;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB5 = TextUnit.b(j3);
                    if (wee1.a(jB5, 4294967296L)) {
                        fC3 = watVar2.q0(j3);
                    } else if (wee1.a(jB5, 8589934592L)) {
                        fC3 = TextUnit.c(j3) * f;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                }
            } else {
                qw4Var2 = qw4Var;
                f = textSize;
                list3 = list7;
            }
            arrayList = new ArrayList(list6.size());
            list4 = list6;
            size = list4.size();
            while (i3 < size) {
                ze5Var3 = (ze5) list6.get(i3);
                obj4 = ze5Var3.a;
                if (obj4 instanceof zma1) {
                    zma1Var3 = (zma1) obj4;
                    if (zma1Var3.f == null) {
                        arrayList.add(ze5Var3);
                    } else {
                        arrayList.add(ze5Var3);
                    }
                }
            }
            fontFamily = zma1Var7.f;
            if (fontFamily != null) {
                zma1Var = new zma1(0L, 0L, zma1Var7.c, zma1Var7.d, zma1Var7.e, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65475);
            } else {
                zma1Var = new zma1(0L, 0L, zma1Var7.c, zma1Var7.d, zma1Var7.e, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65475);
            }
            gjmVar = new gjm(spannableString, qw4Var2, (byte) 2);
            if (arrayList.size() <= 1) {
                if (!arrayList.isEmpty()) {
                    zma1 zma1Var10 = (zma1) ((ze5) arrayList.get(0)).a;
                    gjmVar.invoke(zma1Var != null ? zma1Var.d(zma1Var10) : zma1Var10, Integer.valueOf(((ze5) arrayList.get(0)).b), Integer.valueOf(((ze5) arrayList.get(0)).c));
                }
                collection = list4;
            } else {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                i5 = 0;
                while (i5 < size3) {
                    ze5 ze5Var8 = (ze5) arrayList.get(i5);
                    iArr[i5] = ze5Var8.b;
                    iArr[i5 + size2] = ze5Var8.c;
                    i5++;
                    list4 = list4;
                }
                collection = list4;
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    bhn0.t("Array is empty.");
                    throw f5xVar;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        f5xVar2 = zma1Var;
                        i10 = i4;
                    } else {
                        size4 = arrayList.size();
                        f5xVarD = zma1Var;
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList6 = arrayList;
                            ze5 ze5Var9 = (ze5) arrayList.get(i9);
                            f5x f5xVar8 = zma1Var;
                            i11 = ze5Var9.b;
                            int i39 = i4;
                            i12 = ze5Var9.c;
                            if (i11 == i12) {
                            }
                            i9++;
                            zma1Var = f5xVar8;
                            arrayList = arrayList6;
                            i4 = i39;
                        }
                        arrayList2 = arrayList;
                        f5xVar2 = zma1Var;
                        i10 = i4;
                        if (f5xVarD != null) {
                            gjmVar.invoke(f5xVarD, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7++;
                    list3 = list3;
                    zma1Var = f5xVar2;
                    arrayList = arrayList2;
                    i4 = i10;
                }
            }
            list5 = list3;
            size5 = collection.size();
            i13 = 0;
            z2 = false;
            while (i13 < size5) {
                ze5Var2 = (ze5) list6.get(i13);
                obj3 = ze5Var2.a;
                if (obj3 instanceof zma1) {
                    i23 = ze5Var2.b;
                    int i310 = ze5Var2.c;
                    if (i23 >= 0) {
                        size5 = size5;
                        i22 = i13;
                        textDecoration = textDecoration4;
                        z2 = z2;
                        spannable2 = spannableString;
                    } else {
                        size5 = size5;
                        i22 = i13;
                        textDecoration = textDecoration4;
                        z2 = z2;
                        spannable2 = spannableString;
                    }
                } else {
                    size5 = size5;
                    i22 = i13;
                    textDecoration = textDecoration4;
                    z2 = z2;
                    spannable2 = spannableString;
                }
                spannableString = spannable2;
                z2 = z2;
                textDecoration4 = textDecoration;
                i13 = i22 + 1;
                size5 = size5;
            }
            z3 = z2;
            spannable = spannableString;
            if (z3) {
                size8 = collection.size();
                while (i20 < size8) {
                    ze5Var = (ze5) list6.get(i20);
                    zma1Var2 = (we5) ze5Var.a;
                    if (zma1Var2 instanceof zma1) {
                        i21 = ze5Var.b;
                        int i311 = ze5Var.c;
                        if (i21 < 0) {
                        }
                    }
                }
            }
            u8e1Var2 = cpr0Var2.d;
            if (u8e1Var2 != null) {
                j = u8e1Var2.a;
                jB3 = TextUnit.b(j);
                if (wee1.a(jB3, 4294967296L)) {
                    fC = watVar2.q0(j);
                } else if (wee1.a(jB3, 8589934592L)) {
                    fC = TextUnit.c(j) * f;
                } else {
                    fC = 0.0f;
                }
                f2 = fC;
            } else {
                f2 = 0.0f;
            }
            size6 = collection.size();
            i14 = 0;
            while (i14 < size6) {
                ze5 ze5Var10 = (ze5) list6.get(i14);
                obj2 = ze5Var10.a;
                if (obj2 instanceof gcc) {
                    f5xVar3 = (gcc) obj2;
                } else {
                    f5xVar3 = f5xVar;
                }
                if (f5xVar3 != null) {
                    f3 = f;
                    fK = y1a1.K(f5xVar3.a, f3, watVar2);
                    float fK4 = y1a1.K(f5xVar3.b, f3, watVar2);
                    float fK5 = y1a1.K(f5xVar3.c, f3, watVar2);
                    if (Float.isNaN(fK)) {
                    }
                } else {
                    f3 = f;
                }
                i14++;
                f = f3;
            }
            size7 = list5.size();
            i15 = 0;
            while (i15 < size7) {
                List list9 = list5;
                ze5 ze5Var11 = (ze5) list9.get(i15);
                d6t0 d6t0Var2 = (d6t0) ze5Var11.a;
                int i312 = ze5Var11.b;
                int i313 = ze5Var11.c;
                while (i16 < r9) {
                    spannable.removeSpan((b2h1) obj5);
                }
                long j14 = d6t0Var2.a;
                long j15 = d6t0Var2.b;
                float fC6 = TextUnit.c(j14);
                int i314 = size7;
                int i315 = i15;
                jB = TextUnit.b(d6t0Var2.a);
                Spannable spannable4 = spannable;
                list5 = list9;
                if (wee1.a(jB, 4294967296L)) {
                    i17 = 0;
                } else if (wee1.a(jB, 8589934592L)) {
                    i17 = 1;
                } else {
                    i17 = 2;
                }
                wat watVar5 = watVar2;
                float fC7 = TextUnit.c(j15);
                jB2 = TextUnit.b(j15);
                if (wee1.a(jB2, 4294967296L)) {
                    i18 = 0;
                } else if (wee1.a(jB2, 8589934592L)) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                b = d6t0Var2.c;
                if (b == 1) {
                    i19 = 0;
                } else if (b == 2) {
                    i19 = 1;
                } else {
                    i19 = 3;
                    if (b == 3) {
                        i19 = 2;
                    } else if (b != 4) {
                        if (b == 5) {
                            i19 = 4;
                        } else if (b == 6) {
                            i19 = 5;
                        } else {
                            if (b == 7) {
                                eg.m("Invalid PlaceholderVerticalAlign");
                                throw f5xVar;
                            }
                            i19 = 6;
                        }
                    }
                }
                n6t0 n6t0Var2 = new n6t0(fC6, i17, fC7, i18, watVar5, i19);
                watVar2 = watVar5;
                spannable4.setSpan(n6t0Var2, i312, i313, 33);
                i15 = i315 + 1;
                size7 = i314;
                spannable = spannable4;
            }
            charSequenceH = spannable;
        }
        this.h = charSequenceH;
        this.i = new olb0(charSequenceH, this.g, this.Y);
    }

    public final boolean a() {
        dlg1 dlg1Var = this.t;
        if (dlg1Var != null ? dlg1Var.r() : false) {
            return true;
        }
        if (!this.X && mgo1.s(this.b)) {
            her herVar = e4x.a;
            if (((Boolean) e4x.a.g().getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final CharSequence b() {
        return this.h;
    }

    public final olb0 c() {
        return this.i;
    }

    public final float d() {
        return this.i.a();
    }

    public final float e() {
        olb0 olb0Var = this.i;
        float f = olb0Var.e;
        CharSequence charSequence = olb0Var.a;
        TextPaint textPaint = olb0Var.b;
        if (!Float.isNaN(f)) {
            return olb0Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new bne(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, fj30.c);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new tr80(i, next, 1));
            } else {
                tr80 tr80Var = (tr80) priorityQueue.peek();
                if (tr80Var != null && ((rr80) tr80Var).b - ((rr80) tr80Var).a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new tr80(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                hhg1.k();
                return 0.0f;
            }
            tr80 tr80Var2 = (tr80) it.next();
            int i2 = ((rr80) tr80Var2).a;
            int i3 = ((rr80) tr80Var2).b;
            CharSequence charSequenceS = olb0Var.h;
            if (charSequenceS == null) {
                charSequenceS = fj30.s(charSequence);
                olb0Var.h = charSequenceS;
            }
            desiredWidth = Layout.getDesiredWidth(charSequenceS, i2, i3, textPaint);
            while (it.hasNext()) {
                tr80 tr80Var3 = (tr80) it.next();
                int i4 = ((rr80) tr80Var3).a;
                int i5 = ((rr80) tr80Var3).b;
                CharSequence charSequenceS2 = olb0Var.h;
                if (charSequenceS2 == null) {
                    charSequenceS2 = fj30.s(charSequence);
                    olb0Var.h = charSequenceS2;
                }
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(charSequenceS2, i4, i5, textPaint));
            }
        }
        olb0Var.e = desiredWidth;
        return desiredWidth;
    }

    public final lee1 f() {
        return this.b;
    }

    public final int g() {
        return this.Y;
    }

    public final o45 h() {
        return this.g;
    }
}
