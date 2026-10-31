package p;

import android.graphics.Color;
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
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class xxq0 {
    public static final cqs0 a;
    public static final kja b;
    public static final cqs0 c;

    static {
        pkx pkxVar = pkx.c;
        mmr0 mmr0Var = new mmr0("AUDIOBOOK", pkxVar);
        ilx ilxVar = ilx.c;
        mmr0 mmr0Var2 = new mmr0("CHECK", ilxVar);
        ktx ktxVar = ktx.c;
        mmr0 mmr0Var3 = new mmr0("TIME", ktxVar);
        mmr0 mmr0Var4 = new mmr0("add-podcast", sjx.c);
        mmr0 mmr0Var5 = new mmr0("addon", xjx.c);
        mmr0 mmr0Var6 = new mmr0("audiobook", pkxVar);
        mmr0 mmr0Var7 = new mmr0("background", skx.c);
        mmr0 mmr0Var8 = new mmr0("blocks", vkx.c);
        mmr0 mmr0Var9 = new mmr0("check", ilxVar);
        mmr0 mmr0Var10 = new mmr0("edit", xmx.c);
        mmr0 mmr0Var11 = new mmr0("exclamation-circle", cnx.c);
        tnx tnxVar = tnx.c;
        mmr0 mmr0Var12 = new mmr0("group-session", tnxVar);
        mmr0 mmr0Var13 = new mmr0("headphones-sparkling", wnx.c);
        jox joxVar = jox.c;
        mmr0 mmr0Var14 = new mmr0("lightning", joxVar);
        mmr0 mmr0Var15 = new mmr0("lightning-active", joxVar);
        mpx mpxVar = mpx.c;
        mmr0 mmr0Var16 = new mmr0("offline", mpxVar);
        mmr0 mmr0Var17 = new mmr0("payment", upx.c);
        mmr0 mmr0Var18 = new mmr0("plus", hrx.c);
        qrx qrxVar = qrx.c;
        a = mqo1.t(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, mmr0Var13, mmr0Var14, mmr0Var15, mmr0Var16, mmr0Var17, mmr0Var18, new mmr0("queue", qrxVar), new mmr0("released", xrx.c), new mmr0("soundwave", ssx.c), new mmr0("spotify-logo", wsx.c), new mmr0("time", ktxVar), new mmr0("tune", ptx.c)});
        b = new kja(u7h.c, new n6a1(u7h.f));
        long jG = z4p1.g(4278998054L);
        Float fValueOf = Float.valueOf(0.0f);
        mmr0 mmr0Var19 = new mmr0(fValueOf, new u7h(z4p1.g(4280211296L)));
        mmr0 mmr0Var20 = new mmr0(Float.valueOf(0.509615f), new u7h(z4p1.g(4288082102L)));
        Float fValueOf2 = Float.valueOf(1.0f);
        c = mqo1.t(new mmr0[]{new mmr0(qrxVar, new kja(jG, v9c.l(new mmr0[]{mmr0Var19, mmr0Var20, new mmr0(fValueOf2, new u7h(z4p1.g(4291818858L)))}, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0))), new mmr0(tnxVar, new kja(z4p1.g(4286586221L), v9c.l(new mmr0[]{new mmr0(Float.valueOf(0.298077f), new u7h(z4p1.g(4292901325L))), new mmr0(Float.valueOf(0.644231f), new u7h(z4p1.g(4294763855L))), new mmr0(fValueOf2, new u7h(z4p1.g(4294301401L)))}, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0))), new mmr0(mpxVar, new kja(z4p1.g(4282122468L), v9c.l(new mmr0[]{new mmr0(fValueOf, new u7h(z4p1.g(4288082102L))), new mmr0(Float.valueOf(0.585f), new u7h(z4p1.g(4291818858L))), new mmr0(fValueOf2, new u7h(z4p1.g(4280211296L)))}, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0)))});
    }

    public static final af5 a(String str, String str2, b0k b0kVar) {
        ye5 ye5Var;
        String str3;
        uwr uwrVar = cbx.a;
        long j = cbx.a(b0kVar).b.g;
        ye5 ye5Var2 = new ye5();
        ye5Var2.g(str);
        if (str2 == null || ihc1.y0(str2)) {
            ye5Var = ye5Var2;
        } else {
            ye5Var2.g(" • ");
            try {
                ye5Var = ye5Var2;
                try {
                    int iO = ye5Var.o(new zma1(j, (TextUnit) null, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, (TextUnit) null, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    str3 = str2;
                    try {
                        try {
                            ye5Var.g(str3);
                        } finally {
                            ye5Var.k(iO);
                        }
                    } catch (NoSuchMethodError unused) {
                        ye5Var.g(str3);
                    }
                } catch (NoSuchMethodError unused2) {
                    str3 = str2;
                }
            } catch (NoSuchMethodError unused3) {
                str3 = str2;
                ye5Var = ye5Var2;
            }
        }
        return ye5Var.p();
    }

    public static final af5 b(String str, iu30 iu30Var) {
        ye5 ye5Var = new ye5();
        StringBuilder sb = new StringBuilder();
        p811 p811Var = new p811();
        p811Var.a = qdh0.a;
        p811 p811Var2 = new p811();
        p811Var2.a = "";
        p811 p811Var3 = new p811();
        p811Var3.a = "";
        str.chars().forEach(new wxq0(p811Var, ye5Var, sb, p811Var2, p811Var3, iu30Var));
        ye5Var.g(sb.toString());
        return ye5Var.p();
    }

    public static final long c(String str) {
        try {
            return z4p1.e(Color.parseColor(str));
        } catch (Exception unused) {
            int i = u7h.l;
            return u7h.f;
        }
    }

    public static final hux d(String str) {
        return (hux) a.getOrDefault(str, skx.c);
    }
}
