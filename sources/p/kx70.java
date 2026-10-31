package p;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
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
import androidx.compose.ui.unit.TextUnit;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.http.CronetRuntime;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kx70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx70(vng vngVar, irq0 irq0Var, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, ven0 ven0Var) {
        super(0);
        this.a = (byte) 16;
        this.b = vngVar;
        this.c = irq0Var;
        this.d = str;
        this.e = iu30Var;
        this.g = iu30Var2;
        this.h = function0;
        this.f = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    public final Object invoke() {
        Intent intentJ;
        String strA;
        Object obj;
        String str;
        int i;
        TextDecoration textDecoration;
        String strA2;
        byte b = this.a;
        String af5Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.g;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj3;
                ven0 ven0Var2 = (ven0) obj2;
                if ((((Uri) ven0Var2.getValue()) == null || u890.j((Uri) ven0Var2.getValue(), Uri.EMPTY)) && ((Uri) ((ven0) obj8).getValue()) == null) {
                    wmy wmyVar = (wmy) obj7;
                    if (((ix70) wmyVar.e).a) {
                        ven0Var.setValue(((st60) wmyVar.b).r());
                        intentJ = new Intent("android.media.action.IMAGE_CAPTURE");
                        intentJ.putExtra("output", (Uri) ven0Var.getValue());
                    } else {
                        intentJ = new e1r0((byte) 2).J((Context) obj6, tto1.f(hh0.a));
                    }
                    try {
                        ((ihg0) obj5).a(intentJ);
                    } catch (ActivityNotFoundException unused) {
                        ppo1.q((cir0) obj4);
                    }
                    break;
                }
                return rih1Var;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj7;
                atomicBoolean.set(false);
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj6;
                if (atomicBoolean2.getAndSet(false)) {
                    q26.e().b(new unc0(atomicBoolean, atomicBoolean2, (ssw0) obj5, (vnc0) obj4, this.f, (l811) obj8, (LinkedHashSet) obj3, (byte) 0));
                }
                return rih1Var;
            case 2:
                twn0 twn0Var = (twn0) obj7;
                ug30 ug30Var = (zf30) obj6;
                String str2 = (String) obj5;
                if (str2 == null) {
                    ug30 ug30Var2 = ug30Var instanceof ug30 ? ug30Var : null;
                    strA = ug30Var2 != null ? ug30Var2.A(twn0Var.a) : null;
                } else {
                    strA = str2;
                }
                twn0Var.u(new vun0(ug30Var, new xg30(strA, (String) obj4, (String) obj2, (e6w0) obj8, (ee5) obj3)));
                twn0Var.g();
                twn0Var.i.a(ug30Var, ((e6w0) obj8) instanceof d6w0 ? 5 : 1, false);
                return rih1Var;
            case 3:
                yqg yqgVar = (yqg) ((fdp0) obj7).invoke();
                zip0 zip0Var = (zip0) ((fdp0) obj6).invoke();
                ipq ipqVar = (ipq) ((ycp0) obj5).b.X;
                ipq ipqVar2 = (ipq) ((ycp0) obj4).b.Y;
                mx3 mx3Var = (mx3) ((fdp0) obj2).invoke();
                ipq ipqVar3 = (ipq) ((ycp0) obj8).b.Z;
                return new vjd0(yqgVar, zip0Var, new cfd(mx3Var, ipqVar3, (byte) 11), ipqVar3, new q3s0(ipqVar, (mya1) ipqVar2.get()), (q8n) ((fdp0) obj3).invoke());
            case 4:
                return new n4f0(((vuk) ((u6j0) obj7).b).f(), ((yap0) obj6).b.h(), (u3f0) ((tap0) obj5).invoke(), (di8) ((uap0) obj4).b.q, (x54) ((tap0) obj2).invoke(), (CallbackRouter) ((tap0) obj8).invoke(), (q8n) ((tap0) obj3).invoke());
            case 5:
                return new vhg0((xf01) ((tap0) obj7).invoke(), (i8b0) ((tap0) obj6).invoke(), (Scheduler) ((tap0) obj5).invoke(), (kmn0) ((xap0) obj4).invoke(), (CronetRuntime) ((uap0) obj2).b.r, (n4f0) ((xap0) obj8).invoke(), ((uap0) obj3).b.p);
            case 6:
                return new hjh0((h89) ((gdp0) obj7).invoke(), (Flowable) ((gdp0) obj6).invoke(), (Scheduler) ((gdp0) obj5).invoke(), (tau0) ((hbp0) obj4).invoke(), (tjb) ((hbp0) obj2).invoke(), (g510) ((gdp0) obj8).invoke(), (i8h1) ((gdp0) obj3).invoke());
            case 7:
                return new inh0((Context) ((gdp0) obj7).invoke(), (tau0) ((hbp0) obj6).invoke(), (fnh0) ((gdp0) obj5).invoke(), (Observable) ((ycp0) obj4).invoke(), (Flowable) ((gdp0) obj2).invoke(), (Scheduler) ((gdp0) obj8).invoke(), (m54) ((gdp0) obj3).invoke());
            case 8:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((gdp0) obj7).invoke();
                b8g1 b8g1Var = (b8g1) ((gdp0) obj6).invoke();
                l270 l270Var = ((ucp0) obj5).b.E2;
                Context context = (Context) ((gdp0) obj4).invoke();
                q8n q8nVar = (q8n) ((gdp0) obj2).invoke();
                zle1 zle1Var = (zle1) ((gdp0) obj8).invoke();
                add addVar = (add) ((gdp0) obj3).invoke();
                c8o.l(retrofitMaker);
                r9i0 r9i0Var = (r9i0) retrofitMaker.createWebgateService(r9i0.class, "android-campfire-mediaupload-impl", wrn.f);
                c8o.l(b8g1Var);
                c8o.l(context);
                bx5 bx5Var = new bx5(context);
                c8o.l(q8nVar);
                c8o.l(zle1Var);
                c8o.l(addVar);
                return new q9i0(r9i0Var, b8g1Var, l270Var, bx5Var, q8nVar, zle1Var, addVar);
            case 9:
                Flowable flowable = (Flowable) ((gdp0) obj7).invoke();
                g0l g0lVar = (g0l) ((gdp0) obj6).invoke();
                yqg yqgVar2 = (yqg) ((gdp0) obj5).invoke();
                i8h1 i8h1Var = (i8h1) ((gdp0) obj4).invoke();
                tau0 tau0Var = (tau0) ((hdp0) obj2).invoke();
                RemoteNativeRxRouter remoteNativeRxRouterO = ((ycp0) obj8).b.o();
                e6u0 e6u0Var = (e6u0) ((gdp0) obj3).invoke();
                qqp qqpVar = new qqp(new r0s0(flowable, g0lVar, yqgVar2, i8h1Var, tau0Var, remoteNativeRxRouterO, e6u0Var), (byte) 0);
                return new t1u0((ywp) qqpVar.e, (ywp) qqpVar.c, flowable, new gae(p7h.M(new rjo0[]{new r62(i8h1Var), new ics(i8h1Var), new vw10(i8h1Var), new km30(i8h1Var), new s5v0(i8h1Var), new z0y(i8h1Var)})), g0lVar, yqgVar2, e6u0Var);
            case 10:
                return new u6y0((xrc0) ((idp0) obj7).invoke(), (iyc0) ((idp0) obj6).invoke(), (g0l) ((idp0) obj5).invoke(), (zor) ((idp0) obj4).invoke(), (kt91) ((idp0) obj2).invoke(), (q8n) ((idp0) obj8).invoke(), (q8n) ((idp0) obj3).invoke());
            case 11:
                return new pmy0(((vap0) obj7).b.a(), (kmn0) ((sap0) obj6).invoke(), ((vap0) obj5).b.b(), ((vap0) obj4).b.d(), (azp0) ((qcp0) obj2).invoke(), (q8n) ((qcp0) obj8).invoke(), (ajg) ((qcp0) obj3).invoke());
            case 12:
                Context context2 = (Context) ((cbp0) obj7).invoke();
                mc00 mc00VarP = ((vap0) obj6).b.p();
                sz11 sz11Var = (sz11) ((cbp0) obj5).invoke();
                pz11 pz11Var = (pz11) ((ibp0) obj4).invoke();
                xav0 xav0Var = (xav0) ((ibp0) obj2).invoke();
                vz11 vz11VarT = ((vap0) obj8).b.t();
                yqg yqgVar3 = (yqg) ((ibp0) obj3).invoke();
                c8o.l(pz11Var);
                c8o.l(xav0Var);
                c8o.l(context2);
                hm61 hm61Var = new hm61(mfm0.a, pz11Var, xav0Var);
                c8o.l(sz11Var);
                ne neVar = new ne(context2.getApplicationContext(), hm61Var, sz11Var);
                c8o.l(mc00VarP);
                keh1 keh1Var = new keh1(pz11Var, new lmw(mc00VarP.a.H, (byte) 8), xav0Var, neVar);
                c8o.l(yqgVar3);
                c8o.l(vz11VarT);
                return new xz11(keh1Var, yqgVar3, vz11VarT);
            case 13:
                return new ph61((Map) ((rcp0) obj7).b.g, ((vap0) obj6).b.a(), ((vap0) obj5).b.d(), ((wap0) obj4).b.b(), (ajg) ((qcp0) obj2).invoke(), ((sap0) obj8).b.c(), ((sap0) obj3).b.f());
            case 14:
                return new wt71((Context) ((zbp0) obj7).invoke(), (s35) ((zbp0) obj6).invoke(), (dma1) ((acp0) obj5).invoke(), ((ybp0) obj4).b.w3, ((ybp0) obj2).b.v3, (t2j0) ((acp0) obj8).invoke(), (q8n) ((acp0) obj3).invoke());
            case 15:
                a820 a820Var = (a820) ((acp0) obj7).invoke();
                byp0 byp0Var = (byp0) ((acp0) obj6).invoke();
                b7n b7nVar = (b7n) ((acp0) obj5).invoke();
                dxz0 dxz0Var = (dxz0) ((acp0) obj4).invoke();
                jj4 jj4Var = (jj4) ((acp0) obj2).invoke();
                Observable observable = (Observable) ((acp0) obj8).invoke();
                Scheduler scheduler = (Scheduler) ((acp0) obj3).invoke();
                c8o.l(a820Var);
                c8o.l(byp0Var);
                c8o.l(dxz0Var);
                c8o.l(b7nVar);
                m4e0 m4e0Var = new m4e0(b7nVar, (byte) 23);
                c8o.l(jj4Var);
                c8o.l(observable);
                c8o.l(scheduler);
                return new c2n0(a820Var, byp0Var, new y7c0(dxz0Var, m4e0Var, jj4Var, observable, scheduler));
            case 16:
                ClipData primaryClip = ((vng) obj7).a().getPrimaryClip();
                if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                    obj5 = obj5;
                    obj = obj6;
                    af5Var = null;
                } else {
                    ClipData.Item itemAt = primaryClip.getItemAt(0);
                    CharSequence text = itemAt != null ? itemAt.getText() : null;
                    if (text == null) {
                        obj5 = obj5;
                        obj = obj6;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i2];
                                if (u890.j(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, 0);
                                    parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                                    parcelObtain.setDataPosition(0);
                                    long jM = u7h.k;
                                    long jM2 = jM;
                                    long jY = TextUnit.c;
                                    long jY2 = jY;
                                    FontWeight fontWeight = null;
                                    FontStyle fontStyle = null;
                                    FontSynthesis fontSynthesis = null;
                                    String string = null;
                                    BaselineShift baselineShift = null;
                                    TextGeometricTransform textGeometricTransform = null;
                                    TextDecoration textDecoration2 = null;
                                    Shadow shadow = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > 1) {
                                            byte b2 = parcelObtain.readByte();
                                            if (b2 != 1) {
                                                obj = obj6;
                                                if (b2 != 2) {
                                                    obj = obj;
                                                    if (b2 == 3) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            fontWeight = new FontWeight(parcelObtain.readInt());
                                                            obj6 = obj;
                                                        }
                                                    } else if (b2 == 4) {
                                                        if (parcelObtain.dataAvail() >= 1) {
                                                            byte b3 = parcelObtain.readByte();
                                                            fontStyle = new FontStyle((b3 != 0 && b3 == 1) ? 1 : 0);
                                                            obj6 = obj;
                                                        }
                                                    } else if (b2 != 5) {
                                                        if (b2 == 6) {
                                                            string = parcelObtain.readString();
                                                        } else if (b2 == 7) {
                                                            if (parcelObtain.dataAvail() >= 5) {
                                                                byte b4 = parcelObtain.readByte();
                                                                long j = b4 == 1 ? 4294967296L : b4 == 2 ? 8589934592L : 0L;
                                                                jY2 = wee1.a(j, 0L) ? TextUnit.c : fc11.Y(parcelObtain.readFloat(), j);
                                                            }
                                                        } else if (b2 == 8) {
                                                            if (parcelObtain.dataAvail() >= 4) {
                                                                baselineShift = new BaselineShift(parcelObtain.readFloat());
                                                            }
                                                        } else if (b2 == 9) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                textGeometricTransform = new TextGeometricTransform(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                            }
                                                        } else if (b2 == 10) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                int i3 = u7h.l;
                                                                jM2 = w361.m(parcelObtain.readLong());
                                                            }
                                                        } else if (b2 == 11) {
                                                            if (parcelObtain.dataAvail() >= 4) {
                                                                int i4 = parcelObtain.readInt();
                                                                if ((i4 | 3) != 3) {
                                                                    rf80.a("The given mask=" + i4 + " is not recognized by TextDecoration.");
                                                                }
                                                                if (i4 == 0) {
                                                                    textDecoration = TextDecoration.b;
                                                                } else if (i4 == 1) {
                                                                    textDecoration = TextDecoration.c;
                                                                } else if (i4 != 2) {
                                                                    textDecoration2 = new TextDecoration(i4);
                                                                } else {
                                                                    textDecoration = TextDecoration.d;
                                                                }
                                                                textDecoration2 = textDecoration;
                                                            }
                                                        } else if (b2 == 12) {
                                                            if (parcelObtain.dataAvail() >= 20) {
                                                                int i5 = u7h.l;
                                                                obj6 = obj;
                                                                shadow = new Shadow(parcelObtain.readFloat(), w361.m(parcelObtain.readLong()), (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L));
                                                            }
                                                        }
                                                        obj6 = obj;
                                                    } else if (parcelObtain.dataAvail() >= 1) {
                                                        byte b5 = parcelObtain.readByte();
                                                        if (b5 == 0) {
                                                            i = 0;
                                                        } else if (b5 == 1) {
                                                            i = 65535;
                                                        } else if (b5 == 3) {
                                                            i = 2;
                                                        } else if (b5 == 2) {
                                                            i = 1;
                                                        } else {
                                                            i = 0;
                                                        }
                                                        fontSynthesis = new FontSynthesis(i);
                                                        obj6 = obj;
                                                    }
                                                } else if (parcelObtain.dataAvail() >= 5) {
                                                    byte b6 = parcelObtain.readByte();
                                                    long j2 = b6 == 1 ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                    jY = wee1.a(j2, 0L) ? TextUnit.c : fc11.Y(parcelObtain.readFloat(), j2);
                                                    obj6 = obj;
                                                } else {
                                                    obj = obj;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i6 = u7h.l;
                                                jM = w361.m(parcelObtain.readLong());
                                            }
                                        }
                                        obj = obj6;
                                    }
                                    arrayList.add(new ze5(spanStart, spanEnd, new zma1(jM, jY, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, string, jY2, baselineShift, textGeometricTransform, (LocaleList) null, jM2, textDecoration2, shadow, (PlatformSpanStyle) null, 49152)));
                                } else {
                                    obj = obj6;
                                }
                                if (i2 != length) {
                                    i2++;
                                    text = text;
                                    spanned = spanned;
                                    obj5 = obj5;
                                    obj6 = obj;
                                }
                            }
                        } else {
                            text = text;
                            obj5 = obj5;
                            obj = obj6;
                        }
                        af5Var = new af5(text.toString(), arrayList, 0);
                    } else {
                        af5Var = new af5(text.toString());
                        obj5 = obj5;
                        obj = obj6;
                    }
                }
                if (af5Var != null && (str = ((af5) af5Var).b) != null) {
                    int i7 = ((irq0) obj).a;
                    String str3 = (String) obj5;
                    iu30 iu30Var = (iu30) obj4;
                    iu30 iu30Var2 = (iu30) obj8;
                    Function0 function0 = (Function0) obj3;
                    ven0 ven0Var3 = (ven0) obj2;
                    StringBuilder sb = new StringBuilder();
                    int length2 = str.length();
                    for (int i8 = 0; i8 < length2; i8++) {
                        char cCharAt = str.charAt(i8);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String strC1 = ihc1.c1(i7, sb.toString());
                    if (strC1.length() > 0 && !strC1.equals(str3)) {
                        int length3 = strC1.length();
                        ven0Var3.setValue(new c8e1(e6p1.e(length3, length3), 4, strC1));
                        iu30Var.invoke(strC1);
                        boolean z = strC1.length() == i7;
                        iu30Var2.invoke(Boolean.valueOf(z));
                        if (z) {
                            function0.invoke();
                        }
                    }
                }
                return rih1Var;
            case 17:
                yvq0 yvq0Var = (yvq0) obj7;
                twn0 twn0Var2 = yvq0Var.b;
                zf30 zf30Var = (zf30) obj6;
                twn0Var2.u(new vun0(zf30Var, new xg30(yvq0Var.n((String) obj5, zf30Var), (String) obj4, (String) obj2, (e6w0) obj8, (ee5) obj3)));
                twn0Var2.g();
                return rih1Var;
            case 18:
                w0r0 w0r0Var = (w0r0) obj7;
                ug30 ug30Var3 = (zf30) obj6;
                String str4 = (String) obj5;
                if (str4 == null) {
                    ug30 ug30Var4 = ug30Var3 instanceof ug30 ? ug30Var3 : null;
                    strA2 = ug30Var4 != null ? ug30Var4.A(w0r0Var.a) : null;
                } else {
                    strA2 = str4;
                }
                w0r0Var.d.b(new vun0(ug30Var3, new xg30(strA2, (String) obj4, (String) obj2, (e6w0) obj8, (ee5) obj3)));
                w0r0Var.p();
                w0r0Var.n();
                return rih1Var;
            default:
                fn31.T((c9n) obj7, (o8n) null, 0, new s73((iu30) obj6, (wkt) obj5, (s5k1) obj4, (xwa) obj2, (vwa) obj8, (xwa) obj3, (lnm) null, (byte) 5), 3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx70(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
