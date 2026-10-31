package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompositeException extends RuntimeException {
    public final List a;
    public final String b;
    public Throwable c;

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            hhg1.n("errors is empty");
            throw null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        this.a = listUnmodifiableList;
        this.b = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    public static void a(PrintStreamOrWriter printStreamOrWriter, Throwable th, String str) {
        printStreamOrWriter.a(str).a(th).a('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            printStreamOrWriter.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th.getCause() != null) {
            printStreamOrWriter.a("\tCaused by: ");
            a(printStreamOrWriter, th.getCause(), "");
        }
    }

    public final void b(PrintStreamOrWriter printStreamOrWriter) {
        printStreamOrWriter.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            printStreamOrWriter.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i = 1;
        for (Throwable th : this.a) {
            printStreamOrWriter.a("  ComposedException ").a(Integer.valueOf(i)).a(" :\n");
            a(printStreamOrWriter, th, "\t");
            i++;
        }
        printStreamOrWriter.a("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        ExceptionOverview exceptionOverview;
        int i;
        try {
            exceptionOverview = this.c;
            if (exceptionOverview == null) {
                String property = System.getProperty("line.separator");
                if (this.a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.a.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable cause : this.a) {
                        int i2 = 0;
                        while (cause != null) {
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(cause.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb.append(message);
                                sb.append(property);
                            } else {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i4 = 0; i4 < i2 + 2; i4++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            }
                            int i5 = 0;
                            while (true) {
                                i = i2 + 2;
                                if (i5 >= i) {
                                    break;
                                }
                                sb.append("  ");
                                i5++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null) {
                                    break;
                                }
                                for (int i6 = 0; i6 < i; i6++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append("(cause not expanded again) ");
                                sb.append(cause2.getClass().getCanonicalName());
                                sb.append(": ");
                                sb.append(cause2.getMessage());
                                sb.append(property);
                                break;
                            }
                            identityHashMap.put(cause, Boolean.TRUE);
                            cause = cause.getCause();
                            i2++;
                        }
                    }
                    exceptionOverview = new ExceptionOverview(sb.toString().trim());
                    this.c = exceptionOverview;
                } else {
                    exceptionOverview = (Throwable) this.a.get(0);
                    this.c = exceptionOverview;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return exceptionOverview;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new WrappedPrintWriter(printWriter));
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
