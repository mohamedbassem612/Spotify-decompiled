package com.spotify.mainlayout.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.mainlayout.ui.view.containers.MainLayoutConstrainedContainerView;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;
import com.spotify.mainlayout.ui.view.gradient.MainLayoutGradientView;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Set;
import kotlin.Metadata;
import p.a1g0;
import p.bhn0;
import p.c7p0;
import p.coz0;
import p.d1g0;
import p.een0;
import p.esl1;
import p.f2g0;
import p.gfn0;
import p.hgr0;
import p.hhg1;
import p.hsl1;
import p.hwb;
import p.i0g0;
import p.idd1;
import p.iu30;
import p.mma0;
import p.nk80;
import p.odn0;
import p.pob;
import p.qhl;
import p.qyf0;
import p.ryf0;
import p.rzf0;
import p.sgp0;
import p.syf0;
import p.twq0;
import p.tyf0;
import p.vyf0;
import p.vzf0;
import p.xyf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0006Ã\u0001Ü\u0001Ý\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0011R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\u0011R\u001d\u00104\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\u0011R\u001b\u0010:\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\u0011R\u001d\u0010=\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\u0011R\u001d\u0010@\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u00103R\u001b\u0010C\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\u0011R\u001b\u0010F\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bE\u0010!R\u001d\u0010I\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\u0011R\u001d\u0010L\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\u0011R\u001b\u0010Q\u001a\u00020M8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\u0011R\u001d\u0010\\\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\n\u001a\u0004\b[\u0010!R\u001d\u0010_\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u00103R\u001b\u0010b\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010\n\u001a\u0004\ba\u0010\u0011R\u001b\u0010e\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\u0011R\u001b\u0010h\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010\n\u001a\u0004\bg\u0010!R\u001b\u0010m\u001a\u00020i8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bk\u0010lR\u001b\u0010p\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010\n\u001a\u0004\bo\u0010&R\u001b\u0010s\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010&R\u001d\u0010v\u001a\u0004\u0018\u00010R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010\n\u001a\u0004\bu\u0010UR\u001d\u0010y\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010&R\u001d\u0010|\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bz\u0010\n\u001a\u0004\b{\u0010&R\u001d\u0010\u007f\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u00103R \u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\n\u001a\u0005\b\u0081\u0001\u0010\u0011R \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\u0011R$\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u00198FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\n\u001a\u0005\b\u0087\u0001\u0010\u001cR\u001e\u0010\u008b\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010&R\u001e\u0010\u008e\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\n\u001a\u0005\b\u008d\u0001\u0010&R)\u0010\u0094\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0090\u00010\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010\n\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0095\u00018@X\u0080\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010\n\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R9\u0010¢\u0001\u001a\u0005\u0018\u00010\u009a\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R9\u0010©\u0001\u001a\u0005\u0018\u00010£\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010£\u00018@@@X\u0080\u008e\u0002¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u009d\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R \u0010¯\u0001\u001a\u00030ª\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R0\u0010¶\u0001\u001a\u0013\u0012\u0005\u0012\u00030±\u0001\u0012\u0007\u0012\u0005\u0018\u00010±\u00010°\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\"\u0010»\u0001\u001a\u0005\u0018\u00010·\u00018@X\u0080\u0084\u0002¢\u0006\u000f\n\u0005\b¸\u0001\u0010\n\u001a\u0006\b¹\u0001\u0010º\u0001R9\u0010Â\u0001\u001a\u0005\u0018\u00010¼\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010¼\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b½\u0001\u0010\u009d\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u001d\u0010È\u0001\u001a\u00030Ã\u00018\u0006¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R,\u0010Ð\u0001\u001a\u0005\u0018\u00010É\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R!\u0010Ö\u0001\u001a\u00030Ñ\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001*\u0006\bÔ\u0001\u0010Õ\u0001R,\u0010Ø\u0001\u001a\u00030£\u00012\b\u0010×\u0001\u001a\u00030£\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001¨\u0006Þ\u0001"}, d2 = {"Lcom/spotify/mainlayout/ui/view/MainLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "T0", "Lp/znb0;", "getBottomGradient", "()Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "bottomGradient", "Landroid/view/View;", "U0", "getBottomGradientWindowInsets", "()Landroid/view/View;", "bottomGradientWindowInsets", "V0", "getBottomGradientBlackFade", "bottomGradientBlackFade", "W0", "getFragmentContainerInsetBottomSpacing", "fragmentContainerInsetBottomSpacing", "", "X0", "getBottomGradientViews", "()Ljava/util/Set;", "bottomGradientViews", "Landroidx/constraintlayout/widget/Barrier;", "Y0", "getBottomGradientBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "bottomGradientBarrier", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutContentContainerView;", "Z0", "getNavigationContainer", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutContentContainerView;", "navigationContainer", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "a1", "getNavigationContainerWrapper", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "navigationContainerWrapper", "b1", "getNavigationContainerTop", "navigationContainerTop", "Landroidx/constraintlayout/widget/Guideline;", "c1", "getNavigationAnimationGuidelineEnd", "()Landroidx/constraintlayout/widget/Guideline;", "navigationAnimationGuidelineEnd", "d1", "getNavigationWindowInsetsSpace", "navigationWindowInsetsSpace", "e1", "getImeWindowInsetsSpace", "imeWindowInsetsSpace", "f1", "getSidePanelBackground", "sidePanelBackground", "g1", "getSidePanelGuideline", "sidePanelGuideline", "h1", "getStatusBarPlaceholder", "statusBarPlaceholder", "i1", "getMainContentTopBarrier", "mainContentTopBarrier", "j1", "getDisplayCutoutPlaceholderEnd", "displayCutoutPlaceholderEnd", "k1", "getDisplayCutoutPlaceholderStart", "displayCutoutPlaceholderStart", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "l1", "getFragmentContainer", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "fragmentContainer", "Landroid/view/ViewGroup;", "m1", "getFragmentOverlayContainer", "()Landroid/view/ViewGroup;", "fragmentOverlayContainer", "n1", "getFragmentContainerInsetBottom", "fragmentContainerInsetBottom", "o1", "getFragmentContainerBarrierEnd", "fragmentContainerBarrierEnd", "p1", "getFragmentAnimationGuidelineEnd", "fragmentAnimationGuidelineEnd", "q1", "getFragmentContainerBottomOverlapTouchEventConsumer", "fragmentContainerBottomOverlapTouchEventConsumer", "r1", "getSnackbarContainer", "snackbarContainer", "s1", "getSnackbarBarrierBottom", "snackbarBarrierBottom", "Lcom/spotify/encoremobile/tooltip/TooltipContainer;", "t1", "getTooltipContainer", "()Lcom/spotify/encoremobile/tooltip/TooltipContainer;", "tooltipContainer", "u1", "getResponseAgentContainer", "responseAgentContainer", "v1", "getThinkingAgentContainer", "thinkingAgentContainer", "w1", "getNowPlayingMiniContainer", "nowPlayingMiniContainer", "x1", "getNowPlayingViewContainer", "nowPlayingViewContainer", "y1", "getNowPlayingViewAttachmentsContainer", "nowPlayingViewAttachmentsContainer", "z1", "getNowPlayingViewAnimationGuidelineBottom", "nowPlayingViewAnimationGuidelineBottom", "A1", "getNowPlayingViewRegionExpanded", "nowPlayingViewRegionExpanded", "B1", "getNowPlayingViewRegionCollapsed", "nowPlayingViewRegionCollapsed", "C1", "getNowPlayingViews", "nowPlayingViews", "D1", "getBannerContainer", "bannerContainer", "E1", "getLimitedExperienceIndicatorContainer", "limitedExperienceIndicatorContainer", "Lp/f2g0;", "Lp/b2g0;", "H1", "getVisibilityManager", "()Lp/f2g0;", "visibilityManager", "Lp/i0g0;", "I1", "getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/i0g0;", "nowPlayingViewAnimator", "Lp/c7p0;", "<set-?>", "J1", "Ljava/lang/Object;", "getNowPlayingViewMode", "()Lp/c7p0;", "setNowPlayingViewMode", "(Lp/c7p0;)V", "nowPlayingViewMode", "", "K1", "getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view", "()Ljava/lang/Boolean;", "setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view", "(Ljava/lang/Boolean;)V", "nowPlayingViewPopulated", "Lp/rzf0;", "L1", "Lp/rzf0;", "getInsets$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/rzf0;", "insets", "Lkotlin/Function1;", "Landroid/view/WindowInsets;", "M1", "Lp/iu30;", "getLegacyOverlayPageInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/iu30;", "legacyOverlayPageInsetsTransformer", "Lp/xyf0;", "O1", "getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/xyf0;", "bottomGradientManager", "Lp/hgr0;", "P1", "getPageSurroundingsProperty", "()Lp/hgr0;", "setPageSurroundingsProperty", "(Lp/hgr0;)V", "pageSurroundingsProperty", "Lp/qyf0;", "Q1", "Lp/qyf0;", "getMode", "()Lp/qyf0;", "mode", "Lp/twq0;", "R1", "Lp/twq0;", "getOverlayTouchDispatcher", "()Lp/twq0;", "setOverlayTouchDispatcher", "(Lp/twq0;)V", "overlayTouchDispatcher", "Lp/a1g0;", "getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/a1g0;", "getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view$delegate", "(Lcom/spotify/mainlayout/ui/view/MainLayout;)Ljava/lang/Object;", "overlayMode", "value", "isOverlayTouchPassthroughActive", "()Z", "setOverlayTouchPassthroughActive", "(Z)V", "p/ryf0", "p/pob", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MainLayout extends ConstraintLayout {
    public final idd1 A1;
    public final idd1 B1;
    public final idd1 C1;
    public final idd1 D1;
    public final idd1 E1;
    public final vzf0 F1;
    public final d1g0 G1;
    public final idd1 H1;
    public final idd1 I1;
    public final vyf0 J1;
    public final vyf0 K1;
    public final odn0 L1;
    public final tyf0 M1;
    public final idd1 N1;
    public final idd1 O1;
    public final vyf0 P1;

    /* JADX INFO: renamed from: Q1, reason: from kotlin metadata */
    public final qyf0 mode;

    /* JADX INFO: renamed from: R1, reason: from kotlin metadata */
    public twq0 overlayTouchDispatcher;
    public final idd1 T0;
    public final idd1 U0;
    public final idd1 V0;
    public final idd1 W0;
    public final idd1 X0;
    public final idd1 Y0;
    public final idd1 Z0;
    public final idd1 a1;
    public final idd1 b1;
    public final idd1 c1;
    public final idd1 d1;
    public final idd1 e1;
    public final idd1 f1;
    public final idd1 g1;
    public final idd1 h1;
    public final idd1 i1;
    public final idd1 j1;
    public final idd1 k1;
    public final idd1 l1;
    public final idd1 m1;
    public final idd1 n1;
    public final idd1 o1;
    public final idd1 p1;
    public final idd1 q1;
    public final idd1 r1;
    public final idd1 s1;
    public final idd1 t1;
    public final idd1 u1;
    public final idd1 v1;
    public final idd1 w1;
    public final idd1 x1;
    public final idd1 y1;
    public final idd1 z1;
    public static final /* synthetic */ mma0[] T1 = {new een0(MainLayout.class, "nowPlayingViewMode", "getNowPlayingViewMode()Lcom/spotify/mainlayout/preferences/NowPlayingViewMainLayoutMode;", 0), new een0(MainLayout.class, "nowPlayingViewPopulated", "getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view()Ljava/lang/Boolean;", 0), new een0(MainLayout.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0)};
    public static final pob S1 = new pob((byte) 15, false);

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        S1.getClass();
        this.T0 = pob.m(this, 2131427743);
        this.U0 = pob.m(this, 2131427746);
        this.V0 = pob.m(this, 2131427745);
        this.W0 = pob.m(this, 2131428953);
        byte b = 1;
        this.X0 = new idd1(new syf0(this, b));
        this.Y0 = pob.m(this, 2131427744);
        this.Z0 = pob.m(this, 2131430117);
        this.a1 = pob.m(this, 2131430127);
        this.b1 = new idd1(new syf0(this, (byte) 3));
        this.c1 = pob.m(this, 2131430118);
        this.d1 = pob.m(this, 2131430126);
        this.e1 = pob.m(this, 2131429632);
        this.f1 = pob.m(this, 2131430972);
        this.g1 = pob.m(this, 2131430973);
        this.h1 = pob.m(this, 2131431090);
        this.i1 = pob.m(this, 2131429883);
        this.j1 = pob.m(this, 2131428495);
        this.k1 = pob.m(this, 2131428496);
        this.l1 = pob.m(this, 2131428946);
        this.m1 = pob.m(this, 2131428960);
        this.n1 = pob.m(this, 2131428951);
        this.o1 = pob.m(this, 2131428947);
        this.p1 = pob.m(this, 2131428945);
        this.q1 = pob.m(this, 2131428949);
        this.r1 = pob.m(this, 2131431013);
        this.s1 = pob.m(this, 2131431017);
        this.t1 = pob.m(this, 2131431413);
        this.u1 = pob.m(this, 2131430672);
        this.v1 = pob.m(this, 2131431327);
        this.w1 = pob.m(this, 2131430189);
        this.x1 = pob.m(this, 2131430192);
        this.y1 = pob.m(this, 2131430191);
        this.z1 = pob.m(this, 2131430190);
        this.A1 = pob.m(this, 2131430194);
        this.B1 = pob.m(this, 2131430193);
        this.C1 = new idd1(new syf0(this, (byte) 5));
        this.D1 = pob.m(this, 2131427686);
        this.E1 = pob.m(this, 2131429768);
        vzf0 vzf0Var = new vzf0(this);
        this.F1 = vzf0Var;
        this.G1 = new d1g0(this);
        this.H1 = new idd1(new syf0(this, (byte) 6));
        this.I1 = new idd1(new syf0(this, (byte) 4));
        byte b2 = 0;
        this.J1 = new vyf0(this, b2);
        this.K1 = new vyf0(this, b);
        this.L1 = vzf0Var.d;
        this.M1 = new tyf0(this, b);
        byte b3 = 2;
        this.N1 = new idd1(new syf0(this, b3));
        this.O1 = new idd1(new syf0(this, b2));
        this.P1 = new vyf0(this, b3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coz0.a);
        typedArrayObtainStyledAttributes.getClass();
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            hhg1.n("Attribute not defined in set.");
            throw null;
        }
        this.mode = (qyf0) qyf0.d.get(typedArrayObtainStyledAttributes.getInteger(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainLayoutGradientView getBottomGradient() {
        return (MainLayoutGradientView) this.T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Barrier getBottomGradientBarrier() {
        return (Barrier) this.Y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBottomGradientBlackFade() {
        return (View) this.V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBottomGradientWindowInsets() {
        return (View) this.U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getFragmentContainerInsetBottomSpacing() {
        return (View) this.W0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f2g0 getVisibilityManager() {
        return (f2g0) this.H1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        vzf0 vzf0Var = this.F1;
        vzf0Var.getClass();
        esl1 esl1Var = hsl1.g((View) null, windowInsets).a;
        nk80 nk80VarI = esl1Var.i(519);
        vzf0Var.e.c(vzf0.j[0], vzf0Var, nk80VarI);
        MainLayout mainLayout = vzf0Var.a;
        hwb hwbVar = vzf0.i;
        View navigationWindowInsetsSpace = mainLayout.getNavigationWindowInsetsSpace();
        int i = nk80VarI.d;
        hwbVar.getClass();
        ViewGroup.LayoutParams layoutParams = navigationWindowInsetsSpace.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            navigationWindowInsetsSpace.setLayoutParams(layoutParams);
        }
        View imeWindowInsetsSpace = mainLayout.getImeWindowInsetsSpace();
        int i2 = esl1Var.i(8).d;
        ViewGroup.LayoutParams layoutParams2 = imeWindowInsetsSpace.getLayoutParams();
        if (layoutParams2.height != i2) {
            layoutParams2.height = i2;
            imeWindowInsetsSpace.setLayoutParams(layoutParams2);
        }
        nk80 nk80VarI2 = esl1Var.i(128);
        int i3 = nk80VarI2.c;
        int i4 = nk80VarI2.a;
        View displayCutoutPlaceholderStart = mainLayout.getDisplayCutoutPlaceholderStart();
        if (displayCutoutPlaceholderStart != null) {
            ViewGroup.LayoutParams layoutParams3 = displayCutoutPlaceholderStart.getLayoutParams();
            int i5 = displayCutoutPlaceholderStart.getLayoutDirection() == 0 ? i4 : i3;
            if (layoutParams3.width != i5) {
                layoutParams3.width = i5;
                displayCutoutPlaceholderStart.setLayoutParams(layoutParams3);
            }
        }
        View displayCutoutPlaceholderEnd = mainLayout.getDisplayCutoutPlaceholderEnd();
        if (displayCutoutPlaceholderEnd != null) {
            ViewGroup.LayoutParams layoutParams4 = displayCutoutPlaceholderEnd.getLayoutParams();
            if (displayCutoutPlaceholderEnd.getLayoutDirection() != 0) {
                i3 = i4;
            }
            if (layoutParams4.width != i3) {
                layoutParams4.width = i3;
                displayCutoutPlaceholderEnd.setLayoutParams(layoutParams4);
            }
        }
        int i6 = nk80VarI.b;
        View statusBarPlaceholder = mainLayout.getStatusBarPlaceholder();
        ViewGroup.LayoutParams layoutParams5 = statusBarPlaceholder.getLayoutParams();
        if (layoutParams5.height != i6) {
            layoutParams5.height = i6;
            statusBarPlaceholder.setLayoutParams(layoutParams5);
        }
        mainLayout.getMainContentTopBarrier().setMargin(-i6);
        return super/*android.view.View*/.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        twq0 twq0Var = this.overlayTouchDispatcher;
        if (twq0Var != null) {
            if (!getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().a) {
                twq0Var = null;
            }
            if (twq0Var != null) {
                return twq0Var.b(motionEvent, new tyf0(this, (byte) 0));
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public final MainLayoutContentContainerView getBannerContainer() {
        return (MainLayoutContentContainerView) this.D1.getValue();
    }

    public final xyf0 getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return (xyf0) this.O1.getValue();
    }

    public final Set<View> getBottomGradientViews() {
        return (Set) this.X0.getValue();
    }

    public final View getDisplayCutoutPlaceholderEnd() {
        return (View) this.j1.getValue();
    }

    public final View getDisplayCutoutPlaceholderStart() {
        return (View) this.k1.getValue();
    }

    public final Guideline getFragmentAnimationGuidelineEnd() {
        return (Guideline) this.p1.getValue();
    }

    public final MainLayoutFragmentContainerView getFragmentContainer() {
        return (MainLayoutFragmentContainerView) this.l1.getValue();
    }

    public final Barrier getFragmentContainerBarrierEnd() {
        return (Barrier) this.o1.getValue();
    }

    public final View getFragmentContainerBottomOverlapTouchEventConsumer() {
        return (View) this.q1.getValue();
    }

    public final View getFragmentContainerInsetBottom() {
        return (View) this.n1.getValue();
    }

    public final ViewGroup getFragmentOverlayContainer() {
        return (ViewGroup) this.m1.getValue();
    }

    public final View getImeWindowInsetsSpace() {
        return (View) this.e1.getValue();
    }

    public final rzf0 getInsets$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return this.L1;
    }

    public final iu30 getLegacyOverlayPageInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return this.M1;
    }

    public final MainLayoutContentContainerView getLimitedExperienceIndicatorContainer() {
        return (MainLayoutContentContainerView) this.E1.getValue();
    }

    public final Barrier getMainContentTopBarrier() {
        return (Barrier) this.i1.getValue();
    }

    public final qyf0 getMode() {
        return this.mode;
    }

    public final Guideline getNavigationAnimationGuidelineEnd() {
        return (Guideline) this.c1.getValue();
    }

    public final MainLayoutContentContainerView getNavigationContainer() {
        return (MainLayoutContentContainerView) this.Z0.getValue();
    }

    public final View getNavigationContainerTop() {
        return (View) this.b1.getValue();
    }

    public final MainLayoutConstrainedContainerView getNavigationContainerWrapper() {
        return (MainLayoutConstrainedContainerView) this.a1.getValue();
    }

    public final View getNavigationWindowInsetsSpace() {
        return (View) this.d1.getValue();
    }

    public final ViewGroup getNowPlayingMiniContainer() {
        return (ViewGroup) this.w1.getValue();
    }

    public final Guideline getNowPlayingViewAnimationGuidelineBottom() {
        return (Guideline) this.z1.getValue();
    }

    public final i0g0 getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return (i0g0) this.I1.getValue();
    }

    public final MainLayoutContentContainerView getNowPlayingViewAttachmentsContainer() {
        return (MainLayoutContentContainerView) this.y1.getValue();
    }

    public final MainLayoutContentContainerView getNowPlayingViewContainer() {
        return (MainLayoutContentContainerView) this.x1.getValue();
    }

    public final c7p0 getNowPlayingViewMode() {
        mma0 mma0Var = T1[0];
        return (c7p0) ((sgp0) this.J1).a;
    }

    public final Boolean getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view() {
        mma0 mma0Var = T1[1];
        return (Boolean) ((sgp0) this.K1).a;
    }

    public final View getNowPlayingViewRegionCollapsed() {
        return (View) this.B1.getValue();
    }

    public final View getNowPlayingViewRegionExpanded() {
        return (View) this.A1.getValue();
    }

    public final Set<ViewGroup> getNowPlayingViews() {
        return (Set) this.C1.getValue();
    }

    public final a1g0 getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return this.G1.a();
    }

    public final twq0 getOverlayTouchDispatcher() {
        return this.overlayTouchDispatcher;
    }

    public final hgr0 getPageSurroundingsProperty() {
        mma0 mma0Var = T1[2];
        return (hgr0) ((sgp0) this.P1).a;
    }

    public final MainLayoutContentContainerView getResponseAgentContainer() {
        return (MainLayoutContentContainerView) this.u1.getValue();
    }

    public final View getSidePanelBackground() {
        return (View) this.f1.getValue();
    }

    public final Guideline getSidePanelGuideline() {
        return (Guideline) this.g1.getValue();
    }

    public final Barrier getSnackbarBarrierBottom() {
        return (Barrier) this.s1.getValue();
    }

    public final View getSnackbarContainer() {
        return (View) this.r1.getValue();
    }

    public final View getStatusBarPlaceholder() {
        return (View) this.h1.getValue();
    }

    public final MainLayoutContentContainerView getThinkingAgentContainer() {
        return (MainLayoutContentContainerView) this.v1.getValue();
    }

    public final TooltipContainer getTooltipContainer() {
        return (TooltipContainer) this.t1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        MainLayoutGradientView bottomGradient;
        super/*android.view.View*/.onFinishInflate();
        vzf0 vzf0Var = this.F1;
        setTag(2131429884, vzf0Var.d);
        getFragmentContainer().setTag(2131429842, (gfn0) vzf0Var.d.c);
        getFragmentContainer().setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view(new tyf0(this, (byte) 2));
        if (!((Boolean) this.N1.getValue()).booleanValue() && (bottomGradient = getBottomGradient()) != null) {
            qhl layoutParams = bottomGradient.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            qhl qhlVar = layoutParams;
            qhlVar.k = 2131428948;
            bottomGradient.setLayoutParams(qhlVar);
            bottomGradient.setBottomColor(-16777216);
        }
        getSnackbarContainer().setTag(2131431015, Boolean.TRUE);
        getSnackbarContainer().setTag(2131431014, Boolean.valueOf(this.mode == qyf0.b));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mma0[] mma0VarArr = vzf0.j;
        vzf0 vzf0Var = this.F1;
        MainLayout mainLayout = vzf0Var.a;
        if (mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().a) {
            vzf0Var.h.c(mma0VarArr[3], vzf0Var, Integer.valueOf(vzf0Var.a().d));
        } else {
            vzf0Var.f.c(mma0VarArr[1], vzf0Var, Integer.valueOf(mainLayout.getFragmentContainerInsetBottom().getMeasuredHeight()));
            vzf0Var.g.c(mma0VarArr[2], vzf0Var, Integer.valueOf(mainLayout.getFragmentContainerBottomOverlapTouchEventConsumer().getMeasuredHeight()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            ryf0 ryf0Var = parcelable instanceof ryf0 ? (ryf0) parcelable : null;
            if (ryf0Var != null) {
                if (getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view() == null) {
                    setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view(ryf0Var.b);
                }
                super/*android.view.View*/.onRestoreInstanceState(ryf0Var.a);
                return;
            }
        }
        super/*android.view.View*/.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Parcelable onSaveInstanceState() {
        return new ryf0(super/*android.view.View*/.onSaveInstanceState(), getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view());
    }

    public final void setNowPlayingViewMode(c7p0 c7p0Var) {
        this.J1.c(T1[0], this, c7p0Var);
    }

    public final void setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view(Boolean bool) {
        this.K1.c(T1[1], this, bool);
    }

    public final void setOverlayTouchDispatcher(twq0 twq0Var) {
        this.overlayTouchDispatcher = twq0Var;
    }

    public final void setOverlayTouchPassthroughActive(boolean z) {
        d1g0 d1g0Var = this.G1;
        d1g0Var.f.c(d1g0.i[3], d1g0Var, Boolean.valueOf(z));
    }

    public final void setPageSurroundingsProperty(hgr0 hgr0Var) {
        this.P1.c(T1[2], this, hgr0Var);
    }
}
