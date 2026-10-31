package p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.ravelin.core.model.RavelinError;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l7m0 implements Function, SingleOnSubscribe, jrn0, oqw, v570, l890, myc {
    public static final gig0 c = new gig0();
    public final /* synthetic */ byte a;
    public final Object b;

    public l7m0(byte b) {
        nzi0 nzi0Var;
        this.a = b;
        switch (b) {
            case 3:
                this.b = new LinkedList();
                break;
            case 16:
                this.b = new ArrayList();
                break;
            case 18:
                this.b = ppo1.m(16);
                break;
            default:
                try {
                    nzi0Var = (nzi0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    nzi0Var = c;
                }
                nzi0[] nzi0VarArr = {ue40.a, nzi0Var};
                kig0 kig0Var = new kig0();
                kig0Var.a = nzi0VarArr;
                Charset charset = n290.a;
                this.b = kig0Var;
                break;
        }
    }

    @Override // p.v570
    public void a(u570 u570Var) {
        j570 j570Var = (j570) u570Var.b.j().get(u570Var.a);
        if (j570Var != null) {
            ((h570) this.b).a(j570Var, u570Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        kg8 ig8Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                z0f0 z0f0Var = (z0f0) obj;
                o811 o811Var = new o811();
                u11 u11Var = (u11) obj2;
                fg8 fg8Var = u11Var.d;
                d3f0 d3f0Var = z0f0Var.d;
                if (d3f0Var instanceof b3f0) {
                    ig8Var = new kg8(((b3f0) d3f0Var).a);
                } else if (d3f0Var instanceof a3f0) {
                    a3f0 a3f0Var = (a3f0) d3f0Var;
                    ig8Var = new jg8(a3f0Var.a, a3f0Var.b);
                } else if (d3f0Var instanceof k3f0) {
                    k3f0 k3f0Var = (k3f0) d3f0Var;
                    ig8Var = new lg8(k3f0Var.a, k3f0Var.b);
                } else if (d3f0Var instanceof j3f0) {
                    j3f0 j3f0Var = (j3f0) d3f0Var;
                    ig8Var = new sg8(j3f0Var.a, j3f0Var.b);
                } else if (d3f0Var instanceof e3f0) {
                    e3f0 e3f0Var = (e3f0) d3f0Var;
                    ig8Var = new ng8(e3f0Var.a, e3f0Var.b);
                } else if (d3f0Var instanceof d3f0) {
                    String strB = d3f0Var.b();
                    if (strB == null) {
                        strB = "";
                    }
                    ig8Var = new qg8(strB);
                } else if (d3f0Var instanceof f3f0) {
                    ig8Var = new og8(((f3f0) d3f0Var).a);
                } else if (d3f0Var instanceof h3f0) {
                    ig8Var = hg8.c;
                } else if (d3f0Var instanceof i3f0) {
                    i3f0 i3f0Var = (i3f0) d3f0Var;
                    ig8Var = new rg8(i3f0Var.h(), i3f0Var.g(), i3f0Var.b());
                } else if (d3f0Var instanceof g3f0) {
                    g3f0 g3f0Var = (g3f0) d3f0Var;
                    ig8Var = new pg8(g3f0Var.b(), g3f0Var.g());
                } else if (d3f0Var instanceof x2f0) {
                    x2f0 x2f0Var = (x2f0) d3f0Var;
                    ig8Var = new mg8(x2f0Var.b(), x2f0Var.g());
                } else if (d3f0Var instanceof v2f0) {
                    ig8Var = new ig8(((v2f0) d3f0Var).b());
                } else {
                    if (!(d3f0Var instanceof w2f0)) {
                        if (d3f0Var instanceof y2f0) {
                            eg.m("Unsupported login type");
                            return null;
                        }
                        if (d3f0Var instanceof z2f0) {
                            eg.m("Unsupported login type");
                            return null;
                        }
                        if (d3f0Var instanceof c3f0) {
                            eg.m("Unsupported login type");
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    ig8Var = new ig8(((w2f0) d3f0Var).b());
                }
                hh8 hh8Var = new hh8(u11Var.h.a());
                xi01 xi01Var = z0f0Var.f;
                return fg8Var.b(new gh8(ig8Var, hh8Var, xi01Var != null ? new yi01(xi01Var.a(), xi01Var.b()) : null, u11Var.k.b())).flatMap(vrg.c).retryWhen(new yo31(o811Var, (byte) 5)).map(bbn.c).onErrorReturn(new fl1(z0f0Var, (byte) 5));
            case 5:
                return (Observable) obj2;
            default:
                gvw0 gvw0Var = (gvw0) obj;
                if (gvw0Var instanceof evw0) {
                    return Single.just(new wpb(2, ((evw0) gvw0Var).a.b()));
                }
                if (gvw0Var instanceof fvw0) {
                    fqb fqbVar = (fqb) obj2;
                    return rqt0.F((q8n) fqbVar.g, new zx0(fqbVar, (lnm) null, (byte) 3)).map(vf61.h);
                }
                eg.o();
                return null;
        }
    }

    public void b(moy0 moy0Var, iu30 iu30Var) {
        ((ArrayList) this.b).add(j7p1.q(new xo50(moy0Var), iu30Var));
    }

    public void c(View view, ScaleAnimation scaleAnimation) {
        LinkedList linkedList = (LinkedList) this.b;
        linkedList.add(new zd5(view, scaleAnimation));
        if (linkedList.size() == 1) {
            i();
        }
    }

    public void d(StringBuilder sb, Iterator it) {
        cfa0 cfa0Var = (cfa0) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(cfa0.d(entry.getKey()));
            sb.append("=");
            sb.append(cfa0.d(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) cfa0.a(cfa0Var));
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(cfa0.d(entry2.getKey()));
                sb.append("=");
                sb.append(cfa0.d(entry2.getValue()));
            }
        }
    }

    public ikd e(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("canvas.type");
        if (str == null) {
            return null;
        }
        String strUri = contextTrack.uri();
        String str2 = (String) contextTrack.metadata().get("canvas.url");
        String str3 = (String) contextTrack.metadata().get("canvas.fileId");
        String str4 = (String) contextTrack.metadata().get("canvas.id");
        if (str4 == null) {
            str4 = "";
        }
        sid sidVarValueOf = sid.valueOf(str);
        String str5 = (String) contextTrack.metadata().get("canvas.artist.name");
        String str6 = (String) contextTrack.metadata().get("canvas.artist.uri");
        String str7 = (String) contextTrack.metadata().get("canvas.artist.avatar");
        return new ikd(strUri, str2, str3, str4, sidVarValueOf, str5, str6, jhc1.F(str7) ? null : str7, f(contextTrack));
    }

    public boolean f(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("canvas.explicit");
        return ((g26) this.b).g() && (str != null ? Boolean.parseBoolean(str) : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object g(String str, onm onmVar) {
        ljm ljmVar;
        if (onmVar instanceof ljm) {
            ljmVar = (ljm) onmVar;
            int i = ljmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ljmVar.d = i - Integer.MIN_VALUE;
            } else {
                ljmVar = new ljm(this, onmVar);
            }
        } else {
            ljmVar = new ljm(this, onmVar);
        }
        Object objJ = ljmVar.b;
        int i2 = ljmVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (ihc1.y0(str)) {
                    return new xlj0(new ulj0("Context URI cannot be empty"));
                }
                ezc ezcVarG = yoi1.g(((uu00) this.b).b(new oi("listening_activity_context", new kak(str, (byte) 18))));
                jte jteVar = new jte((byte) 5);
                ljmVar.a = str;
                ljmVar.d = 1;
                objJ = b5p1.j(ezcVarG, jteVar, ljmVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ljmVar.a;
                hm5.M(objJ);
            }
            jo70 jo70Var = ((uv00) objJ).a(jo70.class, str).b;
            return jo70Var == null ? new xlj0(new wlj0("No IdentityTrait found for URI: ".concat(str))) : new ylj0(jo70Var.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e2.toString();
            return new xlj0(new vlj0(l1d.m("Failed to fetch context metadata: ", e2.getMessage())));
        }
    }

    public void h() {
        x390.a((x390) this.b).a();
    }

    public void i() {
        zd5 zd5Var = (zd5) ((LinkedList) this.b).element();
        zd5Var.a.setVisibility(0);
        View view = zd5Var.a;
        ScaleAnimation scaleAnimation = zd5Var.b;
        view.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new yd5(this, zd5Var));
    }

    @Override // p.jrn0
    public irn0 l(Intent intent, th61 th61Var) {
        e9c e9cVar = (e9c) this.b;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strZ = s4b1VarX.z();
        if (strZ == null) {
            strZ = "";
        }
        if (e9c.b(e9cVar).a() && d9y0.r().contains(strZ)) {
            return e9c.d(th61Var);
        }
        return xzn1.B(strZ) ? lfb.l(i8c.class, new s8c(strZ, th61Var.a), a6w0.a) : e9c.c(e9cVar, s4b1VarX, th61Var);
    }

    @Override // p.l890
    public float q(float f, float f2, float f3) {
        m890 m890Var = (m890) this.b;
        return o0c.t(m890Var.j(), m890Var.i(), f3);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        m26 m26Var = (m26) this.b;
        singleEmitter.onSuccess(new h26(((Boolean) Single.create(new ifl1(m26Var, (byte) 5)).blockingGet()).booleanValue(), ((Boolean) Single.create(new l26(m26Var, (byte) 0)).blockingGet()).booleanValue(), ((Boolean) Single.create(new x5j1(m26Var, (byte) 20)).blockingGet()).booleanValue(), ((Number) Single.create(new lan1(m26Var, (byte) 22)).blockingGet()).intValue(), ((Number) Single.create(new yo31(m26Var, (byte) 22)).blockingGet()).intValue(), ((Number) Single.create(new fl1(m26Var, (byte) 21)).blockingGet()).intValue(), ((Number) Single.create(new a42(m26Var, (byte) 22)).blockingGet()).intValue(), ((Number) Single.create(new cp5(m26Var, (byte) 20)).blockingGet()).intValue(), ((Number) Single.create(new bv40(m26Var, (byte) 19)).blockingGet()).intValue(), ((Number) Single.create(new kr60(m26Var, (byte) 21)).blockingGet()).intValue(), ((Number) Single.create(new x6o0(m26Var, (byte) 23)).blockingGet()).intValue(), ((Number) Single.create(new t7o0(m26Var, (byte) 22)).blockingGet()).intValue(), ((Number) Single.create(new ymm0(m26Var, (byte) 20)).blockingGet()).intValue(), ((Number) Single.create(new w4b1(m26Var, (byte) 26)).blockingGet()).intValue(), ((Boolean) Single.create(new e4b1(m26Var, (byte) 23)).blockingGet()).booleanValue(), ((Boolean) Single.create(new l26(m26Var, (byte) 1)).blockingGet()).booleanValue(), ((Boolean) Single.create(new j26(m26Var)).blockingGet()).booleanValue()));
    }

    public String toString() {
        switch (this.a) {
            case 24:
                Locale locale = Locale.US;
                m890 m890Var = (m890) this.b;
                return String.format(locale, "clamp(%.2f, %.2f)", Float.valueOf(m890Var.j()), Float.valueOf(m890Var.i()));
            default:
                return super.toString();
        }
    }

    @Override // p.myc
    public void u(dxc dxcVar, Throwable th) {
        evz0 evz0Var = (evz0) this.b;
        if (evz0Var != null) {
            evz0Var.a(new RavelinError(th.getMessage(), (String) null, 2, (DefaultConstructorMarker) null));
        }
    }

    @Override // p.myc
    public void z(dxc dxcVar, sy21 sy21Var) {
        ry21 ry21Var = sy21Var.a;
        boolean z = ry21Var.Q0;
        evz0 evz0Var = (evz0) this.b;
        if (z) {
            if (evz0Var != null) {
                evz0Var.b();
            }
        } else if (evz0Var != null) {
            evz0Var.a(new RavelinError(ry21Var.c, (String) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public l7m0(Scheduler scheduler) {
        this.a = (byte) 13;
        this.b = Single.fromCallable(x2n.a).subscribeOn(scheduler).cache();
    }

    public l7m0(Context context) {
        this.a = (byte) 21;
        q450 q450Var = new q450(GoogleSignInOptions.X);
        q450Var.b();
        q450Var.c();
        this.b = vpb1.x(context, q450Var.a());
    }

    public l7m0(ConstraintLayout constraintLayout, Button button, EditText editText) {
        this.a = (byte) 6;
        this.b = editText;
    }

    public /* synthetic */ l7m0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public l7m0(nay nayVar, hx40 hx40Var) {
        this.a = (byte) 27;
        this.b = new x390(nayVar, hx40Var, (byte) 20);
    }
}
