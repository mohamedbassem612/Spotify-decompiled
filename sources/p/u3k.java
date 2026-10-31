package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u3k {
    public static final u3k a = new u3k();

    public static Object d(RiveAnimation riveAnimation, g7m1 g7m1Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, String str, Map map, onm onmVar, int i) {
        return a.b(riveAnimation, g7m1Var, ti31Var, kj31Var, cxcVar, new p3k(new boj(g7m1Var, (byte) 10), (byte) 0), (i & 32) != 0 ? "background" : str, z6x.a, (i & 128) != 0 ? b7x.a : map, onmVar);
    }

    public static rx7 f(AudioPreview audioPreview) {
        return new rx7(audioPreview.getUrl(), m(audioPreview), j(audioPreview));
    }

    public static gqb h(Outline outline) {
        if (((outline.p() == 0 || outline.n().length() <= 0) ? null : outline) != null) {
            return new gqb(z4p1.e(Color.parseColor(outline.n())), outline.p());
        }
        return null;
    }

    public static gec i(ButtonConfiguration.Style style) {
        String strP = style.p();
        String strQ = style.q();
        Integer numValueOf = (strQ == null || strQ.length() == 0) ? null : Integer.valueOf(Color.parseColor(style.q()));
        String strN = style.n();
        return new gec(numValueOf, (strN == null || strN.length() == 0) ? null : Integer.valueOf(Color.parseColor(style.n())), strP, (String) null);
    }

    public static sju j(AudioPreview audioPreview) {
        dg dgVar;
        xz7 xz7Var;
        g08 g08Var;
        if (!audioPreview.v() || audioPreview.q().getTitle().length() <= 0 || audioPreview.q().getSubtitle().length() <= 0) {
            return null;
        }
        String title = audioPreview.q().getTitle();
        String subtitle = audioPreview.q().getSubtitle();
        String strR = audioPreview.q().r();
        String str = strR.length() == 0 ? null : strR;
        String imageUrl = audioPreview.q().getImageUrl();
        String str2 = imageUrl.length() == 0 ? null : imageUrl;
        if (audioPreview.q().t()) {
            dgVar = kuo1.j(audioPreview.q().o());
        } else {
            String strP = audioPreview.q().p();
            if (ihc1.y0(strP)) {
                strP = null;
            }
            dgVar = strP != null ? new dg(strP) : null;
        }
        dg dgVar2 = dgVar;
        if (audioPreview.q().s()) {
            String strP2 = audioPreview.q().n().p();
            if (strP2.length() == 0) {
                strP2 = null;
            }
            String strQ = audioPreview.q().n().q();
            if (strQ.length() == 0) {
                strQ = null;
            }
            String strN = audioPreview.q().n().n();
            if (ihc1.y0(strN)) {
                strN = null;
            }
            xz7Var = new xz7(strP2, strQ, (String) null, strN != null ? new dg(strN) : null);
        } else {
            xz7Var = null;
        }
        if (audioPreview.q().s()) {
            String strO = audioPreview.q().n().o();
            if (strO.length() == 0) {
                strO = null;
            }
            String strS = audioPreview.q().n().s();
            if (strS.length() == 0) {
                strS = null;
            }
            g08Var = new g08(strO, strS, (dg) null);
        } else {
            g08Var = null;
        }
        return new sju(title, subtitle, str, str2, dgVar2, xz7Var, g08Var);
    }

    public static ual1 m(AudioPreview audioPreview) {
        return audioPreview.w() ? new tal1(audioPreview.t().p(), audioPreview.t().n()) : sal1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(iu30 iu30Var, lnm lnmVar) {
        n3k n3kVar;
        if (lnmVar instanceof n3k) {
            n3kVar = (n3k) lnmVar;
            int i = n3kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n3kVar.c = i - Integer.MIN_VALUE;
            } else {
                n3kVar = new n3k(this, lnmVar);
            }
        } else {
            n3kVar = new n3k(this, lnmVar);
        }
        Object objInvoke = n3kVar.a;
        int i2 = n3kVar.c;
        if (i2 == 0) {
            hm5.M(objInvoke);
            n3kVar.c = 1;
            objInvoke = iu30Var.invoke(n3kVar);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objInvoke);
        }
        return new wj41((List) objInvoke);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(RiveAnimation riveAnimation, g7m1 g7m1Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, zu30 zu30Var, String str, List list, Map map, onm onmVar) {
        o3k o3kVar;
        Map map2;
        zu30 zu30Var2;
        List list2;
        if (onmVar instanceof o3k) {
            o3kVar = (o3k) onmVar;
            int i = o3kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3kVar.f = i - Integer.MIN_VALUE;
            } else {
                o3kVar = new o3k(this, onmVar);
            }
        } else {
            o3kVar = new o3k(this, onmVar);
        }
        Object objD = o3kVar.d;
        int i2 = o3kVar.f;
        if (i2 == 0) {
            hm5.M(objD);
            if (ihc1.y0(riveAnimation.getUrl())) {
                hhg1.n("Background scene requires a non-blank Rive URL");
                return null;
            }
            bju bjuVar = g7m1Var.b;
            xd1 xd1Var = new xd1((Object) riveAnimation, (Object) ti31Var, (Object) kj31Var, (Object) cxcVar, (lnm) null, (byte) 4);
            o3kVar.a = (hab0) zu30Var;
            o3kVar.b = list;
            map2 = map;
            o3kVar.c = map2;
            o3kVar.f = 1;
            objD = bjuVar.d(str, xd1Var, o3kVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            zu30Var2 = zu30Var;
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map2 = o3kVar.c;
            list2 = o3kVar.b;
            zu30Var2 = (zu30) o3kVar.a;
            hm5.M(objD);
        }
        mmr0 mmr0Var = (mmr0) objD;
        return new ej31((wj31) mmr0Var.a, o7h.N0(list2, (List) mmr0Var.b), map2, zu30Var2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(RiveAnimation riveAnimation, bju bjuVar, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, String str, String str2, onm onmVar) {
        q3k q3kVar;
        String str3;
        String str4;
        Exception exc;
        if (onmVar instanceof q3k) {
            q3kVar = (q3k) onmVar;
            int i = q3kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3kVar.d = i - Integer.MIN_VALUE;
            } else {
                q3kVar = new q3k(this, onmVar);
            }
        } else {
            q3kVar = new q3k(this, onmVar);
        }
        Object obj = q3kVar.b;
        int i2 = q3kVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (ihc1.y0(riveAnimation.getUrl())) {
                    return null;
                }
                try {
                    vu30 xd1Var = new xd1((Object) riveAnimation, (Object) ti31Var, (Object) kj31Var, (Object) cxcVar, (lnm) null, (byte) 5);
                    str3 = str2;
                    try {
                        q3kVar.a = str3;
                        q3kVar.d = 1;
                        Object objD = bjuVar.d(str, xd1Var, q3kVar);
                        Object obj2 = d9n.a;
                        if (objD == obj2) {
                            return obj2;
                        }
                        str4 = str3;
                        obj = objD;
                    } catch (Exception e) {
                        e = e;
                        str4 = str3;
                        exc = e;
                        Logger.e(exc, str4, new Object[0]);
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str2;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = q3kVar.a;
                try {
                    hm5.M(obj);
                } catch (Exception e3) {
                    exc = e3;
                    Logger.e(exc, str4, new Object[0]);
                    return null;
                }
            }
            return (m3k) obj;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, gw70 gw70Var, boolean z, onm onmVar) {
        r3k r3kVar;
        if (onmVar instanceof r3k) {
            r3kVar = (r3k) onmVar;
            int i = r3kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r3kVar.c = i - Integer.MIN_VALUE;
            } else {
                r3kVar = new r3k(this, onmVar);
            }
        } else {
            r3kVar = new r3k(this, onmVar);
        }
        Object objJ = r3kVar.a;
        int i2 = r3kVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ixg ixgVarF = gw70Var.f(str);
            if (z) {
                ixgVarF.g = false;
            }
            Single singleI = ixgVarF.i();
            r3kVar.c = 1;
            objJ = fc11.j(singleI, r3kVar);
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
        Bitmap bitmap = (Bitmap) objJ;
        bitmap.getClass();
        return bitmap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Image image, gw70 gw70Var, lnm lnmVar) {
        s3k s3kVar;
        if (lnmVar instanceof s3k) {
            s3kVar = (s3k) lnmVar;
            int i = s3kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3kVar.d = i - Integer.MIN_VALUE;
            } else {
                s3kVar = new s3k(this, lnmVar);
            }
        } else {
            s3kVar = new s3k(this, lnmVar);
        }
        Object objG = s3kVar.b;
        int i2 = s3kVar.d;
        if (i2 == 0) {
            hm5.M(objG);
            String url = image.getUrl();
            s3kVar.a = image;
            s3kVar.d = 1;
            objG = g(url, gw70Var, false, s3kVar);
            Object obj = d9n.a;
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            image = s3kVar.a;
            hm5.M(objG);
        }
        Bitmap bitmap = (Bitmap) objG;
        String strN = image.n();
        Outline outlineP = image.p();
        return new yj41(bitmap, strN, outlineP != null ? h(outlineP) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Image image, gw70 gw70Var, bju bjuVar, String str, onm onmVar) {
        t3k t3kVar;
        if (onmVar instanceof t3k) {
            t3kVar = (t3k) onmVar;
            int i = t3kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3kVar.d = i - Integer.MIN_VALUE;
            } else {
                t3kVar = new t3k(this, onmVar);
            }
        } else {
            t3kVar = new t3k(this, onmVar);
        }
        Object objE = t3kVar.b;
        int i2 = t3kVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                wj6 wj6Var = new wj6(image, gw70Var, null, (byte) 1);
                t3kVar.a = str;
                t3kVar.d = 1;
                objE = bjuVar.e(str, wj6Var, t3kVar);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = t3kVar.a;
                hm5.M(objE);
            }
            return (yj41) objE;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, f4i1.f("Optional image ", str, " failed to load"), new Object[0]);
            return null;
        }
    }
}
