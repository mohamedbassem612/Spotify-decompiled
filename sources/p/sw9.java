package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sw9 implements sh, Function, tnd1, Predicate, h8q0, sd70, o490, ird1, uoj1, SingleOnSubscribe, nxa {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public sw9(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.c = sw20.a;
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                this.c = ime.c.U0(128);
                break;
            case 26:
                this.c = new Object[256];
                break;
            case 27:
                this.c = new n36();
                break;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public static boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public static boolean C(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public sw20 A() {
        return (sw20) this.c;
    }

    public void D(boolean z) {
        n36 n36Var = (n36) this.c;
        n36Var.addLast(Boolean.valueOf(z));
        if (z) {
            this.b++;
        }
        if (n36Var.c <= 10 || !((Boolean) n36Var.removeFirst()).booleanValue()) {
            return;
        }
        this.b--;
    }

    public void E() {
        ime.c.S0((char[]) this.c);
    }

    public void F(Object obj) {
        int i = this.b;
        Object[] objArr = (Object[]) this.c;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public void G(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.b;
            Object[] objArr2 = (Object[]) this.c;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.b = i3 + 1;
            }
        }
    }

    public void H() {
        if (l1d.C(1) != 0) {
            hhg1.n("Unsupported scheme: AES256_GCM");
        } else if (((KeyGenParameterSpec) this.c) == null) {
            this.b = 1;
        } else {
            hhg1.n("KeyScheme set after setting a KeyGenParamSpec");
        }
    }

    public void I(int i) {
        this.b = i;
    }

    public void J(sw20 sw20Var) {
        this.c = sw20Var;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        mym0 mym0Var = (mym0) this.c;
        mym0Var.e.execute(new zyh0(mym0Var, videoFrameProcessingException, (byte) 9));
    }

    public Object apply(Object obj) {
        rzh rzhVar;
        switch (this.a) {
            case 3:
                zvh zvhVar = (zvh) o7h.s0((List) obj);
                List list = zvhVar != null ? zvhVar.b : null;
                return Observable.just((list == null || (rzhVar = (rzh) o7h.t0(list != null ? p7h.J(list, new uv4((bxh) this.c, this.b)) : -1, list)) == null) ? vwh.a : new wwh(rzhVar));
            case 7:
                uqk0 uqk0Var = ((g510) this.c).h;
                int i = this.b;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                mmr0 mmr0Var = new mmr0("currently_played_item", (String) obj);
                String strValueOf = String.valueOf(i);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("playback_speed", strValueOf)})), uqk0Var.c, uqk0Var.b, System.currentTimeMillis());
            default:
                return Long.valueOf(((Number) ((PlayerState) obj).position(((t1u0) this.c).f.b()).e(0L)).longValue() + ((long) this.b));
        }
    }

    public GridLayoutManager create() {
        return new TraitsLayoutManager((l7m0) this.c, this.b);
    }

    public iu30 d() {
        return new vas(this, (byte) 19);
    }

    public w7h1 f(and1 and1Var, n8h1 n8h1Var) {
        if ((n8h1Var instanceof v3l0 ? (v3l0) n8h1Var : null) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(and1Var.a);
        x6h1 x6h1VarC = ((v3l0) n8h1Var).a.c();
        x6h1VarC.i.add(new a7h1("tab_item", "", numValueOf, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
    }

    public void g(char c) {
        w(this.b, 1);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    public void h() {
        mym0 mym0Var = (mym0) this.c;
        int i = this.b;
        rys rysVar = mym0Var.o;
        rysVar.getClass();
        synchronized (rysVar) {
            try {
                dm5.y(zoi1.l(rysVar.f, i));
                boolean z = false;
                dm5.y(rysVar.o != -1);
                ((qys) rysVar.f.get(i)).b = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= rysVar.f.size()) {
                        z = true;
                        break;
                    } else if (!((qys) rysVar.f.valueAt(i2)).b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                rysVar.g = z;
                if (((qys) rysVar.f.get(rysVar.o)).a.isEmpty()) {
                    if (i == rysVar.o) {
                        rysVar.c();
                    }
                    if (z) {
                        rysVar.a.j();
                        return;
                    }
                }
                if (i != rysVar.o && ((qys) rysVar.f.get(i)).a.size() == 1) {
                    rysVar.e.f(new mys(rysVar, (byte) 2), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n8d0 i(tqh0 tqh0Var) {
        n8d0 n8d0VarI = ((nxa) this.c).i(tqh0Var);
        if (n8d0VarI == null) {
            return null;
        }
        return ia.y(n8d0VarI, new z0i0(this, (byte) 2), l5u.a);
    }

    public w7h1 j(bnd1 bnd1Var, n8h1 n8h1Var) {
        if ((n8h1Var instanceof v3l0 ? (v3l0) n8h1Var : null) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(bnd1Var.a);
        x6h1 x6h1VarC = ((v3l0) n8h1Var).a.c();
        x6h1VarC.i.add(new a7h1("tab_item", "", numValueOf, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 k(cnd1 cnd1Var, n8h1 n8h1Var) {
        if ((n8h1Var instanceof v3l0 ? (v3l0) n8h1Var : null) == null) {
            return null;
        }
        String str = cnd1Var.a;
        Integer numValueOf = Integer.valueOf(cnd1Var.b);
        x6h1 x6h1VarC = ((v3l0) n8h1Var).a.c();
        x6h1VarC.i.add(new a7h1("tab_item", str, numValueOf, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
    }

    public boolean l() {
        return false;
    }

    public n8d0 m(Uri uri) {
        return ia.y(((nxa) this.c).m(uri), new z0i0(this, (byte) 2), l5u.a);
    }

    public void o(Exception exc) {
        gwa0 gwa0Var = (gwa0) this.c;
        h72 h72Var = (h72) gwa0Var.f;
        ((ImageView) h72Var.g).setVisibility(8);
        ((ImageView) h72Var.e).setVisibility(0);
        ((ImageView) h72Var.e).setImageDrawable(((FrameLayout) gwa0Var.g).getContext().getDrawable(this.b));
    }

    public void onSuccess(Object obj) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = ((n841) obj).a;
        if (pendingIntent != null) {
            rz40 rz40Var = (rz40) this.c;
            int i = this.b;
            IntentSender intentSender = pendingIntent.getIntentSender();
            if (((zf30) rz40Var).V0 == null) {
                bhn0.u("Fragment ", rz40Var, " not attached to Activity");
                return;
            }
            if (th30.P(2)) {
                rz40Var.toString();
                Objects.toString(intentSender);
            }
            th30 th30VarJ0 = rz40Var.j0();
            if (th30VarJ0.F != null) {
                kt80 kt80Var = new kt80(intentSender, (Intent) null, 0, 0);
                th30VarJ0.H.addLast(new mh30(((zf30) rz40Var).e, i));
                if (th30.P(2)) {
                    rz40Var.toString();
                }
                th30VarJ0.F.a(kt80Var);
                return;
            }
            tg30 tg30Var = th30VarJ0.x;
            if (i != -1) {
                tg30Var.getClass();
                eg.m("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            Activity activity = tg30Var.d;
            if (activity != null) {
                activity.startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
            } else {
                eg.m("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
    }

    public void p(String str) {
        byte b;
        w(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = ahc1.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    w(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = ahc1.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = ahc1.a[cCharAt];
                        str2.getClass();
                        w(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.c, i4);
                        int length3 = str2.length() + i4;
                        this.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.b = i4;
                    }
                }
                w(i4, 1);
                ((char[]) this.c)[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    public n8d0 q(byte[] bArr) {
        return ia.y(((nxa) this.c).q(bArr), new z0i0(this, (byte) 2), l5u.a);
    }

    public boolean r(View view) {
        ((BottomSheetBehavior) this.c).L(this.b);
        return true;
    }

    public void s(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        w(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        String str;
        s141 s141Var = (s141) this.c;
        int iC = l1d.C(this.b);
        if (iC == 0) {
            str = "inapp";
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            str = "subs";
        }
        gsa gsaVar = s141Var.a;
        zb10 zb10Var = new zb10(s141Var, singleEmitter);
        gsaVar.getClass();
        if (gsa.w(new wra(gsaVar, zb10Var, str), 30000L, new mqh1(gsaVar, zb10Var, (byte) 15), gsaVar.C(), gsaVar.v()) == null) {
            iua iuaVarF = gsaVar.F();
            gsaVar.T(25, 9, iuaVarF);
            vrn1 vrn1Var = dsn1.b;
            zb10Var.a(iuaVarF, ttn1.e);
        }
    }

    public Object t() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    public boolean test(Object obj) {
        xc00 xc00Var = (xc00) this.c;
        if (!((spq0) obj).c()) {
            return false;
        }
        xc00Var.c.getClass();
        return SystemClock.elapsedRealtime() - xc00Var.h >= ((long) (this.b * 1000));
    }

    public String toString() {
        switch (this.a) {
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public bx40 u(Context context) {
        return new bx40(context, this.b, (f160) this.c);
    }

    public jm v() throws GeneralSecurityException, IOException {
        int i = this.b;
        if (i == 0 && ((KeyGenParameterSpec) this.c) == null) {
            hhg1.n("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (i == 1) {
            this.c = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.c;
        if (keyGenParameterSpec == null) {
            bhn0.i("KeyGenParameterSpec was null after build() check");
            return null;
        }
        int i2 = h8h0.a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            nkx0.l("invalid key size, want 256 bits got ", keyGenParameterSpec.getKeySize(), " bits");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            tw20.t(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            bhn0.e(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            tw20.t(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            hhg1.n("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(keystoreAlias)) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpec);
                keyGenerator.generateKey();
            } catch (ProviderException e) {
                throw new GeneralSecurityException(e.getMessage(), e);
            }
        }
        return new jm(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.c);
    }

    public void w(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void writeLong(long j) {
        s(String.valueOf(j));
    }

    public int x() {
        MediaCodecInfo[] codecInfos = (MediaCodecInfo[]) this.c;
        if (codecInfos == null) {
            codecInfos = new MediaCodecList(this.b).getCodecInfos();
            this.c = codecInfos;
        }
        return codecInfos.length;
    }

    public MediaCodecInfo y(int i) {
        MediaCodecInfo[] codecInfos = (MediaCodecInfo[]) this.c;
        if (codecInfos == null) {
            codecInfos = new MediaCodecList(this.b).getCodecInfos();
            this.c = codecInfos;
        }
        return codecInfos[i];
    }

    public int z() {
        return this.b;
    }

    public /* synthetic */ sw9(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public sw9(Activity activity, l7m0 l7m0Var, int i) {
        this.a = (byte) 12;
        this.c = l7m0Var;
        this.b = i;
    }

    public sw9(int i, w3l0 w3l0Var) {
        this.a = (byte) 5;
        this.b = i;
        this.c = w3l0Var;
    }

    public sw9(int i, zf30 zf30Var) {
        this.a = (byte) 11;
        if (i != 0) {
            this.b = i;
            this.c = zf30Var;
            return;
        }
        throw null;
    }

    public sw9(y570 y570Var, int i) {
        this.a = (byte) 13;
        y570Var.getClass();
        this.c = y570Var;
        this.b = i;
    }

    public sw9(Context context) {
        this.a = (byte) 19;
        context.getApplicationContext();
    }

    public sw9(boolean z, boolean z2, boolean z3) {
        this.a = (byte) 20;
        this.b = (z || z2 || z3) ? 1 : 0;
    }

    public void onSuccess() {
        h72 h72Var = (h72) ((gwa0) this.c).f;
        ((ImageView) h72Var.g).setVisibility(0);
        ((ImageView) h72Var.e).setVisibility(8);
    }
}
