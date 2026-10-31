package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.bottomsheet.core.ScrollableContentWithHeaderLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class oql implements Function, p2r0, ya, r9r {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public oql(e35 e35Var) {
        this.a = (byte) 5;
        this.b = e35Var;
        this.c = f46.S0(new le30[]{le30.P0, le30.d1, le30.R0, le30.m1, le30.d, le30.N0, le30.k1, le30.X, le30.Y});
    }

    public static wzn d(Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            hhg1.n(f4i1.c(i, "Invalid colorScheme: "));
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return wzn.d((Bundle) null);
        }
        wzn wznVarD = wzn.d(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return wznVarD;
        }
        wzn wznVarD2 = wzn.d(bundle);
        Integer num = (Integer) wznVarD2.a;
        if (num == null) {
            num = (Integer) wznVarD.a;
        }
        Integer num2 = (Integer) wznVarD2.b;
        if (num2 == null) {
            num2 = (Integer) wznVarD.b;
        }
        Integer num3 = (Integer) wznVarD2.c;
        if (num3 == null) {
            num3 = (Integer) wznVarD.c;
        }
        Integer num4 = (Integer) wznVarD2.d;
        if (num4 == null) {
            num4 = (Integer) wznVarD.d;
        }
        return new wzn(num, num2, num3, num4);
    }

    public static oql g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollableContentWithHeaderLayout scrollableContentWithHeaderLayoutInflate = layoutInflater.inflate(2131624476, viewGroup, false);
        EncoreViewStub encoreViewStubT = m5n1.t(scrollableContentWithHeaderLayoutInflate, 2131428203);
        if (encoreViewStubT != null) {
            return new oql((Object) scrollableContentWithHeaderLayoutInflate, (Object) encoreViewStubT, (byte) 7);
        }
        bhn0.i("Missing required view with ID: ".concat(scrollableContentWithHeaderLayoutInflate.getResources().getResourceName(2131428203)));
        return null;
    }

    public Object B(dub0 dub0Var, Object obj) {
        return null;
    }

    public Object C(ov30 ov30Var, Object obj) {
        return new nft((mla0) this.b, ov30Var);
    }

    public Object D(ezq0 ezq0Var, Object obj) {
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Object F(vdy0 vdy0Var, Object obj) throws i9n {
        int i;
        mla0 mla0Var = (mla0) this.c;
        if (vdy0Var.g0().isEmpty()) {
            i = (vdy0Var.U0 != null ? 1 : 0) + (vdy0Var.V0 != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (vdy0Var.g) {
            if (i == -1) {
                return new vft(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 0) {
                return new pft(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 1) {
                return new rft(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 2) {
                return new tft(mla0Var, vdy0Var, rka0.i);
            }
        } else {
            if (i == -1) {
                return new ogt(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 0) {
                return new ggt(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 1) {
                return new jgt(mla0Var, vdy0Var, rka0.i);
            }
            if (i == 2) {
                return new lgt(mla0Var, vdy0Var, rka0.i);
            }
        }
        mna0.d(vdy0Var, "Unsupported property: ");
        return null;
    }

    public Object G(xdg xdgVar, Object obj) {
        return C(xdgVar, obj);
    }

    public void a(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public boolean accept(Object obj) {
        return ((e35) this.b).a() && ((Set) this.c).contains(((ksk) obj).c);
    }

    public Object apply(Object obj) {
        Observable map;
        switch (this.a) {
            case 0:
                uv00 uv00Var = (uv00) obj;
                pql pqlVar = (pql) this.b;
                String str = (String) this.c;
                zoy0 zoy0Var = uv00Var.a(zoy0.class, str).b;
                boolean z = zoy0Var != null && l4o1.R(zoy0Var);
                w281 w281Var = uv00Var.a(w281.class, str).b;
                boolean z2 = w281Var != null && w281Var.c;
                if (!z || z2) {
                    yix0 yix0Var = pqlVar.b;
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    map = yix0Var.a(yon1.r1()).a(Collections.singleton(str)).map(new nql(str, z, (byte) 0));
                    map.getClass();
                } else {
                    map = Observable.just(new n781(false, false));
                    map.getClass();
                }
                mwm1 mwm1Var = pqlVar.c;
                ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
                ssm1VarQ.q(str);
                Observable map2 = mwm1Var.callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamContains", ssm1VarQ.build()).map(s9x0.Y0).map(zp8.S0);
                vpp0 vpp0Var = pqlVar.d;
                yoz yozVarP = EsOffline.GetItemsRequest.p();
                yozVarP.q(str);
                return Observable.combineLatest(map, map2, vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeItems", yozVarP.build()).map(bj20.T0).map(rbc.T0), new aod(str, uv00Var, (byte) 28));
            case 1:
            default:
                String str2 = (String) obj;
                ((PublishSubject) ((yon) this.b).d).onNext(str2);
                return Single.just(new gsx0(str2, ((zwu0) this.c).j)).toObservable();
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z3 = !zBooleanValue;
                if (!zBooleanValue) {
                    v1k v1kVar = (v1k) this.b;
                    zor zorVar = (zor) v1kVar.d;
                    l0l l0lVarC = ((g0l) v1kVar.b).c();
                    String str3 = (String) this.c;
                    if (l0lVarC == null || !l0lVarC.l()) {
                        zor.i(zorVar, str3, 6);
                    }
                }
                return Boolean.valueOf(z3);
        }
    }

    public Object b(Object obj, ajm0 ajm0Var) {
        return null;
    }

    public jhm c(String str, boolean z) {
        return new jhm("contribution_notes_visibility", (hux) gox.c, (fhm) null, Integer.valueOf(z ? 2131954382 : 2131954435), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(atm.V0, new gy((byte) 15, z)), new kjk(this, str, (byte) 19)), 244);
    }

    public Object e(pa paVar, Object obj) {
        return null;
    }

    public ScrollableContentWithHeaderLayout f() {
        return (ScrollableContentWithHeaderLayout) this.b;
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new ham(((p2r0) this.b).h(q7r0Var, bundle), (n2r) this.c, (byte) 2);
    }

    public Object i(tsi1 tsi1Var, Object obj) {
        return null;
    }

    public void j(Context context, Uri uri) {
        Intent intent = (Intent) this.b;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.c);
    }

    public Object k(fey0 fey0Var, Object obj) {
        return C(fey0Var, obj);
    }

    public void l(Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ix7 ix7Var = "clx".equals(bundle2.getString("_o")) ? (ix7) this.b : (n4b) this.c;
            if (ix7Var == null) {
                return;
            }
            ix7Var.e(bundle2, string);
        }
    }

    public Object p(wim0 wim0Var, Object obj) {
        return null;
    }

    public Object s(rob0 rob0Var, Object obj) {
        return null;
    }

    public Object u(jit jitVar, Object obj) {
        return null;
    }

    public Object y(zdy0 zdy0Var, Object obj) {
        return C(zdy0Var, obj);
    }

    public oql(n6r0 n6r0Var, i8h1 i8h1Var) {
        this.a = (byte) 13;
        this.b = i8h1Var;
        this.c = new ksk0(n6r0Var.path(), (byte) 3);
    }

    public /* synthetic */ oql(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public oql(d7p d7pVar, edn ednVar) {
        this.a = (byte) 8;
        this.b = d7pVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new ksk0(yon1.C3().c, nik1.O4.b(ednVar.a).a, (byte) 2);
    }

    public oql(mla0 mla0Var) {
        this.a = (byte) 11;
        this.b = mla0Var;
        this.c = mla0Var;
    }

    public oql(ConstraintLayout constraintLayout, ArtworkView artworkView, TextView textView) {
        this.a = (byte) 15;
        this.b = artworkView;
        this.c = textView;
    }

    public oql(g23 g23Var) {
        this.a = (byte) 26;
        this.b = g23Var;
        this.c = iy81.a(new jwo(this, (byte) 27));
    }

    public oql(l7m0 l7m0Var, bct bctVar) {
        this.a = (byte) 22;
        this.b = l7m0Var;
        this.c = iy81.a(new jwo(this, (byte) 8));
    }

    public oql(yzp yzpVar, bct bctVar) {
        this.a = (byte) 25;
        this.b = yzpVar;
        this.c = iy81.a(new jwo(this, (byte) 21));
    }

    public oql(fn8 fn8Var) {
        this.a = (byte) 27;
        this.b = fn8Var;
        this.c = iy81.a(new z1p(this, (byte) 3));
    }

    public oql(yva yvaVar, zva zvaVar, q7r0 q7r0Var) {
        this.a = (byte) 28;
        this.b = q7r0Var;
        this.c = new z1p(this, (byte) 7);
    }

    public oql(mx1 mx1Var) {
        this.a = (byte) 23;
        this.b = mx1Var;
        this.c = iy81.a(new jwo(this, (byte) 12));
    }

    public oql(f81 f81Var) {
        this.a = (byte) 21;
        this.b = f81Var;
        this.c = xqu.b(new jwo(this, (byte) 4));
    }

    public oql(xp0 xp0Var, zp0 zp0Var) {
        this.a = (byte) 20;
        this.b = xp0Var;
        this.c = xqu.b(new jwo(this, (byte) 0));
    }

    public oql(pc2 pc2Var, q7r0 q7r0Var) {
        this.a = (byte) 24;
        this.b = q7r0Var;
        this.c = new jwo(this, (byte) 15);
    }

    public oql(z2b z2bVar, ryj ryjVar, b3b b3bVar) {
        this.a = (byte) 29;
        this.b = z2bVar;
        this.c = iy81.a(new z1p(this, (byte) 11));
    }

    public oql(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                break;
            default:
                this.b = new HashMap();
                this.c = new ArrayList();
                break;
        }
    }
}
