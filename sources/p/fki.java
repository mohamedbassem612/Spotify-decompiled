package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fki extends hab0 implements Function0 {
    public static final fki N0;
    public static final fki O0;
    public static final fki P0;
    public static final fki Q0;
    public static final fki R0;
    public static final fki S0;
    public static final fki T0;
    public static final fki U0;
    public static final fki V0;
    public static final fki W0;
    public static final fki X;
    public static final fki X0;
    public static final fki Y;
    public static final fki Y0;
    public static final fki Z;
    public static final fki Z0;
    public static final fki a1;
    public static final fki b;
    public static final fki b1;
    public static final fki c;
    public static final fki c1;
    public static final fki d;
    public static final fki d1;
    public static final fki e;
    public static final fki e1;
    public static final fki f;
    public static final fki g;
    public static final fki h;
    public static final fki i;
    public static final fki t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new fki(i2, (byte) 0);
        c = new fki(i2, (byte) 1);
        d = new fki(i2, (byte) 2);
        e = new fki(i2, (byte) 3);
        f = new fki(i2, (byte) 4);
        g = new fki(i2, (byte) 5);
        h = new fki(i2, (byte) 6);
        i = new fki(i2, (byte) 7);
        t = new fki(i2, (byte) 8);
        X = new fki(i2, (byte) 9);
        Y = new fki(i2, (byte) 10);
        Z = new fki(i2, (byte) 11);
        N0 = new fki(i2, (byte) 12);
        O0 = new fki(i2, (byte) 13);
        P0 = new fki(i2, (byte) 14);
        Q0 = new fki(i2, (byte) 15);
        R0 = new fki(i2, (byte) 16);
        S0 = new fki(i2, (byte) 17);
        T0 = new fki(i2, (byte) 18);
        U0 = new fki(i2, (byte) 19);
        V0 = new fki(i2, (byte) 20);
        W0 = new fki(i2, (byte) 21);
        X0 = new fki(i2, (byte) 22);
        Y0 = new fki(i2, (byte) 23);
        Z0 = new fki(i2, (byte) 24);
        a1 = new fki(i2, (byte) 25);
        b1 = new fki(i2, (byte) 26);
        c1 = new fki(i2, (byte) 27);
        d1 = new fki(i2, (byte) 28);
        e1 = new fki(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fki(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return v8r.q(Float.valueOf(0.0f));
            case 1:
                return v8r.q(0);
            case 2:
            case 3:
                return rih1Var;
            case 4:
                return v8r.q((Object) null);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return rih1Var;
            case 10:
                return v8r.q(Boolean.FALSE);
            case 11:
                return v8r.q(Boolean.FALSE);
            case 12:
                return rih1Var;
            case 13:
                return Boolean.FALSE;
            case 14:
                return new Bundle();
            case 15:
                return ajv.B;
            case 16:
                throw new IllegalStateException("No default context");
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new p3v(0.0f);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                throw new IllegalStateException("No default glance id");
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return fg50.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                throw new IllegalStateException("No default size");
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return null;
            case 22:
                return new p3v(0.0f);
            case 23:
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return gio1.b(new xbk(null, null, null, null, null, null, null, null, null, null, false, null, 131071));
            case 25:
                return gio1.b(c6k.g);
            case 26:
                return gio1.b(new obk("", "Concert Campaign Page", null, "https://i.scdn.co/image/ab6761610000e5eb1a9824a587cc162d8b98fa6f", false, z6x.a, false, true, false));
            case 27:
                return gio1.b(rgk.t);
            case 28:
                return gio1.b(new nkk(new kkk(new xik("", "", "", "", (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, "", "", false, (List) null, false, (Long) null, (wik) null, false, (Integer) null, 4188144)), z6x.a, null, null, null));
            default:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
        }
    }
}
