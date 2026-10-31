package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.compose.ui.geometry.Offset;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fdc implements Function, atc, c7g1, k2r, afu, vfa {
    public static final sfv0 g = new sfv0();
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v28, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v37, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v47, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v49, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v19, types: [android.os.Bundle] */
    public fdc(dko0 dko0Var) {
        Notification.Builder builder;
        ArrayList<mrs0> arrayList;
        ?? r21;
        byte b;
        ?? r11;
        int i;
        ArrayList arrayList2;
        gko0 gko0Var;
        xjo0 xjo0VarF;
        xjo0 xjo0VarF2;
        gko0 gko0Var2;
        int i2;
        this.a = (byte) 23;
        this.f = new Bundle();
        this.e = dko0Var;
        Context context = dko0Var.a;
        ArrayList arrayList3 = dko0Var.F;
        ArrayList<mrs0> arrayList4 = dko0Var.c;
        ArrayList arrayList5 = dko0Var.d;
        this.c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = no80.o(context, dko0Var.y);
            this.d = builder;
        } else {
            builder = new Notification.Builder(context);
            this.d = builder;
        }
        Notification notification = dko0Var.D;
        ?? r12 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dko0Var.e).setContentText(dko0Var.f).setContentInfo(null).setContentIntent(dko0Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & SemanticState.Focused) != 0).setNumber(dko0Var.i).setProgress(dko0Var.n, dko0Var.o, dko0Var.f38p);
        IconCompat iconCompat = dko0Var.h;
        builder.setLargeIcon(iconCompat == null ? null : xzo1.v(iconCompat, context));
        builder.setSubText(dko0Var.m).setUsesChronometer(false).setPriority(dko0Var.j);
        glo0 glo0Var = dko0Var.l;
        if (glo0Var instanceof gko0) {
            gko0 gko0Var3 = (gko0) glo0Var;
            PendingIntent pendingIntent = gko0Var3.h;
            Integer num = gko0Var3.l;
            if (pendingIntent == null) {
                gko0Var = gko0Var3;
                xjo0VarF = gko0Var.f(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, gko0Var3.i);
            } else {
                gko0Var = gko0Var3;
                xjo0VarF = gko0Var.f(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
            }
            gko0 gko0Var4 = gko0Var;
            PendingIntent pendingIntent2 = gko0Var4.g;
            if (pendingIntent2 == null) {
                gko0Var2 = gko0Var4;
                xjo0VarF2 = null;
            } else {
                boolean z = gko0Var4.j;
                xjo0VarF2 = gko0Var4.f(z ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, gko0Var4.k, R.color.call_notification_answer_color, pendingIntent2);
                gko0Var2 = gko0Var4;
            }
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(xjo0VarF);
            ArrayList<xjo0> arrayList7 = gko0Var2.a.b;
            if (arrayList7 != null) {
                i2 = 2;
                for (xjo0 xjo0Var : arrayList7) {
                    xjo0Var.getClass();
                    if (!xjo0Var.a.getBoolean("key_action_priority")) {
                        arrayList6.add(xjo0Var);
                        i2--;
                    }
                    if (xjo0VarF2 != null && i2 == 1) {
                        arrayList6.add(xjo0VarF2);
                        i2--;
                    }
                }
            } else {
                i2 = 2;
            }
            if (xjo0VarF2 != null && i2 >= 1) {
                arrayList6.add(xjo0VarF2);
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                H((xjo0) it.next());
            }
        } else {
            Iterator it2 = dko0Var.b.iterator();
            while (it2.hasNext()) {
                H((xjo0) it2.next());
            }
        }
        Bundle bundle = dko0Var.t;
        if (bundle != null) {
            ((Bundle) this.f).putAll(bundle);
        }
        ((Notification.Builder) this.d).setShowWhen(dko0Var.k);
        ((Notification.Builder) this.d).setLocalOnly(dko0Var.r);
        ((Notification.Builder) this.d).setGroup(dko0Var.q);
        ((Notification.Builder) this.d).setSortKey(null);
        ((Notification.Builder) this.d).setGroupSummary(false);
        this.b = false;
        ((Notification.Builder) this.d).setCategory(dko0Var.s);
        ((Notification.Builder) this.d).setColor(dko0Var.u);
        ((Notification.Builder) this.d).setVisibility(dko0Var.v);
        ((Notification.Builder) this.d).setPublicVersion(null);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                for (mrs0 mrs0Var : arrayList4) {
                    CharSequence charSequence = mrs0Var.a;
                    String str = mrs0Var.c;
                    if (str == null) {
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    d46 d46Var = new d46(arrayList3.size() + arrayList2.size());
                    d46Var.addAll(arrayList2);
                    d46Var.addAll(arrayList3);
                    arrayList3 = new ArrayList((Collection) d46Var);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.d).addPerson((String) it3.next());
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle2 = dko0Var.t;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                dko0Var.t = bundle2;
            }
            Bundle bundle3 = bundle2.getBundle("android.car.EXTENSIONS");
            ?? bundle4 = bundle3 == null ? new Bundle() : bundle3;
            ?? bundle5 = new Bundle((Bundle) bundle4);
            ?? bundle6 = new Bundle();
            int i3 = 0;
            while (i3 < arrayList5.size()) {
                String string = Integer.toString(i3);
                xjo0 xjo0Var2 = (xjo0) arrayList5.get(i3);
                ?? bundle7 = new Bundle();
                IconCompat iconCompatG = xjo0Var2.b;
                ArrayList arrayList8 = arrayList4;
                if (iconCompatG == null && (i = xjo0Var2.f) != 0) {
                    iconCompatG = IconCompat.g((Resources) r12, "", i);
                    xjo0Var2.b = iconCompatG;
                }
                Bundle bundle8 = xjo0Var2.a;
                ?? r22 = r12;
                bundle7.putInt("icon", iconCompatG != null ? iconCompatG.h() : 0);
                bundle7.putCharSequence("title", xjo0Var2.g);
                bundle7.putParcelable("actionIntent", xjo0Var2.h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", xjo0Var2.d);
                bundle7.putBundle("extras", bundle9);
                z221[] z221VarArr = xjo0Var2.c;
                if (z221VarArr == null) {
                    r11 = r22;
                } else {
                    r11 = new Bundle[z221VarArr.length];
                    if (z221VarArr.length > 0) {
                        z221 z221Var = z221VarArr[0];
                        new Bundle();
                        throw r22;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", r11);
                bundle7.putBoolean("showsUserInterface", xjo0Var2.e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i3++;
                arrayList4 = arrayList8;
                r12 = r22;
            }
            arrayList = arrayList4;
            r21 = r12;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            Bundle bundle10 = dko0Var.t;
            ?? r4 = bundle10;
            if (bundle10 == null) {
                Bundle bundle11 = new Bundle();
                dko0Var.t = bundle11;
                r4 = bundle11;
            }
            r4.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            arrayList = arrayList4;
            r21 = 0;
        }
        ((Notification.Builder) this.d).setExtras(dko0Var.t);
        ((Notification.Builder) this.d).setRemoteInputHistory(r21);
        RemoteViews remoteViews = dko0Var.w;
        if (remoteViews != null) {
            ((Notification.Builder) this.d).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = dko0Var.x;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.d).setCustomBigContentView(remoteViews2);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            no80.L((Notification.Builder) this.d);
            no80.R((Notification.Builder) this.d);
            no80.S((Notification.Builder) this.d, dko0Var.z);
            no80.T((Notification.Builder) this.d, dko0Var.A);
            no80.O((Notification.Builder) this.d, 0);
            if (!TextUtils.isEmpty(dko0Var.y)) {
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            for (mrs0 mrs0Var2 : arrayList) {
                Notification.Builder builder2 = (Notification.Builder) this.d;
                mrs0Var2.getClass();
                ph5.c(builder2, rh5.c(mrs0Var2));
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            x74.i0((Notification.Builder) this.d, dko0Var.C);
            x74.l0((Notification.Builder) this.d);
        }
        if (i5 >= 31 && (b = dko0Var.B) != 0) {
            mb4.G((Notification.Builder) this.d, b);
        }
        if (i5 >= 36) {
            hg.m((Notification.Builder) this.d);
        }
        if (dko0Var.E) {
            ((dko0) this.e).getClass();
            this.b = true;
            ((Notification.Builder) this.d).setVibrate(null);
            ((Notification.Builder) this.d).setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            ((Notification.Builder) this.d).setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(((dko0) this.e).q)) {
                    ((Notification.Builder) this.d).setGroup("silent");
                }
                no80.O((Notification.Builder) this.d, 1);
            }
        }
    }

    public static Uri P(mq70 mq70Var, vp70 vp70Var, Uri uri) {
        up70 up70VarA;
        String str = (mq70Var == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a;
        if (str != null) {
            return Uri.parse(str);
        }
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        uri.getClass();
        return uri;
    }

    public static int W(ysc yscVar, int i) {
        int iHashCode = yscVar.b.hashCode() + (yscVar.a * 31);
        ypr yprVar = yscVar.e;
        if (i < 2) {
            long jA = hyl.a(yprVar);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return yprVar.hashCode() + (iHashCode * 31);
    }

    public static void d0(fdc fdcVar, yjp1 yjp1Var) {
        boolean z = fdcVar.b;
        w590 w590Var = (w590) fdcVar.d;
        if (z) {
            return;
        }
        lsm0 lsm0Var = ((z590) ((bpb1) w590Var.i.b).getValue()).a;
        if (lsm0Var != null) {
            w590Var.p(lsm0Var, (tv80) null, (Long) null, (String) null, yjp1Var);
        } else {
            eg.m("must call load first");
        }
    }

    public static ysc g0(int i, DataInputStream dataInputStream) throws IOException {
        ypr yprVarA;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            oql oqlVar = new oql((byte) 1);
            oqlVar.a(Long.valueOf(j), "exo_len");
            yprVarA = ypr.c.b(oqlVar);
        } else {
            yprVarA = toj0.A(dataInputStream);
        }
        return new ysc(i2, utf, yprVarA);
    }

    public static i091 m0(z590 z590Var) {
        int i;
        lsm0 lsm0Var = z590Var.a;
        o091 o091Var = z590Var.c;
        if (z590Var.b) {
            i = 2;
        } else {
            i = lsm0Var != null ? 1 : 0;
        }
        int i2 = i;
        long j = z590Var.h;
        long j2 = z590Var.e;
        long j3 = z590Var.f;
        float f = o091Var.equals(n091.a) ? z590Var.g : 0.0f;
        boolean z = z590Var.d;
        y1k1 y1k1Var = z590Var.i;
        return new i091(lsm0Var, i2, j, j2, j3, f, z, o091Var, y1k1Var != null ? new p091(y1k1Var.a, y1k1Var.b) : null);
    }

    public static final /* synthetic */ oen0 u(fdc fdcVar) {
        return (oen0) fdcVar.e;
    }

    public static final /* synthetic */ be50 v(fdc fdcVar) {
        return (be50) fdcVar.c;
    }

    public static final /* synthetic */ mwn0 w(fdc fdcVar) {
        return (mwn0) fdcVar.f;
    }

    public static final /* synthetic */ oen0 x(fdc fdcVar) {
        return (oen0) fdcVar.f;
    }

    public static final /* synthetic */ be50 y(fdc fdcVar) {
        return (be50) fdcVar.d;
    }

    public static final /* synthetic */ kg0 z(fdc fdcVar) {
        return (kg0) fdcVar.e;
    }

    public dg30 F() {
        return (dg30) this.c;
    }

    public Context G() {
        return (Context) this.d;
    }

    public void H(xjo0 xjo0Var) {
        int i;
        IconCompat iconCompatG = xjo0Var.b;
        if (iconCompatG == null && (i = xjo0Var.f) != 0) {
            iconCompatG = IconCompat.g((Resources) null, "", i);
            xjo0Var.b = iconCompatG;
        }
        boolean z = xjo0Var.d;
        Bundle bundle = xjo0Var.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatG != null ? xzo1.v(iconCompatG, (Context) null) : null, xjo0Var.g, xjo0Var.h);
        z221[] z221VarArr = xjo0Var.c;
        if (z221VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[z221VarArr.length];
            if (z221VarArr.length > 0) {
                z221 z221Var = z221VarArr[0];
                throw null;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            ph5.U(builder);
        }
        if (i2 >= 29) {
            x74.m0(builder);
        }
        if (i2 >= 31) {
            mb4.F(builder);
        }
        if (i2 >= 37) {
            ka4.c(builder);
            ka4.e(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", xjo0Var.e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.d).addAction(builder.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (p.d0r.d(r9, r1, r3, r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object I(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.gpp0
            if (r0 == 0) goto L13
            r0 = r9
            p.gpp0 r0 = (p.gpp0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.gpp0 r0 = new p.gpp0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            r4 = 2
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r4) goto L2b
            p.hm5.M(r9)
            goto L75
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L51
        L37:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.e
            p.ynb0 r9 = (p.ynb0) r9
            java.lang.Object r9 = r9.get()
            p.stk r9 = (p.stk) r9
            r0.a = r8
            r0.d = r3
            java.lang.String r1 = ""
            java.lang.Object r9 = r9.b(r1, r0)
            if (r9 != r5) goto L51
            goto L74
        L51:
            java.lang.Object r9 = r7.c
            p.d0r r9 = (p.d0r) r9
            p.jd0 r1 = p.jd0.D
            p.ouc0 r3 = new p.ouc0
            java.lang.Object r7 = r7.d
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r7)
            p.muc0 r7 = new p.muc0
            p.qqc0 r6 = new p.qqc0
            r6.<init>(r8)
            r7.<init>(r6)
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = p.d0r.d(r9, r1, r3, r7, r0)
            if (r7 != r5) goto L75
        L74:
            return r5
        L75:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fdc.I(java.lang.String, p.onm):java.lang.Object");
    }

    public void J() {
        dk60 dk60Var = (dk60) this.d;
        if (dk60Var.d) {
            dk60Var.d = true;
        } else {
            dk60Var.g.a.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:176:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:178:0x0202  */
    /* JADX WARN: Code duplicated, block: B:179:0x0204  */
    /* JADX WARN: Code duplicated, block: B:181:0x0208  */
    /* JADX WARN: Code duplicated, block: B:183:0x020c  */
    /* JADX WARN: Code duplicated, block: B:189:0x021c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0227  */
    /* JADX WARN: Code duplicated, block: B:192:0x0234  */
    /* JADX WARN: Code duplicated, block: B:195:0x023a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0240  */
    /* JADX WARN: Code duplicated, block: B:199:0x0249  */
    /* JADX WARN: Code duplicated, block: B:200:0x0258  */
    /* JADX WARN: Code duplicated, block: B:202:0x025f  */
    /* JADX WARN: Code duplicated, block: B:205:0x026b  */
    /* JADX WARN: Code duplicated, block: B:206:0x026e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0274  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x0290  */
    /* JADX WARN: Code duplicated, block: B:217:0x0295 A[PHI: r11
      0x0295: PHI (r11v17 p.u310) = (r11v5 p.u310), (r11v13 p.u310) binds: [B:216:0x0293, B:258:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x029f  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:292:0x035e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0362  */
    /* JADX WARN: Code duplicated, block: B:296:0x0366  */
    /* JADX WARN: Code duplicated, block: B:298:0x036a  */
    /* JADX WARN: Code duplicated, block: B:299:0x036d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0371  */
    /* JADX WARN: Code duplicated, block: B:302:0x0376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x0378  */
    /* JADX WARN: Code duplicated, block: B:304:0x037d  */
    /* JADX WARN: Code duplicated, block: B:311:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:312:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:315:0x03de  */
    /* JADX WARN: Code duplicated, block: B:316:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:317:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:318:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:320:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:322:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:324:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x040f  */
    /* JADX WARN: Code duplicated, block: B:330:0x0417  */
    /* JADX WARN: Code duplicated, block: B:332:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x042e  */
    /* JADX WARN: Code duplicated, block: B:340:0x0432  */
    /* JADX WARN: Code duplicated, block: B:341:0x0437  */
    /* JADX WARN: Code duplicated, block: B:344:0x0445  */
    /* JADX WARN: Code duplicated, block: B:345:0x0448  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    public u310 K(zuc0 zuc0Var, wnb1 wnb1Var, String str, String str2, Map map) {
        u310 u310Var;
        Object next;
        wsi1 wsi1Var;
        u310 u310Var2;
        int i;
        boolean z;
        u310 u310Var3;
        u310 u310Var4;
        xkk1 xkk1Var;
        u310 u310Var5;
        io70 io70Var;
        boolean z2;
        boolean z3;
        ngv ngvVar;
        u310 u310VarValueOf;
        boolean z4;
        int i2;
        int i3;
        int i4;
        iix0 iix0Var;
        u310 u310VarValueOf2;
        iix0 iix0Var2;
        u310 u310Var6;
        u310 u310Var7;
        u310 u310VarD;
        int i5;
        u310 u310Var8;
        int i6;
        int i7;
        u310 u310VarL;
        u310 u310VarD2;
        long j;
        boolean z5;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        mdz mdzVar;
        aai0 aai0Var;
        int i10;
        Uri uriC;
        int i11;
        int i12;
        int i13;
        int i14;
        u310 u310Var9;
        u310 u310VarBuild;
        u310 u310VarValueOf3;
        gix0 gix0Var;
        long j2;
        gix0 gix0Var2;
        long j3;
        List list;
        List list2;
        List list3;
        hzy hzyVar;
        int i15;
        u310 u310Var10 = zuc0Var.p;
        tu00 tu00Var = zuc0Var.q;
        String str3 = zuc0Var.c;
        jo70 jo70Var = wnb1Var != null ? wnb1Var.a : null;
        xkk1 xkk1Var2 = wnb1Var != null ? wnb1Var.b : null;
        hll hllVar = wnb1Var != null ? wnb1Var.c : null;
        iix0 iix0Var3 = wnb1Var != null ? wnb1Var.e : null;
        h2v h2vVar = wnb1Var != null ? wnb1Var.f : null;
        v740 v740VarA = tu00Var.a(v740.class);
        if (v740VarA == null) {
            u310Var2 = null;
            u310Var = null;
        } else {
            Iterator it = v740VarA.a.iterator();
            do {
                if (!it.hasNext()) {
                    u310Var = null;
                    next = null;
                    break;
                }
                next = it.next();
                u310Var = null;
            } while (!((u740) next).a.equals(str3));
            u740 u740Var = (u740) next;
            u310Var2 = (u740Var == null || (wsi1Var = (wsi1) o7h.s0(u740Var.b)) == null) ? u310Var : wsi1Var.a;
        }
        if (wnb1Var == null || (hzyVar = wnb1Var.d) == null || (i15 = hzyVar.a) == 0) {
            u310 u310Var11 = jo70Var != null ? jo70Var.b : u310Var;
            if (u310Var11 == null) {
                i = 0;
            } else {
                int iHashCode = u310Var11.hashCode();
                if (iHashCode != -1891298259) {
                    if (iHashCode != 81068331) {
                        if (iHashCode == 120215003 && u310Var11.equals("Episode")) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                    } else if (u310Var11.equals("Track")) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                } else if (u310Var11.equals("Chapter")) {
                    i = 13;
                } else {
                    i = 0;
                }
            }
        } else {
            i = i15;
        }
        int i16 = i == 0 ? -1 : dvc0.a[l1d.C(i)];
        if (i16 == 4) {
            u310 u310Var12 = u310Var10 instanceof k1z ? (k1z) u310Var10 : u310Var;
            if ((u310Var12 != null ? ((k1z) u310Var12).p : u310Var) != h1z.a) {
                l1z l1zVarA = tu00Var.a(l1z.class);
                if (l1zVarA != null && l1zVarA.e) {
                    return u310Var;
                }
                if (!zuc0Var.f()) {
                    return null;
                }
            }
        } else if (i16 == 6 && !f7p1.m(str3) && !zuc0Var.f()) {
            return u310Var;
        }
        u310 u310VarY0 = (jo70Var == null || (list3 = jo70Var.d) == null) ? u310Var : o7h.y0(list3, (CharSequence) null, (String) null, (String) null, puc0.e, 31);
        if (i == 13 || i == 6) {
            u310 u310Var13 = xkk1Var2 != null ? xkk1Var2.b : u310Var;
            u310 u310Var14 = xkk1Var2 != null ? xkk1Var2.a : u310Var;
            if (u310Var13 != null) {
                z = true;
                if (!((mq70) u310Var13).a.isEmpty()) {
                    u310Var14 = u310Var13;
                }
                if (u310Var14 != null) {
                    u310Var5 = u310Var14;
                } else {
                    if (jo70Var != null || (io70Var = jo70Var.e) == null) {
                        u310Var3 = u310Var;
                    } else {
                        u310Var3 = io70Var.b;
                    }
                    if (u310Var3 != null || map == null) {
                        u310Var4 = u310Var;
                    } else {
                        u310Var4 = (wnb1) map.get(new iey0(u310Var3));
                    }
                    if (u310Var4 != null || (xkk1Var = u310Var4.b) == null) {
                        u310Var5 = u310Var;
                    } else {
                        u310Var5 = xkk1Var.a;
                    }
                }
            } else {
                z = true;
            }
            if (u310Var14 == null || (((mq70) u310Var14).a.isEmpty() ^ z) != z) {
                u310Var14 = u310Var;
            }
            if (u310Var14 != null) {
                u310Var5 = u310Var14;
            } else {
                if (jo70Var != null) {
                    u310Var3 = u310Var;
                } else {
                    u310Var3 = u310Var;
                }
                if (u310Var3 != null) {
                    u310Var4 = u310Var;
                } else {
                    u310Var4 = u310Var;
                }
                if (u310Var4 != null) {
                    u310Var5 = u310Var;
                } else {
                    u310Var5 = u310Var;
                }
            }
        } else if (xkk1Var2 != null) {
            u310Var5 = xkk1Var2.a;
        } else {
            u310Var5 = u310Var;
        }
        if (hllVar != null && (list2 = hllVar.b) != null) {
            z2 = true;
            boolean z8 = list2.contains(ell.b);
            if (hllVar == null && (list = hllVar.b) != null && list.contains(ell.d) == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            ngvVar = ngv.e;
            if (hllVar != null) {
                u310VarValueOf = Integer.valueOf(jfv.t(hllVar.a, ngvVar));
            } else {
                u310VarValueOf = u310Var;
            }
            z4 = h2vVar instanceof c2v;
            i2 = 5;
            if ((i == 4 && i != 5 && i != 13) || iix0Var3 == null) {
                i4 = 4;
            } else {
                if (!iix0Var3.g() && !(iix0Var3 instanceof gix0) && !(iix0Var3 instanceof hix0)) {
                    eg.o();
                    return u310Var;
                }
                if (iix0Var3.g()) {
                    i3 = 3;
                } else if (iix0Var3 instanceof gix0) {
                    i3 = 2;
                } else {
                    if (!(iix0Var3 instanceof hix0)) {
                        eg.o();
                        return u310Var;
                    }
                    i3 = 1;
                }
                i4 = i3;
            }
            if (iix0Var3 instanceof gix0) {
                gix0Var2 = (gix0) iix0Var3;
                iix0Var = iix0Var3;
                j3 = gix0Var2.b;
                if (j3 > 0) {
                    u310VarValueOf2 = Integer.valueOf((int) ((j3 - gix0Var2.c) / 1000));
                }
                if (iix0Var != null) {
                    iix0Var2 = iix0Var;
                    if (iix0Var2 instanceof gix0) {
                        gix0Var = (gix0) iix0Var2;
                        j2 = gix0Var.b;
                        if (j2 != 0) {
                            u310VarValueOf3 = Double.valueOf((gix0Var.c / j2) * 100.0d);
                        } else {
                            u310VarValueOf3 = u310Var;
                        }
                    } else {
                        u310VarValueOf3 = u310Var;
                    }
                    u310Var6 = u310VarValueOf3;
                } else {
                    z4 = z4;
                    iix0Var2 = iix0Var;
                    u310Var6 = u310Var;
                }
                mre0 mre0Var = (mre0) this.d;
                if (wnb1Var != null) {
                    u310Var7 = wnb1Var.a;
                } else {
                    u310Var7 = u310Var;
                }
                if (this.b) {
                    Set set = s4b1.f;
                    if (uic.g(str3, blc0.C8) || u310Var7 == null) {
                        u310VarD = u310Var;
                    } else {
                        u310VarD = mqn1.i((String) ((idd1) this.f).getValue(), u310Var7);
                    }
                } else {
                    u310VarD = u310Var;
                }
                i5 = 7;
                if (u310VarD == null) {
                    if (wnb1Var != null) {
                        u310Var8 = wnb1Var.g;
                    } else {
                        u310Var8 = u310Var;
                    }
                    if (i != 5 || i == 7) {
                        i2 = 5;
                        i5 = 7;
                        i6 = 2;
                        i7 = 4;
                        u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                    } else {
                        if (i == 6) {
                            u310 u310Var15 = u310Var10 instanceof k1z ? (k1z) u310Var10 : u310Var;
                            u310VarD = mre0Var.d(wnb1Var != null ? wnb1Var.c : u310Var, wnb1Var != null ? wnb1Var.g : u310Var, iix0Var2, (((u310Var15 != null ? ((k1z) u310Var15).p : u310Var) == h1z.a) || (((wnb1Var == null || (mdzVar = wnb1Var.i) == null) ? 0 : mdzVar.j) == 2)) ? 5 : 4);
                            u310VarD2 = u310VarD;
                            i6 = 2;
                        } else if (i == 13) {
                            i6 = 2;
                            u310VarD2 = mre0Var.d(wnb1Var != null ? wnb1Var.c : u310Var, wnb1Var != null ? wnb1Var.g : u310Var, iix0Var2, 2);
                        } else if (i != 4 || iix0Var2 == null || u310Var8 == null) {
                            i7 = 4;
                            i2 = 5;
                            i5 = 7;
                            i6 = 2;
                            u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                        } else {
                            hll hllVar2 = wnb1Var.c;
                            w281 w281Var = wnb1Var.h;
                            mdz mdzVar2 = wnb1Var.i;
                            long jU = hllVar2 != null ? jfv.u(hllVar2.a, ngvVar) : 0L;
                            if (iix0Var2 instanceof gix0) {
                                gix0 gix0Var3 = (gix0) iix0Var2;
                                j = (gix0Var3.b - gix0Var3.c) / 1000;
                            } else {
                                j = jU;
                            }
                            Date date = new Date(((zoy0) u310Var8).c * 1000);
                            if (w281Var != null) {
                                z5 = true;
                                boolean z9 = w281Var.c;
                                boolean z10 = !z9;
                                if (mdzVar2 == null && mdzVar2.l == z5) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (mdzVar2 != null) {
                                    i8 = mdzVar2.j;
                                } else {
                                    i8 = 0;
                                }
                                i6 = 2;
                                if (i8 == 2) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    i9 = 6;
                                } else if (z6) {
                                    i9 = 4;
                                } else {
                                    i9 = 1;
                                }
                                i7 = 4;
                                i2 = 5;
                                i5 = 7;
                                u310VarL = ((zwg) mre0Var.b).L(new m4v0(jU, j, iix0Var2.g(), date, false, z6, z7, z10, null, iix0Var2, i9, u310Var2, 272));
                            } else {
                                z5 = true;
                            }
                            boolean z11 = !z9;
                            if (mdzVar2 == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (mdzVar2 != null) {
                                i8 = mdzVar2.j;
                            } else {
                                i8 = 0;
                            }
                            i6 = 2;
                            if (i8 == 2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                i9 = 6;
                            } else if (z6) {
                                i9 = 4;
                            } else {
                                i9 = 1;
                            }
                            i7 = 4;
                            i2 = 5;
                            i5 = 7;
                            u310VarL = ((zwg) mre0Var.b).L(new m4v0(jU, j, iix0Var2.g(), date, false, z6, z7, z11, null, iix0Var2, i9, u310Var2, 272));
                        }
                        i7 = 4;
                    }
                    u310VarD2 = u310VarL;
                } else {
                    u310VarD2 = u310VarD;
                    i6 = 2;
                    i7 = 4;
                }
                aai0Var = (aai0) this.c;
                if (i == 0) {
                    i10 = -1;
                } else {
                    i10 = dvc0.a[l1d.C(i)];
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 3:
                        uriC = aai0Var.c(2131230965);
                        break;
                    case 4:
                    case 5:
                        uriC = aai0Var.c(2131233768);
                        break;
                    case 6:
                        uriC = aai0Var.c(2131233937);
                        break;
                    default:
                        uriC = aai0Var.c(2131233937);
                        break;
                }
                if (i == 0) {
                    i11 = -1;
                } else {
                    i11 = dvc0.a[l1d.C(i)];
                }
                if (i11 != 1 || i11 == i6 || i11 == i5) {
                    i12 = i6;
                } else {
                    i12 = 1;
                }
                i13 = i != 0 ? dvc0.a[l1d.C(i)] : -1;
                if (i13 != 1 || i13 == i6 || i13 == 3 || i13 == i7 || i13 == i2) {
                    i14 = i6;
                } else {
                    i14 = 3;
                }
                if (jo70Var != null) {
                    u310Var9 = jo70Var.a;
                } else {
                    u310Var9 = u310Var;
                }
                vp70 vp70Var = vp70.c;
                Uri uriP = P(u310Var5, vp70Var, uriC);
                if (f7p1.m(str3)) {
                    u310VarBuild = new Uri.Builder().scheme("android.resource").authority(((Context) this.e).getResources().getResourcePackageName(2131233937)).appendPath(String.valueOf(2131233937)).build();
                } else {
                    u310VarBuild = u310Var;
                }
                u310 u310Var16 = u310Var;
                Uri uriP2 = P(u310Var5, vp70.b, u310Var16);
                Uri uriP3 = P(u310Var5, vp70Var, u310Var16);
                Uri uriP4 = P(u310Var5, vp70.d, u310Var16);
                Set set2 = s4b1.f;
                boolean zG = uic.g(str3, blc0.C8);
                String str4 = zuc0Var.c;
                return new u310(str4, zuc0Var.a, u310Var9, u310VarD2, uriP, u310VarBuild, uriP2, uriP3, uriP4, (Uri) null, Uri.parse(uic.x(str4).y()), i12, z4, z8, z3, zG, i14, i4, u310Var6, u310VarValueOf, u310VarValueOf2, false, k4s0.d(i2), str, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -14679552, 15);
            }
            iix0Var = iix0Var3;
            u310VarValueOf2 = u310Var;
            if (iix0Var != null) {
                iix0Var2 = iix0Var;
                if (iix0Var2 instanceof gix0) {
                    gix0Var = (gix0) iix0Var2;
                    j2 = gix0Var.b;
                    if (j2 != 0) {
                        u310VarValueOf3 = Double.valueOf((gix0Var.c / j2) * 100.0d);
                    } else {
                        u310VarValueOf3 = u310Var;
                    }
                } else {
                    u310VarValueOf3 = u310Var;
                }
                u310Var6 = u310VarValueOf3;
            } else {
                z4 = z4;
                iix0Var2 = iix0Var;
                u310Var6 = u310Var;
            }
            mre0 mre0Var2 = (mre0) this.d;
            if (wnb1Var != null) {
                u310Var7 = wnb1Var.a;
            } else {
                u310Var7 = u310Var;
            }
            if (this.b) {
                Set set3 = s4b1.f;
                if (uic.g(str3, blc0.C8)) {
                    u310VarD = u310Var;
                } else {
                    u310VarD = u310Var;
                }
            } else {
                u310VarD = u310Var;
            }
            i5 = 7;
            if (u310VarD == null) {
                if (wnb1Var != null) {
                    u310Var8 = wnb1Var.g;
                } else {
                    u310Var8 = u310Var;
                }
                if (i != 5) {
                    i2 = 5;
                    i5 = 7;
                    i6 = 2;
                    i7 = 4;
                    u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                } else {
                    i2 = 5;
                    i5 = 7;
                    i6 = 2;
                    i7 = 4;
                    u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                }
                u310VarD2 = u310VarL;
            } else {
                u310VarD2 = u310VarD;
                i6 = 2;
                i7 = 4;
            }
            aai0Var = (aai0) this.c;
            if (i == 0) {
                i10 = -1;
            } else {
                i10 = dvc0.a[l1d.C(i)];
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                    uriC = aai0Var.c(2131230965);
                    break;
                case 4:
                case 5:
                    uriC = aai0Var.c(2131233768);
                    break;
                case 6:
                    uriC = aai0Var.c(2131233937);
                    break;
                default:
                    uriC = aai0Var.c(2131233937);
                    break;
            }
            if (i == 0) {
                i11 = -1;
            } else {
                i11 = dvc0.a[l1d.C(i)];
            }
            if (i11 != 1) {
                i12 = i6;
            } else {
                i12 = i6;
            }
            i13 = i != 0 ? dvc0.a[l1d.C(i)] : -1;
            if (i13 != 1) {
                i14 = i6;
            } else {
                i14 = i6;
            }
            if (jo70Var != null) {
                u310Var9 = jo70Var.a;
            } else {
                u310Var9 = u310Var;
            }
            vp70 vp70Var2 = vp70.c;
            Uri uriP5 = P(u310Var5, vp70Var2, uriC);
            if (f7p1.m(str3)) {
                u310VarBuild = u310Var;
            } else {
                u310VarBuild = new Uri.Builder().scheme("android.resource").authority(((Context) this.e).getResources().getResourcePackageName(2131233937)).appendPath(String.valueOf(2131233937)).build();
            }
            u310 u310Var17 = u310Var;
            Uri uriP6 = P(u310Var5, vp70.b, u310Var17);
            Uri uriP7 = P(u310Var5, vp70Var2, u310Var17);
            Uri uriP8 = P(u310Var5, vp70.d, u310Var17);
            Set set4 = s4b1.f;
            boolean zG2 = uic.g(str3, blc0.C8);
            String str5 = zuc0Var.c;
            return new u310(str5, zuc0Var.a, u310Var9, u310VarD2, uriP5, u310VarBuild, uriP6, uriP7, uriP8, (Uri) null, Uri.parse(uic.x(str5).y()), i12, z4, z8, z3, zG2, i14, i4, u310Var6, u310VarValueOf, u310VarValueOf2, false, k4s0.d(i2), str, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -14679552, 15);
        }
        z2 = true;
        if (hllVar == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        ngvVar = ngv.e;
        if (hllVar != null) {
            u310VarValueOf = Integer.valueOf(jfv.t(hllVar.a, ngvVar));
        } else {
            u310VarValueOf = u310Var;
        }
        z4 = h2vVar instanceof c2v;
        i2 = 5;
        if (i == 4) {
            if (!iix0Var3.g()) {
                eg.o();
                return u310Var;
            }
            if (iix0Var3.g()) {
                i3 = 3;
            } else if (iix0Var3 instanceof gix0) {
                i3 = 2;
            } else {
                if (!(iix0Var3 instanceof hix0)) {
                    eg.o();
                    return u310Var;
                }
                i3 = 1;
            }
            i4 = i3;
        } else {
            if (!iix0Var3.g()) {
                eg.o();
                return u310Var;
            }
            if (iix0Var3.g()) {
                i3 = 3;
            } else if (iix0Var3 instanceof gix0) {
                i3 = 2;
            } else {
                if (!(iix0Var3 instanceof hix0)) {
                    eg.o();
                    return u310Var;
                }
                i3 = 1;
            }
            i4 = i3;
        }
        if (iix0Var3 instanceof gix0) {
            gix0Var2 = (gix0) iix0Var3;
            iix0Var = iix0Var3;
            j3 = gix0Var2.b;
            if (j3 > 0) {
                u310VarValueOf2 = Integer.valueOf((int) ((j3 - gix0Var2.c) / 1000));
            }
            if (iix0Var != null) {
                iix0Var2 = iix0Var;
                if (iix0Var2 instanceof gix0) {
                    gix0Var = (gix0) iix0Var2;
                    j2 = gix0Var.b;
                    if (j2 != 0) {
                        u310VarValueOf3 = Double.valueOf((gix0Var.c / j2) * 100.0d);
                    } else {
                        u310VarValueOf3 = u310Var;
                    }
                } else {
                    u310VarValueOf3 = u310Var;
                }
                u310Var6 = u310VarValueOf3;
            } else {
                z4 = z4;
                iix0Var2 = iix0Var;
                u310Var6 = u310Var;
            }
            mre0 mre0Var3 = (mre0) this.d;
            if (wnb1Var != null) {
                u310Var7 = wnb1Var.a;
            } else {
                u310Var7 = u310Var;
            }
            if (this.b) {
                Set set5 = s4b1.f;
                if (uic.g(str3, blc0.C8)) {
                    u310VarD = u310Var;
                } else {
                    u310VarD = u310Var;
                }
            } else {
                u310VarD = u310Var;
            }
            i5 = 7;
            if (u310VarD == null) {
                if (wnb1Var != null) {
                    u310Var8 = wnb1Var.g;
                } else {
                    u310Var8 = u310Var;
                }
                if (i != 5) {
                    i2 = 5;
                    i5 = 7;
                    i6 = 2;
                    i7 = 4;
                    u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                } else {
                    i2 = 5;
                    i5 = 7;
                    i6 = 2;
                    i7 = 4;
                    u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
                }
                u310VarD2 = u310VarL;
            } else {
                u310VarD2 = u310VarD;
                i6 = 2;
                i7 = 4;
            }
            aai0Var = (aai0) this.c;
            if (i == 0) {
                i10 = -1;
            } else {
                i10 = dvc0.a[l1d.C(i)];
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                    uriC = aai0Var.c(2131230965);
                    break;
                case 4:
                case 5:
                    uriC = aai0Var.c(2131233768);
                    break;
                case 6:
                    uriC = aai0Var.c(2131233937);
                    break;
                default:
                    uriC = aai0Var.c(2131233937);
                    break;
            }
            if (i == 0) {
                i11 = -1;
            } else {
                i11 = dvc0.a[l1d.C(i)];
            }
            if (i11 != 1) {
                i12 = i6;
            } else {
                i12 = i6;
            }
            i13 = i != 0 ? dvc0.a[l1d.C(i)] : -1;
            if (i13 != 1) {
                i14 = i6;
            } else {
                i14 = i6;
            }
            if (jo70Var != null) {
                u310Var9 = jo70Var.a;
            } else {
                u310Var9 = u310Var;
            }
            vp70 vp70Var3 = vp70.c;
            Uri uriP9 = P(u310Var5, vp70Var3, uriC);
            if (f7p1.m(str3)) {
                u310VarBuild = u310Var;
            } else {
                u310VarBuild = new Uri.Builder().scheme("android.resource").authority(((Context) this.e).getResources().getResourcePackageName(2131233937)).appendPath(String.valueOf(2131233937)).build();
            }
            u310 u310Var18 = u310Var;
            Uri uriP10 = P(u310Var5, vp70.b, u310Var18);
            Uri uriP11 = P(u310Var5, vp70Var3, u310Var18);
            Uri uriP12 = P(u310Var5, vp70.d, u310Var18);
            Set set6 = s4b1.f;
            boolean zG3 = uic.g(str3, blc0.C8);
            String str6 = zuc0Var.c;
            return new u310(str6, zuc0Var.a, u310Var9, u310VarD2, uriP9, u310VarBuild, uriP10, uriP11, uriP12, (Uri) null, Uri.parse(uic.x(str6).y()), i12, z4, z8, z3, zG3, i14, i4, u310Var6, u310VarValueOf, u310VarValueOf2, false, k4s0.d(i2), str, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -14679552, 15);
        }
        iix0Var = iix0Var3;
        u310VarValueOf2 = u310Var;
        if (iix0Var != null) {
            iix0Var2 = iix0Var;
            if (iix0Var2 instanceof gix0) {
                gix0Var = (gix0) iix0Var2;
                j2 = gix0Var.b;
                if (j2 != 0) {
                    u310VarValueOf3 = Double.valueOf((gix0Var.c / j2) * 100.0d);
                } else {
                    u310VarValueOf3 = u310Var;
                }
            } else {
                u310VarValueOf3 = u310Var;
            }
            u310Var6 = u310VarValueOf3;
        } else {
            z4 = z4;
            iix0Var2 = iix0Var;
            u310Var6 = u310Var;
        }
        mre0 mre0Var4 = (mre0) this.d;
        if (wnb1Var != null) {
            u310Var7 = wnb1Var.a;
        } else {
            u310Var7 = u310Var;
        }
        if (this.b) {
            Set set7 = s4b1.f;
            if (uic.g(str3, blc0.C8)) {
                u310VarD = u310Var;
            } else {
                u310VarD = u310Var;
            }
        } else {
            u310VarD = u310Var;
        }
        i5 = 7;
        if (u310VarD == null) {
            if (wnb1Var != null) {
                u310Var8 = wnb1Var.g;
            } else {
                u310Var8 = u310Var;
            }
            if (i != 5) {
                i2 = 5;
                i5 = 7;
                i6 = 2;
                i7 = 4;
                u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
            } else {
                i2 = 5;
                i5 = 7;
                i6 = 2;
                i7 = 4;
                u310VarL = String.format(str2, Arrays.copyOf(new Object[]{u310VarY0}, 1));
            }
            u310VarD2 = u310VarL;
        } else {
            u310VarD2 = u310VarD;
            i6 = 2;
            i7 = 4;
        }
        aai0Var = (aai0) this.c;
        if (i == 0) {
            i10 = -1;
        } else {
            i10 = dvc0.a[l1d.C(i)];
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                uriC = aai0Var.c(2131230965);
                break;
            case 4:
            case 5:
                uriC = aai0Var.c(2131233768);
                break;
            case 6:
                uriC = aai0Var.c(2131233937);
                break;
            default:
                uriC = aai0Var.c(2131233937);
                break;
        }
        if (i == 0) {
            i11 = -1;
        } else {
            i11 = dvc0.a[l1d.C(i)];
        }
        if (i11 != 1) {
            i12 = i6;
        } else {
            i12 = i6;
        }
        i13 = i != 0 ? dvc0.a[l1d.C(i)] : -1;
        if (i13 != 1) {
            i14 = i6;
        } else {
            i14 = i6;
        }
        if (jo70Var != null) {
            u310Var9 = jo70Var.a;
        } else {
            u310Var9 = u310Var;
        }
        vp70 vp70Var4 = vp70.c;
        Uri uriP13 = P(u310Var5, vp70Var4, uriC);
        if (f7p1.m(str3)) {
            u310VarBuild = u310Var;
        } else {
            u310VarBuild = new Uri.Builder().scheme("android.resource").authority(((Context) this.e).getResources().getResourcePackageName(2131233937)).appendPath(String.valueOf(2131233937)).build();
        }
        u310 u310Var19 = u310Var;
        Uri uriP14 = P(u310Var5, vp70.b, u310Var19);
        Uri uriP15 = P(u310Var5, vp70Var4, u310Var19);
        Uri uriP16 = P(u310Var5, vp70.d, u310Var19);
        Set set8 = s4b1.f;
        boolean zG4 = uic.g(str3, blc0.C8);
        String str7 = zuc0Var.c;
        return new u310(str7, zuc0Var.a, u310Var9, u310VarD2, uriP13, u310VarBuild, uriP14, uriP15, uriP16, (Uri) null, Uri.parse(uic.x(str7).y()), i12, z4, z8, z3, zG4, i14, i4, u310Var6, u310VarValueOf, u310VarValueOf2, false, k4s0.d(i2), str, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -14679552, 15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(String str, String str2, Function0 function0, iu30 iu30Var, onm onmVar) {
        v6t v6tVar;
        m231 m231Var;
        if (onmVar instanceof v6t) {
            v6tVar = (v6t) onmVar;
            int i = v6tVar.g;
            if ((i & os00.INVALID_ID) != 0) {
                v6tVar.g = i - os00.INVALID_ID;
            } else {
                v6tVar = new v6t(this, onmVar);
            }
        } else {
            v6tVar = new v6t(this, onmVar);
        }
        Object obj = v6tVar.e;
        int i2 = v6tVar.g;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                tjh tjhVar = (tjh) this.d;
                CompletableSubscribeOn completableSubscribeOnS = tjhVar.c.n(str2).g(new rjh(tjhVar, str, (byte) 1)).s(tjhVar.a);
                v6tVar.a = str;
                v6tVar.b = str2;
                v6tVar.c = function0;
                v6tVar.d = iu30Var;
                v6tVar.g = 1;
                Object objI = fc11.i(completableSubscribeOnS, v6tVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iu30Var = v6tVar.d;
                function0 = v6tVar.c;
                str2 = v6tVar.b;
                str = v6tVar.a;
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        String str3 = str;
        String str4 = str2;
        Function0 function1 = function0;
        iu30 iu30Var2 = iu30Var;
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            iu30Var2.invoke(((dg30) this.c).getString(2131954140));
            function1.invoke();
        } else {
            Logger.e(thA, l1d.m("Failed to delete comment ", str4), new Object[0]);
            String message = thA.getMessage();
            ((jjz) this.f).a(new xiz(fjz.b, (!this.b || message == null) ? yiz.c : new yiz(message), ajz.d), new vt1(this, str3, str4, function1, iu30Var2, (byte) 13), u6t.d);
        }
        return m231Var2;
    }

    public void M(int i, int i2) {
        t45 t45Var = (t45) this.f;
        if (t45Var != null) {
            t45Var.a("outcome", g5d0.f(i));
            t45Var.a("source", g5d0.e(i2));
            t45Var.g("load_children");
            ((zle1) this.c).b(t45Var.e());
        }
    }

    public sh0 N() {
        return (c8l) this.e;
    }

    public boolean O() {
        return this.b;
    }

    public int Q() {
        return ((err0) this.c).s();
    }

    public String R() {
        return (String) this.d;
    }

    public String S(String str) {
        HashMap map = (HashMap) this.d;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                l3d implementation = ((l3d) it.next()).getImplementation();
                o0c.k("CameraInfo doesn't contain Camera2 implementation.", implementation instanceof s1d);
                if (str2.equals(((s1d) ((s1d) implementation).c.b).a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public int T() {
        return ((err0) this.d).s();
    }

    public s4b1 U() {
        Set set = s4b1.f;
        return uic.x(((Intent) ((kly0) this.d).get()).getDataString());
    }

    public ArrayList V() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zk8(new lj8(this.b ? jj8.i : jj8.t, true), new xy50(this, (byte) 2)));
        arrayList.add(new zk8(new lj8(jj8.h, false), new zi50(this, (byte) 22)));
        return arrayList;
    }

    public boolean X() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0540  */
    /* JADX WARN: Code duplicated, block: B:71:0x054f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0580  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0580 -> B:75:0x0581). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x05dd -> B:82:0x05e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object Y(p.xtu0 r39, p.onm r40) {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fdc.Y(p.xtu0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable Z(String str, onm onmVar) {
        hsy hsyVar;
        if (onmVar instanceof hsy) {
            hsyVar = (hsy) onmVar;
            int i = hsyVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                hsyVar.d = i - os00.INVALID_ID;
            } else {
                hsyVar = new hsy(this, onmVar);
            }
        } else {
            hsyVar = new hsy(this, onmVar);
        }
        Object objJ = hsyVar.b;
        int i2 = hsyVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = ((uu00) this.d).b(new oi("EntitySegmentParentResolver", false, (iu30) new w3w(str, this, (byte) 26))).filter(rzs0.c1).firstOrError();
            hsyVar.a = str;
            hsyVar.d = 1;
            objJ = fc11.j(singleFirstOrError, hsyVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hsyVar.a;
            hm5.M(objJ);
        }
        uv00 uv00Var = (uv00) objJ;
        jo70 jo70Var = uv00Var.a(jo70.class, str).b;
        if (jo70Var == null) {
            return null;
        }
        return new mmr0(jo70Var, uv00Var.a(mtl.class, str).b);
    }

    public void a() {
        xab1 xab1Var;
        boolean z;
        synchronized (this.e) {
            xab1Var = (xab1) this.f;
            z = this.b;
            this.f = null;
            this.b = false;
        }
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (z) {
            ((l451) this.d).invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a0(String str, onm onmVar) {
        isy isyVar;
        io70 io70Var;
        if (onmVar instanceof isy) {
            isyVar = (isy) onmVar;
            int i = isyVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                isyVar.d = i - os00.INVALID_ID;
            } else {
                isyVar = new isy(this, onmVar);
            }
        } else {
            isyVar = new isy(this, onmVar);
        }
        Object objJ = isyVar.b;
        int i2 = isyVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = ((uu00) this.d).b(new oi("EntitySegmentParentResolver", false, (iu30) new kov(str, (byte) 17))).filter(s321.b1).firstOrError();
            isyVar.a = str;
            isyVar.d = 1;
            objJ = fc11.j(singleFirstOrError, isyVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = isyVar.a;
            hm5.M(objJ);
        }
        jo70 jo70Var = ((uv00) objJ).a(jo70.class, str).b;
        if (jo70Var == null || (io70Var = jo70Var.e) == null) {
            return null;
        }
        return io70Var.b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                dr8 dr8Var = (fr8) obj;
                ow3 ow3Var = (ow3) this.c;
                if (this.b && (!(dr8Var instanceof dr8) ? !((dr8Var instanceof er8) || (dr8Var instanceof cr8)) : dr8Var.a != nhz.O0)) {
                    return ((km3) ow3Var.c).T((Context) this.d, (wq8) this.e, ((jm70) this.f).a);
                }
                Single singleJust = Single.just(dr8Var);
                singleJust.getClass();
                return singleJust;
            default:
                String strConcat = "spotify:user:".concat((String) obj);
                zu00 zu00Var = (uu00) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                boolean z = this.b;
                return zu00Var.b(new oi(str, false, (iu30) new h3g0(strConcat, str2, z))).filter(yi20.N0).take(1L).timeout(5000L, TimeUnit.MILLISECONDS).map(new hr8((byte) 4, strConcat, str2, (String) this.f, z));
        }
    }

    public void b(ysc yscVar) {
        this.b = true;
    }

    public boolean b0(be50 be50Var) {
        if (!this.b) {
            pf80.a("Only add dependencies during a tracking");
        }
        oen0 oen0Var = (oen0) this.e;
        if (oen0Var != null) {
            oen0Var.a(be50Var);
        } else if (((be50) this.c) != null) {
            oen0 oen0Var2 = ij41.a;
            oen0 oen0Var3 = new oen0();
            be50 be50Var2 = (be50) this.c;
            be50Var2.getClass();
            oen0Var3.a(be50Var2);
            oen0Var3.a(be50Var);
            this.e = oen0Var3;
            this.c = null;
        } else {
            this.c = be50Var;
        }
        oen0 oen0Var4 = (oen0) this.f;
        if (oen0Var4 != null) {
            return !oen0Var4.l(be50Var);
        }
        if (((be50) this.d) != be50Var) {
            return true;
        }
        this.d = null;
        return false;
    }

    public void c(voa0 voa0Var, zsc zscVar, llm llmVar, kd8 kd8Var, hj8 hj8Var) {
        synchronized (this.e) {
            xab1 xab1Var = (xab1) this.f;
            if (xab1Var == null || !xab1Var.isActive()) {
                if (!this.b) {
                    try {
                        try {
                            ((l5v0) this.c).invoke();
                            this.b = true;
                        } catch (Throwable th) {
                            hj8Var.invoke(voa0Var.d, th);
                            return;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                }
                this.f = fn31.T(llmVar, null, 0, new sx(zscVar, voa0Var, hj8Var, kd8Var, (lnm) null, (byte) 1), 3);
            }
        }
    }

    public void c0(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        knn0 knn0Var = (knn0) this.c;
        lik1 lik1Var = (lik1) this.d;
        if (z) {
            knn0Var.a(new x9r0(lik1Var, (p6r0) this.e, (mir0) this.f, (String) null, 8));
        } else {
            knn0Var.a(new y9r0(lik1Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, ioj0 ioj0Var, lnm lnmVar) {
        jsy jsyVar;
        if (lnmVar instanceof jsy) {
            jsyVar = (jsy) lnmVar;
            int i = jsyVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                jsyVar.c = i - os00.INVALID_ID;
            } else {
                jsyVar = new jsy(this, (onm) lnmVar);
            }
        } else {
            jsyVar = new jsy(this, (onm) lnmVar);
        }
        Object objQ = jsyVar.a;
        int i2 = jsyVar.c;
        if (i2 == 0) {
            hm5.M(objQ);
            if (!u890.j(str, ((vqy) this.c).a)) {
                bhn0.f(l1d.m("resolveAgentSelection called with unexpected uri: ", str));
                return null;
            }
            s2t s2tVar = (s2t) this.f;
            jsyVar.c = 1;
            objQ = s2tVar.Q(jsyVar);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
        }
        List list = (List) objQ;
        if (list == null) {
            return rto.a;
        }
        return list.isEmpty() ? sto.a : new qto(list);
    }

    public void dismiss() {
        a1r0 a1r0Var = (a1r0) this.e;
        lzn0 lzn0Var = (lzn0) this.d;
        if (this.b) {
            return;
        }
        this.b = true;
        boolean zH = a1r0Var.h((gj5) this.c);
        boolean z = ((bwd0) this.f).b;
        if (zH) {
            if (z) {
                lzn0Var.e();
            }
            a1r0Var.g();
        } else {
            if (z) {
                lzn0Var.c();
            }
            lzn0Var.e();
        }
    }

    public int e0(yqu0 yqu0Var, ha4 ha4Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        dk60 dk60Var = (dk60) this.d;
        gk60 gk60Var = (gk60) this.f;
        if (this.b) {
            return x8p1.i(false, false, false);
        }
        boolean z4 = true;
        try {
            this.b = true;
            oi oiVarU = ((n0v0) this.e).u(yqu0Var, ha4Var);
            q5f0 q5f0Var = (q5f0) oiVarU.c;
            int i2 = q5f0Var.i();
            while (true) {
                if (i >= i2) {
                    z2 = true;
                    break;
                }
                hav0 hav0Var = (hav0) q5f0Var.j(i);
                i = (hav0Var.d || hav0Var.h) ? 0 : i + 1;
                z2 = false;
                break;
            }
            int i3 = q5f0Var.i();
            for (int i4 = 0; i4 < i3; i4++) {
                hav0 hav0Var2 = (hav0) q5f0Var.j(i4);
                if (z2 || p8p1.i(hav0Var2)) {
                    ((hmb0) this.c).B(hav0Var2.c, gk60Var, hav0Var2.i, true);
                    if (!gk60Var.a.i()) {
                        dk60Var.a(hav0Var2.a, gk60Var, p8p1.i(hav0Var2));
                        gk60Var.clear();
                    }
                }
            }
            boolean zB = dk60Var.b(oiVarU, z);
            if (oiVarU.b) {
                z3 = false;
                break;
            }
            int i5 = q5f0Var.i();
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    z3 = false;
                    break;
                }
                hav0 hav0Var3 = (hav0) q5f0Var.j(i6);
                if (!Offset.c(p8p1.B(hav0Var3, true), 0L) && hav0Var3.l()) {
                    z3 = true;
                    break;
                }
                i6++;
            }
            int i7 = q5f0Var.i();
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    z4 = false;
                    break;
                }
                if (((hav0) q5f0Var.j(i8)).l()) {
                    break;
                }
                i8++;
            }
            return x8p1.i(zB, z3, z4);
        } finally {
            this.b = false;
        }
    }

    public boolean f() {
        ow3 ow3Var = (ow3) this.e;
        return ((File) ow3Var.b).exists() || ((File) ow3Var.c).exists();
    }

    public void f0() {
        if (this.b) {
            return;
        }
        ((q5f0) ((n0v0) this.e).b).a();
        ((dk60) this.d).c();
    }

    public void g(HashMap map) throws Throwable {
        if (this.b) {
            l(map);
        }
    }

    public void h(ysc yscVar, boolean z) {
        this.b = true;
    }

    public void h0(int i, int i2) {
        o0(i, i2);
        this.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r8 == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i0(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.ksy
            if (r0 == 0) goto L13
            r0 = r8
            p.ksy r0 = (p.ksy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ksy r0 = new p.ksy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L4f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.hm5.M(r8)
            goto L41
        L35:
            p.hm5.M(r8)
            r0.c = r3
            java.lang.Object r8 = r6.a0(r7, r0)
            if (r8 != r5) goto L41
            goto L4e
        L41:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L46
            goto La5
        L46:
            r0.c = r2
            java.io.Serializable r8 = r6.Z(r8, r0)
            if (r8 != r5) goto L4f
        L4e:
            return r5
        L4f:
            p.mmr0 r8 = (p.mmr0) r8
            if (r8 != 0) goto L54
            goto La5
        L54:
            java.lang.Object r6 = r8.a
            p.jo70 r6 = (p.jo70) r6
            java.lang.Object r7 = r8.b
            p.mtl r7 = (p.mtl) r7
            if (r7 == 0) goto L61
            p.ktl r7 = r7.a
            goto L62
        L61:
            r7 = r4
        L62:
            p.ktl r8 = p.ktl.b
            if (r7 != r8) goto L93
            java.util.List r6 = r6.d
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = p.q7h.U(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L79:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L92
            java.lang.Object r8 = r6.next()
            p.ho70 r8 = (p.ho70) r8
            p.uto r0 = new p.uto
            java.lang.String r1 = r8.b
            java.lang.String r8 = r8.a
            r0.<init>(r1, r8)
            r7.add(r0)
            goto L79
        L92:
            return r7
        L93:
            p.io70 r6 = r6.e
            if (r6 == 0) goto La5
            p.uto r7 = new p.uto
            java.lang.String r8 = r6.b
            java.lang.String r6 = r6.a
            r7.<init>(r8, r6)
            java.util.List r6 = java.util.Collections.singletonList(r7)
            return r6
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fdc.i0(java.lang.String, p.onm):java.lang.Object");
    }

    public o2r j() {
        c4z c4zVar = (c4z) this.f;
        m0u0 m0u0Var = (m0u0) this.d;
        return new hz10((f520) c4zVar.invoke(m0u0Var.d, new f710(this, (byte) 7)), (r590) this.e, (iru) this.c, new URL(m0u0Var.a.a), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (p.d0r.d(r9, r1, r3, r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j0(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.ipp0
            if (r0 == 0) goto L13
            r0 = r9
            p.ipp0 r0 = (p.ipp0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ipp0 r0 = new p.ipp0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            r4 = 2
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r4) goto L2b
            p.hm5.M(r9)
            goto L73
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L4f
        L37:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.e
            p.ynb0 r9 = (p.ynb0) r9
            java.lang.Object r9 = r9.get()
            p.stk r9 = (p.stk) r9
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r5) goto L4f
            goto L72
        L4f:
            java.lang.Object r9 = r7.c
            p.d0r r9 = (p.d0r) r9
            p.jd0 r1 = p.jd0.D
            p.ouc0 r3 = new p.ouc0
            java.lang.Object r7 = r7.d
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r7)
            p.luc0 r7 = new p.luc0
            p.qqc0 r6 = new p.qqc0
            r6.<init>(r8)
            r7.<init>(r6)
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = p.d0r.d(r9, r1, r3, r7, r0)
            if (r7 != r5) goto L73
        L72:
            return r5
        L73:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fdc.j0(java.lang.String, p.onm):java.lang.Object");
    }

    public String k(String str, ioj0 ioj0Var) {
        return ((mta) this.e).k(str, ioj0Var);
    }

    public void k0(pyp0 pyp0Var) {
        this.f = pyp0Var;
    }

    public void l(HashMap map) throws Throwable {
        ow3 ow3Var = (ow3) this.e;
        DataOutputStream dataOutputStream = null;
        try {
            tj7 tj7VarO = ow3Var.o();
            hd31 hd31Var = (hd31) this.f;
            if (hd31Var == null) {
                this.f = new hd31(tj7VarO);
            } else {
                hd31Var.a(tj7VarO);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((hd31) this.f);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iW = 0;
                for (ysc yscVar : map.values()) {
                    dataOutputStream2.writeInt(yscVar.a);
                    dataOutputStream2.writeUTF(yscVar.b);
                    toj0.D(yscVar.e, dataOutputStream2);
                    iW += W(yscVar, 2);
                }
                dataOutputStream2.writeInt(iW);
                dataOutputStream2.close();
                ((File) ow3Var.c).delete();
                String str = zoi1.a;
                this.b = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                zoi1.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a A[PHI: r2
      0x002a: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v4 java.lang.String), (r2v5 java.lang.String) binds: [B:6:0x0028, B:9:0x0032, B:12:0x003b, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public void l0() {
        String str;
        t45 t45VarA = ((zle1) this.c).a("mbs_load_children_content");
        t45.m(t45VarA, "load_children", 4);
        t45VarA.h = "media-browser-service";
        String str2 = (String) this.e;
        if (this.b) {
            str = "root";
        } else {
            String str3 = "home";
            if (ihc1.h0(str2, "home", false)) {
                str = str3;
            } else {
                str3 = "recently-played";
                if (ihc1.h0(str2, "recently-played", false)) {
                    str = str3;
                } else {
                    str3 = "browse";
                    if (ihc1.h0(str2, "browse", false)) {
                        str = str3;
                    } else {
                        str3 = "your-library";
                        if (ihc1.h0(str2, "your-library", false)) {
                            str = str3;
                        } else {
                            str = "other";
                        }
                    }
                }
            }
        }
        t45VarA.a("content_type", str);
        t45VarA.a("package_name", (String) this.d);
        t45VarA.b("parent_id", (String) this.e);
        this.f = t45VarA;
    }

    public Set m() {
        return ((mta) this.e).m();
    }

    public mmr0 n(String str, ioj0 ioj0Var) {
        return ((mta) this.e).n(str, ioj0Var);
    }

    public tv80 n0(int i) {
        w7h1 w7h1Var;
        ((ohv0) this.c).a(new mhv0("start_intent_led", ktd.d(i), ew80.c, "none"));
        int iC = l1d.C(i);
        b7x b7xVar = b7x.a;
        if (iC == 10) {
            r6h1 r6h1Var = r6h1.c;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-start-screen";
            x6h1VarI.f = "0.1.0";
            x6h1VarI.g = "22.0.0";
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "start");
            x6h1VarR.i.add(new a7h1("sign_up_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            y6h1 y6h1VarA = x6h1VarR.a();
            w6b1 w6b1VarA = f7b1.a(blc0.Ea);
            String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
        } else if (iC != 11) {
            w7h1Var = null;
        } else {
            r6h1 r6h1Var2 = r6h1.c;
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-start-screen";
            x6h1VarI2.f = "0.1.0";
            x6h1VarI2.g = "22.0.0";
            x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "start");
            x6h1VarR2.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR2.j = false;
            y6h1 y6h1VarA2 = x6h1VarR2.a();
            w6b1 w6b1VarA2 = f7b1.a(blc0.va);
            String str2 = w6b1VarA2 != null ? (String) o7h.s0(w6b1VarA2.c) : null;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1Var2, System.currentTimeMillis());
        }
        if (w7h1Var != null) {
            return ((i8h1) this.d).j(w7h1Var);
        }
        return null;
    }

    public long o(String str, ioj0 ioj0Var) {
        return ((mta) this.e).o(str, ioj0Var);
    }

    public void o0(int i, int i2) {
        if (i < 0.0f) {
            tf80.a("Index should be non-negative");
        }
        ((err0) this.c).t(i);
        ((ksb0) this.f).c(i);
        ((err0) this.d).t(i2);
    }

    public String p(String str, ioj0 ioj0Var) {
        return ((mta) this.e).p(str, ioj0Var);
    }

    public void p0(lpb0 lpb0Var) {
        mpb0 mpb0Var;
        mpb0 mpb0Var2;
        npb0 npb0Var = lpb0Var.a;
        this.e = (npb0Var == null || (mpb0Var2 = (mpb0) f46.k0(npb0Var.b)) == null) ? null : mpb0Var2.b;
        if (this.b || lpb0Var.q > 0) {
            this.b = true;
            int i = lpb0Var.b;
            if (i < 0.0f) {
                tf80.c("scrollOffset should be non-negative (" + i + ")");
            }
            o0((npb0Var == null || (mpb0Var = (mpb0) f46.k0(npb0Var.b)) == null) ? 0 : mpb0Var.a, i);
        }
    }

    public String q(String str, ioj0 ioj0Var) {
        return ((mta) this.e).q(str, ioj0Var);
    }

    public void q0(int i) {
        if (i < 0.0f) {
            tf80.c("scrollOffset should be non-negative");
        }
        ((err0) this.d).t(i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public void r(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        dm5.y(!this.b);
        Cipher cipher = (Cipher) this.c;
        ow3 ow3Var = (ow3) this.e;
        File file = (File) ow3Var.b;
        File file2 = (File) ow3Var.b;
        File file3 = (File) ow3Var.c;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream3.readInt();
                    if (i < 0 || i > 2) {
                        zoi1.h(dataInputStream3);
                    } else {
                        if ((dataInputStream3.readInt() & 1) == 0) {
                            dataInputStream = dataInputStream3;
                        } else if (cipher == null) {
                            zoi1.h(dataInputStream3);
                        } else {
                            byte[] bArr = new byte[16];
                            dataInputStream3.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.d;
                                String str = zoi1.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                        try {
                            int i2 = dataInputStream.readInt();
                            int iW = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                ysc yscVarG0 = g0(i, dataInputStream);
                                String str2 = yscVarG0.b;
                                map.put(str2, yscVarG0);
                                sparseArray.put(yscVarG0.a, str2);
                                iW += W(yscVarG0, i);
                            }
                            int i4 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i4 == iW && z) {
                                zoi1.h(dataInputStream);
                                return;
                            }
                            zoi1.h(dataInputStream);
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                zoi1.h(dataInputStream2);
                            }
                        } catch (Throwable th) {
                            dataInputStream2 = dataInputStream;
                            th = th;
                            if (dataInputStream2 != null) {
                                zoi1.h(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    public Flowable r0() {
        SpotifyMainActivity spotifyMainActivity = (dg30) this.c;
        SpotifyMainActivity spotifyMainActivity2 = spotifyMainActivity instanceof SpotifyMainActivity ? spotifyMainActivity : null;
        return spotifyMainActivity2 != null ? spotifyMainActivity2.G1.toFlowable(BackpressureStrategy.d) : Flowable.I(Boolean.FALSE);
    }

    public void s() {
        ow3 ow3Var = (ow3) this.e;
        ((File) ow3Var.b).delete();
        ((File) ow3Var.c).delete();
    }

    public void i(long j) {
    }

    public /* synthetic */ fdc(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public /* synthetic */ fdc(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public /* synthetic */ fdc(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public fdc(boolean z, ow3 ow3Var, Context context, wq8 wq8Var, jm70 jm70Var) {
        this.a = (byte) 3;
        this.b = z;
        this.c = ow3Var;
        this.d = context;
        this.e = wq8Var;
        this.f = jm70Var;
    }

    public fdc(RecyclerView recyclerView, f0t f0tVar, f0t f0tVar2) {
        this.a = (byte) 9;
        this.c = recyclerView;
        this.d = f0tVar;
        this.e = f0tVar2;
        this.f = tr80.d;
    }

    public fdc(qe41 qe41Var, sh0 sh0Var, SpotifyMainActivity spotifyMainActivity) {
        this.a = (byte) 8;
        this.c = qe41Var;
        this.d = sh0Var;
        this.e = new c8l(this);
        qe41Var.getLifecycle().a(new d8l(this, (byte) 0));
        spotifyMainActivity.g1.add(new b8l(this));
    }

    public fdc(d0r d0rVar, f2p f2pVar, s1p s1pVar, d2q d2qVar, xf4 xf4Var) {
        this.a = (byte) 2;
        this.c = d0rVar;
        this.d = f2pVar;
        this.e = s1pVar;
        this.f = d2qVar;
        this.b = xf4Var.c();
    }

    public fdc(yqg yqgVar, w590 w590Var) {
        this.a = (byte) 21;
        this.c = yqgVar;
        this.d = w590Var;
        llm llmVarE = smo1.e(flo1.l(op71.f(), igu.b));
        this.e = llmVarE;
        this.f = gio1.b(m0((z590) ((bpb1) w590Var.i.b).getValue()));
        fn31.T(llmVarE, null, 0, new uug0(this, (lnm) null, (byte) 17), 3);
    }

    public fdc(vi11 vi11Var, ipq ipqVar) {
        this.a = (byte) 4;
        this.c = vi11Var;
        this.d = ipqVar;
        this.e = new CompositeDisposable();
        this.f = new idd1(new vv8(this, (byte) 26));
    }

    public fdc(iac0 iac0Var, vqy vqyVar, uu00 uu00Var, boolean z) {
        this.a = (byte) 12;
        this.c = vqyVar;
        this.d = uu00Var;
        this.b = z;
        this.e = new mta((byte) 3, false);
        this.f = fn31.q(zso1.H(iac0Var.getLifecycle()), null, 0, new ett(this, (lnm) null, (byte) 19), 3);
    }

    public fdc() {
        this.a = (byte) 7;
    }

    public fdc(zle1 zle1Var, String str, String str2, boolean z) {
        this.a = (byte) 17;
        this.c = zle1Var;
        this.d = str;
        this.e = str2;
        this.b = z;
    }

    public fdc(d0r d0rVar, String str, koc0 koc0Var, ynb0 ynb0Var, q8n q8nVar) {
        this.a = (byte) 26;
        this.c = d0rVar;
        this.d = str;
        this.e = ynb0Var;
        this.f = o4p1.r(new lt20(new fu20(new x010(rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 10)), new uop0(yoi1.g(((stk) ynb0Var.get()).a()), (byte) 1), new hpp0(3, (lnm) null, (byte) 0), (byte) 1), new cto0(this, (lnm) null, (byte) 9), (byte) 1), new i440(3, (lnm) null, (byte) 23), (byte) 0), q8nVar);
    }

    public fdc(int i, int i2) {
        this.a = (byte) 15;
        this.c = new err0(i);
        this.d = new err0(i2);
        this.f = new ksb0(i, 90, AdvertisementType.OTHER);
    }

    public fdc(String str, bct bctVar, mnk0 mnk0Var, boolean z) {
        this.a = (byte) 20;
        this.c = mnk0Var;
        this.b = z;
        this.d = bctVar.b;
        this.e = new qvc0("spotify:list:playlist-extender:".concat(ihc1.X0(str, ":")), (c3d0) null, (Set) null, new iqz0(0, 12), 6);
        this.f = w3p1.o(new l4r(hvm.c, 1, ktj0.O0, new j4r(new r7j0(this, (byte) 16)), ktj0.P0), ktj0.N0);
    }

    public fdc(w13 w13Var, swm0 swm0Var, pux0 pux0Var, fp7 fp7Var, npm1 npm1Var, boolean z) {
        this.a = (byte) 28;
        this.c = w13Var;
        this.d = swm0Var;
        this.e = pux0Var;
        this.f = fp7Var;
        this.b = z;
    }

    public fdc(hmb0 hmb0Var) {
        this.a = (byte) 29;
        this.c = hmb0Var;
        this.d = new dk60((sh80) hmb0Var.e1.d);
        this.e = new n0v0((byte) 2);
        this.f = new gk60();
    }

    public fdc(aai0 aai0Var, mre0 mre0Var, Context context, boolean z) {
        this.a = (byte) 16;
        this.c = aai0Var;
        this.d = mre0Var;
        this.e = context;
        this.b = z;
        this.f = new idd1(new nzb0(this, (byte) 13));
    }

    public fdc(d4d d4dVar) {
        this.a = (byte) 6;
        this.b = false;
        HashMap map = new HashMap();
        this.d = map;
        this.f = new HashSet();
        this.c = new ArrayList();
        this.e = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = d4dVar.a.g();
        } catch (CameraAccessExceptionCompat unused) {
            j2h1.p("Camera2CameraCoordinator");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (j2h1.x(str, d4dVar) && j2h1.x(str2, d4dVar)) {
                        ((HashSet) this.f).add(new HashSet(Arrays.asList(str, str2)));
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    j2h1.o("Camera2CameraCoordinator");
                }
            }
        }
    }

    public /* synthetic */ fdc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public fdc(l5v0 l5v0Var, l451 l451Var) {
        this.a = (byte) 27;
        this.c = l5v0Var;
        this.d = l451Var;
        this.e = new Object();
    }

    public fdc(File file) {
        this.a = (byte) 5;
        this.c = null;
        this.d = null;
        this.e = new ow3(file);
    }
}
