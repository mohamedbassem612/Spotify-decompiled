package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Empty;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.messages.PushNotificationDisplayedAndroidEvent;
import com.spotify.messages.PushNotificationsReceivedV1;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d520 implements lqc1, cdr0, zvy0, r6b0, Function, n2r {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] t = {0, 119, -120, -1};
    public static final byte[] X = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public static final huz Y = new huz((Object) null, (byte) 10);

    public d520(List list) {
        this.a = (byte) 1;
        izr0 izr0Var = new izr0((byte[]) list.get(0));
        int iL = izr0Var.L();
        int iL2 = izr0Var.L();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.d = new Canvas();
        this.e = new tgv(719, 575, 0, 719, 0, 575);
        this.f = new sgv(0, new int[]{0, -1, -16777216, -8421505}, u(), v());
        this.g = new gbe(iL, iL2);
    }

    public static int A(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static udb O(f320 f320Var) {
        d320 d320Var = f320Var instanceof d320 ? (d320) f320Var : null;
        if (d320Var != null) {
            syw sywVar = d320Var.a;
            if (sywVar instanceof tyw) {
                return xcb.a;
            }
            if (sywVar instanceof syw) {
                if (sywVar.d == 20) {
                    return wcb.a;
                }
            } else if (!(sywVar instanceof ryw)) {
                eg.o();
                return null;
            }
        }
        return ycb.a;
    }

    public static d520 Q(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624068, (ViewGroup) null, false);
        int i2 = 2131427611;
        ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427611);
        if (artworkViewT != null) {
            i2 = 2131427974;
            SpotifyIconView spotifyIconViewT = m5n1.t(constraintLayoutInflate, 2131427974);
            if (spotifyIconViewT != null) {
                i2 = 2131428234;
                ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                if (contextMenuButtonT != null) {
                    i2 = 2131429056;
                    if (m5n1.t(constraintLayoutInflate, 2131429056) != null) {
                        i2 = 2131430674;
                        ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                        if (contentRestrictionBadgeViewT != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            i2 = 2131431115;
                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                            if (textView != null) {
                                i2 = 2131431356;
                                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                if (textView2 != null) {
                                    return new d520((Object) constraintLayout, (Object) artworkViewT, (Object) spotifyIconViewT, (Object) contextMenuButtonT, (Object) contentRestrictionBadgeViewT, (Object) textView, (Object) textView2, (byte) 12);
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }

    public static d520 R(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624430, (ViewGroup) null, false);
        int i2 = 2131427611;
        ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427611);
        if (artworkViewT != null) {
            i2 = 2131427613;
            ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131427613);
            if (constraintLayoutT != null) {
                i2 = 2131427624;
                ArtworkShadow artworkShadowT = m5n1.t(constraintLayoutInflate, 2131427624);
                if (artworkShadowT != null) {
                    i2 = 2131427625;
                    if (((Space) m5n1.t(constraintLayoutInflate, 2131427625)) != null) {
                        i2 = 2131427626;
                        if (((Space) m5n1.t(constraintLayoutInflate, 2131427626)) != null) {
                            i2 = 2131427627;
                            if (((Space) m5n1.t(constraintLayoutInflate, 2131427627)) != null) {
                                i2 = 2131427628;
                                if (((Space) m5n1.t(constraintLayoutInflate, 2131427628)) != null) {
                                    i2 = 2131427739;
                                    ConstraintLayout constraintLayoutT2 = m5n1.t(constraintLayoutInflate, 2131427739);
                                    if (constraintLayoutT2 != null) {
                                        i2 = 2131429029;
                                        View viewT = m5n1.t(constraintLayoutInflate, 2131429029);
                                        if (viewT != null) {
                                            i2 = 2131429110;
                                            if (m5n1.t(constraintLayoutInflate, 2131429110) != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                i2 = 2131431276;
                                                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431276);
                                                if (frameLayout != null) {
                                                    return new d520(constraintLayout, artworkViewT, constraintLayoutT, artworkShadowT, constraintLayoutT2, viewT, constraintLayout, frameLayout, (byte) 24);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }

    public static void T(d520 d520Var, cvy0 cvy0Var, String str, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        ufz ufzVar;
        ufz m231Var;
        int i10 = (i5 & 4) != 0 ? 0 : i2;
        int i11 = (i5 & 8) != 0 ? 0 : i3;
        int i12 = (i5 & 16) != 0 ? 0 : i4;
        if (i10 == 0) {
            i6 = 0;
        } else {
            if (fca.a[l1d.C(i10)] != 1) {
                eg.o();
                return;
            }
            i6 = 9;
        }
        if (i11 != 0) {
            int iC = l1d.C(i11);
            if (iC == 0) {
                i7 = 1;
            } else if (iC == 1) {
                i7 = 2;
            } else if (iC != 2) {
                i7 = 4;
                if (iC != 3) {
                    if (iC == 4) {
                        i7 = 5;
                    } else {
                        if (iC != 5) {
                            eg.o();
                            return;
                        }
                        i7 = 6;
                    }
                }
            } else {
                i7 = 3;
            }
        } else {
            i7 = 0;
        }
        if (i12 != 0) {
            int iC2 = l1d.C(i12);
            if (iC2 == 0 || iC2 == 1) {
                i8 = 7;
            } else {
                if (iC2 != 2) {
                    eg.o();
                    return;
                }
                i8 = 8;
            }
        } else {
            i8 = 0;
        }
        if (i8 == 0) {
            i9 = i7 == 0 ? i6 : i7;
        } else {
            i9 = i8;
        }
        qb00 qb00Var = (qb00) d520Var.c;
        String str2 = cvy0Var.a;
        String str3 = cvy0Var.c;
        String str4 = cvy0Var.b;
        boolean z = i12 == 0 && i11 == 0;
        boolean zG = ((dto0) d520Var.g).a.g((Context) d520Var.h);
        yvy0 yvy0VarN = PushNotificationDisplayedAndroidEvent.n();
        if (str2 != null) {
            yvy0VarN.w(str2);
        }
        if (str3 != null) {
            yvy0VarN.t(str3);
        }
        if (str4 != null) {
            yvy0VarN.n(str4);
        }
        if (i6 != 0) {
            yvy0VarN.v(g5d0.r(i6));
        }
        if (i9 != 0) {
            yvy0VarN.q(g5d0.r(i9));
        }
        if (str != null) {
            yvy0VarN.u(str);
        }
        t2j0 t2j0Var = qb00Var.a;
        yvy0VarN.s(z);
        yvy0VarN.r(zG);
        t2j0Var.a(yvy0VarN.build());
        kdy0 kdy0Var = (kdy0) d520Var.d;
        jvy0 jvy0Var = new jvy0(cvy0Var.a, cvy0Var.c, ((yqg) d520Var.e).d().getTimeInMillis(), cvy0Var.b, str, String.valueOf(Build.VERSION.SDK_INT), i9, (String) null, 128);
        int i13 = jvy0Var.g;
        if (i13 != 0) {
            try {
                m231Var = ufz.valueOf(g5d0.r(i13));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = ufz.b;
            }
            ufzVar = m231Var;
        } else {
            ufzVar = null;
        }
        fn31.T((llm) kdy0Var.b, (o8n) null, 0, new m311(kdy0Var, jvy0Var, ufzVar, (lnm) null, (byte) 25), 3);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void W(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iG;
        int iG2;
        boolean z;
        int iG3;
        int iG4;
        int iG5;
        int i5;
        int i6;
        boolean z2;
        int iG6;
        bae baeVar = new bae(bArr, bArr.length);
        int i7 = i3;
        int i8 = i4;
        byte[] bArrK = null;
        byte[] bArrK2 = null;
        byte[] bArrK3 = null;
        while (baeVar.b() != 0) {
            int i9 = 8;
            int iG7 = baeVar.g(8);
            if (iG7 != 240) {
                int i10 = 3;
                int i11 = 2;
                int i12 = 4;
                switch (iG7) {
                    case 16:
                        if (i2 == 3) {
                            bArr2 = bArrK == null ? t : bArrK;
                        } else if (i2 == 2) {
                            bArr2 = bArrK3 == null ? i : bArrK3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iG8 = baeVar.g(2);
                            if (iG8 != 0) {
                                iG = iG8;
                                iG2 = 1;
                            } else {
                                if (baeVar.f()) {
                                    int iG9 = baeVar.g(3) + 3;
                                    iG = baeVar.g(2);
                                    iG2 = iG9;
                                } else {
                                    if (baeVar.f()) {
                                        iG2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iG10 = baeVar.g(2);
                                        if (iG10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iG10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = 2;
                                        } else if (iG10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = baeVar.g(4) + 12;
                                            iG = baeVar.g(2);
                                            z3 = z3;
                                        } else if (iG10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iG11 = baeVar.g(8) + 29;
                                            iG = baeVar.g(2);
                                            z3 = z3;
                                            iG2 = iG11;
                                            c2 = 4;
                                        }
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    iG = 0;
                                }
                                if (iG2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iG = bArr2[iG];
                                    }
                                    paint.setColor(iArr[iG]);
                                    canvas.drawRect(i7, i8, i7 + iG2, i8 + 1, paint);
                                }
                                i7 += iG2;
                                if (z3) {
                                    baeVar.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iG2 == 0) {
                            }
                            i7 += iG2;
                            if (z3) {
                                baeVar.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i2 == 3 ? bArrK2 == null ? X : bArrK2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iG12 = baeVar.g(i12);
                            if (iG12 != 0) {
                                z = z4;
                                iG5 = iG12;
                                iG3 = 1;
                            } else if (baeVar.f()) {
                                if (baeVar.f()) {
                                    int iG13 = baeVar.g(i11);
                                    if (iG13 == 0) {
                                        z = z4;
                                        iG3 = 1;
                                    } else if (iG13 != 1) {
                                        if (iG13 == i11) {
                                            iG3 = baeVar.g(i12) + 9;
                                            iG4 = baeVar.g(i12);
                                        } else if (iG13 != i10) {
                                            z = z4;
                                            iG3 = 0;
                                        } else {
                                            iG3 = baeVar.g(i9) + 25;
                                            iG4 = baeVar.g(i12);
                                        }
                                        iG5 = iG4;
                                    } else {
                                        z = z4;
                                        iG3 = i11;
                                    }
                                    iG5 = 0;
                                } else {
                                    iG3 = baeVar.g(i11) + 4;
                                    iG5 = baeVar.g(i12);
                                }
                                z = z4;
                            } else {
                                int iG14 = baeVar.g(i10);
                                if (iG14 != 0) {
                                    iG3 = iG14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iG3 = 0;
                                }
                                iG5 = 0;
                            }
                            if (iG3 == 0 || paint == 0) {
                                i5 = i10;
                                i6 = i11;
                            } else {
                                if (bArr3 != 0) {
                                    iG5 = bArr3[iG5];
                                }
                                paint.setColor(iArr[iG5]);
                                i5 = i10;
                                i6 = 2;
                                canvas.drawRect(i7, i8, i7 + iG3, i8 + 1, paint);
                            }
                            i7 += iG3;
                            if (z) {
                                baeVar.c();
                            } else {
                                z4 = z;
                                i10 = i5;
                                i11 = i6;
                                i12 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iG15 = baeVar.g(8);
                            if (iG15 != 0) {
                                z2 = z5;
                                iG6 = 1;
                            } else if (baeVar.f()) {
                                z2 = z5;
                                iG6 = baeVar.g(7);
                                iG15 = baeVar.g(8);
                            } else {
                                int iG16 = baeVar.g(7);
                                if (iG16 != 0) {
                                    z2 = z5;
                                    iG6 = iG16;
                                    iG15 = 0;
                                } else {
                                    z2 = true;
                                    iG15 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != 0) {
                                paint.setColor(iArr[iG15]);
                                canvas.drawRect(i7, i8, i7 + iG6, i8 + 1, paint);
                            }
                            i7 += iG6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case 32:
                                bArrK3 = k(4, 4, baeVar);
                                break;
                            case 33:
                                bArrK = k(4, 8, baeVar);
                                break;
                            case 34:
                                bArrK2 = k(16, 8, baeVar);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i3;
            }
        }
    }

    public static sgv X(bae baeVar, int i2) {
        int[] iArr;
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = baeVar.g(8);
        baeVar.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrU = u();
        int[] iArrV = v();
        while (i6 > 0) {
            int iG6 = baeVar.g(i4);
            int iG7 = baeVar.g(i4);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrU : iArrV;
            }
            if ((iG7 & 1) != 0) {
                iG3 = baeVar.g(i4);
                iG4 = baeVar.g(i4);
                iG = baeVar.g(i4);
                iG2 = baeVar.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = baeVar.g(6) << i5;
                int iG9 = baeVar.g(4) << 4;
                iG = baeVar.g(4) << 4;
                i3 = i6 - 4;
                iG2 = baeVar.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr[iG6] = A((byte) (255 - (iG2 & 255)), zoi1.j((int) ((1.402d * d2) + d), 0, 255), zoi1.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), zoi1.j((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrV = iArrV;
            i4 = 8;
            i5 = 2;
        }
        return new sgv(iG5, iArr2, iArrU, iArrV);
    }

    public static ugv Y(bae baeVar) {
        byte[] bArr;
        int iG = baeVar.g(16);
        baeVar.o(4);
        int iG2 = baeVar.g(2);
        boolean zF = baeVar.f();
        baeVar.o(1);
        byte[] bArr2 = zoi1.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = baeVar.g(16);
                int iG4 = baeVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    baeVar.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    baeVar.j(bArr, iG4);
                }
            }
            return new ugv(iG, zF, bArr2, bArr);
        }
        baeVar.o(baeVar.g(8) * 16);
        bArr = bArr2;
        return new ugv(iG, zF, bArr2, bArr);
    }

    public static synchronized void Z(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a0(file2);
            }
        }
        return file.delete();
    }

    public static List b0(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static String h0(boolean z, x340 x340Var) {
        int i2;
        int i3;
        if (z) {
            i2 = 1731680786;
            i3 = 2131961700;
        } else {
            i2 = 1731683505;
            i3 = 2131961701;
        }
        return x0d.k(x340Var, i2, i3, x340Var, false);
    }

    public static byte[] k(int i2, int i3, bae baeVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) baeVar.g(i3);
        }
        return bArr;
    }

    public static int[] u() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = A(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = A(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] v() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = A(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = A(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = A(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = A(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = A(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public File B(String str) {
        return new File((File) this.d, str);
    }

    public List C() {
        return b0(((File) this.d).listFiles((FilenameFilter) jhn.s));
    }

    public AtomicBoolean D() {
        return (AtomicBoolean) this.h;
    }

    public r0i0 E() {
        return (r0i0) ((znb0) this.h).getValue();
    }

    public zob1 F() {
        snc0 snc0Var = (snc0) this.e;
        if (snc0Var != null) {
            return snc0Var.getMetadata();
        }
        u890.C("listContentRuntime");
        throw null;
    }

    public List G() {
        return b0(((File) this.h).listFiles());
    }

    public File H(String str) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public List I() {
        return b0(((File) this.g).listFiles());
    }

    public List J() {
        return b0(((File) this.f).listFiles());
    }

    public File K(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public List L(String str, FilenameFilter filenameFilter) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return b0(file.listFiles(filenameFilter));
    }

    public zob1 M() {
        snc0 snc0Var = (snc0) this.e;
        if (snc0Var != null) {
            return snc0Var.b();
        }
        u890.C("listContentRuntime");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024a A[PHI: r1 r6
      0x024a: PHI (r1v9 p.omo1) = (r1v7 p.omo1), (r1v11 p.omo1) binds: [B:98:0x0246, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r6v11 p.rba) = (r6v9 p.rba), (r6v13 p.rba) binds: [B:98:0x0246, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x025f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0289  */
    /* JADX WARN: Code duplicated, block: B:116:0x0290  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f3 A[PHI: r1 r2 r4 r8 r9
      0x02f3: PHI (r1v38 java.lang.String) = (r1v35 java.lang.String), (r1v43 java.lang.String) binds: [B:130:0x02ef, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r2v58 java.lang.Object) = (r2v56 java.lang.Object), (r2v1 java.lang.Object) binds: [B:130:0x02ef, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r4v15 p.omo1) = (r4v7 p.omo1), (r4v18 p.omo1) binds: [B:130:0x02ef, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:130:0x02ef, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r9v36 p.rba) = (r9v35 p.rba), (r9v0 p.rba) binds: [B:130:0x02ef, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x032b  */
    /* JADX WARN: Code duplicated, block: B:149:0x033f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0343  */
    /* JADX WARN: Code duplicated, block: B:152:0x035b  */
    /* JADX WARN: Code duplicated, block: B:154:0x035f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0388 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:158:0x0389 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:159:0x038a  */
    /* JADX WARN: Code duplicated, block: B:168:0x039b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01da A[PHI: r1 r9
      0x01da: PHI (r1v1 p.rba) = (r1v0 p.rba), (r1v4 p.rba) binds: [B:67:0x01d6, B:32:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r9v23 p.omo1) = (r9v21 p.omo1), (r9v25 p.omo1) binds: [B:67:0x01d6, B:32:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:89:0x0208  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0233 A[PHI: r1 r6
      0x0233: PHI (r1v7 p.omo1) = (r1v5 p.omo1), (r1v8 p.omo1) binds: [B:95:0x022f, B:30:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v9 p.rba) = (r6v7 p.rba), (r6v10 p.rba) binds: [B:95:0x022f, B:30:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x030b, code lost:
    
        if (r2 == r10) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object N(p.rba r22, p.onm r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d520.N(p.rba, p.onm):java.lang.Object");
    }

    public udb P(String str, f320 f320Var) {
        d320 d320Var = f320Var instanceof d320 ? (d320) f320Var : null;
        odb odbVar = odb.a;
        if (d320Var == null) {
            Logger.d(f4i1.f("Unexpected FieldValidationResponse type: ", f320Var.getClass().getSimpleName(), ". Expected FieldValidationResponse.Email for email validation."), new Object[0]);
            return odbVar;
        }
        syw sywVar = d320Var.a;
        if (sywVar instanceof tyw) {
            return new qdb(str, nfb.h(str));
        }
        if (sywVar instanceof syw) {
            return sywVar.d == 20 ? ndb.a : pdb.a;
        }
        if (sywVar instanceof ryw) {
            return odbVar;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:64:0x0115, B:66:0x011e, B:69:0x0136, B:71:0x013a, B:74:0x0153, B:75:0x0158), top: B:84:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0136 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:64:0x0115, B:66:0x011e, B:69:0x0136, B:71:0x013a, B:74:0x0153, B:75:0x0158), top: B:84:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x013a A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #1 {all -> 0x0134, blocks: (B:64:0x0115, B:66:0x011e, B:69:0x0136, B:71:0x013a, B:74:0x0153, B:75:0x0158), top: B:84:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0153 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:64:0x0115, B:66:0x011e, B:69:0x0136, B:71:0x013a, B:74:0x0153, B:75:0x0158), top: B:84:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object S(hs50 hs50Var, onm onmVar) {
        hca hcaVar;
        String str;
        hs50 hs50Var2;
        hs50 hs50Var3;
        Object obj;
        String str2;
        Object objP;
        v5w0 v5w0Var;
        String str3;
        t45 t45Var;
        t45 t45Var2;
        bho0 bho0Var;
        fs50 fs50Var;
        bho0 bho0Var2;
        if (onmVar instanceof hca) {
            hcaVar = (hca) onmVar;
            int i2 = hcaVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hcaVar.f = i2 - Integer.MIN_VALUE;
            } else {
                hcaVar = new hca(this, onmVar);
            }
        } else {
            hcaVar = new hca(this, onmVar);
        }
        Object obj2 = hcaVar.d;
        int i3 = hcaVar.f;
        rih1 rih1Var = rih1.a;
        t45 t45Var3 = d9n.a;
        if (i3 == 0) {
            hm5.M(obj2);
            if (hs50Var instanceof gs50) {
                str = "system";
            } else {
                if (!(hs50Var instanceof fs50)) {
                    eg.o();
                    return null;
                }
                str = "none";
            }
            hcaVar.a = hs50Var;
            hcaVar.f = 1;
            if (qgo1.i("presentation_surface", str, hcaVar) != t45Var3) {
                hs50Var2 = hs50Var;
            }
            return t45Var3;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                String str4 = hcaVar.c;
                v5w0Var = (v5w0) hcaVar.b;
                hs50 hs50Var4 = hcaVar.a;
                hm5.M(obj2);
                str3 = str4;
                hs50Var2 = hs50Var4;
                objP = obj2;
                t45Var = (t45) objP;
                if (t45Var == null) {
                    gs50 gs50Var = (gs50) hs50Var2;
                    T(this, gs50Var.b, gs50Var.c, v5w0Var.b, 0, 0, 24);
                    return rih1Var;
                }
                t45.m(t45Var, str3, 2);
                try {
                    T(this, ((gs50) hs50Var2).b, ((gs50) hs50Var2).c, v5w0Var.b, 0, 0, 24);
                    return rih1Var;
                } finally {
                    t45Var.g(str3);
                }
            }
            if (i3 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) hcaVar.b;
            hs50Var3 = hcaVar.a;
            hm5.M(obj2);
            str2 = str5;
            obj = obj2;
            t45Var2 = (t45) obj;
            if (t45Var2 != null) {
                fs50Var = (fs50) hs50Var3;
                bho0Var2 = fs50Var.a;
                if (bho0Var2 instanceof bho0) {
                    T(this, fs50Var.b, fs50Var.c, 0, bho0Var2.a, 0, 20);
                    return rih1Var;
                }
                if (bho0Var2 instanceof aho0) {
                    T(this, fs50Var.b, fs50Var.c, 0, 0, ((aho0) bho0Var2).a, 12);
                    return rih1Var;
                }
                eg.o();
                return null;
            }
            t45.m(t45Var2, str2, 2);
            try {
                bho0Var = ((fs50) hs50Var3).a;
                if (bho0Var instanceof bho0) {
                    T(this, ((fs50) hs50Var3).b, ((fs50) hs50Var3).c, 0, bho0Var.a, 0, 20);
                } else {
                    if (bho0Var instanceof aho0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(this, ((fs50) hs50Var3).b, ((fs50) hs50Var3).c, 0, 0, ((aho0) bho0Var).a, 12);
                }
                t45Var2.g(str2);
                return rih1Var;
            } catch (Throwable th) {
                t45Var2.g(str2);
                throw th;
            }
        }
        hs50Var2 = hcaVar.a;
        hm5.M(obj2);
        if (hs50Var2 instanceof gs50) {
            v5w0 v5w0Var2 = ((gs50) hs50Var2).a;
            hcaVar.a = hs50Var2;
            hcaVar.b = v5w0Var2;
            hcaVar.c = "display_log";
            hcaVar.f = 2;
            objP = qgo1.p(hcaVar);
            if (objP != t45Var3) {
                v5w0Var = v5w0Var2;
                str3 = "display_log";
                t45Var = (t45) objP;
                if (t45Var == null) {
                    gs50 gs50Var2 = (gs50) hs50Var2;
                    T(this, gs50Var2.b, gs50Var2.c, v5w0Var.b, 0, 0, 24);
                    return rih1Var;
                }
                t45.m(t45Var, str3, 2);
                T(this, ((gs50) hs50Var2).b, ((gs50) hs50Var2).c, v5w0Var.b, 0, 0, 24);
                return rih1Var;
            }
        } else {
            if (!(hs50Var2 instanceof fs50)) {
                eg.o();
                return null;
            }
            hcaVar.a = hs50Var2;
            hcaVar.b = "display_log";
            hcaVar.f = 3;
            t45 t45VarP = qgo1.p(hcaVar);
            if (t45VarP != t45Var3) {
                hs50Var3 = hs50Var2;
                obj = t45VarP;
                str2 = "display_log";
                t45Var2 = (t45) obj;
                if (t45Var2 != null) {
                    t45.m(t45Var2, str2, 2);
                    bho0Var = ((fs50) hs50Var3).a;
                    if (bho0Var instanceof bho0) {
                        T(this, ((fs50) hs50Var3).b, ((fs50) hs50Var3).c, 0, bho0Var.a, 0, 20);
                    } else {
                        if (bho0Var instanceof aho0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T(this, ((fs50) hs50Var3).b, ((fs50) hs50Var3).c, 0, 0, ((aho0) bho0Var).a, 12);
                    }
                    t45Var2.g(str2);
                    return rih1Var;
                }
                fs50Var = (fs50) hs50Var3;
                bho0Var2 = fs50Var.a;
                if (bho0Var2 instanceof bho0) {
                    T(this, fs50Var.b, fs50Var.c, 0, bho0Var2.a, 0, 20);
                    return rih1Var;
                }
                if (bho0Var2 instanceof aho0) {
                    T(this, fs50Var.b, fs50Var.c, 0, 0, ((aho0) bho0Var2).a, 12);
                    return rih1Var;
                }
                eg.o();
                return null;
            }
        }
        return t45Var3;
    }

    public void U(omo1 omo1Var) {
        qb00 qb00Var = (qb00) this.c;
        String str = omo1Var.o().a;
        String str2 = omo1Var.o().c;
        String str3 = omo1Var.o().b;
        String str4 = omo1Var.o().e;
        qwy0 qwy0VarN = PushNotificationsReceivedV1.n();
        if (str != null) {
            qwy0VarN.s(str);
        }
        if (str2 != null) {
            qwy0VarN.r(str2);
        }
        if (str3 != null) {
            qwy0VarN.n(str3);
        }
        qwy0VarN.q(str4);
        t2j0 t2j0Var = qb00Var.a;
        qwy0VarN.t(qb00Var.b.b());
        t2j0Var.a(qwy0VarN.build());
        if (omo1Var instanceof rto0) {
            return;
        }
        kdy0 kdy0Var = (kdy0) this.d;
        fn31.T((llm) kdy0Var.b, (o8n) null, 0, new d821(kdy0Var, new jvy0(omo1Var.o().a, omo1Var.o().c, ((yqg) this.e).d().getTimeInMillis(), omo1Var.o().b, qmo1.r(omo1Var), String.valueOf(Build.VERSION.SDK_INT), 0, omo1Var.o().e, 64), (lnm) null, (byte) 15), 3);
    }

    public evz V(String str) {
        return h5p1.s(new m441(new rv8(d3p1.F((d0r) this.g, (o3r) this.h, str), (lnm) null, (byte) 0)), new xs4(yoi1.g(((uu00) this.b).b(new oi("automix_eligibility", false, new wk3(str, (byte) 29))).filter(qbo1.i)), str, (byte) 1), ((mnk0) this.c).a, new sv8(this, str, (lnm) null, (byte) 0));
    }

    public void a() {
        p2o0 p2o0Var = (p2o0) this.d;
        heg hegVar = (heg) this.f;
        HashMap map = (HashMap) this.c;
        boolean zF = false;
        if (hegVar.equals(loa1.b)) {
            Object obj = map.get(ajn0.e("value"));
            fla0 fla0Var = obj instanceof fla0 ? (fla0) obj : null;
            if (fla0Var != null) {
                Object obj2 = ((sgl) fla0Var).a;
                dla0 dla0Var = obj2 instanceof dla0 ? (dla0) obj2 : null;
                if (dla0Var != null) {
                    zF = p2o0Var.F(dla0Var.a.a);
                }
            }
        }
        if (zF || p2o0Var.F(hegVar)) {
            return;
        }
        ((List) this.g).add(new qf5(((beg) this.e).m(), map, (mka1) this.h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        syf syfVar = (syf) this.g;
        c861 c861Var = (c861) this.f;
        String str = (String) this.e;
        String str2 = ((th61) obj).a;
        xgh xghVar = (xgh) this.c;
        String str3 = xghVar.a;
        String str4 = xghVar.a;
        String str5 = xghVar.b;
        boolean zJ = u890.j(str2, str3);
        bhh bhhVar = (bhh) this.d;
        rzn1 rzn1Var = null;
        if (zJ) {
            String str6 = (String) this.b;
            return new kjm(new igm(bhhVar.a.getString(2131954110), rzn1Var, null == true ? 1 : 0, 6), Collections.singletonList(new jhm("podcast_interactivity_delete_comment", cmx.c, (fhm) null, 2131954059, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(d0t.b1, d0t.c1), new uh0(bhhVar.d, str6, str, new ahh(c861Var, (byte) 1), syfVar)), 244)), false);
        }
        lik1 lik1Var = (lik1) this.h;
        igm igmVar = new igm(str5, new wfm(Uri.parse(xghVar.c), new hgm(str4, str5)), null == true ? 1 : 0, 4);
        jhm jhmVarA = bhhVar.a(str, lik1Var, c861Var);
        ahh ahhVar = new ahh(c861Var, (byte) 0);
        return new kjm(igmVar, p7h.M(new jhm[]{jhmVarA, new jhm("podcast_interactivity_block_comment_author", tkx.c, (fhm) null, 2131954058, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(rza.Z0, new nb9(str4, (byte) 18)), new j96(bhhVar.c, str5, str2, str4, syfVar, ahhVar, (byte) 2)), 244)}), false);
    }

    public tcr0 b() {
        return (tcr0) ((idd1) this.h).getValue();
    }

    public void c0(ram ramVar) {
        sam samVar;
        PriorityQueue priorityQueue = (PriorityQueue) this.c;
        dem1.v();
        EnumMap enumMap = (EnumMap) this.b;
        if (!enumMap.containsKey(ramVar)) {
            n57.e("You can not set to a state(" + ramVar.name() + "). Set the state among configured(" + enumMap.keySet().toString() + ")");
            return;
        }
        Iterator it = priorityQueue.iterator();
        do {
            if (!it.hasNext()) {
                samVar = null;
                break;
            }
            samVar = (sam) it.next();
        } while (samVar.a != ramVar);
        if (samVar == null) {
            priorityQueue.add((sam) enumMap.get(ramVar));
        }
        sam samVar2 = (sam) this.h;
        if ((samVar2 != null ? samVar2.a : null) == ramVar) {
            return;
        }
        this.h = (sam) priorityQueue.peek();
        j0();
    }

    public boolean d0(ji8 ji8Var) {
        if (ji8Var instanceof ii8) {
            wd wdVar = ((ii8) ji8Var).a.b;
            if (wdVar == null || ((yqg) this.d).d().getTimeInMillis() + 30000 > wdVar.c.getTime()) {
                return true;
            }
        } else if (!ji8Var.equals(ei8.a)) {
            if ((ji8Var instanceof fi8) || (ji8Var instanceof gi8)) {
                return true;
            }
            eg.o();
            return false;
        }
        return false;
    }

    public void e(ajn0 ajn0Var, Object obj) {
        ckz ckzVarB = cxo1.b(obj, (ajm0) ((p2o0) this.b).d);
        if (ckzVarB == null) {
            ckzVarB = new ckz("Unsupported annotation argument: " + ajn0Var);
        }
        ((HashMap) this.c).put(ajn0Var, ckzVarB);
    }

    public void e0(int i2, List list) {
        kt91 kt91Var = (kt91) this.f;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i2);
        n57.k(i2 != 0, "Invalid resource ID provided: %s", new Object[]{numValueOf});
        kt91Var.k(new er91((fs91) null, "", numValueOf, (String) null, 2131954200, new cg1(this, list, (byte) 21), (cvr) null, (xq91) null, false));
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
        ((HashMap) this.c).put(ajn0Var, new b1z(hegVar, ajn0Var2));
    }

    public void f0() {
        ((zt0) this.h).c(2, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0080  */
    public void g(byte[] bArr, int i2, int i3, kqc1 kqc1Var, akl aklVar) {
        bfo bfoVar;
        wgv wgvVar;
        SparseArray sparseArray;
        int i4;
        Paint paint;
        int i5;
        wgv wgvVar2;
        int i6;
        int iG;
        int i7;
        int i8;
        d520 d520Var = this;
        bae baeVar = new bae(bArr, i2 + i3);
        baeVar.m(i2);
        Paint paint2 = (Paint) d520Var.c;
        Canvas canvas = (Canvas) d520Var.d;
        gbe gbeVar = (gbe) d520Var.g;
        SparseArray sparseArray2 = (SparseArray) gbeVar.f;
        SparseArray sparseArray3 = (SparseArray) gbeVar.g;
        int i9 = gbeVar.b;
        SparseArray sparseArray4 = (SparseArray) gbeVar.c;
        SparseArray sparseArray5 = (SparseArray) gbeVar.d;
        SparseArray sparseArray6 = (SparseArray) gbeVar.e;
        int i10 = gbeVar.a;
        while (baeVar.b() >= 48 && baeVar.g(8) == 15) {
            int iG2 = baeVar.g(8);
            int iG3 = baeVar.g(16);
            int iG4 = baeVar.g(16);
            int iD = baeVar.d() + iG4;
            if (iG4 * 8 > baeVar.b()) {
                oon1.H("Data field length exceeds limit");
                baeVar.o(baeVar.b());
                sparseArray = sparseArray3;
                i4 = i9;
                paint = paint2;
                i5 = i10;
            } else {
                switch (iG2) {
                    case 16:
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        if (iG3 == i10) {
                            pyp0 pyp0Var = (pyp0) gbeVar.i;
                            int i11 = 8;
                            baeVar.g(8);
                            int iG5 = baeVar.g(4);
                            int iG6 = baeVar.g(2);
                            baeVar.o(2);
                            int i12 = iG4 - 2;
                            SparseArray sparseArray7 = new SparseArray();
                            while (i12 > 0) {
                                int iG7 = baeVar.g(i11);
                                baeVar.o(i11);
                                sparseArray7.put(iG7, new vgv(baeVar.g(16), baeVar.g(16)));
                                i10 = i10;
                                i12 -= 6;
                                i11 = 8;
                            }
                            i5 = i10;
                            pyp0 pyp0Var2 = new pyp0(iG5, iG6, sparseArray7, (byte) 5);
                            if (iG6 != 0) {
                                gbeVar.i = pyp0Var2;
                                sparseArray4.clear();
                                sparseArray5.clear();
                                sparseArray6.clear();
                            } else if (pyp0Var != null && pyp0Var.b != iG5) {
                                gbeVar.i = pyp0Var2;
                            }
                        } else {
                            i5 = i10;
                        }
                        break;
                    case 17:
                        pyp0 pyp0Var3 = (pyp0) gbeVar.i;
                        if (iG3 != i10 || pyp0Var3 == null) {
                            sparseArray = sparseArray3;
                            i4 = i9;
                            paint = paint2;
                        } else {
                            int iG8 = baeVar.g(8);
                            baeVar.o(4);
                            boolean zF = baeVar.f();
                            baeVar.o(3);
                            int iG9 = baeVar.g(16);
                            int iG10 = baeVar.g(16);
                            baeVar.g(3);
                            int iG11 = baeVar.g(3);
                            int i13 = 2;
                            baeVar.o(2);
                            int iG12 = baeVar.g(8);
                            int iG13 = baeVar.g(8);
                            int iG14 = baeVar.g(4);
                            int iG15 = baeVar.g(2);
                            baeVar.o(2);
                            int i14 = iG4 - 10;
                            SparseArray sparseArray8 = new SparseArray();
                            while (i14 > 0) {
                                int i15 = i9;
                                int i16 = i14;
                                int iG16 = baeVar.g(16);
                                int iG17 = baeVar.g(i13);
                                baeVar.g(i13);
                                Paint paint3 = paint2;
                                int iG18 = baeVar.g(12);
                                SparseArray sparseArray9 = sparseArray3;
                                baeVar.o(4);
                                int iG19 = baeVar.g(12);
                                int i17 = i16 - 6;
                                if (iG17 == 1 || iG17 == 2) {
                                    baeVar.g(8);
                                    baeVar.g(8);
                                    i17 = i16 - 8;
                                }
                                sparseArray8.put(iG16, new xgv(iG18, iG19));
                                i14 = i17;
                                i9 = i15;
                                paint2 = paint3;
                                sparseArray3 = sparseArray9;
                                i13 = 2;
                            }
                            sparseArray = sparseArray3;
                            i4 = i9;
                            paint = paint2;
                            wgv wgvVar3 = new wgv(iG8, zF, iG9, iG10, iG11, iG12, iG13, iG14, iG15, sparseArray8);
                            if (pyp0Var3.c == 0 && (wgvVar2 = (wgv) sparseArray4.get(iG8)) != null) {
                                SparseArray sparseArray10 = wgvVar2.j;
                                for (int i18 = 0; i18 < sparseArray10.size(); i18++) {
                                    wgvVar3.j.put(sparseArray10.keyAt(i18), (xgv) sparseArray10.valueAt(i18));
                                }
                            }
                            sparseArray4.put(wgvVar3.a, wgvVar3);
                        }
                        i5 = i10;
                        break;
                    case 18:
                        if (iG3 == i10) {
                            sgv sgvVarX = X(baeVar, iG4);
                            sparseArray5.put(sgvVarX.a, sgvVarX);
                        } else if (iG3 == i9) {
                            sgv sgvVarX2 = X(baeVar, iG4);
                            sparseArray2.put(sgvVarX2.a, sgvVarX2);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    case 19:
                        if (iG3 == i10) {
                            ugv ugvVarY = Y(baeVar);
                            sparseArray6.put(ugvVarY.a, ugvVarY);
                        } else if (iG3 == i9) {
                            ugv ugvVarY2 = Y(baeVar);
                            sparseArray3.put(ugvVarY2.a, ugvVarY2);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        if (iG3 == i10) {
                            baeVar.o(4);
                            boolean zF2 = baeVar.f();
                            baeVar.o(3);
                            int iG20 = baeVar.g(16);
                            int iG21 = baeVar.g(16);
                            if (zF2) {
                                int iG22 = baeVar.g(16);
                                int iG23 = baeVar.g(16);
                                int iG24 = baeVar.g(16);
                                i6 = iG23;
                                iG = baeVar.g(16);
                                i8 = iG24;
                                i7 = iG22;
                            } else {
                                i6 = iG20;
                                iG = iG21;
                                i7 = 0;
                                i8 = 0;
                            }
                            gbeVar.h = new tgv(iG20, iG21, i7, i6, i8, iG);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    default:
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                }
                baeVar.p(iD - baeVar.d());
            }
            i10 = i5;
            i9 = i4;
            paint2 = paint;
            sparseArray3 = sparseArray;
        }
        SparseArray sparseArray11 = sparseArray3;
        Paint paint4 = paint2;
        pyp0 pyp0Var4 = (pyp0) gbeVar.i;
        if (pyp0Var4 == null) {
            w280 w280Var = b380.b;
            bfoVar = new bfo(-9223372036854775807L, -9223372036854775807L, bg11.e);
        } else {
            tgv tgvVar = (tgv) gbeVar.h;
            if (tgvVar == null) {
                tgvVar = (tgv) d520Var.e;
            }
            int i19 = tgvVar.b;
            int i20 = tgvVar.a;
            Bitmap bitmap = (Bitmap) d520Var.h;
            if (bitmap == null || i20 + 1 != bitmap.getWidth() || i19 + 1 != ((Bitmap) d520Var.h).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i20 + 1, i19 + 1, Bitmap.Config.ARGB_8888);
                d520Var.h = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray12 = (SparseArray) pyp0Var4.d;
            int i21 = 0;
            while (i21 < sparseArray12.size()) {
                canvas.save();
                vgv vgvVar = (vgv) sparseArray12.valueAt(i21);
                wgv wgvVar4 = (wgv) sparseArray4.get(sparseArray12.keyAt(i21));
                int i22 = vgvVar.a + tgvVar.c;
                int i23 = vgvVar.b + tgvVar.e;
                int i24 = wgvVar4.c;
                int i25 = wgvVar4.f;
                SparseArray sparseArray13 = sparseArray12;
                int i26 = wgvVar4.d;
                int i27 = i19;
                int i28 = i22 + i24;
                int i29 = i20;
                SparseArray sparseArray14 = sparseArray4;
                int i30 = i23 + i26;
                int i31 = i21;
                canvas.clipRect(i22, i23, Math.min(i28, tgvVar.d), Math.min(i30, tgvVar.f));
                sgv sgvVar = (sgv) sparseArray5.get(i25);
                if (sgvVar == null && (sgvVar = (sgv) sparseArray2.get(i25)) == null) {
                    sgvVar = (sgv) d520Var.f;
                }
                int[] iArr = sgvVar.b;
                int[] iArr2 = sgvVar.c;
                int[] iArr3 = sgvVar.d;
                tgv tgvVar2 = tgvVar;
                SparseArray sparseArray15 = wgvVar4.j;
                SparseArray sparseArray16 = sparseArray2;
                int i32 = 0;
                while (i32 < sparseArray15.size()) {
                    int iKeyAt = sparseArray15.keyAt(i32);
                    SparseArray sparseArray17 = sparseArray15;
                    xgv xgvVar = (xgv) sparseArray15.valueAt(i32);
                    ugv ugvVar = (ugv) sparseArray6.get(iKeyAt);
                    int i33 = i32;
                    sparseArray11 = sparseArray11;
                    if (ugvVar == null) {
                        ugvVar = (ugv) sparseArray11.get(iKeyAt);
                    }
                    ugv ugvVar2 = ugvVar;
                    if (ugvVar2 != null) {
                        Paint paint5 = ugvVar2.b ? null : (Paint) d520Var.b;
                        wgv wgvVar5 = wgvVar4;
                        int i34 = wgvVar5.e;
                        int i35 = xgvVar.a + i22;
                        int i36 = xgvVar.b + i23;
                        int[] iArr4 = i34 == 3 ? iArr3 : i34 == 2 ? iArr2 : iArr;
                        wgvVar = wgvVar5;
                        W(ugvVar2.c, iArr4, i34, i35, i36, paint5, canvas);
                        W(ugvVar2.d, iArr4, i34, i35, i36 + 1, paint5, canvas);
                    } else {
                        sparseArray6 = sparseArray6;
                        wgvVar = wgvVar4;
                    }
                    d520Var = this;
                    i22 = i22;
                    i23 = i23;
                    wgvVar4 = wgvVar;
                    i32 = i33 + 1;
                    i26 = i26;
                    sparseArray15 = sparseArray17;
                    iArr2 = iArr2;
                    sparseArray6 = sparseArray6;
                    i24 = i24;
                }
                int i37 = i26;
                SparseArray sparseArray18 = sparseArray6;
                int i38 = i23;
                wgv wgvVar6 = wgvVar4;
                int i39 = i22;
                int i40 = i24;
                int[] iArr5 = iArr2;
                if (wgvVar6.b) {
                    int i41 = wgvVar6.e;
                    paint4.setColor(i41 == 3 ? iArr3[wgvVar6.g] : i41 == 2 ? iArr5[wgvVar6.h] : iArr[wgvVar6.i]);
                    canvas.drawRect(i39, i38, i28, i30, paint4);
                } else {
                    paint4 = paint4;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i39, i38, i40, i37);
                float f = i29;
                float f2 = i39 / f;
                float f3 = i38;
                float f4 = i27;
                arrayList.add(new feo((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, bitmapCreateBitmap2, f3 / f4, 0, 0, f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f, i37 / f4, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                d520Var = this;
                paint4 = paint4;
                sparseArray5 = sparseArray5;
                i19 = i27;
                i20 = i29;
                arrayList = arrayList;
                sparseArray12 = sparseArray13;
                sparseArray4 = sparseArray14;
                sparseArray2 = sparseArray16;
                sparseArray6 = sparseArray18;
                i21 = i31 + 1;
                tgvVar = tgvVar2;
            }
            bfoVar = new bfo(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        aklVar.accept(bfoVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:120:0x026c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    public Object g0(km61 km61Var, ibd1 ibd1Var, Boolean bool, boolean z, tqw tqwVar, onm onmVar) throws AbortFlowException {
        sbd1 sbd1Var;
        hbd1 hbd1Var;
        uv61 uv61VarA;
        boolean z2;
        tv80 tv80Var;
        uv61 uv61VarA2;
        boolean z3;
        tv80 tv80Var2;
        jt61 jt61Var;
        String str;
        jt61 jt61Var2;
        String str2;
        String strValueOf;
        boolean zM;
        boolean zBooleanValue;
        Boolean bool2 = bool;
        xv61 xv61Var = (xv61) this.d;
        i9i1 i9i1Var = (i9i1) this.f;
        b7n b7nVar = (b7n) this.b;
        if (onmVar instanceof sbd1) {
            sbd1Var = (sbd1) onmVar;
            int i2 = sbd1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbd1Var.h = i2 - Integer.MIN_VALUE;
            } else {
                sbd1Var = new sbd1(this, onmVar);
            }
        } else {
            sbd1Var = new sbd1(this, onmVar);
        }
        Object obj = sbd1Var.f;
        int i3 = sbd1Var.h;
        boolean z4 = true;
        d9n d9nVar = rih1.a;
        String strValueOf2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return d9nVar;
            }
            if (i3 == 2) {
                hm5.M(obj);
                return d9nVar;
            }
            if (i3 == 3) {
                z3 = sbd1Var.e;
                uv61VarA2 = sbd1Var.d;
                hbd1 hbd1Var2 = sbd1Var.c;
                tv80Var2 = sbd1Var.b;
                Boolean bool3 = sbd1Var.a;
                hm5.M(obj);
                hbd1Var = hbd1Var2;
                bool2 = bool3;
                jt61Var = (jt61) obj;
                if (jt61Var != null) {
                    str = (String) jt61Var.a();
                } else {
                    str = null;
                }
                uv61VarA2.a(bool2 != null ? (String) ((ebd1) hbd1Var).c.invoke(str, bool2) : null, (String) ((ebd1) hbd1Var).c.invoke(str, Boolean.valueOf(z3)), tv80Var2);
                return d9nVar;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jt61 jt61Var3 = sbd1Var.d;
                hm5.M(obj);
                return d9nVar;
            }
            z2 = sbd1Var.e;
            uv61VarA = sbd1Var.d;
            hbd1 hbd1Var3 = sbd1Var.c;
            tv80Var = sbd1Var.b;
            Boolean bool4 = sbd1Var.a;
            hm5.M(obj);
            hbd1Var = hbd1Var3;
            bool2 = bool4;
            jt61Var2 = (jt61) obj;
            if (jt61Var2 != null) {
                str2 = (String) jt61Var2.a();
            } else {
                str2 = null;
            }
            strValueOf = "0";
            zM = f46.M(new String[]{"0", "1"}, str2);
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
                if (((dbd1) hbd1Var).c) {
                    if (zBooleanValue) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                }
                if (zM) {
                    strValueOf2 = String.valueOf(zBooleanValue);
                } else if (zBooleanValue) {
                    strValueOf2 = "1";
                } else {
                    strValueOf2 = "0";
                }
            }
            if (((dbd1) hbd1Var).c) {
                z4 = z2;
            } else if (z2) {
                z4 = false;
            }
            if (zM) {
                strValueOf = String.valueOf(z4);
            } else if (z4) {
                strValueOf = "1";
            }
            uv61VarA.a(strValueOf2, strValueOf, tv80Var);
            return d9nVar;
        }
        hm5.M(obj);
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        hbd1Var = ibd1Var.b;
        boolean z5 = hbd1Var instanceof cbd1;
        d9n d9nVar2 = d9n.a;
        if (z5) {
            cbd1 cbd1Var = (cbd1) hbd1Var;
            if (((Boolean) cbd1Var.b.invoke(km61Var, Boolean.valueOf(z), tv80VarY)).booleanValue()) {
                x6n x6nVar = cbd1Var.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                sbd1Var.a = null;
                sbd1Var.b = null;
                sbd1Var.c = null;
                sbd1Var.e = z;
                sbd1Var.h = 1;
                if (b7nVar.b(x6nVar, boolValueOf, sbd1Var) == d9nVar2) {
                    return d9nVar2;
                }
            }
            return d9nVar;
        }
        if (hbd1Var instanceof bbd1) {
            if (((Boolean) ((bbd1) hbd1Var).a.invoke(km61Var, Boolean.valueOf(z), tv80VarY)).booleanValue()) {
                sbd1Var.a = null;
                sbd1Var.b = null;
                sbd1Var.c = null;
                sbd1Var.e = z;
                sbd1Var.h = 2;
                if (b7nVar.b(j6n.a, Integer.valueOf(z ? 1 : 4), sbd1Var) == d9nVar2) {
                    return d9nVar2;
                }
            }
            return d9nVar;
        }
        if (hbd1Var instanceof ebd1) {
            ebd1 ebd1Var = (ebd1) hbd1Var;
            if (((Boolean) ebd1Var.d.invoke(km61Var, Boolean.valueOf(z), tv80VarY)).booleanValue()) {
                uv61VarA2 = xv61Var.a(rc11.a.b(ivw0.class), ebd1Var.e);
                tu41 tu41Var = uv61VarA2.d;
                sbd1Var.a = bool2;
                sbd1Var.b = tv80VarY;
                sbd1Var.c = hbd1Var;
                sbd1Var.d = uv61VarA2;
                sbd1Var.e = z;
                sbd1Var.h = 3;
                Object objK = b5p1.k(tu41Var, sbd1Var);
                if (objK != d9nVar2) {
                    tv80 tv80Var3 = tv80VarY;
                    obj = objK;
                    z3 = z;
                    tv80Var2 = tv80Var3;
                    jt61Var = (jt61) obj;
                    if (jt61Var != null) {
                        str = (String) jt61Var.a();
                    } else {
                        str = null;
                    }
                    uv61VarA2.a(bool2 != null ? (String) ((ebd1) hbd1Var).c.invoke(str, bool2) : null, (String) ((ebd1) hbd1Var).c.invoke(str, Boolean.valueOf(z3)), tv80Var2);
                    return d9nVar;
                }
                return d9nVar2;
            }
            return d9nVar;
        }
        if (!(hbd1Var instanceof dbd1)) {
            if (hbd1Var instanceof gbd1) {
                ht61 ht61Var = (jt61) ((gbd1) hbd1Var).b.invoke(km61Var, Boolean.valueOf(z), tv80VarY);
                if (!(ht61Var instanceof it61)) {
                    if (ht61Var instanceof ht61) {
                        i9i1Var.c(ht61Var);
                        return d9nVar;
                    }
                    eg.o();
                    return null;
                }
            } else if (hbd1Var instanceof fbd1) {
                fbd1 fbd1Var = (fbd1) hbd1Var;
                it61 it61Var = (jt61) fbd1Var.b.invoke(km61Var, Boolean.valueOf(z), tv80VarY);
                if (!(it61Var instanceof it61)) {
                    if (it61Var instanceof ht61) {
                        i9i1Var.c((ht61) it61Var);
                        return d9nVar;
                    }
                    eg.o();
                    return null;
                }
                ueo0 ueo0Var = (ueo0) ((idd1) this.h).getValue();
                Function0 function0 = fbd1Var.a;
                LinkedHashMap linkedHashMap = ueo0Var.a;
                Object objB = linkedHashMap.get(fbd1Var);
                if (objB == null) {
                    objB = gio1.b(function0.invoke());
                    linkedHashMap.put(fbd1Var, objB);
                }
                Object obj2 = it61Var.a;
                sbd1Var.a = null;
                sbd1Var.b = null;
                sbd1Var.c = null;
                sbd1Var.d = null;
                sbd1Var.e = z;
                sbd1Var.h = 5;
                ((wen0) objB).emit(obj2, sbd1Var);
                if (d9nVar == d9nVar2) {
                    return d9nVar2;
                }
            } else {
                if (!(hbd1Var instanceof abd1)) {
                    eg.o();
                    return null;
                }
                abd1 abd1Var = (abd1) hbd1Var;
                if (((Boolean) abd1Var.b.invoke(km61Var, Boolean.valueOf(z), tv80VarY)).booleanValue()) {
                    xv61Var.a(abd1Var.a, d9nVar).a(bool2, Boolean.valueOf(z), tv80VarY);
                }
            }
            return d9nVar;
        }
        dbd1 dbd1Var = (dbd1) hbd1Var;
        if (((Boolean) dbd1Var.d.invoke(km61Var, Boolean.valueOf(z), tv80VarY)).booleanValue()) {
            uv61VarA = xv61Var.a(rc11.a.b(ivw0.class), dbd1Var.e);
            tu41 tu41Var2 = uv61VarA.d;
            sbd1Var.a = bool2;
            sbd1Var.b = tv80VarY;
            sbd1Var.c = hbd1Var;
            sbd1Var.d = uv61VarA;
            sbd1Var.e = z;
            sbd1Var.h = 4;
            Object objK2 = b5p1.k(tu41Var2, sbd1Var);
            if (objK2 != d9nVar2) {
                tv80 tv80Var4 = tv80VarY;
                obj = objK2;
                z2 = z;
                tv80Var = tv80Var4;
                jt61Var2 = (jt61) obj;
                if (jt61Var2 != null) {
                    str2 = (String) jt61Var2.a();
                } else {
                    str2 = null;
                }
                strValueOf = "0";
                zM = f46.M(new String[]{"0", "1"}, str2);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                    if (((dbd1) hbd1Var).c) {
                        if (zBooleanValue) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    }
                    if (zM) {
                        strValueOf2 = String.valueOf(zBooleanValue);
                    } else if (zBooleanValue) {
                        strValueOf2 = "1";
                    } else {
                        strValueOf2 = "0";
                    }
                }
                if (((dbd1) hbd1Var).c) {
                    z4 = z2;
                } else if (z2) {
                    z4 = false;
                }
                if (zM) {
                    strValueOf = String.valueOf(z4);
                } else if (z4) {
                    strValueOf = "1";
                }
                uv61VarA.a(strValueOf2, strValueOf, tv80Var);
                return d9nVar;
            }
            return d9nVar2;
        }
        return d9nVar;
    }

    public ymd0 getState() {
        return (kdn0) this.g;
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        ArrayList arrayList = new ArrayList();
        p2o0 p2o0Var = (p2o0) this.b;
        d520 d520Var = new d520(p2o0Var, x1p1.j((ajm0) p2o0Var.d, hegVar, (poj0) p2o0Var.e), hegVar, arrayList, mka1.m0);
        zwg zwgVar = new zwg();
        zwgVar.b = d520Var;
        zwgVar.c = this;
        zwgVar.d = ajn0Var;
        zwgVar.e = arrayList;
        zwgVar.a = d520Var;
        return zwgVar;
    }

    public int i() {
        return 2;
    }

    public void i0() {
        m85 m85Var = (m85) this.c;
        if (z().isConnected()) {
            z().unsubscribe(z().getRoot(), (rr4) this.f);
            if (!m85Var.a()) {
                z().disconnect();
            }
        }
        if (m85Var.a()) {
            z().disconnect();
        }
    }

    public js20 j(xpw xpwVar) {
        no5 no5Var = (no5) this.c;
        pbd1 pbd1Var = new pbd1(this, (byte) 0);
        pbd1 pbd1Var2 = new pbd1(this, (byte) 1);
        pbd1 pbd1Var3 = new pbd1(this, (byte) 2);
        fym0 fym0Var = new fym0(this, (lnm) null, (byte) 1);
        return x3p1.n(new tjf0(no5Var, pbd1Var3, pbd1Var, pbd1Var2, ec61.a1, (byte) 20), ec61.b1, qr51.Y0, null, new q961(new lcm(fym0Var, (lnm) null, (byte) 15), (byte) 8), 8);
    }

    public void j0() {
        int i2;
        View view = (View) this.e;
        Context context = (Context) this.f;
        sam samVar = (sam) this.h;
        i0c0 i0c0Var = (f8x) this.d;
        if (samVar == null) {
            i0c0Var.a.setVisibility(8);
            view.setVisibility(0);
        } else {
            i0c0 i0c0Var2 = i0c0Var;
            jl00 jl00Var = i0c0Var2.b;
            xoi1.a(context);
            switch (((sam) this.h).d) {
                case "offline":
                    i2 = 2131232242;
                    break;
                case "devices":
                    i2 = 2131231738;
                    break;
                case "exclamation_circle":
                    i2 = 2131231803;
                    break;
                default:
                    i2 = 2131232485;
                    break;
            }
            Drawable drawable = context.getDrawable(i2);
            if (drawable == null) {
                hhg1.n("Icon drawable resource must be valid");
                return;
            }
            int iO = ago1.o(context, 2130968791, 0);
            int iO2 = ago1.o(context, 0, 0);
            drawable.setTint(iO);
            ((i0c0) jl00Var.b).a.setImageDrawable(new x10(drawable, 1.0f, iO2, (byte) 2));
            i0c0Var2.setTitle(context.getText(((sam) this.h).b));
            i0c0Var2.setSubtitle(context.getText(((sam) this.h).c));
            i0c0Var2.a.setVisibility(0);
            view.setVisibility(8);
        }
        LoadingView loadingView = (LoadingView) this.g;
        if (loadingView != null) {
            int i3 = loadingView.N0;
            if (i3 == 2 || i3 == 3 || i3 == 4) {
                View view2 = i0c0Var.a;
                if (view2.getVisibility() == 0) {
                    view = view2;
                } else if (view.getVisibility() != 0) {
                    view = null;
                }
                if (view != null) {
                    view.setVisibility(8);
                    LoadingView loadingView2 = (LoadingView) this.g;
                    loadingView2.setListener(new m6s(loadingView2.getContext(), view));
                }
                ((LoadingView) this.g).setTargetContentView(view);
                LoadingView loadingView3 = (LoadingView) this.g;
                loadingView3.post(loadingView3.Q0);
            }
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k0(String str, onm onmVar) {
        tcb tcbVar;
        if (onmVar instanceof tcb) {
            tcbVar = (tcb) onmVar;
            int i2 = tcbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tcbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tcbVar = new tcb(this, onmVar);
            }
        } else {
            tcbVar = new tcb(this, onmVar);
        }
        Object objL = tcbVar.a;
        int i3 = tcbVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objL);
                Observable observableA = ((hr81) this.d).a(tri1.b, str);
                tcbVar.c = 1;
                objL = fc11.l(observableA, 1, (Object) null, tcbVar);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            return O((f320) objL);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("Email login validation error", new Object[]{e2});
            return ycb.a;
        }
    }

    public void l(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && a0(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l0(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.ucb
            if (r0 == 0) goto L13
            r0 = r8
            p.ucb r0 = (p.ucb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ucb r0 = new p.ucb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            goto L4f
        L37:
            p.hm5.M(r8)
            java.lang.Object r8 = r6.d     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            p.hr81 r8 = (p.hr81) r8     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            p.tri1 r1 = p.tri1.b     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            io.reactivex.rxjava3.core.Observable r8 = r8.a(r1, r7)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            r0.a = r7     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            r0.d = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            java.lang.Object r8 = p.fc11.l(r8, r4, r2, r0)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            if (r8 != r5) goto L4f
            goto L5b
        L4f:
            p.f320 r8 = (p.f320) r8     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            r0.a = r2     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            r0.d = r3     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            p.udb r8 = r6.P(r7, r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            if (r8 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.udb r8 = (p.udb) r8     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L61
            return r8
        L5f:
            r6 = move-exception
            goto L63
        L61:
            r6 = move-exception
            goto L6f
        L63:
            java.lang.String r7 = "Email validation error"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.spotify.base.java.logging.Logger.d(r7, r6)
            p.odb r6 = p.odb.a
            return r6
        L6f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d520.l0(java.lang.String, p.onm):java.lang.Object");
    }

    public s6b0 m(ajn0 ajn0Var) {
        return new fta((p2o0) this.b, ajn0Var, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m0(String str, onm onmVar) {
        vcb vcbVar;
        if (onmVar instanceof vcb) {
            vcbVar = (vcb) onmVar;
            int i2 = vcbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vcbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                vcbVar = new vcb(this, onmVar);
            }
        } else {
            vcbVar = new vcb(this, onmVar);
        }
        Object objA = vcbVar.a;
        int i3 = vcbVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objA);
                ao aoVar = (ao) this.h;
                oji1 oji1Var = new oji1(str);
                vcbVar.c = 1;
                objA = aoVar.a(oji1Var, vcbVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            rji1 rji1Var = (rji1) objA;
            return rji1Var.a ? rdb.a : new sdb(rji1Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("Username login hint request failed", new Object[]{e2});
            return tdb.a;
        }
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
        ((HashMap) this.c).put(ajn0Var, new fla0(jegVar));
    }

    public String n0() {
        return (String) this.f;
    }

    public Object o(onm onmVar) {
        return fn31.Y((q8n) this.b, new qm(this, (lnm) null, (byte) 25), onmVar);
    }

    public r0i0 p(PlayerState playerState, PlayerQueue playerQueue, long j, boolean z, ota1 ota1Var, eao eaoVar, tal talVar, boolean z2, boolean z3, v0i0 v0i0Var, ghh0 ghh0Var, sp91 sp91Var, boolean z4, boolean z5, boolean z6, odn odnVar, g5v0 g5v0Var, String str, Map map, ktl ktlVar, boolean z7, String str2, String str3, boolean z8, boolean z9) {
        int i2;
        w0i0 w0i0Var;
        y0i0 y0i0Var;
        pbq pbqVar = (pbq) this.f;
        Object obj = this.b;
        Context context = (Context) obj;
        boolean z10 = v0i0Var.a;
        if (!z10 && "KR".equals(v0i0Var.b) && v0i0Var.c.length() == 0) {
            return new r0i0(5, 0L, 0.0f, (Bundle) null, mgz.d, context.getString(2131955741), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16334);
        }
        if (!z10) {
            return new r0i0(5, 0L, 0.0f, (Bundle) null, mgz.b, context.getString(2131955679), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16334);
        }
        if (!playerState.track().c() && !playerState.isPlaying()) {
            boolean zEquals = talVar.equals(new qal(1));
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.spotify.music.extra.OFFLINE_MODE", zEquals);
            bundle.putBoolean("com.spotify.music.extra.ON_DEMAND_ENABLED", z2);
            return new r0i0(0, 0L, 0.0f, bundle, (mgz) null, (String) null, 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16375);
        }
        boolean z11 = playerState.isPlaying() && !playerState.isPaused();
        Long l = (Long) playerState.position(((yqg) this.c).b()).h();
        long jLongValue = l != null ? l.longValue() : -1L;
        Double d = (Double) playerState.playbackSpeed().h();
        float fDoubleValue = d != null ? (float) d.doubleValue() : 0.0f;
        if (playerState.track().c()) {
            boolean z12 = z11 && !z5;
            if (z12 && playerState.isBuffering()) {
                i2 = 4;
            } else {
                i2 = z12 ? 3 : 2;
            }
        } else {
            i2 = 1;
        }
        boolean zEquals2 = talVar.equals(new qal(1));
        Bundle bundle2 = new Bundle();
        if (playerState.isPlaying()) {
            bundle2.putBoolean("com.amazon.alexa.externalmediaplayer.active", z);
            bundle2.putBoolean("com.spotify.music.extra.ACTIVE_PLAYBACK_LOCAL", z);
        }
        bundle2.putBoolean("com.spotify.music.extra.CROSSFADE_ENABLED", eaoVar.a);
        bundle2.putInt("com.spotify.music.extra.CROSSFADE_DURATION", eaoVar.b);
        bundle2.putBoolean("com.spotify.music.extra.OFFLINE_MODE", zEquals2);
        bundle2.putBoolean("com.spotify.music.extra.OFFLINE_ENABLED", z3);
        bundle2.putBoolean("com.spotify.music.extra.ON_DEMAND_ENABLED", z2);
        bundle2.putBoolean("com.spotify.music.extra.IS_RECOMMENDATION", z6);
        PlayerOptions playerOptionsOptions = playerState.options();
        playerOptionsOptions.getClass();
        if (!playerState.restrictions().disallowPeekingNextReasons().isEmpty() || o4p1.t(playerState)) {
            w0i0Var = new w0i0();
        } else {
            ContextTrack contextTrack = (ContextTrack) playerQueue.track().h();
            ktl ktlVar2 = ktl.a;
            b7x b7xVar = b7x.a;
            j2i0 j2i0VarF = contextTrack != null ? pbqVar.F(new zlm(contextTrack, (su00) null, false, b7xVar, ktlVar2, false, false)) : null;
            b380 b380VarNextTracks = playerQueue.nextTracks();
            ArrayList arrayList = new ArrayList(q7h.U(b380VarNextTracks, 10));
            Iterator it = b380VarNextTracks.iterator();
            while (it.hasNext()) {
                b7x b7xVar2 = b7xVar;
                ktl ktlVar3 = ktlVar2;
                b7xVar = b7xVar2;
                ktlVar2 = ktlVar3;
                arrayList.add(new zlm((ContextTrack) it.next(), (su00) null, false, b7xVar2, ktlVar3, false, false));
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(pbqVar.F((zlm) it2.next()));
            }
            w0i0Var = new w0i0((Context) obj, playerOptionsOptions.repeatingContext(), j2i0VarF, arrayList2, j);
        }
        w0i0 w0i0Var2 = w0i0Var;
        long j2 = (!playerState.restrictions().disallowPeekingNextReasons().isEmpty() || o4p1.t(playerState)) ? -1L : j;
        ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
        j2i0 j2i0VarF2 = contextTrack2 != null ? pbqVar.F(new zlm(contextTrack2, new su00(playerState, odnVar, g5v0Var, str, str2, str3), true, map, ktlVar, z8, z9)) : null;
        int i3 = playerState.options().shufflingContext() ? 2 : 1;
        if (playerState.options().repeatingTrack()) {
            y0i0Var = y0i0.b;
        } else {
            y0i0Var = playerState.options().repeatingContext() ? y0i0.c : y0i0.a;
        }
        return new r0i0(i2, jLongValue, fDoubleValue, bundle2, (mgz) null, (String) null, i3, y0i0Var, w0i0Var2, j2, j2i0VarF2, ((xpv0) this.e).f(playerState, ota1Var, talVar instanceof sal, sp91Var, z4, ghh0Var, z7, (wqg) this.g, z9), sp91Var, z4, 48);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    public Collection q(ArrayList arrayList) {
        xun0 xun0VarH;
        String str;
        xun0 xun0VarM;
        String str2;
        Uri data;
        t45 t45Var;
        xg30 xg30VarA;
        xg30 xg30VarA2;
        io60 io60Var = (io60) this.d;
        zt0 zt0Var = (zt0) this.h;
        if (zt0Var.b == null) {
            t45 t45VarA = zt0Var.a.a("ad-on-app-open");
            t45VarA.h = "android-ad-on-app-open";
            zt0Var.b = t45VarA;
        }
        zt0Var.a(1);
        zt0Var.a(2);
        if (!((Boolean) d5p1.h(((xs0) this.c).a).a.getValue()).booleanValue()) {
            f0();
            return io60Var.b(arrayList);
        }
        if (!(((lrw0) this.g).b instanceof sze1)) {
            f0();
            return io60Var.b(arrayList);
        }
        if (arrayList.size() != 1) {
            f0();
            return io60Var.b(arrayList);
        }
        Intent intent = (Intent) o7h.p0(arrayList);
        if (!u890.j(intent.getAction(), "android.intent.action.MAIN") || intent.getData() != null) {
            f0();
            return io60Var.b(arrayList);
        }
        yun0 yun0Var = (yun0) ((ewn0) this.e).b;
        ArrayDeque arrayDequeL = yun0Var.l();
        if (arrayDequeL == null || !arrayDequeL.isEmpty()) {
            Iterator it = arrayDequeL.iterator();
            while (it.hasNext()) {
                if (u890.j(((q0a) it.next()).b.b, "spotify:internal:ads:app-open")) {
                }
            }
            xun0VarH = yun0Var.h();
            if (xun0VarH != null || (xg30VarA2 = xun0VarH.a()) == null) {
                str = null;
            } else {
                str = xg30VarA2.b;
            }
            if (!u890.j(str, "spotify:internal:ads:app-open")) {
                xun0VarM = yun0Var.m();
                if (xun0VarM != null || (xg30VarA = xun0VarM.a()) == null) {
                    str2 = null;
                } else {
                    str2 = xg30VarA.b;
                }
                if (!u890.j(str2, "spotify:internal:ads:app-open")) {
                    if (u890.j(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
                        data = intent.getData();
                        if (u890.j(data != null ? data.toString() : null, nik1.d2.a)) {
                            f0();
                            return arrayList;
                        }
                    }
                    t45Var = zt0Var.b;
                    if (t45Var != null) {
                        t45Var.g(kk0.b(2));
                    }
                    Intent intent2 = new Intent();
                    intent2.setData(Uri.parse(nik1.d2.a));
                    intent2.putExtra("extra_internal_injected", true);
                    intent2.setAction("android.intent.action.VIEW").setComponent(new ComponentName(((Activity) this.f).getBaseContext(), (String) this.b));
                    intent2.setFlags(67108864);
                    return Collections.singletonList(intent2);
                }
            }
        } else {
            xun0VarH = yun0Var.h();
            if (xun0VarH != null) {
                str = null;
            } else {
                str = null;
            }
            if (!u890.j(str, "spotify:internal:ads:app-open")) {
                xun0VarM = yun0Var.m();
                if (xun0VarM != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (!u890.j(str2, "spotify:internal:ads:app-open")) {
                    if (u890.j(intent.getAction(), "android.intent.action.MAIN")) {
                        data = intent.getData();
                        if (u890.j(data != null ? data.toString() : null, nik1.d2.a)) {
                            f0();
                            return arrayList;
                        }
                    } else {
                        data = intent.getData();
                        if (u890.j(data != null ? data.toString() : null, nik1.d2.a)) {
                            f0();
                            return arrayList;
                        }
                    }
                    t45Var = zt0Var.b;
                    if (t45Var != null) {
                        t45Var.g(kk0.b(2));
                    }
                    Intent intent3 = new Intent();
                    intent3.setData(Uri.parse(nik1.d2.a));
                    intent3.putExtra("extra_internal_injected", true);
                    intent3.setAction("android.intent.action.VIEW").setComponent(new ComponentName(((Activity) this.f).getBaseContext(), (String) this.b));
                    intent3.setFlags(67108864);
                    return Collections.singletonList(intent3);
                }
            }
        }
        f0();
        return arrayList;
    }

    public void r(String str) {
        a0(new File((File) this.e, str));
    }

    public void reset() {
        gbe gbeVar = (gbe) this.g;
        ((SparseArray) gbeVar.c).clear();
        ((SparseArray) gbeVar.d).clear();
        ((SparseArray) gbeVar.e).clear();
        ((SparseArray) gbeVar.f).clear();
        ((SparseArray) gbeVar.g).clear();
        gbeVar.h = null;
        gbeVar.i = null;
    }

    public Object s(rxd1 rxd1Var, onm onmVar) {
        dto0 dto0Var = (dto0) this.b;
        if (!dto0Var.a.g((Context) this.c)) {
            return new fs50(new aho0(3), rxd1Var.a(), v1p1.h(rxd1Var));
        }
        if (rxd1Var instanceof jx81) {
            return ((nwy0) ((ynb0) this.d).get()).a(rxd1Var, onmVar);
        }
        if (rxd1Var instanceof g080) {
            return ((nwy0) ((ynb0) this.e).get()).a(rxd1Var, onmVar);
        }
        if (rxd1Var instanceof tbf) {
            return ((nwy0) ((ynb0) this.f).get()).a(rxd1Var, onmVar);
        }
        if (rxd1Var instanceof cai0) {
            return ((nwy0) ((ynb0) this.g).get()).a(rxd1Var, onmVar);
        }
        if (rxd1Var instanceof br70) {
            return ((nwy0) ((ynb0) this.h).get()).a(rxd1Var, onmVar);
        }
        eg.o();
        return null;
    }

    public void start() {
        switch (this.a) {
            case 10:
                ((mko) this.d).start();
                ((nix0) this.e).a();
                ((stt0) this.f).c();
                ((gst0) this.g).b();
                break;
            default:
                if (((llm) this.h) == null) {
                    ((kdn0) this.g).m(l3r.b);
                    llm llmVarE = smo1.e(flo1.l(guo1.B(), (q8n) this.b));
                    fn31.T(llmVarE, (o8n) null, 0, new awe(this, (lnm) null, (byte) 23), 3);
                    this.h = llmVarE;
                    break;
                }
                break;
        }
    }

    public void stop() {
        switch (this.a) {
            case 10:
                ((mko) this.d).stop();
                ((nix0) this.e).b();
                ((stt0) this.f).d();
                ((gst0) this.g).c();
                break;
            default:
                llm llmVar = (llm) this.h;
                if (llmVar != null) {
                    smo1.p(llmVar, null);
                }
                this.h = null;
                ((kdn0) this.g).m(l3r.a);
                break;
        }
    }

    public vd0 t(rcr0 rcr0Var) {
        ArrayList arrayList = ((vfr0) ((jkp0) this.c).b).c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = ((ufr0) it.next()).c;
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((rfr0) it2.next()).a);
            }
            r7h.W(arrayList4, arrayList2);
        }
        return new vd0((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), rcr0Var, this, (byte) 7);
    }

    public List w() {
        return b0(((File) this.e).list());
    }

    public Set x() {
        return (Set) this.d;
    }

    public synchronized Single y() {
        Single map;
        if (((AtomicBoolean) this.h).get()) {
            return Single.just(new gi8(new ug8((Integer) null, "AccessTokenClient is invalidated")));
        }
        ji8 ji8Var = (ji8) this.e;
        if (d0(ji8Var)) {
            be beVar = (be) this.b;
            jkz jkzVarN = EsAccessTokenClient.GetTokenRequest.n();
            jkzVarN.n();
            map = beVar.callSingle("spotify.authentication.login5.impl.proto.AccessTokenClient", "getToken", jkzVarN.build()).map(q9w.c).takeUntil((SingleSubject) this.f).map(new ee(this));
            map.getClass();
        } else {
            map = Single.just(ji8Var);
            map.getClass();
        }
        return map;
    }

    public MediaBrowser z() {
        return (MediaBrowser) ((idd1) this.h).getValue();
    }

    public /* synthetic */ d520(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public d520(xgh xghVar, bhh bhhVar, String str, String str2, c861 c861Var, syf syfVar, lik1 lik1Var) {
        this.a = (byte) 23;
        this.c = xghVar;
        this.d = bhhVar;
        this.b = str;
        this.e = str2;
        this.f = c861Var;
        this.g = syfVar;
        this.h = lik1Var;
    }

    public d520(String str, String str2, Set set) {
        this.a = (byte) 21;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.c = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.e = map;
        this.b = str;
        this.f = str2;
        this.g = mj81.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.d = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw pze0.g(it);
    }

    public d520(q8n q8nVar, x010 x010Var, j1 j1Var) {
        this.a = (byte) 28;
        this.b = q8nVar;
        this.c = x010Var;
        this.d = j1Var;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        this.e = dt71VarE;
        this.f = d5p1.g(dt71VarE);
        this.g = new kdn0(l3r.a);
    }

    public d520(oj3 oj3Var, cn3 cn3Var, eyh0 eyh0Var, gw70 gw70Var, Activity activity) {
        this.a = (byte) 7;
        this.b = oj3Var;
        this.c = cn3Var;
        this.d = eyh0Var;
        this.e = gw70Var;
        this.f = activity;
        this.g = new vku();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d520(l1o l1oVar, Set set, sjq0 sjq0Var, plo ploVar, lko lkoVar, xf4 xf4Var, pix0 pix0Var, qeq qeqVar, sbq sbqVar, p6r0 p6r0Var, y2r0 y2r0Var, zob1 zob1Var) {
        this.a = (byte) 10;
        this.b = set;
        lko lkoVar2 = xf4Var.y() ? ploVar : lkoVar;
        this.c = new jkp0(y2r0Var, sjq0Var, zob1Var);
        this.d = lko.a(lkoVar2, new c64(t(kcr0.a), this, (byte) 10), l1oVar.c);
        this.e = pix0.a(pix0Var, t(jcr0.a), p6r0Var);
        this.f = qeqVar.a(t(pcr0.a));
        this.g = sbqVar.a(t(ocr0.a));
        this.h = new idd1(new i26(this, (byte) 9));
    }

    public d520(i4q i4qVar, dg8 dg8Var, f971 f971Var, l6d l6dVar, kt91 kt91Var, iac0 iac0Var) {
        this.a = (byte) 25;
        this.b = i4qVar;
        this.c = dg8Var;
        this.d = f971Var;
        this.e = l6dVar;
        this.f = kt91Var;
        this.g = iac0Var;
    }

    public d520(teb tebVar, k1i k1iVar, hr81 hr81Var, nfb nfbVar, t8h1 t8h1Var, i8h1 i8h1Var, vzl0 vzl0Var, ao aoVar) {
        this.a = (byte) 18;
        this.b = tebVar;
        this.c = k1iVar;
        this.d = hr81Var;
        this.e = t8h1Var;
        this.f = i8h1Var;
        this.g = vzl0Var;
        this.h = aoVar;
    }

    public d520(xs0 xs0Var, io60 io60Var, ewn0 ewn0Var, Activity activity, String str, lrw0 lrw0Var, zt0 zt0Var) {
        this.a = (byte) 6;
        this.c = xs0Var;
        this.d = io60Var;
        this.e = ewn0Var;
        this.f = activity;
        this.b = str;
        this.g = lrw0Var;
        this.h = zt0Var;
    }

    public d520(be beVar, tg8 tg8Var, yqg yqgVar) {
        this.a = (byte) 3;
        this.b = beVar;
        this.c = tg8Var;
        this.d = yqgVar;
        this.e = new ii8(tg8Var.a);
        this.f = new SingleSubject();
        this.h = new AtomicBoolean(false);
        ObservableRefCount observableRefCountF = beVar.callStream("spotify.authentication.login5.impl.proto.AccessTokenClient", "onPermanentError", Empty.n()).map(s9w.c).map(ce.a).replay(1).f();
        this.g = observableRefCountF;
        observableRefCountF.subscribe(p.c);
    }

    public d520(Context context, q8n q8nVar, m85 m85Var, ComponentName componentName) {
        this.a = (byte) 8;
        this.b = q8nVar;
        this.c = m85Var;
        this.d = componentName;
        this.f = new rr4(this);
        this.g = new qr4(this, (byte) 0);
        this.h = new idd1(new nx2(context, this, (byte) 12));
    }

    public d520(pwy0 pwy0Var, xgc xgcVar, qb00 qb00Var, kdy0 kdy0Var, yqg yqgVar, yuy0 yuy0Var, dto0 dto0Var, Context context) {
        this.a = (byte) 14;
        this.b = pwy0Var;
        this.c = qb00Var;
        this.d = kdy0Var;
        this.e = yqgVar;
        this.f = yuy0Var;
        this.g = dto0Var;
        this.h = context;
    }

    public d520(Context context, yqg yqgVar, n801 n801Var, xpv0 xpv0Var, pbq pbqVar, wqg wqgVar) {
        this.a = (byte) 9;
        this.b = context;
        this.c = yqgVar;
        this.d = n801Var;
        this.e = xpv0Var;
        this.f = pbqVar;
        this.g = wqgVar;
        this.h = dm5.S(1, new rq4(this, (byte) 16));
    }

    public d520(uu00 uu00Var, mnk0 mnk0Var, rxj0 rxj0Var, z6k0 z6k0Var, npm1 npm1Var, d0r d0rVar) {
        this.a = (byte) 13;
        this.b = uu00Var;
        this.c = mnk0Var;
        this.d = rxj0Var;
        this.e = z6k0Var;
        this.f = npm1Var;
        this.g = d0rVar;
        this.h = w3p1.o(new l4r(pwc0.b, 1, oc8.X0, new j4r(oc8.V0), oc8.Y0), oc8.W0);
    }

    public d520(b7n b7nVar, no5 no5Var, xv61 xv61Var, pcl pclVar, i9i1 i9i1Var, teo0 teo0Var) {
        this.a = (byte) 2;
        this.b = b7nVar;
        this.c = no5Var;
        this.d = xv61Var;
        this.e = pclVar;
        this.f = i9i1Var;
        this.g = teo0Var;
        this.h = new idd1(new fjc1(this, (byte) 9));
    }

    public d520(k6c k6cVar, dv00 dv00Var, khc khcVar) {
        this.a = (byte) 20;
        this.b = k6cVar;
        this.c = dv00Var;
        this.d = khcVar;
    }

    public d520(Context context, f8x f8xVar, View view) {
        this.a = (byte) 27;
        this.b = new EnumMap(ram.class);
        this.c = new PriorityQueue(ram.d.length, new tam((byte) 0));
        this.f = context;
        this.d = f8xVar;
        this.e = view;
        ((i0c0) f8xVar).a.setVisibility(8);
        view.setVisibility(8);
    }

    public d520(Context context) {
        String string;
        String strReplaceAll;
        this.a = (byte) 0;
        String str = hrw0.a.b(context).a;
        this.b = str;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = eth.S(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(strReplaceAll);
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        Z(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        Z(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        Z(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        Z(file4);
        this.g = file4;
        File file5 = new File(file, "native-reports");
        Z(file5);
        this.h = file5;
    }

    public /* synthetic */ d520(ConstraintLayout constraintLayout, ImageView imageView, View view, View view2, View view3, View view4, View view5, ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = imageView;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = view5;
        this.h = viewGroup;
    }

    public d520(p2o0 p2o0Var, beg begVar, heg hegVar, List list, mka1 mka1Var) {
        this.a = (byte) 17;
        this.d = p2o0Var;
        this.e = begVar;
        this.f = hegVar;
        this.g = list;
        this.h = mka1Var;
        this.b = p2o0Var;
        this.c = new HashMap();
    }
}
