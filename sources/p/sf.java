package p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Gainmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.chromium.net.CronetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sf {
    public static boolean A(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final ColorSpace B(hah hahVar) {
        if (u890.j(hahVar, kah.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (u890.j(hahVar, kah.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void C(long j, af5 af5Var, boolean z, waq0 waq0Var) {
        if (z) {
            j = xzn1.j(j, af5Var);
        }
        int i = (int) (4294967295L & j);
        waq0Var.invoke(new rs50(new lov[]{new sl61(i, i), new f9t(nbe1.e(j), 0)}));
    }

    public static int D(r1c0 r1c0Var, HandwritingGesture handwritingGesture, x6e1 x6e1Var, e8k1 e8k1Var, waq0 waq0Var) {
        int i;
        int i2;
        int i3;
        String string;
        z9e1 z9e1VarD;
        z9e1 z9e1VarD2;
        af5 af5Var = r1c0Var.j;
        if (af5Var == null) {
            return 3;
        }
        z9e1 z9e1VarD3 = r1c0Var.d();
        if (!af5Var.equals(z9e1VarD3 != null ? z9e1VarD3.a.a.a : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jV = xzn1.v(r1c0Var, l0p1.x(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (nbe1.d(jV)) {
                return j(selectGesture, waq0Var);
            }
            waq0Var.invoke(new sl61((int) (jV >> 32), (int) (jV & 4294967295L)));
            if (x6e1Var != null) {
                x6e1Var.e(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i4 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jV2 = xzn1.v(r1c0Var, l0p1.x(deleteGesture.getDeletionArea()), i4);
                if (nbe1.d(jV2)) {
                    return j(deleteGesture, waq0Var);
                }
                C(jV2, af5Var, i4 == 1, waq0Var);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i5 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jX = xzn1.x(r1c0Var, l0p1.x(deleteRangeGesture.getDeletionStartArea()), l0p1.x(deleteRangeGesture.getDeletionEndArea()), i5);
                    if (nbe1.d(jX)) {
                        return j(deleteRangeGesture, waq0Var);
                    }
                    C(jX, af5Var, i5 == 1, waq0Var);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (e8k1Var == null) {
                        return j(joinOrSplitGesture, waq0Var);
                    }
                    long jK = xzn1.K(joinOrSplitGesture.getJoinOrSplitPoint());
                    z9e1 z9e1VarD4 = r1c0Var.d();
                    int iT = z9e1VarD4 != null ? xzn1.t(z9e1VarD4.a.b, jK, r1c0Var.c(), e8k1Var) : -1;
                    if (iT == -1 || ((z9e1VarD2 = r1c0Var.d()) != null && xzn1.A(z9e1VarD2.a, iT))) {
                        return j(joinOrSplitGesture, waq0Var);
                    }
                    long J = xzn1.J(iT, af5Var);
                    if (!nbe1.d(J)) {
                        C(J, af5Var, false, waq0Var);
                        return 1;
                    }
                    int i6 = (int) (J >> 32);
                    waq0Var.invoke(new rs50(new lov[]{new sl61(i6, i6), new qqh(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (e8k1Var == null) {
                        return j(insertGesture, waq0Var);
                    }
                    long jK2 = xzn1.K(insertGesture.getInsertionPoint());
                    z9e1 z9e1VarD5 = r1c0Var.d();
                    int iT2 = z9e1VarD5 != null ? xzn1.t(z9e1VarD5.a.b, jK2, r1c0Var.c(), e8k1Var) : -1;
                    if (iT2 == -1 || ((z9e1VarD = r1c0Var.d()) != null && xzn1.A(z9e1VarD.a, iT2))) {
                        return j(insertGesture, waq0Var);
                    }
                    waq0Var.invoke(new rs50(new lov[]{new sl61(iT2, iT2), new qqh(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                z9e1 z9e1VarD6 = r1c0Var.d();
                long jU = xzn1.u(z9e1VarD6 != null ? z9e1VarD6.a : null, xzn1.K(removeSpaceGesture.getStartPoint()), xzn1.K(removeSpaceGesture.getEndPoint()), r1c0Var.c(), e8k1Var);
                if (nbe1.d(jU)) {
                    return j(removeSpaceGesture, waq0Var);
                }
                String strO = e6p1.o(jU, af5Var);
                mbh0 mbh0VarM = mno1.m(Pattern.compile("\\s+").matcher(strO), 0, strO);
                if (mbh0VarM == null) {
                    string = strO.toString();
                    i2 = -1;
                    i = -1;
                } else {
                    int length = strO.length();
                    StringBuilder sb = new StringBuilder(length);
                    i = -1;
                    int i7 = 0;
                    while (true) {
                        sb.append((CharSequence) strO, i7, ((rr80) mbh0VarM.b()).a);
                        if (i == -1) {
                            i = ((rr80) mbh0VarM.b()).a;
                        }
                        i2 = ((rr80) mbh0VarM.b()).b + 1;
                        sb.append((CharSequence) "");
                        i3 = ((rr80) mbh0VarM.b()).b + 1;
                        mbh0VarM = mbh0VarM.c();
                        if (i3 >= length || mbh0VarM == null) {
                            break;
                        }
                        i7 = i3;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) strO, i3, length);
                    }
                    string = sb.toString();
                }
                if (i == -1 || i2 == -1) {
                    return j(removeSpaceGesture, waq0Var);
                }
                int i8 = (int) (jU >> 32);
                waq0Var.invoke(new rs50(new lov[]{new sl61(i8 + i, i8 + i2), new qqh(string.substring(i, string.length() - (nbe1.e(jU) - i2)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jX2 = xzn1.x(r1c0Var, l0p1.x(selectRangeGesture.getSelectionStartArea()), l0p1.x(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (nbe1.d(jX2)) {
                return j(selectRangeGesture, waq0Var);
            }
            waq0Var.invoke(new sl61((int) (jX2 >> 32), (int) (jX2 & 4294967295L)));
            if (x6e1Var != null) {
                x6e1Var.e(true);
            }
        }
        return 1;
    }

    public static int E(ggg1 ggg1Var, HandwritingGesture handwritingGesture, aae1 aae1Var, Function0 function0, e8k1 e8k1Var) {
        int i;
        int i2;
        int i3;
        String string;
        y9e1 y9e1VarC;
        int i4 = 0;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jW = xzn1.w(aae1Var, l0p1.x(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (nbe1.d(jW)) {
                return i(ggg1Var, selectGesture);
            }
            ggg1Var.o(jW);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i4 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long jW2 = xzn1.w(aae1Var, l0p1.x(deleteGesture.getDeletionArea()), i4);
                if (nbe1.d(jW2)) {
                    return i(ggg1Var, deleteGesture);
                }
                if (i4 == 1) {
                    jW2 = xzn1.j(jW2, ggg1Var.h());
                }
                ggg1.n(ggg1Var, "", jW2, false, false, 28);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i4 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long jY = xzn1.y(aae1Var, l0p1.x(deleteRangeGesture.getDeletionStartArea()), l0p1.x(deleteRangeGesture.getDeletionEndArea()), i4);
                    if (nbe1.d(jY)) {
                        return i(ggg1Var, deleteRangeGesture);
                    }
                    if (i4 == 1) {
                        jY = xzn1.j(jY, ggg1Var.h());
                    }
                    ggg1.n(ggg1Var, "", jY, false, false, 28);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (ggg1Var.e() != ggg1Var.a.d()) {
                        return 3;
                    }
                    long jK = xzn1.K(joinOrSplitGesture.getJoinOrSplitPoint());
                    y9e1 y9e1VarC2 = aae1Var.c();
                    int iT = y9e1VarC2 != null ? xzn1.t(y9e1VarC2.b, jK, aae1Var.e(), e8k1Var) : -1;
                    if (iT == -1 || ((y9e1VarC = aae1Var.c()) != null && xzn1.A(y9e1VarC, iT))) {
                        return i(ggg1Var, joinOrSplitGesture);
                    }
                    long J = xzn1.J(iT, ggg1Var.h());
                    if (nbe1.d(J)) {
                        ggg1.n(ggg1Var, " ", J, false, false, 28);
                        return 1;
                    }
                    ggg1.n(ggg1Var, "", J, false, false, 28);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long jK2 = xzn1.K(insertGesture.getInsertionPoint());
                    y9e1 y9e1VarC3 = aae1Var.c();
                    int iT2 = y9e1VarC3 != null ? xzn1.t(y9e1VarC3.b, jK2, aae1Var.e(), e8k1Var) : -1;
                    if (iT2 == -1) {
                        return i(ggg1Var, insertGesture);
                    }
                    ggg1.n(ggg1Var, insertGesture.getTextToInsert(), e6p1.e(iT2, iT2), false, false, 28);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long jU = xzn1.u(aae1Var.c(), xzn1.K(removeSpaceGesture.getStartPoint()), xzn1.K(removeSpaceGesture.getEndPoint()), aae1Var.e(), e8k1Var);
                if (nbe1.d(jU)) {
                    return i(ggg1Var, removeSpaceGesture);
                }
                String strO = e6p1.o(jU, ggg1Var.h());
                mbh0 mbh0VarM = mno1.m(Pattern.compile("\\s+").matcher(strO), 0, strO);
                if (mbh0VarM == null) {
                    string = strO.toString();
                    i = -1;
                    i2 = -1;
                } else {
                    int length = strO.length();
                    StringBuilder sb = new StringBuilder(length);
                    i = -1;
                    while (true) {
                        sb.append((CharSequence) strO, i4, ((rr80) mbh0VarM.b()).a);
                        if (i == -1) {
                            i = ((rr80) mbh0VarM.b()).a;
                        }
                        i2 = ((rr80) mbh0VarM.b()).b + 1;
                        sb.append((CharSequence) "");
                        i3 = ((rr80) mbh0VarM.b()).b + 1;
                        mbh0VarM = mbh0VarM.c();
                        if (i3 >= length || mbh0VarM == null) {
                            break;
                        }
                        i4 = i3;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) strO, i3, length);
                    }
                    string = sb.toString();
                }
                if (i == -1 || i2 == -1) {
                    return i(ggg1Var, removeSpaceGesture);
                }
                int i5 = (int) (jU >> 32);
                ggg1.n(ggg1Var, string.substring(i, string.length() - (nbe1.e(jU) - i2)), e6p1.e(i5 + i, i5 + i2), false, false, 28);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jY2 = xzn1.y(aae1Var, l0p1.x(selectRangeGesture.getSelectionStartArea()), l0p1.x(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (nbe1.d(jY2)) {
                return i(ggg1Var, selectRangeGesture);
            }
            ggg1Var.o(jY2);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return 1;
    }

    public static boolean F(r1c0 r1c0Var, PreviewableHandwritingGesture previewableHandwritingGesture, x6e1 x6e1Var, CancellationSignal cancellationSignal) {
        af5 af5Var = r1c0Var.j;
        if (af5Var != null) {
            z9e1 z9e1VarD = r1c0Var.d();
            if (af5Var.equals(z9e1VarD != null ? z9e1VarD.a.a.a : null)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                zr50 zr50Var = zr50.a;
                byte b = 1;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (x6e1Var != null) {
                        long jV = xzn1.v(r1c0Var, l0p1.x(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        r1c0 r1c0Var2 = x6e1Var.d;
                        if (r1c0Var2 != null) {
                            r1c0Var2.f(jV);
                        }
                        r1c0 r1c0Var3 = x6e1Var.d;
                        if (r1c0Var3 != null) {
                            r1c0Var3.e(nbe1.b);
                        }
                        if (!nbe1.d(jV)) {
                            x6e1Var.u(false);
                            x6e1Var.r(zr50Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (x6e1Var != null) {
                        long jV2 = xzn1.v(r1c0Var, l0p1.x(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        r1c0 r1c0Var4 = x6e1Var.d;
                        if (r1c0Var4 != null) {
                            r1c0Var4.e(jV2);
                        }
                        r1c0 r1c0Var5 = x6e1Var.d;
                        if (r1c0Var5 != null) {
                            r1c0Var5.f(nbe1.b);
                        }
                        if (!nbe1.d(jV2)) {
                            x6e1Var.u(false);
                            x6e1Var.r(zr50Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (x6e1Var != null) {
                        long jX = xzn1.x(r1c0Var, l0p1.x(selectRangeGesture.getSelectionStartArea()), l0p1.x(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r1c0 r1c0Var6 = x6e1Var.d;
                        if (r1c0Var6 != null) {
                            r1c0Var6.f(jX);
                        }
                        r1c0 r1c0Var7 = x6e1Var.d;
                        if (r1c0Var7 != null) {
                            r1c0Var7.e(nbe1.b);
                        }
                        if (!nbe1.d(jX)) {
                            x6e1Var.u(false);
                            x6e1Var.r(zr50Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (x6e1Var != null) {
                        long jX2 = xzn1.x(r1c0Var, l0p1.x(deleteRangeGesture.getDeletionStartArea()), l0p1.x(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r1c0 r1c0Var8 = x6e1Var.d;
                        if (r1c0Var8 != null) {
                            r1c0Var8.e(jX2);
                        }
                        r1c0 r1c0Var9 = x6e1Var.d;
                        if (r1c0Var9 != null) {
                            r1c0Var9.f(nbe1.b);
                        }
                        if (!nbe1.d(jX2)) {
                            x6e1Var.u(false);
                            x6e1Var.r(zr50Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new yxj(x6e1Var, b));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean G(ggg1 ggg1Var, PreviewableHandwritingGesture previewableHandwritingGesture, aae1 aae1Var, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            y(ggg1Var, xzn1.w(aae1Var, l0p1.x(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            y(ggg1Var, xzn1.w(aae1Var, l0p1.x(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            y(ggg1Var, xzn1.y(aae1Var, l0p1.x(selectRangeGesture.getSelectionStartArea()), l0p1.x(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            y(ggg1Var, xzn1.y(aae1Var, l0p1.x(deleteRangeGesture.getDeletionStartArea()), l0p1.x(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new yxj(ggg1Var, (byte) 2));
        }
        return true;
    }

    public static void H(PendingIntent pendingIntent) {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(pendingIntent);
            e.toString();
        }
    }

    public static void I(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void J(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void K(MediaRoute2Info.Builder builder, Set set) {
        builder.setDeduplicationIds(set);
    }

    public static void L(MediaRoute2Info.Builder builder, int i) {
        builder.setType(i);
    }

    public static void M(ns40 ns40Var, Gainmap gainmap, int i) {
        int i2 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        float[] gamma = gainmap.getGamma();
        int i3 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        int i4 = (d(gamma) && d(gainmap.getRatioMax()) && d(gainmap.getRatioMin())) ? 1 : 0;
        ns40Var.g(i2, a(i, "uGainmapIsAlpha"));
        ns40Var.g(i3, a(i, "uNoGamma"));
        ns40Var.g(i4, a(i, "uSingleChannel"));
        String strA = a(i, "uLogRatioMin");
        float[] ratioMin = gainmap.getRatioMin();
        ns40Var.f(strA, new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        String strA2 = a(i, "uLogRatioMax");
        float[] ratioMax = gainmap.getRatioMax();
        ns40Var.f(strA2, new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        ns40Var.f(a(i, "uEpsilonSdr"), gainmap.getEpsilonSdr());
        ns40Var.f(a(i, "uEpsilonHdr"), gainmap.getEpsilonHdr());
        ns40Var.f(a(i, "uGainmapGamma"), gamma);
        ns40Var.e(a(i, "uDisplayRatioHdr"), gainmap.getDisplayRatioForFullHdr());
        ns40Var.e(a(i, "uDisplayRatioSdr"), gainmap.getMinDisplayRatioForHdrTransition());
        fn31.t();
    }

    public static void N(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(p7h.M(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo.setSupportedHandwritingGesturePreviews(f46.S0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void O(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void P(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static final void Q(fp8 fp8Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            fp8Var.n(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    public static void R(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static RouteListingPreference S(as31 as31Var) {
        ArrayList arrayList = new ArrayList();
        for (zr31 zr31Var : as31Var.a) {
            arrayList.add(new RouteListingPreference.Item.Builder(zr31Var.a).setFlags(zr31Var.c).setSubText(zr31Var.d).setCustomSubtextMessage(zr31Var.e).setSelectionBehavior(zr31Var.b).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(as31Var.c).setUseSystemOrdering(as31Var.b).build();
    }

    public static CronetException T(Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (w74.j(exc)) {
            return new lz4((QuicException) exc);
        }
        if (exc instanceof NetworkException) {
            return new ku4((NetworkException) exc, false);
        }
        if (exc instanceof CallbackException) {
            CallbackException callbackException = (CallbackException) exc;
            return new p84(callbackException.getMessage(), callbackException.getCause());
        }
        HttpException httpException = (HttpException) exc;
        return new wk4(httpException.getMessage(), httpException);
    }

    public static String a(int i, String str) {
        return i == -1 ? str : f4i1.c(i, str);
    }

    public static final void b(CursorAnchorInfo.Builder builder, y9e1 y9e1Var, n511 n511Var) {
        if (n511Var.k()) {
            return;
        }
        zrm0 zrm0Var = y9e1Var.b;
        int i = zrm0Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iP = yoi1.p(zrm0Var.e(n511Var.b), 0, i);
        int iP2 = yoi1.p(zrm0Var.e(n511Var.d), 0, i);
        if (iP > iP2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(y9e1Var.g(iP), zrm0Var.f(iP), y9e1Var.h(iP), zrm0Var.b(iP));
            if (iP == iP2) {
                return;
            } else {
                iP++;
            }
        }
    }

    public static final void c(CursorAnchorInfo.Builder builder, y9e1 y9e1Var, n511 n511Var) {
        if (n511Var.k()) {
            return;
        }
        zrm0 zrm0Var = y9e1Var.b;
        int i = zrm0Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iP = yoi1.p(zrm0Var.e(n511Var.b), 0, i);
        int iP2 = yoi1.p(zrm0Var.e(n511Var.d), 0, i);
        if (iP > iP2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(y9e1Var.g(iP), zrm0Var.f(iP), y9e1Var.h(iP), zrm0Var.b(iP));
            if (iP == iP2) {
                return;
            } else {
                iP++;
            }
        }
    }

    public static boolean d(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static void e(MediaRoute2Info.Builder builder, gvh0 gvh0Var) {
        if (gvh0Var.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(gvh0Var.a());
        }
    }

    public static Context f(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static boolean g(Gainmap gainmap, Gainmap gainmap2) {
        return gainmap.getGamma() == gainmap2.getGamma() && gainmap.getRatioMax() == gainmap2.getRatioMax() && gainmap.getRatioMin() == gainmap2.getRatioMin() && gainmap.getEpsilonHdr() == gainmap2.getEpsilonHdr() && gainmap.getEpsilonSdr() == gainmap2.getEpsilonSdr() && gainmap.getDisplayRatioForFullHdr() == gainmap2.getDisplayRatioForFullHdr() && gainmap.getMinDisplayRatioForHdrTransition() == gainmap2.getMinDisplayRatioForHdrTransition() && gainmap.getGainmapContents() == gainmap2.getGainmapContents() && gainmap.getGainmapContents().getGenerationId() == gainmap2.getGainmapContents().getGenerationId();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.chromium.net.CronetException */
    public static Object h(o7o o7oVar, Class cls) throws Exception {
        try {
            return o7oVar.run();
        } catch (Exception e) {
            if (e instanceof InlineExecutionProhibitedException) {
                org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (e instanceof HttpException) {
                throw T(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static int i(ggg1 ggg1Var, HandwritingGesture handwritingGesture) {
        y7e1 y7e1Var = ggg1Var.a;
        dk80 dk80Var = ggg1Var.b;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        h4e1Var.t = null;
        ggg1Var.r(h4e1Var);
        y7e1Var.b(dk80Var, true, 1);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ggg1.m(ggg1Var, fallbackText, false, false, 28);
        return 5;
    }

    public static int j(HandwritingGesture handwritingGesture, waq0 waq0Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        waq0Var.invoke(new qqh(fallbackText, 1));
        return 5;
    }

    public static JobScheduler k(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    public static AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float m(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void n(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static Set p(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int q(Context context) {
        return context.getDeviceId();
    }

    public static int r(Context context) {
        return context.getDeviceId();
    }

    public static int[] s(w9e1 w9e1Var, RectF rectF, int i, final w9 w9Var) {
        return w9e1Var.f.getRangeForRect(rectF, i == 1 ? new bi5(new qpj1(w9e1Var.f.getText(), w9e1Var.l(), (byte) 20)) : new GraphemeClusterSegmentFinder(w9e1Var.f.getText(), w9e1Var.a), new Layout.TextInclusionStrategy() { // from class: p.il4
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) w9Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float t(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int v(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int w(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static int x(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void y(ggg1 ggg1Var, long j, int i) {
        if (nbe1.d(j)) {
            y7e1 y7e1Var = ggg1Var.a;
            dk80 dk80Var = ggg1Var.b;
            y7e1Var.b.c().h();
            h4e1 h4e1Var = y7e1Var.b;
            h4e1Var.t = null;
            ggg1Var.r(h4e1Var);
            y7e1Var.b(dk80Var, true, 1);
            y7e1Var.g(true);
            y7e1Var.f(y7e1Var.b.e);
            return;
        }
        long j2 = ggg1Var.j(j);
        y7e1 y7e1Var2 = ggg1Var.a;
        dk80 dk80Var2 = ggg1Var.b;
        y7e1Var2.b.c().h();
        h4e1 h4e1Var2 = y7e1Var2.b;
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        yzr0 yzr0Var = h4e1Var2.c;
        if (i2 >= i3) {
            hhg1.n(cy30.i(i2, "Do not set reversed or empty range: ", i3, " > "));
            return;
        }
        h4e1Var2.t = new mmr0(new s8e1(i), new nbe1(e6p1.e(yoi1.p(i2, 0, yzr0Var.length()), yoi1.p(i3, 0, yzr0Var.length()))));
        y7e1Var2.b(dk80Var2, true, 1);
        y7e1Var2.g(true);
        y7e1Var2.f(y7e1Var2.b.e);
    }

    public static boolean z(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
}
