package p;

import android.accounts.Account;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.recyclerview.widget.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q450 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public q450(e8r0 e8r0Var, hc51 hc51Var, y751 y751Var, sco0 sco0Var, pnp pnpVar, boolean z, wao0 wao0Var, boolean z2, boolean z3, Parcelable parcelable, String str, nt21 nt21Var, w651 w651Var) {
        wmy wmyVar;
        a layoutManager;
        this.d = e8r0Var;
        this.e = hc51Var;
        this.f = y751Var;
        this.a = z;
        this.b = z3;
        this.g = parcelable;
        this.h = w651Var;
        this.c = z2;
        str = str == null ? "" : str;
        kop kopVar = (kop) pnpVar.a.c;
        g931 g931Var = new g931((aop) kopVar.c1.get(), (bop) kopVar.d1.get(), kopVar.d(), wao0Var, nt21Var, str, z2);
        this.i = g931Var;
        if (parcelable == null || (wmyVar = (wmy) g931Var.d) == null) {
            return;
        }
        rw41 rw41Var = (rw41) wmyVar.e;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("layout_manager_state");
            if (parcelable2 != null && (layoutManager = rw41Var.d.getLayoutManager()) != null) {
                layoutManager.w0(parcelable2);
            }
            rw41Var.h.b = new dts(bundle);
        }
    }

    public GoogleSignInOptions a() {
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(GoogleSignInOptions.O0)) {
            Scope scope = GoogleSignInOptions.N0;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (this.c && (((Account) this.h) == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.Z);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.h, this.c, this.a, this.b, (String) this.e, (String) this.f, (HashMap) this.i, (String) this.g);
    }

    public void b() {
        ((HashSet) this.d).add(GoogleSignInOptions.Y);
    }

    public void c() {
        boolean z = true;
        this.a = true;
        zod.o("1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com");
        String str = (String) this.e;
        if (str != null && !str.equals("1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com")) {
            z = false;
        }
        zod.j("two different server client ids provided", z);
        this.e = "1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com";
        this.b = false;
    }

    public q450(GoogleSignInOptions googleSignInOptions) {
        this.d = new HashSet();
        this.i = new HashMap();
        zod.s(googleSignInOptions);
        this.d = new HashSet(googleSignInOptions.b);
        this.a = googleSignInOptions.e;
        this.b = googleSignInOptions.f;
        this.c = googleSignInOptions.d;
        this.e = googleSignInOptions.g;
        this.h = googleSignInOptions.c;
        this.f = googleSignInOptions.h;
        this.i = GoogleSignInOptions.F(googleSignInOptions.i);
        this.g = googleSignInOptions.t;
    }

    public q450() {
        this.d = new HashSet();
        this.i = new HashMap();
    }

    public q450(w2d w2dVar) {
        boolean z;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = w2dVar;
        int[] iArr = (int[]) w2dVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z = false;
            break;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.b = z;
        this.c = vvt.a.m(ZslDisablerQuirk.class) != null;
        this.e = new zxl1(new t8e1((byte) 29));
    }
}
