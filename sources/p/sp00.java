package p;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sp00 implements b2i, Function, ObservableOnSubscribe, lw40 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public sp00(il00 il00Var, String str, u9c0 u9c0Var) {
        this.a = (byte) 10;
        this.b = il00Var;
        this.d = str;
        bpb1 bpb1VarB = gio1.b("");
        this.e = bpb1VarB;
        jge jgeVarE = hu20.e(r4p1.k(rqt0.u(new mt(bpb1VarB, (byte) 13)), 500L), new uls((lnm) null, this, (byte) 17));
        alb1 alb1Var = new alb1(0L, Long.MAX_VALUE);
        tr80 tr80Var = new tr80(1, 20, 1);
        ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
        lr80 it = tr80Var.iterator();
        while (((sr80) it).c) {
            arrayList.add(new zx31(f4i1.c(it.nextInt(), "FindInShowLoading-")));
        }
        this.c = d5p1.t(jgeVarE, u9c0Var, alb1Var, new vh20("", new wdr0(arrayList)));
    }

    public static rwj f(sp00 sp00Var) {
        return new rwj((l0y) sp00Var.b, (k0y) sp00Var.c, (mwn0) sp00Var.d, (hnl) sp00Var.e);
    }

    public static sp00 s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624680, viewGroup, false);
        int i = 2131428619;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428619);
        if (frameLayout != null) {
            i = 2131429724;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131429724);
            if (recyclerViewT != null) {
                i = 2131429832;
                ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131429832);
                if (progressBar != null) {
                    i = 2131430093;
                    if (((TextView) m5n1.t(constraintLayoutInflate, 2131430093)) != null) {
                        return new sp00((Object) constraintLayoutInflate, (Object) frameLayout, (Object) recyclerViewT, (Object) progressBar, (byte) 15);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static sp00 t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131624684, viewGroup, false);
        int i = 2131428198;
        if (((FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131428198)) != null) {
            CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
            i = 2131429077;
            TextView textView = (TextView) m5n1.t(coordinatorLayoutInflate, 2131429077);
            if (textView != null) {
                i = 2131430666;
                View viewT = m5n1.t(coordinatorLayoutInflate, 2131430666);
                if (viewT != null) {
                    int i2 = 2131427879;
                    TextView textView2 = (TextView) m5n1.t(viewT, 2131427879);
                    if (textView2 != null) {
                        i2 = 2131427880;
                        TextView textView3 = (TextView) m5n1.t(viewT, 2131427880);
                        if (textView3 != null) {
                            i2 = 2131429136;
                            View viewT2 = m5n1.t(viewT, 2131429136);
                            if (viewT2 != null) {
                                i2 = 2131430332;
                                EditText editText = (EditText) m5n1.t(viewT, 2131430332);
                                if (editText != null) {
                                    i2 = 2131430333;
                                    TextView textView4 = (TextView) m5n1.t(viewT, 2131430333);
                                    if (textView4 != null) {
                                        i2 = 2131430334;
                                        ConstraintLayout constraintLayoutT = m5n1.t(viewT, 2131430334);
                                        if (constraintLayoutT != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewT;
                                            i2 = 2131430665;
                                            Button button = (Button) m5n1.t(viewT, 2131430665);
                                            if (button != null) {
                                                i2 = 2131431576;
                                                View viewT3 = m5n1.t(viewT, 2131431576);
                                                if (viewT3 != null) {
                                                    p1f0 p1f0Var = new p1f0(linearLayout, textView2, textView3, viewT2, editText, textView4, constraintLayoutT, button, viewT3);
                                                    i = 2131431040;
                                                    ProgressBar progressBar = (ProgressBar) m5n1.t(coordinatorLayoutInflate, 2131431040);
                                                    if (progressBar != null) {
                                                        return new sp00((Object) coordinatorLayout, (Object) textView, (Object) p1f0Var, (Object) progressBar, (byte) 17);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bhn0.i("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i2)));
                    return null;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public void A(wtc wtcVar, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream((File) ((ow3) this.c).e(str));
            try {
                nfa0 nfa0Var = (nfa0) this.d;
                nfa0Var.getClass();
                nma0 nma0VarSerializer = wtc.Companion.serializer();
                b8p1 b8p1Var = new b8p1(fileOutputStream);
                byte[] bArr = (byte[]) b8p1Var.d;
                try {
                    kln1.t(nfa0Var, b8p1Var, nma0VarSerializer, wtcVar);
                    b8p1Var.n();
                    ime.c.S0((char[]) b8p1Var.e);
                    kgc.c.z(bArr);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    b8p1Var.n();
                    ime.c.S0((char[]) b8p1Var.e);
                    kgc.c.z(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    u890.p(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e) {
            Logger.l(e, "Error while caching widget recommendations", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(String str, onm onmVar, tv80 tv80Var, boolean z) {
        t730 t730Var;
        if (onmVar instanceof t730) {
            t730Var = (t730) onmVar;
            int i = t730Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t730Var.d = i - Integer.MIN_VALUE;
            } else {
                t730Var = new t730(this, onmVar);
            }
        } else {
            t730Var = new t730(this, onmVar);
        }
        Object obj = t730Var.b;
        int i2 = t730Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            ccc0 ccc0Var = (ccc0) this.c;
            ubc0 ubc0Var = new ubc0(tv80Var);
            t730Var.a = str;
            t730Var.d = 1;
            Object objI = ccc0.i(ccc0Var, str, z, ubc0Var, t730Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = t730Var.a;
            hm5.M(obj);
        }
        ((yp10) this.d).a(5, Collections.singletonMap("creatorUri", str));
        return rih1.a;
    }

    public tqd0 a() {
        String str = (String) this.b;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        g350 g350Var = new g350();
        Bundle bundleF = pzm.f("title", str, "subtitle", str2);
        bundleF.putString("positive_button_text", str3);
        g350Var.T0(bundleF);
        g350Var.W1 = (Function0) this.e;
        return g350Var;
    }

    public Object apply(Object obj) {
        String strA;
        switch (this.a) {
            case 5:
                return ((z410) this.b).b((Context) obj, (PreparePlayOptions) this.c, (PlayOrigin) this.d, (LoggingParams) this.e);
            case 6:
                Boolean bool = (Boolean) obj;
                g610 g610Var = (g610) this.b;
                oj3 oj3Var = g610Var.i;
                String str = (String) this.c;
                List listSingletonList = Collections.singletonList(str);
                String str2 = (String) this.d;
                if (str2.length() == 0) {
                    str2 = "external-integrations";
                }
                return oj3.d(oj3Var, listSingletonList, "external-integrations", str2, bool.booleanValue()).map(new v2z(g610Var, (String) this.e, str));
            default:
                iow iowVar = (kow) obj;
                String str3 = (String) this.c;
                boolean z = iowVar instanceof iow;
                n710 n710Var = (n710) this.b;
                if (z) {
                    cf70 cf70Var = iowVar.e;
                    AbstractSet abstractSet = (AbstractSet) this.d;
                    n710Var.getClass();
                    Single map = cf70Var.a(str3, o7h.y0(abstractSet, ",", (String) null, (String) null, e210.h, 30)).map(new y6x0((byte) 29));
                    nkv nkvVar = n710Var.e;
                    nkvVar.getClass();
                    return map.compose(new mev(nkvVar, (byte) 1));
                }
                m210 m210Var = (m210) this.e;
                hyy0 hyy0Var = n710Var.c;
                synchronized (hyy0Var) {
                    try {
                        long jB = ((yqg) hyy0Var.b).b();
                        while (!((n36) hyy0Var.c).isEmpty() && jB - ((Number) ((n36) hyy0Var.c).first()).longValue() > 1000) {
                            ((n36) hyy0Var.c).removeFirst();
                        }
                        n36 n36Var = (n36) hyy0Var.c;
                        if (n36Var.c >= 10) {
                            return Single.error(new Exception("Rate limit exceeded"));
                        }
                        n36Var.addLast(Long.valueOf(jB));
                        if (m210Var == null || (strA = n710Var.d.a(m210Var)) == null) {
                            return Single.error(new Exception("Client context not found"));
                        }
                        sy2 sy2Var = n710Var.a;
                        mga0 mga0Var = n210.a;
                        nma0 nma0VarSerializer = m210.Companion.serializer();
                        mga0Var.getClass();
                        uga0 uga0VarL = fga0.l(jon1.P(mga0Var, m210Var, nma0VarSerializer));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : uga0VarL.a.entrySet()) {
                            aha0 aha0Var = (ega0) entry.getValue();
                            if (!u890.j(aha0Var, rga0.INSTANCE)) {
                                if (aha0Var instanceof aha0) {
                                    aha0 aha0Var2 = aha0Var;
                                    if (!aha0Var2.c() || aha0Var2.b().length() != 0) {
                                    }
                                }
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        return sy2Var.d(strA, mga0Var.b(uga0.Companion.serializer(), new uga0(linkedHashMap)), str3).map(new l7c((byte) 28));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(onm onmVar) {
        eu40 eu40Var;
        if (onmVar instanceof eu40) {
            eu40Var = (eu40) onmVar;
            int i = eu40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu40Var.c = i - Integer.MIN_VALUE;
            } else {
                eu40Var = new eu40(this, onmVar);
            }
        } else {
            eu40Var = new eu40(this, onmVar);
        }
        Object objG = eu40Var.a;
        int i2 = eu40Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objG);
            eu40Var.c = 1;
            objG = g(eu40Var);
            Object obj = d9n.a;
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        edq0 edq0Var = (edq0) objG;
        if (!(edq0Var instanceof cdq0)) {
            if (!(edq0Var instanceof ddq0)) {
                eg.o();
                return null;
            }
            ((qib) this.e).c(2, 2, 2);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) {
        v230 v230Var;
        if (onmVar instanceof v230) {
            v230Var = (v230) onmVar;
            int i = v230Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v230Var.d = i - Integer.MIN_VALUE;
            } else {
                v230Var = new v230(this, onmVar);
            }
        } else {
            v230Var = new v230(this, onmVar);
        }
        Object objD = v230Var.b;
        int i2 = v230Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            jl00 jl00Var = (jl00) this.c;
            v230Var.a = str;
            v230Var.d = 1;
            objD = jl00Var.d(str, v230Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = v230Var.a;
            hm5.M(objD);
        }
        boolean z = ((u230) objD).a;
        return new jhm("collection_follow_author", (hux) (z ? fux.c : hnx.c), (fhm) null, new Integer(z ? 2131954468 : 2131954371), (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(ll20.e1, new cl1(z, str, (byte) 16)), new c30((Object) this, (Object) str, z, (byte) 14)), 244);
    }

    public cqs0 d(b0k b0kVar) {
        String str = (String) this.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1860001923);
        uny unyVar = (uny) this.e;
        FontWeight fontWeight = FontWeight.Z;
        android.content.Context context = (android.content.Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        HashMap map = (HashMap) unyVar.d;
        Object objC = map.get(2131296262);
        if (objC == null) {
            Typeface typefaceK = x74.K(context, 2131296262, 1);
            objC = typefaceK != null ? qon1.c(typefaceK) : hm5.d(new a930[]{o0c.b(2131296262, fontWeight)});
            map.put(2131296262, objC);
        }
        lee1 lee1Var = new lee1(0L, fc11.G(9), (FontWeight) null, (FontFamily) objC, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777117);
        float fH = ((wat) x340Var.k(t4k.h)).h();
        xat xatVar = new xat(fH, 1.0f);
        long jL = xatVar.L((fH * 3.0f) + ((int) (yae1.a(d5p1.q(0, x340Var, 1), str, lee1Var, 0, false, 0, 0L, (flb0) null, xatVar, 892).c >> 32)));
        long jG = fc11.G(12);
        fc11.p(jL, jG);
        cqs0 cqs0VarT = mqo1.t(new mmr0[]{new mmr0("explicitId", new gh80(new d6t0(4, Float.compare(TextUnit.c(jL), TextUnit.c(jG)) < 0 ? jG : jL, jG), apo.r(-1303172554, new cex(str, lee1Var, (byte) 8), x340Var)))});
        x340Var.r(false);
        return cqs0VarT;
    }

    public dtw e(x360 x360Var, FrameLayout frameLayout) {
        ozg1 ozg1Var = (ozg1) this.d;
        if (x360Var instanceof hvl1) {
            return iho1.m(frameLayout, f6o1.A((w460) this.c, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tho1.v((hvl1) x360Var));
        }
        if (x360Var instanceof jzg1) {
            return iho1.m(frameLayout, ozg1Var, tho1.y((jzg1) x360Var));
        }
        if (x360Var instanceof mhq0) {
            return iho1.m(frameLayout, f6o1.A((thq0) this.e, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tho1.w((mhq0) x360Var));
        }
        if (x360Var instanceof prb1) {
            return iho1.m(frameLayout, ozg1Var, tho1.x((prb1) x360Var));
        }
        if (x360Var instanceof i460) {
            i460 i460Var = (i460) x360Var;
            return iho1.m(frameLayout, f6o1.A(new l460(new ojm((lo60) this.b), i460Var.e != null), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tho1.u(i460Var));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(onm onmVar) {
        fu40 fu40Var;
        if (onmVar instanceof fu40) {
            fu40Var = (fu40) onmVar;
            int i = fu40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fu40Var.c = i - Integer.MIN_VALUE;
            } else {
                fu40Var = new fu40(this, onmVar);
            }
        } else {
            fu40Var = new fu40(this, onmVar);
        }
        Object objI = fu40Var.a;
        int i2 = fu40Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            zwz0 zwz0Var = (zwz0) this.c;
            fu40Var.c = 1;
            zwz0Var.getClass();
            objI = b5p1.i(zwz0Var.c(), fu40Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return ((Boolean) objI).booleanValue() ? cdq0.a : new ddq0();
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(75074839);
        CharSequence charSequence = (CharSequence) this.b;
        String str = (String) this.c;
        CharSequence charSequence2 = (CharSequence) this.d;
        ye5 ye5Var = new ye5();
        ye5Var.f(charSequence);
        z6p1.r(ye5Var, "explicitId", str);
        ye5Var.f(charSequence2);
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, onm onmVar) {
        k810 k810Var;
        spq0 spq0VarTrack;
        if (onmVar instanceof k810) {
            k810Var = (k810) onmVar;
            int i = k810Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k810Var.d = i - Integer.MIN_VALUE;
            } else {
                k810Var = new k810(this, onmVar);
            }
        } else {
            k810Var = new k810(this, onmVar);
        }
        Object objO = k810Var.b;
        int i2 = k810Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                l810 l810Var = new l810(this, null, (byte) 0);
                k810Var.a = str;
                k810Var.d = 1;
                objO = rc2.O(3000L, l810Var, k810Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = k810Var.a;
                hm5.M(objO);
            }
            PlayerState playerState = (PlayerState) objO;
            ContextTrack contextTrack = (playerState == null || (spq0VarTrack = playerState.track()) == null) ? null : (ContextTrack) spq0VarTrack.h();
            if (u890.j(contextTrack != null ? contextTrack.uri() : null, str)) {
                return l4o1.t(contextTrack);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r10 == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.String r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.m810
            if (r0 == 0) goto L13
            r0 = r10
            p.m810 r0 = (p.m810) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.m810 r0 = new p.m810
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            goto L75
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L31:
            java.lang.String r9 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            goto L4c
        L37:
            p.hm5.M(r10)
            p.l810 r10 = new p.l810     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r10.<init>(r8, r4, r3)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r0.a = r9     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r0.d = r3     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r10 = p.rc2.O(r6, r10, r0)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            if (r10 != r5) goto L4c
            goto L74
        L4c:
            com.spotify.player.model.PlayerState r10 = (com.spotify.player.model.PlayerState) r10     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            if (r10 == 0) goto L5d
            p.spq0 r10 = r10.playbackId()     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            if (r10 == 0) goto L5d
            java.lang.Object r10 = r10.h()     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            goto L5e
        L5d:
            r10 = r4
        L5e:
            if (r10 == 0) goto L78
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            p.lnf0 r8 = (p.lnf0) r8     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            p.dhf0 r1 = p.dhf0.g     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            io.reactivex.rxjava3.core.Single r8 = r8.d(r9, r10, r1, r4)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r0.a = r4     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            r0.d = r2     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            java.lang.Object r10 = p.fc11.j(r8, r0)     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            if (r10 != r5) goto L75
        L74:
            return r5
        L75:
            p.a9h r10 = (p.a9h) r10     // Catch: java.lang.Throwable -> L78 java.util.concurrent.CancellationException -> L79
            return r10
        L78:
            return r4
        L79:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sp00.j(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[Catch: Exception -> 0x0142, CancellationException -> 0x0148, TryCatch #3 {CancellationException -> 0x0148, blocks: (B:14:0x0035, B:54:0x00f8, B:56:0x0106, B:58:0x010a, B:60:0x0112, B:63:0x011a, B:65:0x011e, B:73:0x012f, B:75:0x0133, B:76:0x013c, B:67:0x0123, B:69:0x0127, B:71:0x012b, B:50:0x00ba), top: B:89:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133 A[Catch: Exception -> 0x0142, CancellationException -> 0x0148, TryCatch #3 {CancellationException -> 0x0148, blocks: (B:14:0x0035, B:54:0x00f8, B:56:0x0106, B:58:0x010a, B:60:0x0112, B:63:0x011a, B:65:0x011e, B:73:0x012f, B:75:0x0133, B:76:0x013c, B:67:0x0123, B:69:0x0127, B:71:0x012b, B:50:0x00ba), top: B:89:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, k1r k1rVar, onm onmVar) {
        n810 n810Var;
        t9y t9yVar;
        List list;
        List list2;
        String str2;
        String str3;
        List list3;
        String str4;
        String str5;
        xkk1 xkk1Var;
        String str6;
        afx afxVar;
        mq70 mq70Var;
        pp70 pp70Var;
        pp70 pp70Var2;
        mq70 mq70Var2;
        up70 up70VarA;
        if (onmVar instanceof n810) {
            n810Var = (n810) onmVar;
            int i = n810Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                n810Var.h = i - Integer.MIN_VALUE;
            } else {
                n810Var = new n810(this, onmVar);
            }
        } else {
            n810Var = new n810(this, onmVar);
        }
        Object objK = n810Var.f;
        int i2 = n810Var.h;
        List list4 = z6x.a;
        Object obj = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objK);
                    k1rVar.getClass();
                    if (!(k1rVar instanceof i1r)) {
                        return new clk1(null, null, 15);
                    }
                    t9yVar = (t9y) u890.k(k1rVar, (d0r) null, (n4r) null);
                    eid eidVar = t9yVar.h;
                    if (eidVar != null) {
                        try {
                            lo9 lo9Var = (lo9) this.c;
                            n810Var.a = str;
                            n810Var.b = t9yVar;
                            n810Var.c = null;
                            n810Var.h = 1;
                            objK = lo9Var.k(eidVar, n810Var);
                            if (objK == obj) {
                            }
                        } catch (Exception unused) {
                            list = list4;
                        }
                    } else {
                        n810Var.a = null;
                        n810Var.b = t9yVar;
                        n810Var.c = list4;
                        n810Var.h = 2;
                        objK = i(str, n810Var);
                        if (objK != obj) {
                            list2 = list4;
                            str2 = (String) objK;
                            str3 = t9yVar.g;
                            if (str3 != null) {
                            }
                            return new clk1(list2, str2, 6);
                        }
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str5 = n810Var.e;
                        str4 = n810Var.d;
                        list3 = n810Var.c;
                        try {
                            hm5.M(objK);
                            xkk1Var = ((uv00) objK).a(xkk1.class, str5).b;
                            if (xkk1Var != null || (mq70Var2 = xkk1Var.a) == null || (up70VarA = mq70Var2.a(vp70.e)) == null) {
                                str6 = null;
                            } else {
                                str6 = up70VarA.a.a;
                            }
                            if (xkk1Var == null && (pp70Var2 = xkk1Var.d) != null) {
                                afxVar = pp70Var2.c;
                            } else if (xkk1Var != null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
                                afxVar = null;
                            } else {
                                afxVar = pp70Var.c;
                            }
                            return new clk1(str6, str4, list3, afxVar != null ? new u7h(afxVar.a.c) : null);
                        } catch (Exception unused2) {
                            return new clk1(list3, str4, 6);
                        }
                    }
                    list2 = n810Var.c;
                    t9yVar = n810Var.b;
                    hm5.M(objK);
                    str2 = (String) objK;
                    str3 = t9yVar.g;
                    if (str3 != null || str3.length() == 0) {
                        return new clk1(list2, str2, 6);
                    }
                    try {
                        ezc ezcVarG = yoi1.g(((uu00) this.d).b(new oi("enhanced-share-card-images", false, new kq00(str3, (byte) 7))));
                        afv afvVar = new afv(2, null, (byte) 12);
                        n810Var.a = null;
                        n810Var.b = null;
                        n810Var.c = list2;
                        n810Var.d = str2;
                        n810Var.e = str3;
                        n810Var.h = 3;
                        Object objJ = b5p1.j(ezcVarG, afvVar, n810Var);
                        if (objJ != obj) {
                            objK = objJ;
                            str5 = str3;
                            list3 = list2;
                            str4 = str2;
                            xkk1Var = ((uv00) objK).a(xkk1.class, str5).b;
                            if (xkk1Var != null) {
                                str6 = null;
                            } else {
                                str6 = null;
                            }
                            if (xkk1Var == null) {
                                if (xkk1Var != null) {
                                    afxVar = null;
                                } else {
                                    afxVar = null;
                                }
                            } else if (xkk1Var != null) {
                                afxVar = null;
                            } else {
                                afxVar = null;
                            }
                            return new clk1(str6, str4, list3, afxVar != null ? new u7h(afxVar.a.c) : null);
                        }
                        return obj;
                    } catch (Exception unused3) {
                        list3 = list2;
                        str4 = str2;
                        return new clk1(list3, str4, 6);
                    }
                }
                eid eidVar2 = n810Var.c;
                t9y t9yVar2 = n810Var.b;
                String str7 = n810Var.a;
                try {
                    hm5.M(objK);
                    t9yVar = t9yVar2;
                    str = str7;
                } catch (Exception unused4) {
                    t9yVar = t9yVar2;
                    str = str7;
                    list = list4;
                }
                list = (List) objK;
                if (list != null) {
                    list4 = list;
                }
                n810Var.a = null;
                n810Var.b = t9yVar;
                n810Var.c = list4;
                n810Var.h = 2;
                objK = i(str, n810Var);
                if (objK != obj) {
                    list2 = list4;
                    str2 = (String) objK;
                    str3 = t9yVar.g;
                    if (str3 != null) {
                    }
                    return new clk1(list2, str2, 6);
                }
                return obj;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    public void l(LayoutInflater layoutInflater, ScrollView scrollView) {
        View viewInflate = layoutInflater.inflate(2131625020, (ViewGroup) scrollView, true);
        this.b = (TextView) viewInflate.findViewById(2131431356);
        this.c = (TextView) viewInflate.findViewById(2131427729);
        CharSequence charSequence = (CharSequence) this.e;
        boolean z = charSequence != null && charSequence.length() > 0;
        if (!viewInflate.isInEditMode()) {
            if (z) {
                r6p1.x(new TextView[]{(TextView) this.b});
                r6p1.y(new TextView[]{(TextView) this.c});
            }
            r6p1.w(viewInflate);
        }
        ((TextView) this.b).setText((CharSequence) this.d);
        ((TextView) this.c).setText((CharSequence) this.e, TextView.BufferType.SPANNABLE);
        ((TextView) this.c).setVisibility(z ? 0 : 8);
        ((TextView) this.c).setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, onm onmVar, tv80 tv80Var, boolean z) {
        s730 s730Var;
        if (onmVar instanceof s730) {
            s730Var = (s730) onmVar;
            int i = s730Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s730Var.d = i - Integer.MIN_VALUE;
            } else {
                s730Var = new s730(this, onmVar);
            }
        } else {
            s730Var = new s730(this, onmVar);
        }
        Object obj = s730Var.b;
        int i2 = s730Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            ccc0 ccc0Var = (ccc0) this.c;
            ubc0 ubc0Var = new ubc0(tv80Var);
            s730Var.a = str;
            s730Var.d = 1;
            Object objC = ccc0.c(ccc0Var, str, z, ubc0Var, s730Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = s730Var.a;
            hm5.M(obj);
        }
        ((yp10) this.d).a(4, Collections.singletonMap("creatorUri", str));
        return rih1.a;
    }

    public i8h1 n() {
        return (i8h1) ((idd1) this.e).getValue();
    }

    public int o() {
        if (((TextView) this.c).getVisibility() == 8) {
            return 0;
        }
        return (int) Math.ceil(Math.abs(((TextView) this.c).getPaint().getFontMetrics().descent));
    }

    public ConstraintLayout p() {
        return (ConstraintLayout) this.b;
    }

    public CoordinatorLayout q() {
        return (CoordinatorLayout) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(onm onmVar) {
        a520 a520Var;
        if (onmVar instanceof a520) {
            a520Var = (a520) onmVar;
            int i = a520Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a520Var.c = i - Integer.MIN_VALUE;
            } else {
                a520Var = new a520(this, onmVar);
            }
        } else {
            a520Var = new a520(this, onmVar);
        }
        Object objJ = a520Var.a;
        int i2 = a520Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            mr20 mr20Var = (mr20) this.b;
            afv afvVar = new afv(2, null, (byte) 13);
            a520Var.c = 1;
            objJ = b5p1.j(mr20Var, afvVar, a520Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        th61 th61Var = (th61) objJ;
        return th61Var.b ? th61Var.a : "unauthenticated";
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        th30 th30Var = (th30) this.e;
        WeakReference weakReference = new WeakReference((zf30) this.b);
        WeakReference weakReference2 = new WeakReference(observableEmitter);
        yun0 yun0Var = (yun0) this.c;
        WeakReference weakReference3 = new WeakReference(yun0Var);
        axn0 axn0Var = (axn0) this.d;
        gi30 gi30Var = new gi30(weakReference, weakReference2, weakReference3, axn0Var != null ? new WeakReference(axn0Var) : null);
        yun0Var.g(gi30Var);
        th30Var.q.add(gi30Var);
        observableEmitter.setCancellable(new fi30(yun0Var, gi30Var, th30Var, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable u(onm onmVar) {
        b520 b520Var;
        wtc wtcVar;
        if (onmVar instanceof b520) {
            b520Var = (b520) onmVar;
            int i = b520Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b520Var.c = i - Integer.MIN_VALUE;
            } else {
                b520Var = new b520(this, onmVar);
            }
        } else {
            b520Var = new b520(this, onmVar);
        }
        Object objR = b520Var.a;
        int i2 = b520Var.c;
        if (i2 == 0) {
            hm5.M(objR);
            b520Var.c = 1;
            objR = r(b520Var);
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream((File) ((ow3) this.c).e((String) objR));
            try {
                nfa0 nfa0Var = (nfa0) this.d;
                nfa0Var.getClass();
                nma0 nma0VarSerializer = wtc.Companion.serializer();
                dg90 dg90Var = new dg90(fileInputStream);
                lne lneVar = (lne) dg90Var.b;
                try {
                    Object objS = kln1.s(nfa0Var, nma0VarSerializer, dg90Var);
                    lgc.c.z(((ByteBuffer) lneVar.e).array());
                    wtcVar = (wtc) objS;
                    wtcVar.a.size();
                    fileInputStream.close();
                } catch (Throwable th) {
                    lgc.c.z(((ByteBuffer) lneVar.e).array());
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    u890.p(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (SerializationException e) {
            Logger.l(e, "Error while reading widget cached recommendations", new Object[0]);
            wtcVar = new wtc(z6x.a);
        } catch (IOException e2) {
            Logger.l(e2, "Error while reading widget cached recommendations", new Object[0]);
            wtcVar = new wtc(z6x.a);
        }
        List<ttc> list = wtcVar.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ttc ttcVar : list) {
            arrayList.add(new u011(Uri.parse(ttcVar.d), ttcVar.a, ttcVar.b, ttcVar.c));
        }
        return arrayList;
    }

    public void v() {
        ((Disposable) this.e).dispose();
    }

    public void w() {
        ((Disposable) this.e).dispose();
        this.e = ((o241) ((e5l0) this.c).b).a.map(een.m1).distinctUntilChanged().observeOn((Scheduler) this.b).subscribe((lyw0) this.d, new jld((byte) 7));
    }

    public void x(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = (TextView) this.c;
        if (textView != null) {
            textView.setText(charSequence);
            ((TextView) this.c).setVisibility((charSequence == null || charSequence.length() <= 0) ? 8 : 0);
        }
    }

    public void y(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = (TextView) this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public Object z(List list, jtc jtcVar) {
        Object objY = fn31.Y((q8n) this.e, new xr00(this, list, (lnm) null, (byte) 7), jtcVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public /* synthetic */ sp00(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public sp00(xfx xfxVar, lo60 lo60Var, gw70 gw70Var, agc0 agc0Var) {
        this.a = (byte) 29;
        this.b = lo60Var;
        this.c = new w460(lo60Var, false, false, false, (a1r0) null, 60);
        this.d = new ozg1(new sfx(xfxVar.e, (byte) 3), lo60Var, false, agc0Var);
        this.e = new thq0(gw70Var, lo60Var);
    }

    public sp00(xep xepVar, wqk0 wqk0Var, wqk0 wqk0Var2) {
        this.a = (byte) 26;
        this.b = xepVar;
        this.c = wqk0Var;
        this.d = wqk0Var2;
        this.e = new idd1(new g050(this, (byte) 3));
    }

    public sp00(xep xepVar, txk0 txk0Var, wqk0 wqk0Var) {
        this.a = (byte) 27;
        this.b = xepVar;
        this.c = txk0Var;
        this.d = wqk0Var;
        this.e = new idd1(new g050(this, (byte) 5));
    }

    public sp00(ObservableFromPublisher observableFromPublisher, m210 m210Var, i210 i210Var) {
        this.a = (byte) 4;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        this.b = observableFromPublisher;
        this.c = m210Var;
        this.d = i210Var;
        this.e = smo1.e(bs50Var);
    }

    public sp00(lza1 lza1Var, String str) {
        Object objPutIfAbsent;
        this.a = (byte) 0;
        ConcurrentHashMap concurrentHashMap = lza1.a;
        Object objB = concurrentHashMap.get(str);
        if (objB == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objB = gio1.b(Boolean.TRUE)))) != null) {
            objB = objPutIfAbsent;
        }
        wen0 wen0Var = (wen0) objB;
        this.b = wen0Var;
        this.c = d5p1.h(wen0Var);
    }

    public sp00(Scheduler scheduler, e5l0 e5l0Var, lyw0 lyw0Var) {
        this.a = (byte) 18;
        this.e = Disposable.e(Functions.b);
        this.b = scheduler;
        this.c = e5l0Var;
        this.d = lyw0Var;
    }

    public sp00(ScrollView scrollView, TextView textView, EncoreButton encoreButton, EncoreButton encoreButton2, TextView textView2) {
        this.a = (byte) 14;
        this.b = textView;
        this.c = encoreButton;
        this.d = encoreButton2;
        this.e = textView2;
    }

    public /* synthetic */ sp00(byte b) {
        this.a = b;
    }
}
