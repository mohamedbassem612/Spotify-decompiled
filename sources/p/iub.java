package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import java.util.Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iub extends hab0 implements iu30 {
    public static final iub N0;
    public static final iub O0;
    public static final iub P0;
    public static final iub Q0;
    public static final iub R0;
    public static final iub S0;
    public static final iub T0;
    public static final iub U0;
    public static final iub V0;
    public static final iub W0;
    public static final iub X;
    public static final iub X0;
    public static final iub Y;
    public static final iub Y0;
    public static final iub Z;
    public static final iub Z0;
    public static final iub a1;
    public static final iub b;
    public static final iub b1;
    public static final iub c;
    public static final iub c1;
    public static final iub d;
    public static final iub d1;
    public static final iub e;
    public static final iub e1;
    public static final iub f;
    public static final iub g;
    public static final iub h;
    public static final iub i;
    public static final iub t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new iub(i2, (byte) 0);
        c = new iub(i2, (byte) 1);
        d = new iub(i2, (byte) 2);
        e = new iub(i2, (byte) 3);
        f = new iub(i2, (byte) 4);
        g = new iub(i2, (byte) 5);
        h = new iub(i2, (byte) 6);
        i = new iub(i2, (byte) 7);
        t = new iub(i2, (byte) 8);
        X = new iub(i2, (byte) 9);
        Y = new iub(i2, (byte) 10);
        Z = new iub(i2, (byte) 11);
        N0 = new iub(i2, (byte) 12);
        O0 = new iub(i2, (byte) 13);
        P0 = new iub(i2, (byte) 14);
        Q0 = new iub(i2, (byte) 15);
        R0 = new iub(i2, (byte) 16);
        S0 = new iub(i2, (byte) 17);
        T0 = new iub(i2, (byte) 18);
        U0 = new iub(i2, (byte) 19);
        V0 = new iub(i2, (byte) 20);
        W0 = new iub(i2, (byte) 21);
        X0 = new iub(i2, (byte) 22);
        Y0 = new iub(i2, (byte) 23);
        Z0 = new iub(i2, (byte) 24);
        a1 = new iub(i2, (byte) 25);
        b1 = new iub(i2, (byte) 26);
        c1 = new iub(i2, (byte) 27);
        d1 = new iub(i2, (byte) 28);
        e1 = new iub(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iub(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Long.valueOf(((Number) obj).longValue());
            case 1:
                return rih1Var;
            case 2:
                ((kd31) obj).f(false);
                return rih1Var;
            case 3:
                return nik1.N1.a;
            case 4:
                Bundle bundle = new Bundle();
                bundle.putParcelable("messaging_bottomsheet_token", ((i0c) obj).a);
                return bundle;
            case 5:
                return new ContentRestrictionBadgeView((Context) obj, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            case 6:
                return ((Throwable) obj).getCause();
            case 7:
                return new fzk0((i3l0) obj);
            case 8:
                return new hzk0((i3l0) obj);
            case 9:
                return new izk0((i3l0) obj);
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((izk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 11:
                return new hzk0((i3l0) obj);
            case 12:
                return new jzk0((i3l0) obj);
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return new kc90(((u8c) obj).a);
            case 15:
                return new lzk0((i3l0) obj);
            case 16:
                return new mzk0((i3l0) obj);
            case 17:
                mzk0 mzk0Var = (mzk0) obj;
                String str = nik1.w1.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), mzk0Var.a, r6h1.c, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new onb1(true);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new kzk0((i3l0) obj);
            case 20:
                b261.c((e261) obj);
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                long j = nfc.b;
                phc1 phc1Var = new phc1(lslVar.X0(1.0f), 0.0f, 0, 0, (uw4) null, 30);
                float fX0 = lslVar.X0(12.0f);
                DrawScope.g0(lslVar, j, 0L, 0L, (((long) Float.floatToRawIntBits(fX0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fX0))), phc1Var, 0.0f, 0, 230);
                return rih1Var;
            case 23:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                long j2 = nfc.d;
                phc1 phc1Var2 = new phc1(lslVar2.X0(1.0f), 0.0f, 0, 0, (uw4) null, 30);
                float fX1 = lslVar2.X0(12.0f);
                DrawScope.g0(lslVar2, j2, 0L, 0L, (((long) Float.floatToRawIntBits(fX1)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L), phc1Var2, 0.0f, 0, 230);
                return rih1Var;
            case 24:
                return new nzk0((i3l0) obj);
            case 25:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((nzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 26:
                return ((pwo0) obj).a;
            case 27:
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                int iOrdinal = ((yoc) obj).ordinal();
                if (iOrdinal == 0) {
                    return bfd1.a;
                }
                if (iOrdinal == 1) {
                    return bfd1.b;
                }
                if (iOrdinal == 2) {
                    return bfd1.c;
                }
                if (iOrdinal == 3) {
                    return bfd1.d;
                }
                eg.o();
                return null;
        }
    }
}
