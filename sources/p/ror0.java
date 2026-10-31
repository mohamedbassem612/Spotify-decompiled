package p;

import android.graphics.Color;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.Paragraph;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ror0 {
    public static final Paragraph.TextStyle a(Paragraph paragraph) {
        int iU = paragraph.u();
        int i = iU == 0 ? -1 : qor0.a[l1d.C(iU)];
        if (i == 1) {
            return paragraph.p().s();
        }
        if (i != 2) {
            return i != 3 ? Paragraph.TextStyle.n() : paragraph.q().t();
        }
        return paragraph.r().s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final mmr0 b(Paragraph.TextStyle textStyle, b0k b0kVar) throws NoWhenBranchMatchedException {
        String strU;
        lee1 lee1VarG = g(textStyle, textStyle.u(), textStyle.o(), j(textStyle), k(textStyle), b0kVar);
        long j = lee1VarG.a.b;
        long jG = fc11.G(24);
        fc11.p(j, jG);
        if (Float.compare(TextUnit.c(j), TextUnit.c(jG)) >= 0) {
            strU = r5b1.a.g("-\u200b", textStyle.u());
        } else {
            strU = textStyle.u();
        }
        return new mmr0(lee1VarG, strU);
    }

    public static final tnr0 c(Paragraph.Box box) {
        String strN;
        if (box == null) {
            return new tnr0();
        }
        String strN2 = box.n();
        long j = u7h.j;
        long jE = e(j, strN2);
        float fR = box.r();
        float fQ = box.q();
        long jE2 = j;
        Outline outlineP = box.p();
        float fP = outlineP != null ? outlineP.p() : 0.0f;
        Outline outlineP2 = box.p();
        if (outlineP2 != null && (strN = outlineP2.n()) != null) {
            jE2 = e(jE2, strN);
        }
        return new tnr0(jE, fR, fQ, new eor0(fP, jE2));
    }

    public static final long d(String str) {
        return z4p1.e(Color.parseColor(str));
    }

    public static final long e(long j, String str) {
        if (str == null || ihc1.y0(str)) {
            return j;
        }
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return j;
        }
    }

    public static final bor0 f(Paragraph.GlowBox glowBox) {
        long jE = e(u7h.j, glowBox.p());
        String strR = glowBox.r();
        if (ihc1.y0(strR)) {
            strR = null;
        }
        return new bor0(jE, strR, glowBox.n(), glowBox.q(), glowBox.s());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Failed to calculate best type for var: r2v81 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v81 ??, new type: androidx.compose.ui.text.font.FontWeight
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v4 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final p.lee1 g(com.spotify.wrapped.v1.proto.Paragraph.TextStyle r71, java.lang.String r72, int r73, androidx.compose.ui.text.font.FontWeight r74, float r75, p.b0k r76) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ror0.g(com.spotify.wrapped.v1.proto.Paragraph$TextStyle, java.lang.String, int, androidx.compose.ui.text.font.FontWeight, float, p.b0k):p.lee1");
    }

    public static final eor0 h(Outline outline) {
        String strN;
        return new eor0(outline != null ? outline.p() * 2 : 0.0f, (outline == null || (strN = outline.n()) == null) ? u7h.j : e(u7h.j, strN));
    }

    public static final a0e1 i(snr0 snr0Var) {
        int iOrdinal = snr0Var.ordinal();
        if (iOrdinal == 1) {
            return new a0e1(5);
        }
        if (iOrdinal == 2) {
            return new a0e1(3);
        }
        if (iOrdinal != 3) {
            return null;
        }
        return new a0e1(6);
    }

    public static final FontWeight j(Paragraph.TextStyle textStyle) {
        Paragraph.FontVariation fontVariationR = textStyle.r();
        Integer numValueOf = fontVariationR != null ? Integer.valueOf(fontVariationR.o()) : null;
        if (numValueOf != null && numValueOf.intValue() == 100) {
            return FontWeight.g;
        }
        if (numValueOf != null && numValueOf.intValue() == 200) {
            return FontWeight.h;
        }
        if (numValueOf != null && numValueOf.intValue() == 300) {
            return FontWeight.i;
        }
        if (numValueOf != null && numValueOf.intValue() == 400) {
            return FontWeight.t;
        }
        if (numValueOf != null && numValueOf.intValue() == 500) {
            return FontWeight.X;
        }
        if (numValueOf != null && numValueOf.intValue() == 600) {
            return FontWeight.Y;
        }
        if (numValueOf != null && numValueOf.intValue() == 700) {
            return FontWeight.Z;
        }
        if (numValueOf != null && numValueOf.intValue() == 800) {
            return FontWeight.N0;
        }
        if (numValueOf != null && numValueOf.intValue() == 900) {
            return FontWeight.O0;
        }
        return null;
    }

    public static final float k(Paragraph.TextStyle textStyle) {
        Paragraph.FontVariation fontVariationR = textStyle.r();
        Integer numValueOf = fontVariationR != null ? Integer.valueOf(fontVariationR.p()) : null;
        if (numValueOf != null && numValueOf.intValue() == 50) {
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            return 50.0f;
        }
        if (numValueOf != null && numValueOf.intValue() == 96) {
            uwr uwrVar2 = cbx.a;
            Object obj2 = ajx.a.b;
            return 96.0f;
        }
        if (numValueOf != null && numValueOf.intValue() == 150) {
            uwr uwrVar3 = cbx.a;
            Object obj3 = ajx.a.b;
            return 150.0f;
        }
        uwr uwrVar4 = cbx.a;
        Object obj4 = ajx.a.b;
        return 96.0f;
    }
}
