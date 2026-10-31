package p;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class vue0 {
    public static volatile byte a = 0;
    public static final l1q0 b = new l1q0((byte) 1);
    public static final ytw0 c = new ytw0((byte) 16);
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static LinkedHashSet a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = vue0.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e2) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            return linkedHashSet;
        }
    }

    public static rue0 b(Class cls) {
        int i;
        rue0 rue0VarC = c(cls.getName());
        if (d) {
            voi1 voi1Var = yoi1.b;
            Class cls2 = null;
            if (voi1Var == null) {
                if (yoi1.c) {
                    voi1Var = null;
                } else {
                    try {
                        voi1Var = new voi1();
                    } catch (SecurityException unused) {
                        voi1Var = null;
                    }
                    yoi1.b = voi1Var;
                    yoi1.c = true;
                }
            }
            if (voi1Var != null) {
                Class[] classContext = voi1Var.getClassContext();
                String name = yoi1.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    eg.m("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                yoi1.L("Detected logger name mismatch. Given name: \"" + rue0VarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                yoi1.L("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return rue0VarC;
    }

    public static rue0 c(String str) {
        ytw0 ytw0Var;
        if (a == 0) {
            synchronized (vue0.class) {
                try {
                    if (a == 0) {
                        a = (byte) 1;
                        e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte b2 = a;
        if (b2 == 1) {
            ytw0Var = b;
        } else {
            if (b2 == 2) {
                eg.m("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (b2 == 3) {
                ytw0Var = xrb1.b.a;
            } else {
                if (b2 != 4) {
                    eg.m("Unreachable code");
                    return null;
                }
                ytw0Var = c;
            }
        }
        return ytw0Var.b(str);
    }

    public static boolean d() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static final void e() {
        LinkedHashSet linkedHashSetA;
        try {
            try {
                if (d()) {
                    linkedHashSetA = null;
                } else {
                    linkedHashSetA = a();
                    h(linkedHashSetA);
                }
                xrb1 xrb1Var = xrb1.b;
                a = (byte) 3;
                g(linkedHashSetA);
            } catch (Throwable th) {
                f();
                throw th;
            }
        } catch (Exception e2) {
            a = (byte) 2;
            System.err.println("Failed to instantiate SLF4J LoggerFactory");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            String message = e3.getMessage();
            if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                a = (byte) 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e3.printStackTrace();
                throw e3;
            }
            a = (byte) 4;
            yoi1.L("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            yoi1.L("Defaulting to no-operation (NOP) logger implementation");
            yoi1.L("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message2 = e4.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = (byte) 2;
                yoi1.L("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                yoi1.L("Your binding is version 1.5.5 or earlier.");
                yoi1.L("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
        f();
        if (a == 3) {
            String[] strArr = e;
            try {
                String str = xrb1.d;
                boolean z = false;
                for (String str2 : strArr) {
                    if (str.startsWith(str2)) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                yoi1.L("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                yoi1.L("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            } catch (NoSuchFieldError unused) {
            } catch (Throwable th2) {
                System.err.println("Unexpected problem occured during version sanity check");
                System.err.println("Reported exception:");
                th2.printStackTrace();
            }
        }
    }

    public static void f() {
        l1q0 l1q0Var = b;
        synchronized (l1q0Var) {
            try {
                l1q0Var.a = true;
                for (bpc1 bpc1Var : new ArrayList(((HashMap) l1q0Var.b).values())) {
                    bpc1Var.t(c(bpc1Var.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) b.c;
        int size = linkedBlockingQueue.size();
        ArrayList<cpc1> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (cpc1 cpc1Var : arrayList) {
                if (cpc1Var != null) {
                    bpc1 bpc1VarA = cpc1Var.a();
                    String name = bpc1VarA.getName();
                    if (bpc1VarA.r()) {
                        eg.m("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!bpc1VarA.q()) {
                        if (bpc1VarA.c()) {
                            bpc1VarA.s(cpc1Var);
                        } else {
                            yoi1.L(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (cpc1Var.a().c()) {
                        yoi1.L("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        yoi1.L("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        yoi1.L("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!cpc1Var.a().q()) {
                        yoi1.L("The following set of substitute loggers may have been accessed");
                        yoi1.L("during the initialization phase. Logging calls during this");
                        yoi1.L("phase were not honored. However, subsequent logging calls to these");
                        yoi1.L("loggers will work as normally expected.");
                        yoi1.L("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        l1q0 l1q0Var2 = b;
        ((HashMap) l1q0Var2.b).clear();
        ((LinkedBlockingQueue) l1q0Var2.c).clear();
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder("Actual binding is of type [");
        xrb1.b.getClass();
        sb.append(xrb1.c);
        sb.append("]");
        yoi1.L(sb.toString());
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            yoi1.L("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                yoi1.L("Found binding in [" + ((URL) it.next()) + "]");
            }
            yoi1.L("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
