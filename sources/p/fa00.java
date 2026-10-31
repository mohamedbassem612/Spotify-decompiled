package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fa00 extends hab0 implements iu30 {
    public static final fa00 N0;
    public static final fa00 O0;
    public static final fa00 P0;
    public static final fa00 Q0;
    public static final fa00 R0;
    public static final fa00 S0;
    public static final fa00 T0;
    public static final fa00 U0;
    public static final fa00 V0;
    public static final fa00 W0;
    public static final fa00 X;
    public static final fa00 X0;
    public static final fa00 Y;
    public static final fa00 Y0;
    public static final fa00 Z;
    public static final fa00 Z0;
    public static final fa00 a1;
    public static final fa00 b;
    public static final fa00 b1;
    public static final fa00 c;
    public static final fa00 c1;
    public static final fa00 d;
    public static final fa00 d1;
    public static final fa00 e;
    public static final fa00 e1;
    public static final fa00 f;
    public static final fa00 g;
    public static final fa00 h;
    public static final fa00 i;
    public static final fa00 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fa00(i2, (byte) 0);
        c = new fa00(i2, (byte) 1);
        d = new fa00(i2, (byte) 2);
        e = new fa00(i2, (byte) 3);
        f = new fa00(i2, (byte) 4);
        g = new fa00(i2, (byte) 5);
        h = new fa00(i2, (byte) 6);
        i = new fa00(i2, (byte) 7);
        t = new fa00(i2, (byte) 8);
        X = new fa00(i2, (byte) 9);
        Y = new fa00(i2, (byte) 10);
        Z = new fa00(i2, (byte) 11);
        N0 = new fa00(i2, (byte) 12);
        O0 = new fa00(i2, (byte) 13);
        P0 = new fa00(i2, (byte) 14);
        Q0 = new fa00(i2, (byte) 15);
        R0 = new fa00(i2, (byte) 16);
        S0 = new fa00(i2, (byte) 17);
        T0 = new fa00(i2, (byte) 18);
        U0 = new fa00(i2, (byte) 19);
        V0 = new fa00(i2, (byte) 20);
        W0 = new fa00(i2, (byte) 21);
        X0 = new fa00(i2, (byte) 22);
        Y0 = new fa00(i2, (byte) 23);
        Z0 = new fa00(i2, (byte) 24);
        a1 = new fa00(i2, (byte) 25);
        b1 = new fa00(i2, (byte) 26);
        c1 = new fa00(i2, (byte) 27);
        d1 = new fa00(i2, (byte) 28);
        e1 = new fa00(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa00(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new i46(((u5m) obj).a.p(), (byte) 1);
            case 1:
                return new vqk(((ser0) obj).a, null, null, false, 2, 2, false, true, null, null, null, null, 32142);
            case 2:
                String str = ((vd00) obj).b;
                if (!u890.j(str, "EventSenderStats2NonAuth") && !u890.j(str, "EventSenderStats")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return rih1Var;
            case 4:
                bn70 bn70Var = (bn70) obj;
                return new nar0(new urk0(bn70Var.a.path(), "", bn70Var.b.a));
            case 5:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ((o3m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 6:
                return ((o3m0) obj).l();
            case 7:
                ((kd31) obj).b(1.0f);
                return rih1Var;
            case 8:
                return new ContentRestrictionBadgeView((Context) obj, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            case 9:
                return "filter-explicit-content";
            case 10:
                return rih1Var;
            case 11:
                return ((vs00) obj).a;
            case 12:
                return ((vs00) obj).a;
            case 13:
                return ((vs00) obj).b;
            case 14:
                return ((vs00) obj).b;
            case 15:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 23:
                s4t0 s4t0Var = (s4t0) obj;
                return new vs00(s4t0Var.a, s4t0Var.b, s4t0Var.c, s4t0Var.d);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((px00) obj).a;
            case 25:
                b261.d((e261) obj);
                return rih1Var;
            case 26:
                return Integer.valueOf(((q5t0) obj).X());
            case 27:
                b261.d((e261) obj);
                return rih1Var;
            case 28:
                b261.d((e261) obj);
                return rih1Var;
            default:
                Bundle bundle = new Bundle();
                bundle.putParcelable("extender-element", dhm0.a((dhm0) obj, (String) null, false, false, (String) null, false, false, false, (Set) null, (Set) null, false, (Set) null, false, (xbe0) null, false, false, (List) null, (wuz) null, 1572863));
                return bundle;
        }
    }
}
