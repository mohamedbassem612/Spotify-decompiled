package p;

import android.content.Intent;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.show_esperanto.proto.GetShowResponse;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdx0 implements Function, b2i, Init, Predicate, t2n, BiPredicate, com.spotify.mobius.functions.Function, s2i1, jrn0, c36, h271 {
    public final /* synthetic */ byte a;
    public static final pdx0 b = new pdx0((byte) 0);
    public static final pdx0 c = new pdx0((byte) 1);
    public static final pdx0 d = new pdx0((byte) 2);
    public static final pdx0 e = new pdx0((byte) 3);
    public static final pdx0 f = new pdx0((byte) 4);
    public static final pdx0 g = new pdx0((byte) 5);
    public static final pdx0 h = new pdx0((byte) 6);
    public static final pdx0 i = new pdx0((byte) 7);
    public static final pdx0 t = new pdx0((byte) 8);
    public static final pdx0 X = new pdx0((byte) 9);
    public static final pdx0 Y = new pdx0((byte) 10);
    public static final pdx0 Z = new pdx0((byte) 11);
    public static final pdx0 N0 = new pdx0((byte) 12);
    public static final pdx0 O0 = new pdx0((byte) 13);
    public static final pdx0 P0 = new pdx0((byte) 14);
    public static final pdx0 Q0 = new pdx0((byte) 15);
    public static final pdx0 R0 = new pdx0((byte) 16);
    public static final pdx0 S0 = new pdx0((byte) 17);
    public static final pdx0 T0 = new pdx0((byte) 18);
    public static final pdx0 U0 = new pdx0((byte) 19);
    public static final pdx0 V0 = new pdx0((byte) 20);
    public static final pdx0 W0 = new pdx0((byte) 21);
    public static final pdx0 X0 = new pdx0((byte) 22);
    public static final pdx0 Y0 = new pdx0((byte) 23);
    public static final pdx0 Z0 = new pdx0((byte) 24);
    public static final pdx0 a1 = new pdx0((byte) 25);
    public static final pdx0 b1 = new pdx0((byte) 26);

    public pdx0(fw0 fw0Var) {
        this.a = (byte) 27;
    }

    public Object apply(Object obj) {
        Boolean boolValueOf;
        switch (this.a) {
            case 0:
                return CompletableEmpty.a;
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                return new i5w0((q0f1) obj);
            case 3:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    boolValueOf = Boolean.valueOf(((wsc0) oy21Var.a).f.w.b);
                }
                return boolValueOf;
            case 4:
                return sig0.a;
            case 5:
                return Boolean.valueOf(((lfd) obj).b);
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return GetShowResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.show_esperanto.proto.GetShowResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 11:
                return new mo81((xc40) obj);
            case 13:
                return new sm81(false, false, false, ((Boolean) obj).booleanValue());
            case 14:
                return new m3a1(((c6c) obj).a);
            case 15:
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list) {
                    linkedHashMap.put(((eww0) obj2).a, obj2);
                }
                return linkedHashMap;
            case 16:
                return ((oy01) obj).a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsTokenExchange.TokenExchangeResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange.TokenExchangeResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new slg1((String) null);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(((kdn) obj).a);
            case 22:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                return new hsk1(l0lVar != null ? hqq0.D(l0lVar) : 0);
        }
    }

    public Object b(u171 u171Var) {
        mz9 mz9Var;
        ilw0 klw0Var;
        zsd zsdVar = u171Var.a.c;
        vsd vsdVar = zsdVar instanceof vsd ? (vsd) zsdVar : null;
        if (vsdVar == null || (mz9Var = vsdVar.a) == null) {
            hhg1.n("Expected BackgroundWithSticker card data");
            return null;
        }
        ox9 ox9Var = mz9Var.a;
        String str = ox9Var.b;
        List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        if (listQ0.size() != 2) {
            hhg1.f("Invalid aspect ratio format: ".concat(str));
            return null;
        }
        Float fB0 = nhc1.b0((String) listQ0.get(0));
        Float fB1 = nhc1.b0((String) listQ0.get(1));
        if (fB0 == null || Math.abs(fB0.floatValue()) > Float.MAX_VALUE || fB0.floatValue() <= 0.0f) {
            hhg1.f(gvg.g(listQ0.get(0), "Invalid aspect ratio width: "));
            return null;
        }
        if (fB1 == null || Math.abs(fB1.floatValue()) > Float.MAX_VALUE || fB1.floatValue() <= 0.0f) {
            hhg1.f(gvg.g(listQ0.get(1), "Invalid aspect ratio height: "));
            return null;
        }
        float fFloatValue = fB0.floatValue() / fB1.floatValue();
        if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
            hhg1.f("Invalid aspect ratio: ".concat(str));
            return null;
        }
        wx9 wx9Var = ox9Var.a;
        if (wx9Var instanceof vx9) {
            vx9 vx9Var = (vx9) wx9Var;
            String str2 = vx9Var.a;
            String str3 = vx9Var.b;
            if (str3 == null) {
                str3 = str2;
            }
            klw0Var = new ilw0(str2, str3, "");
        } else if (wx9Var instanceof wx9) {
            klw0Var = new jlw0(wx9Var.a, "");
        } else {
            if (!(wx9Var instanceof xx9)) {
                eg.o();
                return null;
            }
            klw0Var = new klw0(((xx9) wx9Var).a, 0L, 0L, true, true, 2, "");
        }
        wx9 wx9Var2 = mz9Var.b;
        return new nz9(klw0Var, fFloatValue, wx9Var2 != null ? new jlw0(wx9Var2.a, "") : null);
    }

    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = iArr[i3];
            iArr2[i4] = i5;
            i5 += i6;
            i3++;
            i4++;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 2:
                hpz0 hpz0Var = (hpz0) obj;
                return hpz0Var.a instanceof y8e0 ? First.b(hpz0Var) : First.c(hpz0Var, Effects.a(new bpz0[]{bpz0.a}));
            default:
                return First.b((nb81) obj);
        }
    }

    public Object g(Object obj) {
        return Long.valueOf(((uz21) obj).f());
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-706445892);
        ye5 ye5Var = new ye5();
        x340Var.i0(-289668149);
        uwr uwrVar = cbx.a;
        int iO = ye5Var.o(new zma1(cbx.a(x340Var).b.g, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            ye5Var.g(cwl1.o0(x340Var, 2131961960));
            ye5Var.k(iO);
            x340Var.r(false);
            ye5Var.g("\n");
            ye5Var.g(cwl1.o0(x340Var, 2131961961));
            af5 af5VarP = ye5Var.p();
            x340Var.r(false);
            return af5VarP;
        } catch (Throwable th) {
            ye5Var.k(iO);
            throw th;
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new iji1(xkg0Var, str2, str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        String strJ = uic.x(dataString).j();
        String str = strJ != null ? strJ : "";
        return new hrn0(eb1.class, new nb1(str, nik1.S5.b("spotify:internal:parental-control:manage-blocked-content:search:".concat(str)), iyr0.b), a6w0.a);
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for background with sticker cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for background with sticker cards");
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return u890.j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri());
            default:
                return u890.j(((PlayerState) obj).track(), ((PlayerState) obj2).track());
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pdx0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                return !((uv00) obj).f;
            case 12:
                return ((w181) obj).a;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }
}
