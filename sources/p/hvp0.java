package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.net.Uri;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentRequest;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentResponse;
import com.spotify.notifications.datasource.proto.MediaContent;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.premiumdestination.destination.mobius.domain.TransformerException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hvp0 implements Function, nyc, ObservableOnSubscribe, hyd, hs31, Producer, xi7, qiw, ya {
    public final /* synthetic */ byte a;
    public Object b;

    public hvp0(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.b = new idd1(tnt0.b1);
                break;
        }
    }

    public static dnc0 b(hvp0 hvp0Var) {
        cc9 cc9Var = new cc9(0, 0, 7);
        l1n0 l1n0Var = (l1n0) ((q7r0) hvp0Var.b).e(l1n0.class);
        return new dnc0((rzq) l1n0Var.a.a.k().c, fsm0.g, fsm0.h, cc9Var, (guh0) null, 6);
    }

    public static dnc0 d(hvp0 hvp0Var, Function0 function0, Function0 function1) {
        return new dnc0((rzq) ((l1n0) ((q7r0) hvp0Var.b).e(l1n0.class)).a.a.k().c, function0, function1, new cc9(0, 0, 7), (guh0) null, 6);
    }

    public n8h1 a(r6h1 r6h1Var) {
        py9 py9Var = new py9(r6h1Var, (byte) 13);
        this.b = py9Var;
        return new jpk0(py9Var, (byte) 0);
    }

    public boolean accept(Object obj) {
        return ((iq4) this.b).a();
    }

    public Object apply(Object obj) throws IOException {
        Single map;
        List list;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        byte b2 = 3;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                return new jvp0((List) obj, ((ivp0) this.b).g);
            case 1:
            case 4:
            case 5:
            case 10:
            case 15:
            case 16:
            case 17:
            case 19:
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList = ((z4z0) this.b).d;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList) {
                    hll hllVar = uv00Var.a(hll.class, (String) obj2).b;
                    linkedHashMap.put(obj2, Boolean.valueOf((hllVar == null || (list = hllVar.d) == null) ? false : list.contains(fll.c)));
                }
                return new i7z0(linkedHashMap);
            case 2:
                return sd41.b(((t9q0) this.b).b, ((y9q0) obj).a, (tv80) null, 6).w();
            case 3:
                ksy0 ksy0Var = (rsy0) obj;
                hgo hgoVar = (hgo) this.b;
                if (ksy0Var instanceof osy0) {
                    return Single.just(ynq0.a);
                }
                if (ksy0Var instanceof ksy0) {
                    String str = ksy0Var.a.b().d;
                    if (str == null) {
                        map = Single.just(((Resources) ((zwa) hgoVar.d).b).getString(2131956002));
                        map.getClass();
                    } else {
                        map = ((uny) ((yfu) hgoVar.c).c).l(str).map(xi10.V0);
                        map.getClass();
                    }
                    Single map2 = map.map(new swm0((Object) ksy0Var, (byte) 15));
                    map2.getClass();
                    return map2;
                }
                if (ksy0Var instanceof nsy0) {
                    nsy0 nsy0Var = (nsy0) ksy0Var;
                    m560 m560Var = nsy0Var.a;
                    if (m560Var instanceof k560) {
                        return Single.just(new xnq0(m560Var));
                    }
                    if (m560Var instanceof l560) {
                        return yoi1.i((mr20) ((na) hgoVar.e).invoke(), o6xVar).firstOrError().flatMap(new uip0(nsy0Var, (byte) 6));
                    }
                    eg.o();
                    return null;
                }
                if (ksy0Var instanceof lsy0) {
                    return Single.just(pnq0.d);
                }
                if (ksy0Var instanceof isy0) {
                    return Single.just(wnq0.a);
                }
                if (ksy0Var instanceof jsy0) {
                    return Single.just(pnq0.a);
                }
                if (ksy0Var instanceof msy0) {
                    return Single.just(pnq0.e);
                }
                if (ksy0Var.equals(psy0.a)) {
                    return Single.just(pnq0.g);
                }
                if (ksy0Var instanceof qsy0) {
                    return Single.just(foq0.a);
                }
                eg.o();
                return null;
            case 6:
                String str2 = ((z5s0) obj).a;
                x6s0 x6s0Var = (x6s0) this.b;
                if (str2.length() == 0) {
                    b2 = 4;
                } else if (str2.length() < 10) {
                    b2 = 2;
                } else if (Arrays.binarySearch(x6s0Var.a.a.getResources().getStringArray(2130903062), str2.toLowerCase(Locale.ROOT)) < 0) {
                    b2 = 1;
                }
                return new e6s0(str2, b2);
            case 7:
                px41 px41Var = (px41) this.b;
                return new w051(px41Var.b, px41Var.c, new z851((pvp0) obj), (tv80) null);
            case 8:
                z6x z6xVar = (Collection) ((List) obj);
                aus0 aus0Var = (aus0) this.b;
                if (z6xVar.isEmpty()) {
                    nma0 nma0Var = aus0.d;
                    Context context = aus0Var.a;
                    nfa0 nfa0Var = aus0Var.b;
                    String resourceEntryName = context.getResources().getResourceEntryName(2131886091);
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + resourceEntryName + ".json");
                    try {
                        InputStream fileInputStream = file.exists() ? new FileInputStream(file) : context.getResources().openRawResource(2131886091);
                        fileInputStream.getClass();
                        z6x z6xVar2 = (List) nfa0Var.a(new String(o0c.K(fileInputStream), nne.a), aus0.d);
                        if (z6xVar2 == null) {
                            z6xVar2 = z6x.a;
                        }
                        z6xVar = z6xVar2;
                    } catch (IOException e) {
                        throw new IOException("Failed to load RAW resource #2131886091", e);
                    }
                }
                return (List) z6xVar;
            case 9:
                return rqt0.F(o6xVar, new f3t0((kbt0) this.b, (cat0) obj, lnmVar, b2)).map(aj20.X0).onErrorReturn(bj20.X0);
            case 11:
                return new mmr0((pyt0) obj, (cs01) this.b);
            case 12:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                return ((tuz) this.b).b(dcu0.d(playerQueue.toBuilder().nextTracks(b380.p(dcu0.a(playerQueue))).build()));
            case 13:
                PlayerState playerState = (PlayerState) obj;
                return new g691(o4p1.o(playerState), (int) ((Number) playerState.position(((yqg) ((sjq0) this.b).c).b()).e(0L)).longValue(), (int) ((Number) playerState.duration().e(0L)).longValue());
            case 14:
                return ((Boolean) obj).booleanValue() ? new rg60(((o4v0) this.b).b) : xi10.f;
            case 18:
                Throwable th = (Throwable) obj;
                String str3 = ((wtv0) this.b).b;
                if (str3 == null || ihc1.y0(str3)) {
                    return new juv0(4);
                }
                if (th instanceof JsonException) {
                    return new juv0(5);
                }
                if (th instanceof MappingException) {
                    return new juv0(6);
                }
                return th instanceof TransformerException ? new juv0(7) : new juv0(2);
            case 20:
                nww0 nww0Var = (nww0) this.b;
                int i = ((eww0) obj).g;
                nww0Var.getClass();
                return new mww0(Integer.valueOf(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)))));
        }
    }

    public w7h1 c(rxd rxdVar) {
        if (!(rxdVar instanceof rxd)) {
            eg.o();
            return null;
        }
        py9 py9Var = (py9) this.b;
        if (py9Var == null) {
            u890.C("factory");
            throw null;
        }
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("show_all_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", rxdVar.a)), x6h1VarC.a(), py9Var.b, System.currentTimeMillis());
    }

    public String e(long j) {
        if (j <= 0) {
            return "";
        }
        long j2 = j / 60;
        if (j2 < 1) {
            j2 = 1;
        }
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        smc0 smc0VarN = k4p1.n();
        if (j3 > 0) {
            smc0VarN.add(new Measure(Long.valueOf(j3), MeasureUnit.HOUR));
        }
        if (j4 > 0) {
            smc0VarN.add(new Measure(Long.valueOf(j4), MeasureUnit.MINUTE));
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        MeasureFormat measureFormat = (MeasureFormat) ((idd1) this.b).getValue();
        Measure[] measureArr = (Measure[]) smc0VarK.toArray(new Measure[0]);
        return measureFormat.formatMeasures((Measure[]) Arrays.copyOf(measureArr, measureArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object f(String str, String str2, onm onmVar) {
        xvy0 xvy0Var;
        if (onmVar instanceof xvy0) {
            xvy0Var = (xvy0) onmVar;
            int i = xvy0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xvy0Var.d = i - Integer.MIN_VALUE;
            } else {
                xvy0Var = new xvy0(this, onmVar);
            }
        } else {
            xvy0Var = new xvy0(this, onmVar);
        }
        Object objA = xvy0Var.b;
        int i2 = xvy0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                bp40 bp40VarN = GetPushNotificationContentRequest.n();
                bp40VarN.q(str);
                bp40VarN.n(str2);
                GetPushNotificationContentRequest getPushNotificationContentRequest = (GetPushNotificationContentRequest) bp40VarN.build();
                uvy0 uvy0Var = (uvy0) this.b;
                getPushNotificationContentRequest.getClass();
                xvy0Var.a = str;
                xvy0Var.d = 1;
                objA = uvy0Var.a(getPushNotificationContentRequest, xvy0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = xvy0Var.a;
                hm5.M(objA);
            }
            GetPushNotificationContentResponse getPushNotificationContentResponse = (GetPushNotificationContentResponse) objA;
            int i3 = wvy0.a[getPushNotificationContentResponse.n().n().ordinal()];
            if (i3 == 1) {
                return new tvy0(getPushNotificationContentResponse.n().q().n());
            }
            if (i3 == 2) {
                MediaContent mediaContentP = getPushNotificationContentResponse.n().p();
                return new svy0(mediaContentP.r(), mediaContentP.getUrl(), mediaContentP.p(), mediaContentP.q(), mediaContentP.n());
            }
            Logger.k("Notifications: unexpected content type " + getPushNotificationContentResponse.n().n() + " for " + str, new Object[0]);
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, gvg.h("Notifications: failed to fetch push notification content for ", str, ": ", e2.getMessage()), new Object[0]);
            return null;
        }
    }

    public String g() {
        return ((y3x0) this.b).a;
    }

    public Object get() {
        return new DispatcherWorker(((nix0) this.b).e);
    }

    public m6e0 h() {
        return bbp1.h(((zdz) this.b).a(50).firstOrError());
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String queryParameter;
        Uri uri = s4b1Var.a;
        if (uri == null || (queryParameter = uri.getQueryParameter("referrer")) == null) {
            queryParameter = "unknown";
        }
        Uri uri2 = Uri.parse("https://www.spotify.com/" + Locale.getDefault().getCountry() + "/account/cancel?referrer=" + queryParameter + "&platform=android");
        b72 b72Var = (b72) this.b;
        ((ryf) b72Var.c).b((Activity) b72Var.b, new lyf(mxf.b, iyf.a, uri2));
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ((em61) this.b).v(iOException);
    }

    public Single l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 24:
                b72 b72Var = (b72) this.b;
                return ((xvo) b72Var.c).a(true).firstOrError().map(new vyq0(intent, b72Var)).onErrorReturn(new bt8(intent, (byte) 1));
            default:
                b72 b72Var2 = (b72) this.b;
                return ((Observable) ((y170) b72Var2.c).invoke()).firstOrError().map(new yqu0(b72Var2, intent, (byte) 29)).onErrorReturn(r6x0.c);
        }
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        ((em61) this.b).u(ry21Var);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        fn70 fn70Var = new fn70(observableEmitter, (byte) 1);
        en70 en70Var = (en70) this.b;
        en70Var.d(fn70Var);
        observableEmitter.setCancellable(new pc6(en70Var, fn70Var, (byte) 10));
    }

    public void v(Object obj) {
        t7a t7aVar = (t7a) obj;
        fvx0 fvx0Var = (fvx0) this.b;
        s24 s24Var = fvx0Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.b;
        EncoreTextView encoreTextView = (EncoreTextView) s24Var.c;
        fjg1.a(constraintLayout, (jhg1) null);
        if (!(t7aVar instanceof n7a)) {
            if (t7aVar instanceof r7a) {
                encoreTextView.setVisibility(0);
                encoreTextView.setText(constraintLayout.getContext().getString(2131954270));
                encoreTextView.setTextAppearance(2132018006);
                return;
            } else if (t7aVar.equals(p7a.a)) {
                encoreTextView.setVisibility(8);
                return;
            } else {
                eg.o();
                return;
            }
        }
        encoreTextView.setVisibility(0);
        encoreTextView.setTextAppearance(2132018011);
        if (!fvx0Var.c.b.i()) {
            encoreTextView.setText(constraintLayout.getContext().getString(2131957219));
            return;
        }
        String string = constraintLayout.getContext().getString(2131957220);
        String string2 = constraintLayout.getContext().getString(2131957221);
        int iW0 = ihc1.w0(string, string2, 0, false, 6);
        int length = string2.length() + iW0;
        ntj ntjVar = new ntj(fvx0Var, (byte) 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(ntjVar, iW0, length, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(constraintLayout.getContext().getColor(2131104471)), 0, spannableStringBuilder.length(), 33);
        encoreTextView.setText(spannableStringBuilder);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public hvp0(o4e0 o4e0Var, px41 px41Var) {
        this.a = (byte) 7;
        this.b = px41Var;
    }

    public /* synthetic */ hvp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
