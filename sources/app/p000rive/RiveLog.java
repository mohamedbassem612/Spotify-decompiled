package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001f !B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ+\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lapp/rive/RiveLog;", "", "<init>", "()V", "", "tag", "Lkotlin/Function0;", "msg", "Lp/rih1;", "v", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "d", "i", "w", "", "t", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "logV", "(Ljava/lang/String;Ljava/lang/String;)V", "logD", "logI", "logW", "logE", "Lapp/rive/RiveLog$Logger;", "logger", "Lapp/rive/RiveLog$Logger;", "getLogger", "()Lapp/rive/RiveLog$Logger;", "setLogger", "(Lapp/rive/RiveLog$Logger;)V", "LogcatLogger", "Logger", "NoOpLogger", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveLog {
    public static final RiveLog INSTANCE = new RiveLog();
    private static volatile Logger logger = NoOpLogger.INSTANCE;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ%\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ%\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/rive/RiveLog$LogcatLogger;", "Lapp/rive/RiveLog$Logger;", "<init>", "()V", "", "tag", "Lkotlin/Function0;", "msg", "Lp/rih1;", "v", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "d", "i", "w", "", "t", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogcatLogger implements Logger {
        public static final int $stable = 0;

        @Override // app.rive.RiveLog.Logger
        public void d(String tag, Function0 msg) {
        }

        @Override // app.rive.RiveLog.Logger
        public void e(String tag, Throwable t, Function0 msg) {
        }

        @Override // app.rive.RiveLog.Logger
        public void i(String tag, Function0 msg) {
        }

        @Override // app.rive.RiveLog.Logger
        public void v(String tag, Function0 msg) {
        }

        @Override // app.rive.RiveLog.Logger
        public void w(String tag, Function0 msg) {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ1\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lapp/rive/RiveLog$Logger;", "", "", "tag", "Lkotlin/Function0;", "msg", "Lp/rih1;", "v", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "d", "i", "w", "", "t", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void d(Logger logger, String str, Function0 function0) {
            }

            public static void e(Logger logger, String str, Throwable th, Function0 function0) {
            }

            public static /* synthetic */ void e$default(Logger logger, String str, Throwable th, Function0 function0, int i, Object obj) {
                if (obj != null) {
                    hhg1.h("Super calls with default arguments not supported in this target, function: e");
                    return;
                }
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.e(str, th, function0);
            }

            public static void i(Logger logger, String str, Function0 function0) {
            }

            public static void v(Logger logger, String str, Function0 function0) {
            }

            public static void w(Logger logger, String str, Function0 function0) {
            }
        }

        void d(String tag, Function0 msg);

        void e(String tag, Throwable t, Function0 msg);

        void i(String tag, Function0 msg);

        void v(String tag, Function0 msg);

        void w(String tag, Function0 msg);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/RiveLog$NoOpLogger;", "Lapp/rive/RiveLog$Logger;", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoOpLogger implements Logger {
        public static final int $stable = 0;
        public static final NoOpLogger INSTANCE = new NoOpLogger();

        private NoOpLogger() {
        }

        @Override // app.rive.RiveLog.Logger
        public void d(String str, Function0 function0) {
            Logger.DefaultImpls.d(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void e(String str, Throwable th, Function0 function0) {
            Logger.DefaultImpls.e(this, str, th, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void i(String str, Function0 function0) {
            Logger.DefaultImpls.i(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void v(String str, Function0 function0) {
            Logger.DefaultImpls.v(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void w(String str, Function0 function0) {
            Logger.DefaultImpls.w(this, str, function0);
        }
    }

    private RiveLog() {
    }

    public static final void d(String tag, Function0 msg) {
        INSTANCE.getLogger().d(tag, msg);
    }

    public static final void e(String tag, Throwable t, Function0 msg) {
        INSTANCE.getLogger().e(tag, t, msg);
    }

    public static /* synthetic */ void e$default(String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        INSTANCE.getLogger().e(str, th, function0);
    }

    public static final void i(String tag, Function0 msg) {
        INSTANCE.getLogger().i(tag, msg);
    }

    public static final void logD(String tag, String msg) {
        logger.d(tag, new AnonymousClass1(msg));
    }

    public static final void logE(String tag, String msg) {
        logger.e(tag, null, new C00501(msg));
    }

    public static final void logI(String tag, String msg) {
        logger.i(tag, new C00511(msg));
    }

    public static final void logV(String tag, String msg) {
        logger.v(tag, new C00521(msg));
    }

    public static final void logW(String tag, String msg) {
        logger.w(tag, new C00531(msg));
    }

    public static final void v(String tag, Function0 msg) {
        INSTANCE.getLogger().v(tag, msg);
    }

    public static final void w(String tag, Function0 msg) {
        INSTANCE.getLogger().w(tag, msg);
    }

    public final Logger getLogger() {
        return logger;
    }

    public final void setLogger(Logger logger2) {
        logger = logger2;
    }

    /* JADX INFO: renamed from: app.rive.RiveLog$logD$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ String $msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$msg = str;
        }

        public final String invoke() {
            return this.$msg;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveLog$logE$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00501 extends hab0 implements Function0 {
        final /* synthetic */ String $msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00501(String str) {
            super(0);
            this.$msg = str;
        }

        public final String invoke() {
            return this.$msg;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveLog$logI$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00511 extends hab0 implements Function0 {
        final /* synthetic */ String $msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00511(String str) {
            super(0);
            this.$msg = str;
        }

        public final String invoke() {
            return this.$msg;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveLog$logV$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00521 extends hab0 implements Function0 {
        final /* synthetic */ String $msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00521(String str) {
            super(0);
            this.$msg = str;
        }

        public final String invoke() {
            return this.$msg;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveLog$logW$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00531 extends hab0 implements Function0 {
        final /* synthetic */ String $msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00531(String str) {
            super(0);
            this.$msg = str;
        }

        public final String invoke() {
            return this.$msg;
        }
    }
}
