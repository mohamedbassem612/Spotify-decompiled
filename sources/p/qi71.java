package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qi71 extends hab0 implements iu30 {
    public static final qi71 N0;
    public static final qi71 O0;
    public static final qi71 P0;
    public static final qi71 Q0;
    public static final qi71 R0;
    public static final qi71 S0;
    public static final qi71 T0;
    public static final qi71 U0;
    public static final qi71 V0;
    public static final qi71 W0;
    public static final qi71 X;
    public static final qi71 X0;
    public static final qi71 Y;
    public static final qi71 Y0;
    public static final qi71 Z;
    public static final qi71 Z0;
    public static final qi71 a1;
    public static final qi71 b;
    public static final qi71 b1;
    public static final qi71 c;
    public static final qi71 c1;
    public static final qi71 d;
    public static final qi71 d1;
    public static final qi71 e;
    public static final qi71 e1;
    public static final qi71 f;
    public static final qi71 g;
    public static final qi71 h;
    public static final qi71 i;
    public static final qi71 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qi71(i2, (byte) 0);
        c = new qi71(i2, (byte) 1);
        d = new qi71(i2, (byte) 2);
        e = new qi71(i2, (byte) 3);
        f = new qi71(i2, (byte) 4);
        g = new qi71(i2, (byte) 5);
        h = new qi71(i2, (byte) 6);
        i = new qi71(i2, (byte) 7);
        t = new qi71(i2, (byte) 8);
        X = new qi71(i2, (byte) 9);
        Y = new qi71(i2, (byte) 10);
        Z = new qi71(i2, (byte) 11);
        N0 = new qi71(i2, (byte) 12);
        O0 = new qi71(i2, (byte) 13);
        P0 = new qi71(i2, (byte) 14);
        Q0 = new qi71(i2, (byte) 15);
        R0 = new qi71(i2, (byte) 16);
        S0 = new qi71(i2, (byte) 17);
        T0 = new qi71(i2, (byte) 18);
        U0 = new qi71(i2, (byte) 19);
        V0 = new qi71(i2, (byte) 20);
        W0 = new qi71(i2, (byte) 21);
        X0 = new qi71(i2, (byte) 22);
        Y0 = new qi71(i2, (byte) 23);
        Z0 = new qi71(i2, (byte) 24);
        a1 = new qi71(i2, (byte) 25);
        b1 = new qi71(i2, (byte) 26);
        c1 = new qi71(i2, (byte) 27);
        d1 = new qi71(i2, (byte) 28);
        e1 = new qi71(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi71(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return vi71.a;
            case 2:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 3:
                ((xas) obj).a(d, ea71.g);
                return rih1Var;
            case 4:
                return ((kb61) obj).l0();
            case 5:
                pl71 pl71Var = (pl71) obj;
                return new ri71(pl71Var.b, pl71Var.c, pl71Var.d, pl71Var.f, pl71Var.g, pl71Var.h);
            case 6:
                return mno1.h(new mmr0[]{new mmr0("share.sheet.preview.row.element.bundle.key", (qk71) obj)});
            case 7:
                ok71 ok71Var = (ok71) jhc1.t((Bundle) obj, "share.sheet.preview.row.element.bundle.key", ok71.class);
                return ok71Var != null ? ok71Var : pk71.a;
            case 8:
                cas casVar = (a7m0) obj;
                casVar.a = ea71.i;
                casVar.d = da71.i;
                casVar.e = da71.t;
                casVar.a(h, i);
                return rih1Var;
            case 9:
                return w7x.a;
            case 10:
                return new dl71(((Number) ((List) obj).get(0)).intValue());
            case 11:
                pl71 pl71Var2 = (pl71) obj;
                return new kk71(pl71Var2.b, pl71Var2.c, pl71Var2.d, pl71Var2.g, pl71Var2.f);
            case 12:
                return rih1Var;
            case 13:
                return ConsumerShareRequestParameters.n((byte[]) obj);
            case 14:
                return ((ConsumerShareRequestParameters) obj).toByteArray();
            case 15:
                ((Number) obj).intValue();
                return rih1Var;
            case 16:
                fp71 fp71Var = (fp71) obj;
                Bundle bundle = new Bundle();
                if (fp71Var instanceof dp71) {
                    dp71 dp71Var = (dp71) fp71Var;
                    bundle.putParcelableArrayList("share_with_page_destinations", new ArrayList<>((Collection) dp71Var.a));
                    bundle.putBoolean("share_with_page_suggested_contacts_disabled", dp71Var.d);
                }
                return bundle;
            case 17:
                aq71 aq71Var = (aq71) obj;
                return new bq71(aq71Var.a, aq71Var.c, aq71Var.b, aq71Var.d, false, aq71Var.e);
            case 18:
                bq71 bq71Var = (bq71) obj;
                mmr0 mmr0Var = new mmr0("shareableMetadata", bq71Var.d);
                mmr0 mmr0Var2 = new mmr0("previewId", bq71Var.b);
                mmr0 mmr0Var3 = new mmr0("senderName", bq71Var.c);
                mmr0 mmr0Var4 = new mmr0("shareUri", bq71Var.a);
                int i2 = bq71Var.f;
                if (i2 == 1) {
                    str = "DEFAULT";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str = "BRIGHT";
                }
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, new mmr0("borderStrokeColor", str), new mmr0("explicitContentFiltered", Boolean.valueOf(bq71Var.e))});
            case 19:
                ((qtr) obj).d(T0, ea71.Q0);
                return rih1Var;
            case 20:
                return new huz(((kb61) obj).r(), (byte) 10);
            case 21:
                return ((kb61) obj).c0().b();
            case 22:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 23:
                return Boolean.valueOf(!(((y4m) obj) instanceof v4m));
            case 24:
                return Boolean.valueOf(!(((r840) obj) instanceof p840));
            case 25:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 26:
                return Boolean.valueOf(((pay) obj) == pay.b);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                return fu1.b((fu1) obj, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, (c380) null, (c380) null, true, (Set) null, false, (wka1) null, (Set) null, 2064383);
        }
    }
}
