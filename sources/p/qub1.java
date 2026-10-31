package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Property;
import android.view.View;
import androidx.webkit.WebViewStartupException;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qub1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qub1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri uriBuild;
        PowerManager.WakeLock wakeLock;
        o2b1 string = null;
        int i = 0;
        switch (this.a) {
            case 0:
                up41 up41Var = (up41) this.b;
                pub1 pub1Var = (pub1) this.c;
                dqu dquVar = (dqu) ((w62) up41Var.b).g;
                dquVar.getClass();
                mk60 mk60Var = (mk60) dquVar.b;
                dm5.y(mk60Var.k);
                b380 b380Var = pub1Var.e;
                HashSet hashSet = mk60Var.h;
                w280 w280VarR = b380Var.r(0);
                while (w280VarR.hasNext()) {
                    nub1 nub1Var = (nub1) w280VarR.next();
                    String str = nub1Var.a;
                    oub1 oub1Var = nub1Var.c;
                    String str2 = nub1Var.b;
                    if (hashSet.contains(str) && !hashSet.contains(str2)) {
                        v280 v280Var = new v280(4);
                        v280 v280Var2 = new v280(4);
                        b380<ml60> b380Var2 = mk60Var.d;
                        j380 j380Var = oub1Var.c;
                        for (ml60 ml60Var : b380Var2) {
                            Uri uri = (Uri) ml60Var.b.get(str);
                            String str3 = ml60Var.a.b;
                            uri.getClass();
                            if (j380Var.containsKey(str3)) {
                                uriBuild = (Uri) j380Var.get(str3);
                                uriBuild.getClass();
                            } else {
                                uriBuild = mk60.b(uri, oub1Var).build();
                            }
                            if (uriBuild != null) {
                                v280Var.c(uriBuild);
                                v280Var2.c(uri);
                            }
                        }
                        mk60.d(nub1Var, mk60Var.e, v280Var, v280Var2);
                        mk60.d(nub1Var, mk60Var.f, v280Var, v280Var2);
                        mk60.d(nub1Var, mk60Var.g, v280Var, v280Var2);
                        hashSet.add(str2);
                        h9n h9nVar = mk60Var.b;
                        bg11 bg11VarG = v280Var.g();
                        bg11 bg11VarG2 = v280Var2.g();
                        HashMap map = ((h1s) h9nVar.b).d;
                        dm5.y(bg11VarG.d == bg11VarG2.d);
                        for (int i2 = 0; i2 < bg11VarG.d; i2++) {
                            g1s g1sVar = (g1s) map.get(bg11VarG2.get(i2));
                            g1sVar.getClass();
                            Uri uri2 = (Uri) bg11VarG.get(i2);
                            g1sVar.a.b.put(str2, uri2);
                            HashMap map2 = g1sVar.b;
                            f1s f1sVar = (f1s) map2.get(uri2);
                            if (f1sVar == null) {
                                map2.put(uri2, new f1s(g1sVar.d, uri2, str2));
                            } else {
                                f1sVar.b.add(str2);
                            }
                            map.put(uri2, g1sVar);
                        }
                    }
                }
                mk60Var.m = pub1Var.d;
                mk60Var.e(-9223372036854775807L);
                return;
            case 1:
                ((dkl) ((AtomicReference) this.c).get()).accept(new m29((d4d1) this.b));
                return;
            case 2:
                hfe1 hfe1Var = (hfe1) this.b;
                j4d1 j4d1Var = (j4d1) this.c;
                j4d1 j4d1Var2 = hfe1Var.h;
                if (j4d1Var2 != null && j4d1Var2 == j4d1Var) {
                    hfe1Var.h = null;
                    hfe1Var.g = null;
                }
                k65 k65Var = hfe1Var.l;
                if (k65Var != null) {
                    k65Var.a();
                    hfe1Var.l = null;
                    return;
                }
                return;
            case 3:
                ((t8r0) ((zsc) this.b).c).p((mkb1) this.c, 3);
                return;
            case 4:
                TooltipContainer tooltipContainer = (TooltipContainer) this.b;
                d4f1 d4f1Var = (d4f1) this.c;
                int i3 = TooltipContainer.P0;
                tooltipContainer.f(tooltipContainer.e, d4f1Var);
                a6f1 a6f1Var = tooltipContainer.a;
                a6f1Var.getClass();
                Rect rect = new Rect();
                a6f1Var.getDrawingRect(rect);
                int i4 = rect.left;
                int i5 = a6f1Var.t;
                int i6 = i4 + i5;
                a6f1Var.c = i6;
                int i7 = rect.right - i5;
                a6f1Var.e = i7;
                int i8 = rect.top;
                int i9 = a6f1Var.g;
                int i10 = i8 + i9;
                a6f1Var.d = i10;
                a6f1Var.f = (rect.bottom - i9) - i10;
                float f = a6f1Var.O0;
                float f2 = a6f1Var.i;
                float f3 = i6 + i9 + f2;
                if (f < f3) {
                    a6f1Var.O0 = f3;
                } else {
                    float f4 = (i7 - f2) - i9;
                    if (f > f4) {
                        a6f1Var.O0 = f4;
                    }
                }
                a6f1Var.setVisibility(0);
                RectF rectF = a6f1Var.T0;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = 0.0f;
                rectF.bottom = 0.0f;
                if (a6f1Var.Q0.c()) {
                    a6f1Var.R0.setScaleX(1.0f);
                    a6f1Var.R0.setScaleY(0.25f);
                    a6f1Var.R0.setAlpha(0.0f);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new y5f1(a6f1Var, (byte) 0));
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a6f1Var.R0, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.25f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(250L);
                objectAnimatorOfPropertyValuesHolder.setStartDelay(50L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder);
                animatorSet.start();
                return;
            case 5:
                pgg1 pgg1Var = (pgg1) this.b;
                v280 v280Var3 = (v280) this.c;
                lqr lqrVar = pgg1Var.e;
                bg11 bg11VarG3 = v280Var3.g();
                cab cabVar = pgg1Var.d;
                String str4 = (String) cabVar.c;
                String str5 = (String) cabVar.d;
                myr myrVar = (myr) lqrVar.b;
                bt00 bt00Var = myrVar.f98p;
                zho1.M(bt00Var, bg11VarG3, str4, str5);
                a1g1 a1g1Var = myrVar.i;
                dt00 dt00VarA = bt00Var.a();
                kgg1 kgg1Var = (kgg1) a1g1Var.b;
                kgg1Var.c();
                kgg1Var.g.h(-1, new ifb1(a1g1Var, dt00VarA));
                if (kgg1Var.a()) {
                    n4w n4wVar = kgg1Var.u;
                    n4wVar.getClass();
                    n4wVar.g(dt00VarA);
                }
                kgg1Var.q = null;
                return;
            case 6:
                roj1 roj1Var = (roj1) this.b;
                qoj1 qoj1Var = (qoj1) this.c;
                roj1Var.getClass();
                try {
                    qoj1Var.run();
                    return;
                } catch (Exception e) {
                    roj1Var.b(e);
                    return;
                }
            case 7:
                bih1 bih1Var = (bih1) this.b;
                String str6 = (String) this.c;
                qwj1 qwj1Var = (qwj1) bih1Var.c;
                String str7 = zoi1.a;
                qwj1Var.h(str6);
                return;
            case 8:
                bih1 bih1Var2 = (bih1) this.b;
                z1k1 z1k1Var = (z1k1) this.c;
                qwj1 qwj1Var2 = (qwj1) bih1Var2.c;
                String str8 = zoi1.a;
                qwj1Var2.b(z1k1Var);
                return;
            case 9:
                bih1 bih1Var3 = (bih1) this.b;
                Exception exc = (Exception) this.c;
                qwj1 qwj1Var3 = (qwj1) bih1Var3.c;
                String str9 = zoi1.a;
                qwj1Var3.D(exc);
                return;
            case 10:
                bih1 bih1Var4 = (bih1) this.b;
                iwg iwgVar = (iwg) this.c;
                qwj1 qwj1Var4 = (qwj1) bih1Var4.c;
                String str10 = zoi1.a;
                qwj1Var4.S(iwgVar);
                return;
            case 11:
                lbk1 lbk1Var = (lbk1) this.b;
                kbk1 kbk1Var = (kbk1) this.c;
                if (dhn.a.contains(lbk1.class)) {
                    return;
                }
                try {
                    Timer timer = lbk1Var.c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    lbk1Var.d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(kbk1Var, 0L, 1000L);
                    lbk1Var.c = timer2;
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    dhn.a(lbk1.class, th);
                    return;
                }
            case 12:
                String str11 = (String) this.b;
                lbk1 lbk1Var2 = (lbk1) this.c;
                if (dhn.a.contains(lbk1.class)) {
                    return;
                }
                try {
                    byte[] bytes = str11.getBytes(nne.a);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(bytes);
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        int length = bArrDigest.length;
                        while (i < length) {
                            byte b = bArrDigest[i];
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                            i++;
                        }
                        string = sb.toString();
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                    Date date = xd.Y;
                    xd xdVarS = fuo1.s();
                    if (string == null || !string.equals(lbk1Var2.d)) {
                        int i11 = lbk1.e;
                        lbk1Var2.b(w8p1.l(str11, xdVarS, wf10.b()), string);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    dhn.a(lbk1.class, th2);
                    return;
                }
            case 13:
                String str12 = (String) this.b;
                String str13 = (String) this.c;
                HashSet hashSet2 = yck1.e;
                s9p1.J(str12, str13, new float[0]);
                return;
            case 14:
                rhk1 rhk1Var = (rhk1) this.b;
                View[] viewArr = (View[]) this.c;
                if (rhk1Var.f127p != -1) {
                    for (View view : viewArr) {
                        view.setTag(rhk1Var.f127p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (rhk1Var.q != -1) {
                    int length2 = viewArr.length;
                    while (i < length2) {
                        viewArr[i].setTag(rhk1Var.q, null);
                        i++;
                    }
                    return;
                }
                return;
            case 15:
                uqs uqsVar = (uqs) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                qpj1 qpj1Var = (qpj1) uqsVar.c;
                if (atomicBoolean.get()) {
                    new Thread(new qub1(qpj1Var, atomicBoolean, (byte) 16), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 16:
                qpj1 qpj1Var2 = (qpj1) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (qpj1Var2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) qpj1Var2.c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 17:
                s24 s24Var = (s24) this.b;
                try {
                    byte[] bArrC = ((x45) s24Var.b).c(Arrays.asList((Object[]) this.c));
                    new String(bArrC, StandardCharsets.UTF_8);
                    aij0 aij0Var = (aij0) s24Var.c;
                    aij0Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("MESSAGE_BODY", bArrC);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    messageObtain.setData(bundle);
                    try {
                        aij0Var.b.send(messageObtain);
                        return;
                    } catch (RemoteException unused3) {
                        Logger.d("Could not send the message to the remote client", new Object[0]);
                        return;
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                    n57.g(e2.getMessage(), e2);
                    return;
                }
            case 18:
                s24 s24Var2 = (s24) this.b;
                byte[] bArr = (byte[]) this.c;
                s24Var2.getClass();
                try {
                    nfa0 nfa0Var = ((x45) s24Var2.b).a;
                    m8b0 m8b0Var = bArr.length == 0 ? new m8b0(z6x.a, nfa0Var) : new m8b0(fga0.k(nfa0Var.c(nhc1.P(bArr))), nfa0Var);
                    try {
                        int iA = m8b0Var.a();
                        if (iA == 1) {
                            string = (ssk1) s24Var2.i;
                        } else if (iA == 32) {
                            string = (yrg0) s24Var2.X;
                        } else if (iA == 34) {
                            string = (h5a1) s24Var2.Y;
                        } else if (iA == 48) {
                            string = (lxh1) s24Var2.Z;
                        } else if (iA == 5) {
                            string = (y1t0) s24Var2.t;
                        } else if (iA != 6) {
                            Logger.k("No router for WAMP action %d.", new Object[]{Integer.valueOf(iA)});
                        } else {
                            string = (o2b1) s24Var2.N0;
                        }
                        if (string != null) {
                            string.f(m8b0Var);
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        e3.getMessage();
                        n57.g(e3.getMessage(), e3);
                        return;
                    }
                } catch (Exception e4) {
                    e4.getMessage();
                    n57.g(e4.getMessage(), e4);
                    return;
                }
                e4.getMessage();
                n57.g(e4.getMessage(), e4);
                return;
            case 19:
                qpj1 qpj1Var3 = (qpj1) this.b;
                WebViewStartupException webViewStartupException = (WebViewStartupException) this.c;
                xjl1 xjl1Var = (xjl1) qpj1Var3.b;
                zrw0 zrw0Var = bsw0.a;
                bsw0.a(xjl1Var.a, c2u.a);
                ohd ohdVar = (ohd) qpj1Var3.c;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(new e331(new m231(webViewStartupException)));
                    return;
                }
                return;
            case 20:
                ((iyh1) this.b).b((bih1) this.c);
                return;
            default:
                m8m1 m8m1Var = (m8m1) this.b;
                x8c0 x8c0Var = (x8c0) this.c;
                if (m8m1Var.c) {
                    return;
                }
                m8m1Var.d = x8c0Var;
                x8c0Var.a(m8m1Var);
                return;
        }
    }
}
